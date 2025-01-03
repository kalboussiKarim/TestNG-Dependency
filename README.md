# TestNG Dependency

This project provides a comprehensive introduction to TestNG's dependency management features, including examples and demonstrations to clarify their usage. It focuses on illustrating how dependencies between tests and test groups can be managed effectively using TestNG.

## Features and Examples

### 1. **@Test `dependsOnMethods`**
   - Demonstrates the `dependsOnMethods` attribute of the `@Test` annotation.
   - Provides a clear example to illustrate how tests can be skipped when the methods they depend on fail.
   - Explains practical scenarios where `dependsOnMethods` is useful.

### 2. **Grouping Tests with `groups` Attribute**
   - Showcases how to use the `groups` attribute of the `@Test` annotation to organize tests into logical groups.
   - Provides examples of tests grouped by functionality or purpose.

### 3. **Including and Excluding Test Groups via XML**
   - Demonstrates how to include or exclude specific test groups using a TestNG XML configuration file.
   - Explains how to configure test suites effectively for selective test execution.

## How to Use
1. Clone the repository:
   ```bash
   git clone https://github.com/kalboussiKarim/TestNG-Dependency.git
   ```
2. Import the project into your favorite IDE (e.g., IntelliJ IDEA, Eclipse).
3. Explore the examples in the provided code files.
4. Run the tests directly or via a TestNG XML configuration file.

## Prerequisites
- Java Development Kit (JDK) installed.
- TestNG library integrated with your project.
- A basic understanding of Java programming.

## Learning Outcomes
By exploring this project, you will:
- Learn how to manage test dependencies using `dependsOnMethods`.
- Understand the importance and usage of grouping tests.
- Gain hands-on experience in configuring test execution through XML files.
- Develop skills to organize and execute tests effectively in complex projects.

