<h1> 🎓 Student Management System </h1>

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)  
![MySQL](https://img.shields.io/badge/MySQL-00758F?style=for-the-badge&logo=mysql&logoColor=white)  
![Swing](https://img.shields.io/badge/Swing-User%20Interface-lightgrey?style=for-the-badge)

---

A simple **Java Swing** based desktop application for managing student records, using **MySQL** as the backend database.

The application allows you to **Insert**, **Update**, **Delete**, and **View** student information through an easy-to-use graphical interface.

---

## ✨ Features

- ➕ Insert new student details.
- ✏️ Update existing student records.
- 🗑️ Delete student records.
- 📋 View all students' data.
- 💻 Simple and clean UI design.

---

## 🖼️ Screenshots

### Home Screen
> Main dashboard with navigation options.
<br>

![Home Screen](./Screenshot%202025-04-20%20143956.png)

---

### Insert Student
> Add a new student's ID, Name, Email, and Course.
<br>

![Insert Student](./Screenshot%202025-04-20%20144008.png)

---

### Update Student
> Update an existing student's details using their ID.
<br>

![Update Student](./Screenshot%202025-04-20%20144035.png)

---

### Delete Student
> Delete a student record by entering their Student ID.
<br>

![Delete Student](./Screenshot%202025-04-20%20144047.png)

---

## 🛠️ Tech Stack

| Technology  | Purpose                         |
|-------------|----------------------------------|
| Java        | Core Programming Language        |
| Java Swing  | GUI Development                  |
| MySQL       | Database                         |
| JDBC        | Database Connectivity            |

---

## 🗂️ Project Structure

```
StudentManagementSystem/
├── src/
│   ├── Main.java
│   ├── InsertStudentForm.java
│   ├── UpdateStudentForm.java
│   ├── DeleteStudentForm.java
│   └── ViewStudentsForm.java
├── database/
│   └── StudentDB.java
├── Screenshots/
│   ├── Home Screen.png
│   ├── Insert Student.png
│   ├── Update Student.png
│   └── Delete Student.png
├── README.md
└── assets/
```

---

## ⚙️ How to Run the Project

1. **Install Java JDK** (8 or higher).
2. **Install MySQL Server** and create the required database and table.
3. **Configure Database Credentials** in `StudentDB.java`.
4. **Compile and Run** using any Java IDE (e.g., IntelliJ IDEA, Eclipse).

### Database Setup

```sql
CREATE DATABASE studentsdb;

USE studentsdb;

CREATE TABLE students (
    id INT PRIMARY KEY,
    name VARCHAR(100),
    email VARCHAR(100),
    course VARCHAR(50)
);
```

---

## 🤝 Contributing

Contributions are welcome!  
Feel free to **fork** the project, make changes, and create a **pull request**.

---

## 📄 License

This project is open-source and available under the [MIT License](LICENSE).

---

## 📬 Contact

- **Developer:** Prashanth
- **Email:** [YourEmail@example.com]

---

> **Built with ❤️ using Java Swing and MySQL**

