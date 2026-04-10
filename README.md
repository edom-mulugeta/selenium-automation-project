# Selenium Automation Project (QA)

## Project Overview

This project is a test automation framework built using Selenium WebDriver, Java, and TestNG. It automates basic user interactions on a demo web application and demonstrates core QA automation concepts.

---

## Tech Stack

* Java
* Selenium WebDriver
* TestNG
* Maven
* Git and GitHub

---

## Framework Design

The project follows the Page Object Model (POM) design pattern:

* `base` – WebDriver setup and teardown
* `pages` – Page classes containing locators and methods
* `tests` – Test cases
* `testng.xml` – Test suite configuration

---

## Test Scenarios

### Signup Test

* Enter user details such as name, email, and address
* Submit the form

### Negative Signup Test

* Attempt form submission with invalid or missing data

### Login Page Test

* Navigate to login page
* Verify that the page loads correctly

### Alerts Test

* Trigger a browser alert
* Capture and print alert text
* Accept the alert

---

## How to Run the Project

1. Clone the repository:

```bash
git clone https://github.com/your-username/selenium-automation-project.git
```

2. Open the project in an IDE such as Eclipse or IntelliJ

3. Run the tests:

* Right click `testng.xml`
* Select **Run As → TestNG Suite**

---

## Sample Output

```
Total tests run: 4
Passes: 4
Failures: 0
Skips: 0
```

---

## Key Concepts Demonstrated

* Selenium WebDriver automation
* TestNG test structure and annotations
* Page Object Model design pattern
* Handling alerts
* Basic test validation
* Version control using Git

---

## Future Improvements

* Add explicit waits using WebDriverWait
* Integrate reporting tools such as Extent Reports
* Add CI/CD integration
* Expand test coverage

---

## Author

Edom Hailemariam
