Feature: Scenario Outline Example
	@outline

  Scenario Outline: 
    When Login with "<username>" and "<password>"
    And Click on the Login button
    Then Validate that "<username>" is displayed
    And We want to say Bye "<fullname>"

   
   Examples: 
      | username | password | fullname      |
      | Emine    | e1234    | Emine Karakaya |
      | Volkan   | v1234    | Volkan Gedik   |
      | Harun    | h1234    | Harun Bicakci  |