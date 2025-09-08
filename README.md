# Training Feedback Management System
A **Java + MySQL** based application for managing employee training feedback.
This system allows employees to submit feedback on training sessions, and provides trainers/administrators with aggregated insights.

## Features

* Manage **phases** (e.g., *Tech Fundamentals*).
* Manage **sessions** within each phase (e.g., *Agile and Scrum, HTML/CSS, JS*).
* Store structured **feedback questions** for each session.
* Record employee feedback:
  * Numeric scores (ratings)
  * Text responses (comments/suggestions)
* View feedback per session with detailed employee responses.

## Tech Stack

* **Java 17+**
* **MySQL 8+**
* **JDBC** for database connectivity

## ER Diagram
<img width="1264" height="850" alt="Untitled" src="https://github.com/user-attachments/assets/9ee71726-eb9c-4ab6-a4c8-e46ae8ed6625" />

## Setup & Installation

1. Clone this repository:

   ```bash
   git clone https://github.com/your-username/training-feedback-system.git
   ```
2. Import into your IDE (e.g., IntelliJ / Eclipse).
3. Create the MySQL database and run the schema scripts in `sql/` (if you export them).
4. Update your database connection in `db.properties`:

   ```properties
   db.url=jdbc:mysql://localhost:3306/feedback_db
   db.user=root
   db.password=yourpassword
   ```
5. Compile and run the project:

   ```bash
   mvn clean install
   java -cp target/feedback-system.jar com.abcdcompany.utility.FeedbackUtility
   ```

## Usage

1. Choose a **phase** (e.g., *Tech Fundamentals*).
2. Select a **session** (e.g., *Agile and Scrum*).
3. View or provide feedback for that session.
4. Feedback includes **numeric ratings** (1–5) and **text comments**.
5. Administrators/trainers can review consolidated feedback.
