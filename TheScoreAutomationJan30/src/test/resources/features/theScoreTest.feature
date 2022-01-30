Feature: As user, I want to be able to select my favorite team and check the best player of the week

  Scenario: 1. I add a team as my favorite and check out the best player in that team
    Given user connects to the server and starts the application
    When user continues to favorite team page
    And user clicks "NBA" tab from modules
    And user selects "Boston Celtics" as a favorite team and continue to next page
    And user clicks into newly added favorite team page
    Then user verifies the page with team name "Boston Celtics"
    Then user clicks "PLAYER STATS" module and selects the "Best Player"
    Then user successfully sees the best player's information
