Personal Finance Tracker
Project Description

Personal Finance Tracker is a full-stack web application developed to help users manage their daily expenses easily.
The application allows users to add, view, update, and delete expenses.
All expense data is stored securely in a database and displayed instantly on the user interface along with a visual chart.

This project uses Spring Boot for backend development and React for frontend development.

![Project Screenshot](images/dashboard.png)

Technologies Used
Backend

Java

Spring Boot

Spring Data JPA

PostgreSQL

Frontend

React

Vite

Axios

Chart.js


Project Working
1. Add Expense

User enters:

Description

Amount

Date

On clicking Add Expense, data is sent to backend.

Backend saves the data in PostgreSQL database.

2. View Expenses

All saved expenses are fetched from the backend.

Expenses are displayed in a table showing:

Date

Amount

Description

Action buttons

3. Update Expense

User can edit an existing expense.

Updated data is sent to backend and saved.

UI refreshes instantly.

4. Delete Expense

User can delete an expense.

Backend removes the record from database.

UI updates automatically.

5. Expense Chart

A line chart shows expenses over time.

Chart updates automatically whenever data changes.

Application Flow

Frontend sends request using Axios

Spring Boot backend processes request

Data is stored or retrieved from PostgreSQL

Response is sent back to frontend

UI updates instantly with table and chart


