Feature: Product Search

Scenario Outline: Search products

  Given User is on Home page
  When User searches for "<product>"
  Then Verify search result "<result>"

Examples:
| product | result  |
| iPhone  | Found   |
| MacBook | Found   |
| xyz123  | NotFound|
|         | NotFound|