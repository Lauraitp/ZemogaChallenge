Feature: Carnival page to Search Cruises
  As a user I want to find many cruises that fits the characteristics that I need to travel

  Scenario: Search cruises
    Given Open the Carnival Home Page
    When Search a Cruises sail to The Bahamas and duration 6 - 9 Days to filter the price
    Then the prices are ordered from the cheapest to the most expensive
    And Verify that the results decrease with the filter

    Scenario: See the itinerary of trip
    Given Open the Carnival Home Page
    When She looking for all days to the itinerary
    Then Verify that the itinerary is complete
    And Exist a button to Book the trip