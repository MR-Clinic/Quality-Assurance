Feature: Open API Testing


  @idenritytest
  Scenario: Create user
    When I create new User with name is "RofikAw" and job is "Quality Assurance"
    Then New user is created
    And New user name is "RofikAw" and job is "Quality Assurance"

  @login
  Scenario: login mr clinic
    When user login with username "daenerys46" and password is "daenery7"
    Then user success login

#Dashboard Admin

  @[POST]addvisit
  Scenario: post add visit
    When post add visit with insert body form-data doctor_uid "VtPsYQUdHgqiZJ2mujSLvJ" date "15-03-2022" complaint "tyfus"
    Then success add visit

#  @GetTotalVisitList
#  Scenario: Get Total Visit List
#    When get total visit list with insert form query params kind "doctor" uid "VtPsYQUdHgqiZJ2mujSLvJ" status "pending"
#    Then success get patient profile

  @Registrasidoctor
  Scenario: doctor register
    When user register with username "doctorA" email is "doctor@email.com" and password is "doctor123"
    Then success add Doctor

  @Registrasipatient
  Scenario: patient register
    When patient register with username "daenerys46" email is "daenerys@email.com" password is "daenery7" nik "3307123456789" name "daenery7" gender "wanita" address "kroya, cilacap" placeBrith "cilacap" dob "01-12-1962" job "mother of dragon" status "caraiMati" religion "islam"
    Then success add patient

  @UpdateDoctor
  Scenario: Update Doctor
    When update new doctor with name "name new doctor 20" and capacity is "10"
    Then success update Doctor

  @UpdatePatient
  Scenario: Update Patientsuccess get all Patient list
    When update new doctor with username "completeHotarunew" email is "hotaru@gmail.com" password is "hotaru" gender is "wanita" address is "kalimaya" job is "Software Enginner" status "kawin" religion "Judaism"
    Then success update Patient

  @GetAllPatientList
  Scenario: Get List Patient
    When admin want to Get all list patient with input several of query params contain kind "doctor" uid "VtPsYQUdHgqiZJ2mujSLvJ" and grouped "patient"
    Then success get all Patient list

  @GetVisitQueue
  Scenario: Get visit Queue
    When admin want to get visit Queue by in several of query params containt kind "doctor" uid "VtPsYQUdHgqiZJ2mujSLvJ" and status "pending"
    Then admin want to success get the visit queue list

  @UpdateVisitConfirmation
  Scenario: Put visit Confirmation
    When user update visit with input query params visit_uid "iypcsTa3fjto9mwiqrSG27" status "ready"
    Then user success update visit status
