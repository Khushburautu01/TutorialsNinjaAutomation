Feature: Login Functionality

Scenario Outline: Login with different credentials

  Given User is on Login page
  When User enters "<email>" and "<password>"
  And Clicks Login button
  Then Verify "<result>"

Examples:
| email                 | password    | result  |
| test@gmail.com        | Test123     | Success |
| wrong@gmail.com       | Test123     | Failure |
| test@gmail.com        | wrong123    | Failure |
|                        |             | Failure |