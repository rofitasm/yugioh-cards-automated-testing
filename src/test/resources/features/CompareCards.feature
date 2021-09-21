@Yugioh
Feature: Compare Yugi Oh Data

  Scenario Outline: Compare Yugioh Data '<yugiohName>' from Yugiohdb and Yugipedia
    Given open yugioh web home page
    And open card search page
    And search '<yugiohName>' using search bar yugiohdb
    And open yugioh details page
    When get yugiohdb web data

    Given open yugipedia web home page
    And search '<yugiohName>' using search bar yugipedia web
    When get yugipedia web data

#    When prepare yugioh data compare
#    Then yugioh data in yugiohdb and yugipedia should be similar

    Examples:
      | yugiohName         |
      | Dark Magician      |
      | Active Guard       |
      | Dark Magician Girl |
      | Rayquaza           |


