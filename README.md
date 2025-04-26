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

![Screenshot 2025-04-20 143956](https://github.com/user-attachments/assets/533b3646-f2cc-428b-84ca-eea653b3ac8b)


---

### Insert Student
> Add a new student's ID, Name, Email, and Course.
<br>

![Screenshot 2025-04-20 144008](https://github.com/user-attachments/assets/d086e4fc-e57f-487d-814c-2998f91aff89)


---

### Update Student
> Update an existing student's details using their ID.
<br>

![Screenshot 2025-04-20 144035](https://github.com/user-attachments/assets/07c86336-def7-47e2-8270-fcb291c5c96c)


---

### Delete Student
> Delete a student record by entering their Student ID.
<br>

![Screenshot 2025-04-20 144047](https://github.com/user-attachments/assets/44575cc9-02f4-4c00-8d05-4637f0369791)


---

## 🛠️ Tech Stack

| Technology  | Purpose                         |
|-------------|----------------------------------|
| Java        | Core Programming Language        |
| Java Swing  | GUI Development                  |
| MySQL       | Database                         |
| JDBC        | Database Connectivity            |


---

## ⚙️ How to Run the Project

1. Install Java JDK (8 or higher).
2. Install MySQL Server and create the required database and table.
3. Clone the Repository:
    git clone <repository-url>

4. Place MySQL Connector JAR:
     -> Download mysql-connector-java-8.0.22.jar.
     -> Place it in your project directory.

5. Compile and Run the Project:
    Compile and run the files using the following commands:

    javac -cp ".;mysql-connector-java-8.0.22.jar" MainDashboard.java <br>
    java -cp ".;mysql-connector-java-8.0.22.jar" MainDashboard <br>

   -> Insert Student: <br>
        javac -cp ".;mysql-connector-java-8.0.22.jar" StudentInsert.java <br
        java -cp ".;mysql-connector-java-8.0.22.jar" StudentInsert <br>
   -> Update Student: <br>
        javac -cp ".;mysql-connector-java-8.0.22.jar" StudentUpdateGUI.java <br>
        java -cp ".;mysql-connector-java-8.0.22.jar" StudentUpdateGUI <br>

   
   -> Delete Student: <br>
        javac -cp ".;mysql-connector-java-8.0.22.jar" StudentDeleteGUI.java <br>
        java -cp ".;mysql-connector-java-8.0.22.jar" StudentDeleteGUI <br>

   
   -> View Students: <br>
        javac -cp ".;mysql-connector-java-8.0.22.jar" StudentViewGUI.java <br>
        java -cp ".;mysql-connector-java-8.0.22.jar" StudentViewGUI <br>
   

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

- **Developer:** Pendem Prashanth
- **Email:** prashanthpendem2323@gmail.com

---

> **Built with ❤️ using Java Swing and MySQL**

