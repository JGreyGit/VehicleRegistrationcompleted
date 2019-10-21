
Feature: A verification of vehicle existence within VolksWagen Financial Services.

  Background: Initial still steps to navigate to browser
   Given user navigates to VolksWagen URL

@positiveTest @negativeTest
  Scenario Outline: User searches for a car by its registration number. Testing VolkWagen Registered Cars Testing both positive and negative entries of vehicle registration numbers
    Then user confirm <SubTitle> is displayed and input field is present thus enters <Registration Number>
    And clicks on the “Find vehicle” button
    Then <Result> is displayed and the page will display the <Registration Number> that the user entered
    And the page will display the correct <Cover start> and <Cover end>

    Examples:

    |SubTitle              | Registration Number | Cover start   | Cover end   | Result  |
    |Drive Away Insurance | OV12UYY               | 09 FEB 2022  | 18 FEB 2022 |Result for|
    |Drive Away Insurance |777777          | 09 FEB 2022  | 18 FEB 2022 |Sorry record not found|
    |Drive Away Insurance | {*}£!}                | 09 FEB 2022  | 18 FEB 2022 |Please enter a valid car registration|
    |Drive Away Insurance | JustString          | 09 FEB 2022  | 18 FEB 2022 |Sorry record not found|
    |Drive Away Insurance |                 | 09 FEB 2022  | 18 FEB 2022 |Please enter a valid car registration|

