Feature: User Sign Up

  Scenario Outline: Successful user registration
    Given user is on Certificate service SignIn
    And user clicks on sign-up link
    When the user provides valid registration details in "<FirstName>""<LastName>""<UserName>""<Email>""<Password>" and "<confirmPassword>"
    And clicks the sign-up button
    And redirected to the SignIn page
    
    Examples:
    
    |FirstName  |LastName  |UserName |Email                |Password     |confirmPassword |
    |Ridansh    |Khanna    |ridankha23|ridan33@gmail.com  |12345678      |12345678        |
    |Mani       |saini     |Priyakh  |saini@yahoo.com      |@@@          |12345           |
    |M          |S         |Priya123 |sam@hotmail.com      |123@pri      |123@pri         |
    |           |          |123@&    |we  @&gmail.in       |****  89     |&&&&&90   07    |
    |Ridansh    |Khanna    |ridan23  |ridan223@gmail.com   |12345678@    |12345678@      |
  
  #Scenario: User signUp with missing information
    #Given the user is on the sign-up page
    #When the user provides incomplete registration details
    #Then error message should be displayed for each incomplete field
    #But the user should stay on the sign-up page
    #
    #Scenario: User signUp with invalid information
    #Given the user is on the sign-up page
    #When the user provides invalid registration details
    #Then error message should be displayed for each invalid field
    #But the user should stay on the sign-up page
#
  #Scenario: User signUp with an existing email
    #Given the user is on the sign-up page
    #And there is an existing user with the same email
    #When the user provides registration details with the existing email
    #And clicks the sign-up button
    #Then an error message should be displayed
    #But the user should stay on the sign-up page
    #
    #Scenario: User signUp with an existing username
    #Given the user is on the sign-up page
    #And there is an existing user with the same username
    #When the user provides registration details with the existing username
    #And clicks the sign-up button
    #Then an error message should be displayed
    #But the user should stay on the sign-up page
#
  #Scenario: User signUp with password length less than 8 characters
    #Given the user is on the sign-up page
    #When the user provides a password less than 8 characters
    #And clicks the sign-up button
    #Then an error message should be displayed
    #But the user should stay on the sign-up page
