Feature: Login Data Driven

  Scenario Outline: Login Data Driven
    Given User Launch browser
    And opens URL "http://tutorialsninja.com/demo/index.php?route=common/home"
    When User navigate to MyAccount menu
    And click on Login
    And User enters Email as "<email>" and Password as "<password>"
    And Click on Login button
    Then User navigates to MyAccount Page

    Examples: 
      | email                    | password       |
      | pavanol@gmail.com        | test123        |
      | nikeshkumar123@gmail.com | nikeshKumar123 |
