💰 Personal Finance Tracker

Spring Boot + React (Vite) + PostgreSQL

A full-stack web application to track daily expenses, visualize spending trends, and manage personal finances efficiently.

🚀 Features

➕ Add daily expenses (description, amount, date)

📋 View all expenses in a tabular format

🔄 Update & delete expenses

📊 Real-time expense visualization using charts

💾 Data persistence with PostgreSQL

⚡ Fast frontend using React + Vite

🌐 RESTful API with Spring Boot

🛠️ Tech Stack
Backend

Java 21

Spring Boot

Spring Data JPA

PostgreSQL

Maven

Frontend

React 18

Vite

Axios

Chart.js / react-chartjs-2

Tailwind CSS (for styling)

📂 Project Structure
personal-finance-tracker/
│
├── backend/
│   ├── src/main/java/com/example/finance_tracker
│   ├── controller
│   ├── service
│   ├── repository
│   ├── model
│   └── application.properties
│
├── frontend/
│   ├── src
│   │   ├── components
│   │   ├── pages
│   │   ├── services
│   │   ├── App.jsx
│   │   └── main.jsx
│   ├── index.html
│   └── vite.config.js
│
└── README.md

⚙️ Backend Setup (Spring Boot)

1️⃣ Open backend folder

cd backend


2️⃣ Configure PostgreSQL in application.properties

spring.datasource.url=jdbc:postgresql://localhost:5432/finance_tracker
spring.datasource.username=postgres
spring.datasource.password=your_password

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true


3️⃣ Run the backend

mvn spring-boot:run


Backend runs on:

http://localhost:8081

⚙️ Frontend Setup (React + Vite)

1️⃣ Open frontend folder

cd frontend


2️⃣ Install dependencies

npm install


3️⃣ Start frontend

npm run dev


Frontend runs on:

http://localhost:5173


(or next available port)

🔗 API Endpoints
Method	Endpoint	Description
GET	/api/expenses	Get all expenses
POST	/api/expenses	Add new expense
PUT	/api/expenses/{id}	Update expense
DELETE	/api/expenses/{id}	Delete expense
📊 Live Expense Chart

Expenses update instantly after adding

Line chart shows spending over time

Chart data synced with backend

🧪 Sample Expense JSON
{
  "description": "Tea",
  "amount": 20,
  "date": "2025-12-29"
}

🧠 Learning Outcomes

Full-stack integration (React + Spring Boot)

REST API design

State management in React

Chart visualization

PostgreSQL database handling

Real-world CRUD operations

👨‍💻 Author

Praveen S
GitHub: Praveen-S-24

📌 Future Enhancements

Category-wise expenses

Monthly summary

Authentication (Login/Register)

Export to Excel/PDF

Dark mode

⭐ If you like this project, give it a star on GitHub!

If you want, next I can:

✨ Improve UI (premium look)

🎤 Give viva explanation

📄 Create project report PDF

🧠 Explain code line-by-line

Just tell me 👍
