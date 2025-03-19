# Automated Testing Framework For Jupiter Toys Website

This repository contains an automation testing framework using **Selenium with Java**, **TestNG**, and **Cucumber**.

## Prerequisites

Ensure you have the following installed:

- **Java (JDK 11 or later)**: [Download Here](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html)
- **Apache Maven**: [Download Here](https://maven.apache.org/download.cgi)
- **IDE (Eclipse/IntelliJ IDEA)**
- **Google Chrome**

## Project Structure

- **src/test/java**: Contains step definitions and test runners.
- **src/test/resources/features**: Stores Gherkin feature files.
- **pom.xml**: Contains dependencies and build configurations.

## Installation

1. Clone this repository:
   ```sh
   git clone https://github.com/RVMac/jupiter-toys-automation-testng-trial.git
   ```
2. Navigate to the project directory:
   ```sh
   cd automation-framework
   ```
3. Install dependencies using Maven:
   ```sh
   mvn clean install
   ```

## Running Tests

To execute tests, run the following command:
```sh
mvn clean test
```

## Running Tests via GitHub Actions

This project includes a GitHub Actions workflow to automate test execution. To manually trigger the workflow:
1. Push your changes to GitHub.
2. Navigate to the **Actions** tab in your GitHub repository.
3. Select the **Run Automation Tests** workflow and click **Run workflow**.
4. Monitor the execution logs to view test results.

## Reporting

After execution, test reports will be generated:
- **target/cucumber-reports.html** (Cucumber reports)

## Contributing

Feel free to fork and submit pull requests.

## License

This project is licensed under the MIT License - see the LICENSE file for details.