@SearchProduct @Scenario2 @UI
Feature: Product search
  Scenario Outline: verify Product search for MAC BOOK
    Given user is on home page
    When user searches for "<Product>" in the search bar
    And Verify that search result is displayed
    Then click on the 3 rd search result product
    Then verify search result belongs to "<Product>"
    
     Examples:
      | Product |
      | MacBook |
      | Iphone7 |
      | Android |
      | Car     |
