Feature: Login Shop DemoQA
  #TCC.HRM 0.0.1
  Scenario: Login Valid Test
    Given User enter url HRM
    When User input valid username
    And User input valid password
    And User click button login
    Then User menampilkan title page

    #TCC.HRM 0.0.2
  Scenario: Login with Password Invalid Test
    Given User Logout
    When User input valid username
    And User input invalid password
    And User click button login
    Then User get text invalid credential

  #TCC.HRM 0.0.3
  Scenario: Login Without Username
    Given clear username
    When User input Blank username
    And User input valid password
    And User click button login
    Then User get text required