Feature: Login pasien

  @loginvaliddata
  Scenario: Login with valid data to Mr Clinic
    Given User open the mr clinic homepage
    When User click login button
    And user input username dan password
    And user click button login
    Then user direct to dashboard

    @loginwithblankusername
  Scenario: Login with blank username
    Given User open the mr clinic homepage
    When User click login button
    And user input password
    And user click button login
    Then user direct pop up error massage

  @loginwithblankpassword
  Scenario: Login with blank password
    Given User open the mr clinic homepage
    When User click login button
    And user input username
    And user click button login
    Then user direct pop up error massage