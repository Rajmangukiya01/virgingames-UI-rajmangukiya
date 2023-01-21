$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("virgingames.feature");
formatter.feature({
  "line": 1,
  "name": "Check the functionality",
  "description": "As a user I can select any option",
  "id": "check-the-functionality",
  "keyword": "Feature"
});
formatter.before({
  "duration": 3745578301,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "As a user I can select any option",
  "description": "",
  "id": "check-the-functionality;as-a-user-i-can-select-any-option",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "I am on home page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I can click on online slots",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I can verify \"Play Online Slots at Virgin Games\" text",
  "keyword": "Then "
});
formatter.match({
  "location": "PageSteps.iAmOnHomePage()"
});
formatter.result({
  "duration": 85800200,
  "status": "passed"
});
formatter.match({
  "location": "PageSteps.iCanClickOnOnlineSlots()"
});
formatter.result({
  "duration": 191368300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Play Online Slots at Virgin Games",
      "offset": 14
    }
  ],
  "location": "PageSteps.iCanVerifyText(String)"
});
formatter.result({
  "duration": 503753300,
  "status": "passed"
});
formatter.after({
  "duration": 202200,
  "status": "passed"
});
formatter.before({
  "duration": 2154118500,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 9,
      "value": "#  @smoke"
    }
  ],
  "line": 10,
  "name": "As a user I can search any games",
  "description": "",
  "id": "check-the-functionality;as-a-user-i-can-search-any-games",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 11,
  "name": "I am on home page",
  "keyword": "Given "
});
formatter.step({
  "line": 12,
  "name": "I click on search button",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "I can enter name \"Double Bubble\" of the game",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I can select a game",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "I can verify the game name \"Double Bubble\"",
  "keyword": "Then "
});
formatter.match({
  "location": "PageSteps.iAmOnHomePage()"
});
formatter.result({
  "duration": 29500,
  "status": "passed"
});
formatter.match({
  "location": "SearchSteps.iClickOnSearchButton()"
});
formatter.result({
  "duration": 236109399,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Double Bubble",
      "offset": 18
    }
  ],
  "location": "SearchSteps.iCanEnterNameOfTheGame(String)"
});
formatter.result({
  "duration": 942090300,
  "status": "passed"
});
formatter.match({
  "location": "SearchSteps.iCanSelectAGame()"
});
formatter.result({
  "duration": 169118900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Double Bubble",
      "offset": 28
    }
  ],
  "location": "SearchSteps.iCanVerifyTheGameName(String)"
});
formatter.result({
  "duration": 553775001,
  "status": "passed"
});
formatter.after({
  "duration": 39000,
  "status": "passed"
});
});