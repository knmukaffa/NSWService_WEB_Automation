Feature: User Search for Services Centre

  @NSW
  Scenario: User Search for Services Centre
    Given User already at home page
    When User search for "Apply for a number plate"
    Then Search result for "Apply for a number plate" will appear
    And User click on chosen services from search result
    And User click on find a service centre button
    Then User already on find a service location page
    And User search by suburb "Sydney Domestic Airport 2020"
    And User set filter to service centre
    And Service centre search result with name "Rockdale Service Centre" should appear