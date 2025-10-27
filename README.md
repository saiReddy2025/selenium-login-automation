🔐 Login Page Automation using Selenium
📘 Overview

This project automates the Login Page Testing process using Selenium WebDriver (Java).
It performs automated testing for multiple scenarios like valid, invalid, and empty login credentials.

🚀 Features

✅ Automates login form interactions

🔍 Validates success and error messages

🧾 Handles edge cases (empty fields)

🧠 Includes wait mechanisms for stable execution

🌐 Cross-browser compatibility

🧰 Tech Stack

Language: Java

Automation Tool: Selenium WebDriver

Browser: Google Chrome

Testing Framework: JUnit / TestNG (optional)

⚙️ Setup Instructions

Install Java JDK

Verify with: java -version

Install Git (optional for pushing to GitHub)

Download from git-scm.com

Download Selenium JARs

From: https://www.selenium.dev/downloads/

Download ChromeDriver

Ensure version matches your Chrome browser

Extract and place chromedriver.exe in your project folder

Run the Project

javac -cp ".;selenium-java-4.38.0/*;selenium-java-4.38.0/libs/*" LoginAutomation.java
java -cp ".;selenium-java-4.38.0/*;selenium-java-4.38.0/libs/*" LoginAutomation

📊 Test Scenarios
Scenario	Input	Expected Result
✅ Valid Login	Correct username & password	Success message
❌ Invalid Login	Wrong credentials	Error message
⚠️ Empty Fields	Empty username or password	Validation alert
📁 Folder Structure
SeleniumProject/
│
├── LoginAutomation.java
├── chromedriver.exe
├── /selenium-java-4.38.0
└── README.md

🧑‍💻 Author

Sai Kumar Reddy !!
📧 GitHub Profile
 (Add your profile link here)
💼 Aspiring Java Developer | Automation Enthusiast
