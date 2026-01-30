Feature: Search items
  Scenario: Validate retrieval of search result
  Given user visits website
  And validate that user is on homepage
  When user searches for required item
  Then validate that results are displayed