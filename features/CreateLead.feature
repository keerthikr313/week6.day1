Feature: LeafTaps Create Lead functionality

Background:
Given Open the chrome browser
And Load the application url

Scenario: Create Lead with mandatory information

Given Enter the username as 'demosalesmanager'
And Enter the password as 'crmsfa'
When Click on Login button
Then Homepage should be displayed
When click on CRMSFA link
Then MyHomepage should be displayed
