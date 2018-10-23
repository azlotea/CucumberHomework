Feature: Delete new Vet

  Scenario: As a user I want to delete a newly added veterinarian
    Given I add a new veterinarian
    When I am looking for him in the list and I click on delete button
    Then The veterinarian can't be found anymore on the list