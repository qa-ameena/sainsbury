$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("search.feature");
formatter.feature({
  "line": 2,
  "name": "Customer should be able to search for a product",
  "description": "",
  "id": "customer-should-be-able-to-search-for-a-product",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@search"
    }
  ]
});
formatter.before({
  "duration": 35574544200,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "open homepage",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "user is on the homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user must be able to hover over the subheader options \"Tu\"",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "select a product under selected subheader \"Women\"",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user is able to select the subheader filter\"New Arrivals\"",
  "keyword": "And "
});
formatter.match({
  "location": "HomePageStepDef.userIsOnTheHomepage()"
});
formatter.result({
  "duration": 1958844200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Tu",
      "offset": 55
    }
  ],
  "location": "ResultsStepDef.userMustBeAbleToHoverOverTheSubheaderOptions(String)"
});
formatter.result({
  "duration": 5029891600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Women",
      "offset": 43
    }
  ],
  "location": "ResultsStepDef.selectAProductUnderSelectedSubheader(String)"
});
formatter.result({
  "duration": 9278506600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "New Arrivals",
      "offset": 44
    }
  ],
  "location": "ResultsStepDef.userIsAbleToSelectTheSubheaderFilter(String)"
});
formatter.result({
  "duration": 13296267200,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 25,
      "value": "#  And user is able to select the subheader filters\"Blouses\""
    },
    {
      "line": 26,
      "value": "#  And user is able to select the subheader filters\"10\""
    },
    {
      "line": 27,
      "value": "#  And user is able to select the subheader filters\"£20-£29.99\""
    }
  ],
  "line": 30,
  "name": "user should be able to add a product randomly",
  "description": "",
  "id": "customer-should-be-able-to-search-for-a-product;user-should-be-able-to-add-a-product-randomly",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 29,
      "name": "@basket"
    }
  ]
});
formatter.step({
  "line": 31,
  "name": "user should be able to pick a product to add randomly",
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "user should be abke to able to pick size\"10\"",
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "user should be able to select required quantity \"1\"",
  "keyword": "And "
});
formatter.step({
  "line": 34,
  "name": "user should be able to view the product in the basket",
  "keyword": "Then "
});
formatter.match({
  "location": "BasketStepDef.userShouldBeAbleToPickAProductToAddRandomly()"
});
formatter.result({
  "duration": 6428330600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "10",
      "offset": 41
    }
  ],
  "location": "BasketStepDef.userShouldBeAbkeToAbleToPickSize(String)"
});
formatter.result({
  "duration": 5178335900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 49
    }
  ],
  "location": "BasketStepDef.userShouldBeAbleToSelectRequiredQuantity(String)"
});
formatter.result({
  "duration": 815200,
  "status": "passed"
});
formatter.match({
  "location": "BasketStepDef.userShouldBeAbleToViewTheProductInTheBasket()"
});
formatter.result({
  "duration": 1167057400,
  "error_message": "java.lang.AssertionError: No of items not displaying\nExpected: a string containing \"1 item\"\n     but: was \"\"\r\n\tat org.hamcrest.MatcherAssert.assertThat(MatcherAssert.java:20)\r\n\tat com.maven.sainsbury.stepDefinitions.BasketStepDef.userShouldBeAbleToViewTheProductInTheBasket(BasketStepDef.java:33)\r\n\tat ✽.Then user should be able to view the product in the basket(search.feature:34)\r\n",
  "status": "failed"
});
formatter.after({
  "duration": 50700,
  "status": "passed"
});
});