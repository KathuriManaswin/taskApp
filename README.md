# 📝 Task Management API (Spring Boot)

A backend REST API for managing tasks, built using Spring Boot with a clean layered architecture.  
The application supports task creation, updates, retrieval, and deletion with proper exception handling and DTO-based communication.

---

## 🚀 Features

- ✅ Create, update, delete, and fetch tasks
- 📌 Task prioritization (LOW, MEDIUM, HIGH)
- 🔄 Task status tracking 
- 📦 DTO-based request/response handling
- 🧠 Clean architecture (Controller → Service → Repository)
- ⚠️ Centralized exception handling
- 🔁 Entity ↔ DTO mapping layer

---

## 🛠️ Tech Stack

- **Backend:** Spring Boot
- **Language:** Java
- **Build Tool:** Maven
- **Database:**  H2 
- **Architecture:** Layered (Controller, Service, Repository)
- **Containerization (Frontend):** Docker (prebuilt image)

---
## ⚙️ How to Run the Application

### 1. Clone the repository

```bash
git clone https://github.com/KathuriManaswin/taskApp.git
cd taskApp

```
### 2. Run Backend (Spring Boot)

#### Option 1: Using IntelliJ (Recommended)

- Open the project in IntelliJ IDEA  
- Locate and run:  ManaswinTaskAppApplication.java

---
## 🔗 Application Flow

1. User interacts with frontend (port 3000)
2. Frontend sends API requests to backend (port 8080)
3. Backend processes requests via:
   - Controller → Service → Repository
4. Data is returned as DTOs and rendered on UI

--- 
## 🌐 Ports Used

| Service   | Port  |
|----------|------|
| Backend  | 8080 |
| Frontend | 3000 |
