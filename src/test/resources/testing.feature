Feature: To get the specified topic
  Background:
    Given user clicks on the given link

  @regression
  Scenario Outline: Verification of the steps
    Given user clicks on the dropdown
    When user selects given option
    Then user clicks on get started
    And  user clicks on the search button
    Then user enters any "<topic>"
    Then user closes browser window


    Examples:
      | topic |
      | Java  |

