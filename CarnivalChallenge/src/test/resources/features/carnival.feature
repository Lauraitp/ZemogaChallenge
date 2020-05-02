Feature: Carnival page to Search Cruises
  As a user I want to find many cruises that fits the characteristics that I need to travel

  Scenario: Search cruises
    Given Open the Carnival Home Page
    When Search a Cruises sail to The Bahamas and duration 6 - 9 Days to filter the price
    Then Verify that the results decrease with the filter
    And the prices are ordered from the cheapest to the most expensive