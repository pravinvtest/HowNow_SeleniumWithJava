# _PULSE | Web Automation Framework_

This is a java framework which is using TestNG, Maven, Extent Report, PageObjectModel to achieve different tasks.


### _Project Features_
- Supports parallel testing (for parallel="tests" in testng.xml).
- Generates report after each run for all test cases with screenshots.
- Read data from JSON files.

### _Project Components_
Below are the component details of the framework:

- #### Test Data
    Supports to read and maintain data from multiple file types like:
    -  JSON File
    -  Test Scripts
    -  TestNg is used as a test framework in order to generate test script taking into account the Page Object Model design pattern.

-   #### Test Scripts
    Using maven, project dependencies are managed. Test can be run using pom.xml and testng.xml.

-   #### Build Tool
    Using `maven`, project dependencies are managed. Test can be run using `pom.xml` and `testng.xml`.

-   #### Reporting
    Generates html report automatically by using Extent Report 5. By attaching screenshots and execution videos of the failed test cases.
However, user can set the framework to take screenshots and videos of passed or/and skipped test cases. All reports are generated in reports-test-output folder. Report automatically opens in default browser.
Note: Exception logs and fail reasons are added to the report as well.

-   #### Utilities
    Holds common methods to re-use in order to achieve maximum re-usability.



### Getting Started:
1. Run pom.xml or testng.xml file.
