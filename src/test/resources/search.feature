@search
Feature:Customer should be able to search for a product

  Background:open homepage
    Given user is on the homepage
    When user must be able to hover over the subheader options "Tu"
    And select a product under selected subheader "Women"
    And user is able to select the subheader filter"New Arrivals"

  Scenario: User can search for a required product
    When user searching for a product"Women"
    And user must be able to see the list of searched products


  @dropdown
  Scenario: User should be able to select from dropdown
    When Customer must be able to click the dropdown
    And customer should be able to select "Tu"

@results
Scenario:user should be able to hover the subheading options and select a product
  When user must be able to hover over the subheader options "Tu"
  And select a product under selected subheader "Women"
  And user is able to select the subheader filter"New Arrivals"
#  And user is able to select the subheader filters"Blouses"
#  And user is able to select the subheader filters"10"
#  And user is able to select the subheader filters"£20-£29.99"

@basket
Scenario:user should be able to add a product randomly
And user should be able to pick a product to add randomly
And user should be abke to able to pick size"10"
And user should be able to select required quantity "1"
Then user should be able to view the product in the basket



