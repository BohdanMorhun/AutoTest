Feature: Find the product

  Scenario: Successfully find the product with a keyword
  As a user I want to search site content with a keyword, so that I that I can find necessary product information

    Given I am logged in on the https://rozetka.com.ua/ page
    When I type a query in the search element
    And I hit a “Find” button
    Then I see the results
