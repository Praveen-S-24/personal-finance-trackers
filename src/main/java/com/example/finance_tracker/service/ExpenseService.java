package com.example.finance_tracker.service;

import com.example.finance_tracker.exception.ResourceNotFoundException;
import com.example.finance_tracker.model.Expense;
import com.example.finance_tracker.repository.ExpenseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class ExpenseService {

    @Autowired
    private ExpenseRepository expenseRepository;

    public Expense addExpense(Expense expense) {
        return expenseRepository.save(expense);
    }

    public List<Expense> getExpenses(LocalDate startDate, LocalDate endDate) {
        if (startDate != null && endDate != null) {
            return expenseRepository.findByDateBetween(startDate, endDate);
        }
        return expenseRepository.findAll();
    }

    public Double getTotalAmount(LocalDate startDate, LocalDate endDate) {
        return expenseRepository.findByDateBetween(startDate, endDate)
                .stream()
                .mapToDouble(Expense::getAmount)
                .sum();
    }

    public Expense updateExpense(Long id, Expense expenseDetails) {
        Expense expense = expenseRepository.findById(id)
                .orElseThrow(() ->
                        new ResourceNotFoundException("Expense not found for this id :: " + id));

        expense.setDescription(expenseDetails.getDescription());
        expense.setAmount(expenseDetails.getAmount());
        expense.setDate(expenseDetails.getDate());
        expense.setCategory(expenseDetails.getCategory()); // if exists

        return expenseRepository.save(expense);
    }

    public boolean deleteExpense(Long id) {
        Expense expense = expenseRepository.findById(id)
                .orElseThrow(() ->
                        new ResourceNotFoundException("Expense not found for this id :: " + id));

        expenseRepository.delete(expense);
        return true;
    }
}
