Feature: Login on the (with existing user)

  Scenario: Successful log in
As a user I want to log in using my account name and password, so that I can manage my purchases from my personal account

  Given I am on the https://rozetka.com.ua/ main page
  And Have been already registered
  And The account is successfully validated

  When I click a “Sign in Personal Cabinet”
  And Input the registered valid login email and password
  And Hit a “Log in” button

  Then I am successfully logged in
  And I see Rozetka’s main screen



