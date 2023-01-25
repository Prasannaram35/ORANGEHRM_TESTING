Feature: Verify ORANGEHRM1 Testcase   
Author:Plabani
  Scenario: Verify valid username and Password
    Given open URL
    When Enter valid username "Admin" and Password "admin123"
    And click on Login button
    Then Login Successful