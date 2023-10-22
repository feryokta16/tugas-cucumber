Feature: Shop DemoQA
  #TCC.HRM 0.0.4
  Scenario: Buy the first product
    Given User enter url HRM
    And clear username
    When clear password
    And User login
    And User Search the product
    And user choose the first product
    And user Add product
    And User get Message Tokyo Talkies


    #TCC.HRM 0.0.5
  Scenario: Buy the second product
    Given User continue shoping
    And user choose the second product
    And user choose the color
    And user choose the black color
    And user choose the size
    And user choose the large size
    And user add contains of dress
    And user min contains of dress
    And user click submit
    And User click keranjang
    Then user get text second product


    #TCC 0.0.6
  Scenario: Checkout Product
    Given user click checkout
    Then user get checkout text


