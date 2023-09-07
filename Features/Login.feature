Feature: Login with Valid Credentials

  @regression
  Scenario: Successful Login with Valid Credentials
    Given User Launch browser
    And opens URL "http://tutorialsninja.com/demo/index.php?route=common/home"
    When User navigate to MyAccount menu
    And click on Login
    And User enters Email as "nikeshkumar123@gmail.com" and Password as "nikeshKumar123"
    And Click on Login button
    Then User navigates to MyAccount Page

  @sanity
  Scenario: Successful Login with Valid Credentials
    Given User Launch browser
    And opens URL "http://tutorialsninja.com/demo/index.php?route=common/home"
    When User navigate to MyAccount menu
    And click on Login
    And User enters Email as "nikeshkumar123@gmail.com" and Password as "nikeshKumar1234"
    And Click on Login button
    Then User navigates to MyAccount Page

  @regression @sanity
  Scenario: Successful Login with Valid Credentials
    Given User Launch browser
    And opens URL "http://tutorialsninja.com/demo/index.php?route=common/home"
    When User navigate to MyAccount menu
    And click on Login
    And User enters Email as "tonystark123@xyz.com" and Password as "nikeshKumar123"
    And Click on Login button
    Then User navigates to MyAccount Page
