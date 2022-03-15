Feature: Open API Testing


  @idenritytest
  Scenario: Create user
    When I create new User with name is "RofikAw" and job is "Quality Assurance"
    Then New user is created
    And New user name is "RofikAw" and job is "Quality Assurance"

  @loginpatient
  Scenario: login mr clinic (Patient)
    When Patient login with username "daenerys46" and password is "daenery7"
    Then Patient success login

#  @loginpatient
#  Scenario: login doctor
#    When Patient login with username "completeHotaru" and password is "hotaru"
#    Then Patient success login

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
  Scenario: Update Patient
    When update new doctor with username "completeHotarunew" email is "hotaru@gmail.com" password is "hotaru" gender is "wanita" address is "kalimaya" job is "Software Enginner" status "kawin" religion "Judaism"
    Then success update Patient

  @GetPatientProfile
  Scenario: Get Patient Profile
    When get patient profile with insert form query params patient_uid "WiRttJjaRjfoRzMmZ6bWgk"
    Then success get patient profile

  @GetVisit
  Scenario: Get visit
    When user get visit by status "pending"
    Then user success get the visit list

  @UpdateVisit
  Scenario: Put visit
    When user update visit with input query params visit_uid "iPpXsHdpHQEX45vCgDbo8" with name of complaint "Membatalkan Komplain" with main diagnose penyakit sejuta umat yakni "Tifus" and additional diagnose "Gastroenteritis"  action "Minum obat dan jangan makan pedes" recipe "Amoxxicillin" bloodPressuse "120" heart rate "90" O2 saturated "100" weight "75"  height "174" bmi "2" status "cancelled"
    Then user success update visit status
