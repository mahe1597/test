Feature: Validate about this item functionality

  Background:
    Given Open the Browser and Site is launched

  @TVSearch
  Scenario: Validate about this item functionality of second highest price samsung tv product
    And click on the hamburger menu in the top left corner
    And scroll down and then click on the TV,Appliances and Electronics link under Shop by Department section
    Then click on Televisions under Tv,Audio & Cameras sub section
    And scroll down and filter the results by Brand Samsung
    And Sort the Samsung results with price High to Low
    And Click on the second highest priced item
    Then Switch the Window and Validate the about this item

