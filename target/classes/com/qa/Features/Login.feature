Feature: Account Creation 

As a user 
I want to create account and link my Near account 
So that I can get access to the platform 

Scenario: User successfully creates Mtvrs account and links Near account to land on home page

Given User has a Near account in the web browser 
And User is on the Sign-in page
When User Clicks on Sign Up
And User lands on How it works page
And User Clicks on CREATE YOUR ACCOUNT button
And User lands on Welcome to Mtvrs page 
And User enters valid email address "test@gmail.com"
And User clicks on Continue 
And User enters a valid username "ajaytest"
And User clicks on Continue 
And User enters valid password "ajay#1234"
And User enters correct confirm password "ajay#1234"
And User clicks on Connect your NEAR account 
And User lands on Near Web Wallet 
And User selects a Near address "top town"
And User clicks on Next on Connect with NEAR page 
And User clicks on Connect on Connecting with account page
Then User lands on Games page 
And User is shown "ajaytest" 
And User is shown "top town"