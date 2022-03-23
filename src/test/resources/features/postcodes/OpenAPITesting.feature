Feature: Open API Testing

#  @idenritytest
#  Scenario: Create user
#    When I create new User with name is "RofikAw" and job is "Quality Assurance"
#    Then New user is created
#    And New user name is "RofikAw" and job is "Quality Assurance"

  @TestLinkAPI
  Scenario: test link API
    When user test API link with input several body userName "admin" email "admin@mail" and password "adminadmin"
    Then user success test link API

  @login
  Scenario: login mr clinic
    When user login with username "rofik1" and password is "rofik123"
    Then user success login

  @Registrasidoctor
  Scenario: doctor register
    When user register with username "doctorA12" email is "doctor55@email.com" password is "doctor123" name "theRealDoctor" address "Los Ageless, United Stated of America" status "available" openDay "senin" closeDay "jumat" capacity "10"
    Then success add Doctor

  @Registrasipatient
  Scenario: patient register
    When patient register with username "daenerys61" email is "daenerys@email.com" password is "daenery7" nik "3307123456789" name "daenery7" gender "wanita" address "kroya, cilacap, central java, Indonesia" placeBrith "cilacap" dob "01-12-1962" job "mother of dragon" status "caraiMati" religion "islam"
    Then success add patient

  @UpdatePatient
  Scenario: Update Patient success get all Patient list/ register patient part 2
    When update new doctor with nik "3305567891234567" name "narto" gender "pria" address "konoha jiraya nakagama" job "shinobi" status "belumKawin" religion "islam" placeBirth "malang" dob "05-05-2000"
    Then success update Patient

  @GetAllPatientList
  Scenario: Get List Patient
    When admin want to Get all list patient with input several of query params contain kind "doctor" uid "VtPsYQUdHgqiZJ2mujSLvJ" and grouped "patient"
    Then success get all Patient list

  @[POST]addvisit
  Scenario: post add visit
    When post add visit with insert body form-data doctor_uid "VtPsYQUdHgqiZJ2mujSLvJ" date "15-03-2022" complaint "tyfus"
    Then success add visit

  @GetVisitQueue
  Scenario: Get visit Queue
    When admin want to get visit Queue by in several of query params containt kind "doctor" uid "VtPsYQUdHgqiZJ2mujSLvJ" and status "pending"
    Then admin want to success get the visit queue list

  @UpdateVisitConfirmation
  Scenario: Put visit Confirmation
    When user update visit with input query params visit_uid "iypcsTa3fjto9mwiqrSG27" and body form-data "ready"
    Then user success update visit status

  @Gethistoryofexaminationanddiagnosis
  Scenario: history of examination and diagnosis
    When admin get history of examination and diagnosis with input several query params contain kind "patient" uid "hotaru123" status "ready"
    Then admin success get history of examination and diagnosis
