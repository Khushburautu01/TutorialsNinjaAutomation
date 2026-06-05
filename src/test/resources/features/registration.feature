Feature: Registration Functionality

Scenario Outline: Register new users

  Given User is on Registration page
  When User enters registration details "<firstname>" "<lastname>" "<phone>" "<password>"
  And Clicks on Continue button
  Then Account should be created successfully

Examples:
| firstname | lastname | phone      | password    |
| Khushbu   | Rautu    | 9876543210 | Password123 |