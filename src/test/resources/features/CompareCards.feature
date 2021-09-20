@Yugioh
Feature: Compare Yugi Oh Data

  Scenario Outline: Compare Yugioh Data from Yugioh web and Yugipedia
    Given open yugioh web home page
    And open card search page
    And search '<yugiohName>' using search bar yugioh web
    And open yugioh details page
    When get yugioh web data

    Examples:
      | yugiohName         |
      | Dark Magician      |
#      | Active Guard       |
#      | Dark Magician Girl |
#      | Rayquaza           |


