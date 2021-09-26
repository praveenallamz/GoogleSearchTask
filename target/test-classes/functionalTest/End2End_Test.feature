Feature: Open Google, search for “J. P. Morgan”, click the first result returned by Google, verify that the J.P. Morgan logo is shown 

Scenario Outline: Google Search given text and verify logo displayed as expected 
	Given user is on Home Page 
	When he search for "<SearchText>" 
	Then choose the first item from list 
	And Verify the logo is displayed 
	
	Examples: 
		| SearchText   | 
		| J. P. Morgan |
		
   