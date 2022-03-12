Feature: Reqres API


  @createUser
  Scenario: Create user
    When I create new User with name is "RofikAw" and job is "Quality Assurance"
    Then New user is created
    And New user name is "RofikAw" and job is "Quality Assurance"

  @loginmrclinic
  Scenario: login mr clinic
    When user login with username "userName" and password is "password"
    Then user success login
