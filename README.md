Loan-Eligibility-Prediction-Model
==============================

Build a model to predict loan eligibility with an average accuracy of more than 76%

# Banking Loan Eligibility Prediction - Software Testing Project

This is a software testing project designed for the **Banking Eligibility Prediction System** to evaluate and determine the user's loan eligibility based on parameters like age, income, employment type, and loan amount.


Banking-Eligibility-Prediction/
├── 1_Requirements/
├── 2_Test_Plan/
├── 3_Test_Cases/
│   ├── Manual_TestCases_LoanEligibility.xlsx
│   └── Automation_TestScenarios_Selenium.xlsx
├── 4_Bug_Reports/
├── 5_Test_Reports/
├── 6_Data/
│   └── Loan_Applicants_Data.csv
├── 7_Postman/
│   └── Loan_API_Collection.json
├── 8_Automation_Code/
│   ├── BaseClass.java
│   ├── LoanEligibilityTest.java
│   ├── ExcelUtils.java
│   ├── TestNG.xml
│   └── pom.xml
├── 9_Screenshots/
├── 10_Documentation/
│   ├── Project_Overview.md
│   ├── Tools_and_Configuration.md
│   └── How_to_Run_Project.txt
└── README.md


## 📌 Project Features
- Automated UI Testing using Selenium & TestNG
- Page Object Model (POM) Design Pattern
- API Testing using Postman
- Manual Test Cases & Bug Reports
- Extent HTML Reports with screenshots
- Logging using Log4j

## 🧪 Technologies Used
- Java + Selenium WebDriver + TestNG
- Maven for build automation
- Postman for API testing
- Log4j for logging
- Excel for manual test cases & bug tracking

## 🗂️ Project Structure
```
BankingEligibilityPrediction/
│
├── src/                         # Page Object Model classes
├── test/                        # TestNG test scripts
├── postman/                     # Postman collections
├── reports/                     # Extent HTML reports
├── screenshots/                 # Screenshots of failed test cases
├── logs/                        # Log4j config/logs
├── documentation/              # Test cases, bug reports
├── config.properties            # Configuration for tests
├── pom.xml                      # Maven dependencies
└── README.md                    # Project documentation
```

## 🚀 How to Run the Project
1. Clone this repository
2. Import as Maven project in IntelliJ/Eclipse
3. Update `config.properties` with correct values
4. Run tests using `TestNG`

## ✅ Test Scenarios
- Login with valid & invalid credentials
- Loan eligibility form submission
- Field validation and error handling

## 📂 Documentation
- Manual test cases and bug report files are in `/documentation`
- Postman API collection is in `/postman`
- Sample Extent report and screenshots are under `/reports` and `/screenshots`

---
**Developed by:** Monika Borkute  


