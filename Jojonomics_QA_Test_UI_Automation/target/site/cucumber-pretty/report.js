$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/SearchForServicesCentre.feature");
formatter.feature({
  "line": 1,
  "name": "User Search for Services Centre",
  "description": "",
  "id": "user-search-for-services-centre",
  "keyword": "Feature"
});
formatter.before({
  "duration": 10258089700,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "User Search for Services Centre",
  "description": "",
  "id": "user-search-for-services-centre;user-search-for-services-centre",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@NSW"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "User already at home page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User search for \"Apply for a number plate\"",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "Search result for \"Apply for a number plate\" will appear",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "User click on chosen services from search result",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "User click on find a service centre button",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "User already on find a service location page",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "User search by suburb \"Sydney Domestic Airport 2020\"",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "User set filter to service centre",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "Service centre search result with name \"Rockdale Service Centre\" should appear",
  "keyword": "And "
});
formatter.match({
  "location": "HomePageSteps.userAlreadyAtHomePage()"
});
formatter.result({
  "duration": 198263800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Apply for a number plate",
      "offset": 17
    }
  ],
  "location": "HomePageSteps.userSearchFor(String)"
});
formatter.result({
  "duration": 4197949000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Apply for a number plate",
      "offset": 19
    }
  ],
  "location": "HomePageSteps.searchResultWillAppear(String)"
});
formatter.result({
  "duration": 29503300,
  "status": "passed"
});
formatter.match({
  "location": "SearchPageSteps.userClickOnChosenServicesFromSearchResult()"
});
formatter.result({
  "duration": 4367620000,
  "status": "passed"
});
formatter.match({
  "location": "SearchPageSteps.userClickOnFindAServiceCentreButton()"
});
formatter.result({
  "duration": 2907757700,
  "status": "passed"
});
formatter.match({
  "location": "SearchPageSteps.userAlreadyOnFindAServiceLocationPage()"
});
formatter.result({
  "duration": 1037312000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Sydney Domestic Airport 2020",
      "offset": 23
    }
  ],
  "location": "SearchPageSteps.userSearchBySuburb(String)"
});
formatter.result({
  "duration": 2007022000,
  "status": "passed"
});
formatter.match({
  "location": "SearchPageSteps.userSetFilterToServiceCentre()"
});
formatter.result({
  "duration": 559103400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Rockdale Service Centre",
      "offset": 40
    }
  ],
  "location": "SearchPageSteps.serviceCentreSearchResultWithNameShouldAppear(String)"
});
formatter.result({
  "duration": 842427300,
  "status": "passed"
});
formatter.after({
  "duration": 682126200,
  "status": "passed"
});
});