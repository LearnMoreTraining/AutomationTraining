Feature: To validate the login page of Salesforce

  Background:
    Given User Navigates to the login page

  @Today123
  Scenario: To validate the error message in login page
    When user Enters the username "Aravinth" and password "123"
    #And User clicks the login button
   # Then User Validates the error message

  @Aravinth
  Scenario: To Validate the login functionality with valid user name and password
    When user Enters the username "learnmore" and password "345"
    And User clicks the login button
    Then User should navigate to the homepage

  Scenario Outline:  To Validate the login functionality with valid user name and password
    When user Enters the username <UserName> and password <Password>
    And User clicks the login button
    Then User should navigate to the homepage

    Examples:
        |UserName|Password|
        | Aravinth       |    1233    |
        | kavi         |     yeue       |
        | Goki          |       hshs         |

   @Aravinth  @Smoke
    Scenario:  To select the currency dropdown value

      Given  User Navigates to the Spicejet homepage
      When User clicks the currency dropdown
      Then User selects the specified value from the dropdown
      And User rerives the values


    @Wiki
    Scenario:  wiki tabel validation
      Given Wiki tabel


    @DynmaicDrop
    Scenario:  Handle Dynmaic Dropdown
      Given User navigate to the homepage
      When User Selects the Specified value from the From Dropdown
      And User Selects the Specified value from the To Dropdown


      @AutoSuggestive
  Scenario: AutoSuggestive
    Given User navigate to the homepage
    When User selects the Autosuggestive value

    @MapExample
      Scenario: Map Ex
      When Execute Map

    @Frame
      #Pre
    Scenario: frame
      Given Frame Validation
#post
    @Excel
    Scenario:  excel
      Given  User Navigates to the login page
      When User enter the username and password

  @WindowHandling
  Scenario:  Handle Window
    When Set example





