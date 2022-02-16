@AddAddress @Scenario1 @UI
Feature: Add address in the address screen

  Scenario:  verify that user able to login to mercary application
    Given user is on mercari home page
    Then Verify Mercari Home page is displayed
    When Login with valid UserName and Password using login with email option
    

  Scenario Outline: verify user able to add new address in the address section
    Given user is on home page
    When user navigates to "My Page" tab and clicks "Change Email Address" pane
    Then add adress with "<Country>",  "<ZipCode>", "<State>",  "<Address1>", "<Address2>",  "<Address3>", "<City>", "<RecipientName>", "<TelephoneNum>", "<MainShippingAddress>",  "<AddressBookName>"
    And verify that the entered "<Country>",  "<ZipCode>", "<State>",  "<Address1>", "<Address2>",  "<Address3>", "<City>", "<RecipientName>", "<TelephoneNum>", "<MainShippingAddress>",  "<AddressBookName>" deatails are displayed
    Examples:
      |Country|ZipCode |State     |Address1                |Address2    |Address3 |City    |RecipientName |TelephoneNum |MainShippingAddress|AddressBookName  |
      |India  | 636809 |Tamil Nadu|3rd Panchayat Link Road |Doshi Etopia|Perungudi|Chennai |Seetharaman   |9894446053   |Yes                |Home             |
      |India  | 636809 |Tamil Nadu|2rd Panchayat Link Road |Doshi Etopia|Perungudi|Chennai |Mizuma        |9894446053   |Yes                |Office           |