Feature: validate guru99

  Scenario: enter data to guru99
    Given user opens guru99 reg page
    When kadhitari "<id>" and "<name>" and "<lastname>" for gthe user
    Then validate any response

    Examples: 
      | id | name    | lastname  |
      |  1 | akshay  | gayakawad |
      |  2 | swapnil | Shingate  |
      |  3 | datta   | burange   |