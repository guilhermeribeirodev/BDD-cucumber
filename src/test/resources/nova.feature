
Feature: Person Management

  Scenario: Ensure that persons were rightly created

  	Given the person system is initialized with the following data
      | id  | name      | age   |
      | 1   | donald    | 60    |
      | 2   | guilhe    | 40    |
      | 3   | kjkhak    | 20    |
    When a new person were created with name 'donald' and age 40 
    Then return a name validation error with 'name must be different'
  	