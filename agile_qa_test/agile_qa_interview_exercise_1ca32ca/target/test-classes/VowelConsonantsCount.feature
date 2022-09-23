Feature: Validate functionality to get count of vowels and consonants from an array of a string. Also validate if up to four string could be concatenated

Scenario Outline: Verify count of vowels of each string is correct
		When user inputs string array "<array_of_strings>" to method 
		Then verify vowel "<count>" for each string is returned
		Examples:
		| array_of_strings | 	   count	  			 |
		| abc, acd, def  	 | abc=1, acd=1, def=1 |

Scenario Outline: Verify count of consonants of each string is correct
		When user inputs string array "<array_of_strings>" to method 
		Then verify consonant "<count>" for each string is returned
		Examples:
		| array_of_strings | 	   count	  			 |
		| abc, acd, def  	 | abc=2, acd=2, def=2 |

Scenario Outline: Verify error message if more than four strings are passed
		When user inputs string array "<array_of_strings>" to method 
		Then verify error message "<message>" is displayed
		Examples:
		| array_of_strings   			| 	   message	  			 |
		| abc, acd, def, cbi, zcl | Extra arguments passed. |
		
Scenario Outline: verify count of vowels and consonants for blank arguments
		When user inputs string array "" to method 
		Then verify vowel "<count>" for each string is returned
		Then verify consonant "<count>" for each string is returned
		Examples:
		| count |
		| =0    |
		
Scenario Outline: Verify count of vowels and consonants when one of the string is blank
		When user inputs string array "<array_of_strings>" to method 
		Then verify vowel "<count>" for each string is returned
		Then verify consonant "<count1>" for each string is returned
		Examples:
		| array_of_strings | 	   count	  			   |	count1					|
		| abc, , acd    	 | abc=1, =0, acd=1 	   | abc=2, =0, acd=2 |
