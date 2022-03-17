Feature: Open API Testing

#  @idenritytest
#  Scenario: Create user
#    When I create new User with name is "RofikAw" and job is "Quality Assurance"
#    Then New user is created
#    And New user name is "RofikAw" and job is "Quality Assurance"

  @login
  Scenario: login mr clinic
    When user login with username "melatidokter212" and password is "melatidokter1"
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
  Scenario: Update Patient success get all Patient list
    When update new doctor with password is "hotaru" gender is "wanita" address is "kalimaya" job is "Software Enginner" status "kawin" religion "Judaism" file "https://www.teralogistics.com/wp-content/uploads/2020/12/default.png"
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
