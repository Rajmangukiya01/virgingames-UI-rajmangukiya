Feature: Check the functionality
  As a user I can select any option

  Scenario: As a user I can select any option
    Given I am on home page
    When I can click on online slots
    Then I can verify "Play Online Slots at Virgin Games" text

#  @smoke
  Scenario: As a user I can search any games
    Given I am on home page
    When I click on search button
    And I can enter name "Double Bubble" of the game
    And I can select a game
    Then I can verify the game name "Double Bubble"
