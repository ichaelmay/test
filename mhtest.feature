Feature: Shoe Store


  @test1 #Story 1 Test Case 1
  Scenario Outline: Verify website loads and each month is displayed

    Given I open Chrome and navigate to "<URL>"
    Then A link for each month of the year is displayed

    Examples:

      |URL|
      |https://rb-shoe-store.herokuapp.com/|

  @test1 #Story 1 Test Case 2
  Scenario Outline: Verify the page for January

     Given I open Chrome and navigate to "<URL>"
     When I click the month link for "<month>"
     Then I verify the page loads for "<month>"
     And I verify a list of shoes is displayed
     And I verify a description for each shoe is displayed
     And I verify a suggested price for each shoe is displayed
     And I verify an image for each shoe is displayed


     Examples:

       |URL|month|
      |https://rb-shoe-store.herokuapp.com/|January|

  @test1 #Story 1 Test Case 3
  Scenario Outline: Verify the page for February

    Given I open Chrome and navigate to "<URL>"
    When I click the month link for "<month>"
    Then I verify the page loads for "<month>"
    And I verify a list of shoes is displayed
    And I verify a description for each shoe is displayed
    And I verify a suggested price for each shoe is displayed
    And I verify an image for each shoe is displayed


    Examples:

      |URL|month|
      |https://rb-shoe-store.herokuapp.com/|February|

  @test1 #Story 1 Test Case 4
  Scenario Outline: Verify the page for March

    Given I open Chrome and navigate to "<URL>"
    When I click the month link for "<month>"
    Then I verify the page loads for "<month>"
    And I verify a list of shoes is displayed
    And I verify a description for each shoe is displayed
    And I verify a suggested price for each shoe is displayed
    And I verify an image for each shoe is displayed


    Examples:

      |URL|month|
      |https://rb-shoe-store.herokuapp.com/|March|

  @test1 #Story 1 Test Case 5
  Scenario Outline: Verify the page for April

    Given I open Chrome and navigate to "<URL>"
    When I click the month link for "<month>"
    Then I verify the page loads for "<month>"
    And I verify a list of shoes is displayed
    And I verify a description for each shoe is displayed
    And I verify a suggested price for each shoe is displayed
    And I verify an image for each shoe is displayed


    Examples:

      |URL|month|
      |https://rb-shoe-store.herokuapp.com/|April|

  @test1 #Story 1 Test Case 6
  Scenario Outline: Verify the page for May

    Given I open Chrome and navigate to "<URL>"
    When I click the month link for "<month>"
    Then I verify the page loads for "<month>"
    And I verify a list of shoes is displayed
    And I verify a description for each shoe is displayed
    And I verify a suggested price for each shoe is displayed
    And I verify an image for each shoe is displayed


    Examples:

      |URL|month|
      |https://rb-shoe-store.herokuapp.com/|May|

  @test1 #Story 1 Test Case 7
  Scenario Outline: Verify the page for June

    Given I open Chrome and navigate to "<URL>"
    When I click the month link for "<month>"
    Then I verify the page loads for "<month>"
    And I verify a list of shoes is displayed
    And I verify a description for each shoe is displayed
    And I verify a suggested price for each shoe is displayed
    And I verify an image for each shoe is displayed


    Examples:

      |URL|month|
      |https://rb-shoe-store.herokuapp.com/|June|

  @test1 #Story 1 Test Case 8
  Scenario Outline: Verify the page for July

    Given I open Chrome and navigate to "<URL>"
    When I click the month link for "<month>"
    Then I verify the page loads for "<month>"
    And I verify a list of shoes is displayed
    And I verify a description for each shoe is displayed
    And I verify a suggested price for each shoe is displayed
    And I verify an image for each shoe is displayed


    Examples:

      |URL|month|
      |https://rb-shoe-store.herokuapp.com/|July|

  @test1 #Story 1 Test Case 9
  Scenario Outline: Verify the page for August

    Given I open Chrome and navigate to "<URL>"
    When I click the month link for "<month>"
    Then I verify the page loads for "<month>"
    And I verify a list of shoes is displayed
    And I verify a description for each shoe is displayed
    And I verify a suggested price for each shoe is displayed
    And I verify an image for each shoe is displayed


    Examples:

      |URL|month|
      |https://rb-shoe-store.herokuapp.com/|August|

  @test1 #Story 1 Test Case 10
  Scenario Outline: Verify the page for September

    Given I open Chrome and navigate to "<URL>"
    When I click the month link for "<month>"
    Then I verify the page loads for "<month>"
    And I verify a list of shoes is displayed
    And I verify a description for each shoe is displayed
    And I verify a suggested price for each shoe is displayed
    And I verify an image for each shoe is displayed


    Examples:

      |URL|month|
      |https://rb-shoe-store.herokuapp.com/|September|

  @test1 #Story 1 Test Case 11
  Scenario Outline: Verify the page for October

    Given I open Chrome and navigate to "<URL>"
    When I click the month link for "<month>"
    Then I verify the page loads for "<month>"
    And I verify a list of shoes is displayed
    And I verify a description for each shoe is displayed
    And I verify a suggested price for each shoe is displayed
    And I verify an image for each shoe is displayed


    Examples:

      |URL|month|
      |https://rb-shoe-store.herokuapp.com/|October|

  @test1 #Story 1 Test Case 12
  Scenario Outline: Verify the page for November

    Given I open Chrome and navigate to "<URL>"
    When I click the month link for "<month>"
    Then I verify the page loads for "<month>"
    And I verify a list of shoes is displayed
    And I verify a description for each shoe is displayed
    And I verify a suggested price for each shoe is displayed
    And I verify an image for each shoe is displayed


    Examples:

      |URL|month|
      |https://rb-shoe-store.herokuapp.com/|November|

  @test1 #Story 1 Test Case 13
  Scenario Outline: Verify the page for December

    Given I open Chrome and navigate to "<URL>"
    When I click the month link for "<month>"
    Then I verify the page loads for "<month>"
    And I verify a list of shoes is displayed
    And I verify a description for each shoe is displayed
    And I verify a suggested price for each shoe is displayed
    And I verify an image for each shoe is displayed


    Examples:

      |URL|month|
      |https://rb-shoe-store.herokuapp.com/|December|

  @test1 #Story 2 Test Case 1
  Scenario Outline: Verify website loads and there is a field enter an email address

    Given I open Chrome and navigate to "<URL>"
    Then I verify the label for the email address field
    And I verify the input field for the email address
    And I verify the submit button for the email address

    Examples:

      |URL|
      |https://rb-shoe-store.herokuapp.com/|

  @test1 #Story 2 Test Case 2
  Scenario Outline: Verify message when email Submit button is clicked with no email entered

    Given I open Chrome and navigate to "<URL>"
    When I click the email Submit button
    Then I verify the reminder message to enter an email


    Examples:

      |URL|
      |https://rb-shoe-store.herokuapp.com/|


  @test1 #Story 2 Test Case 3
  Scenario Outline: Submit a valid address and verify the message

    Given I open Chrome and navigate to "<URL>"
    When I enter an email address "<email>"
    And  I click the email Submit button
    Then I verify the email submit message "<email>"


    Examples:

      |URL|email|
      |https://rb-shoe-store.herokuapp.com/|joe@joe.com|


  @test1 #Story 2 Test Case 4
  Scenario Outline: Submit an invalid address and verify the message

    Given I open Chrome and navigate to "<URL>"
    When I enter an email address "<email>"
    And  I click the email Submit button
    Then I verify the invalid email submit message "<email>"


    Examples:

      |URL|email|
      |https://rb-shoe-store.herokuapp.com/|joe|
