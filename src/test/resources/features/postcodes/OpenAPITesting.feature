Feature: Open API Testing


  @GetListPatientThisDay
  Scenario: Get List Patient This Day
    When user want to Get all list patient with input several of query params contain kind "doctor" uid "VtPsYQUdHgqiZJ2mujSLvJ" and day of this day "14-03-2022" and grouped "patient"
    Then user get list patient today

  @getPatientGeneralData
  Scenario: Get Patient General Data/ Patient Information
    When user get patient general data with input query params patient_uid "WiRttJjaRjfoRzMmZ6bWgk"
    Then admin get list patient today

  @UpdateInpectionData
  Scenario: Put inspection data
    When user update inpection data with input query params visit_uid "wVM99u8o5mEJGN5cvJHJie" and body form-data contain complaint "banyak antri" mainDiagnose "tyfus" additionalDiagnose "muntaber" action "minum obat dan jangan makan pedes" recipe "amoxicillin" bloodPressure "120" heartRate "90" o2Saturate "100" weight "70" height "175" bmi "2" status "ready"
    Then user success update inpection data

  @getalldoctor's
  Scenario: Get All Doctor Profile Account
    When user get doctor account profile with insert the endpoint
    Then user success Get Doctor Profile Account

  @EditAccountDoctor
  Scenario: edit/update doctor account
    When user edit doctor account with input several body form-data contain name "dr sulaiman hadar al farezy" address "karangnggayu, bayunmas, jawa tengah" status "available" openDay "senin" closeDay "kamis" capacity "11" and file "https://www.teralogistics.com/wp-content/uploads/2020/12/default.png"
    Then user success edit Doctor Profile Account

  @CheckUsernameDoctor
  Scenario: get profile doctor by userName
    When user get profile doctor check by userName "bejo123"
    Then user get profile doctor by userName

  @CheckUsernamePatient
  Scenario: get profile patient by userName
    When user get profile patient check by userName "hotaru123"
    Then user get profile patient by userName

  @CheckemailDoctor
  Scenario: get profile doctor by email
    When user get profile doctor check by email "muhammadbejo47@gmail.com"
    Then user get profile doctor by email

  @CheckemailPatient
  Scenario: get profile patient by email
    When user get profile patient check by email "genhotaru@gmail.com"
    Then user get profile patient by email

  @DeleteDoctor
  Scenario: delete doctor
    When user delete doctor with name "dr sadad"
    Then user success delete doctor

  @DeletePatient
  Scenario: delete patient
    When user want to delete patient account with insert the endpoint and bearer token
    Then user success delete patient

  @DeleteVisit
  Scenario: delete visit
    When user delete visit with insert query params visit_uid "DwGmh6i7uYR62DtiEhDtaj" and insert body form-data status "cancelled"
    Then user success delete visit