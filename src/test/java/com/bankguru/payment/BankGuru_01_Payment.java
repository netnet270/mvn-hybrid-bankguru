package com.bankguru.payment;

import commons.BaseTest;
import commons.PageGeneratorManager;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pageObjects.LoginPageObject;
import pageObjects.ManagerPageObject;
import pageObjects.NewCustomerPageObject;

public class BankGuru_01_Payment extends BaseTest {
  WebDriver driver;
  LoginPageObject loginPage;
  NewCustomerPageObject newCustomerPage;
  ManagerPageObject managerPage;
  String userName, password, customerName, genderValueInput, genderValueOutput, dateOfBirthInput, dateOfBirthOutput, address, city, state, pin, phone, email, customerID, passwordCustomer;
  
  @Parameters({"browser", "url"})
  @BeforeClass
  public void BeforeClass(String browserName, String appUrl) {
    log.info("Pre_Condition - Step 01: Open browser");
    driver = getBrowserDriver(browserName, appUrl);
    loginPage = PageGeneratorManager.getLoginPageObject(driver);
    
    userName = "mngr392664";
    password = "dezyzUp";
    customerName = "AUTOMATION TESTING";
    genderValueInput = "f";
    genderValueOutput = "female";
    dateOfBirthInput = "01/01/1989";
    dateOfBirthOutput = "1989-01-01";
    address = "PO Box 911 8331 Duis Avenue";
    city = "Tampa";
    state = "FL";
    pin = "466250";
    phone = "4555442476";
    email = "automation" + getRandomNumber() + "@gmail.com";
    passwordCustomer = "123456";
    
    log.info("Pre_Condition - Step 02: Login to system");
    managerPage = loginPage.loginToSystem(userName, password);
    
    log.info("Pre_Condition - Step 03: Verify success message is displayed");
    verifyEquals(managerPage.getLoginSuccessMessage(), "Welcome To Manager's Page of Guru99 Bank");
  }
  
  @Test
  public void Payment_01_Create_New_Customer() {
    log.info("Create_New_Customer_01 - Step 01: Open New Customer Page");
    managerPage.openManagerTabByText(driver, "New Customer");
    newCustomerPage = PageGeneratorManager.getNewCustomerPageObject(driver);
    
    log.info("Create_New_Customer_01 - Step 02: Enter to Customer Name textbox with value: " + customerName);
    newCustomerPage.enterToTextboxByLabel(driver, "Customer Name", customerName);
    
    log.info("Create_New_Customer_01 - Step 03: Select to Gender radio button with value: " + genderValueInput);
    newCustomerPage.selectToRadioButton(driver, genderValueInput);
    
    log.info("Create_New_Customer_01 - Step 04: Enter to Date of Birth textbox with value: " + dateOfBirthInput);
    newCustomerPage.enterToTextboxByLabel(driver, "Date of Birth", dateOfBirthInput);
    
    log.info("Create_New_Customer_01 - Step 05: Enter to Address textbox with value: " + address);
    newCustomerPage.enterToTextareaByLabel(driver, "Address", address);
    
    log.info("Create_New_Customer_01 - Step 06: Enter to City textbox with value: " + city);
    newCustomerPage.enterToTextboxByLabel(driver, "City", city);
    
    log.info("Create_New_Customer_01 - Step 07: Enter to State textbox with value: " + state);
    newCustomerPage.enterToTextboxByLabel(driver, "State", state);
    
    log.info("Create_New_Customer_01 - Step 08: Enter to PIN textbox with value: " + pin);
    newCustomerPage.enterToTextboxByLabel(driver, "PIN", pin);
    
    log.info("Create_New_Customer_01 - Step 09: Enter to Mobile Number textbox with value: " + phone);
    newCustomerPage.enterToTextboxByLabel(driver, "Mobile Number", phone);
    
    log.info("Create_New_Customer_01 - Step 10: Enter to E-mail textbox with value: " + email);
    newCustomerPage.enterToTextboxByLabel(driver, "E-mail", email);
    
    log.info("Create_New_Customer_01 - Step 11: Enter to Password textbox with value: " + passwordCustomer);
    newCustomerPage.enterToTextboxByLabel(driver, "Password", passwordCustomer);
    
    log.info("Create_New_Customer_01 - Step 12: CLick to Submit button");
    newCustomerPage.clickToButtonByValue(driver, "Submit");

    log.info("Create_New_Customer_01 - Step 13: Verify create customer success message is displayed");
    verifyEquals(newCustomerPage.getCreateCustomerSuccessMessage(), "Customer Registered Successfully!!!");
  
    log.info("Create_New_Customer_01 - Step 14: Get customer ID value ");
    customerID = newCustomerPage.getRowValueByRowName(driver, "Customer ID");
    
    log.info("Create_New_Customer_01 - Step 15: Verify text displayed at Customer Name with value: " + customerName);
    verifyEquals(newCustomerPage.getRowValueByRowName(driver, "Customer Name"), customerName);
    
    log.info("Create_New_Customer_01 - Step 16: Verify text displayed at Gender with value: " + genderValueOutput);
    verifyEquals(newCustomerPage.getRowValueByRowName(driver, "Gender"), genderValueOutput);
    
    log.info("Create_New_Customer_01 - Step 17: Verify text displayed at Birthdate with value: " + dateOfBirthOutput);
    verifyEquals(newCustomerPage.getRowValueByRowName(driver, "Birthdate"), dateOfBirthOutput);
    
    log.info("Create_New_Customer_01 - Step 18: Verify text displayed at Address with value: " + address);
    verifyEquals(newCustomerPage.getRowValueByRowName(driver, "Address"), address);
    
    log.info("Create_New_Customer_01 - Step 19: Verify text displayed at City with value: " + city);
    verifyEquals(newCustomerPage.getRowValueByRowName(driver, "City"), city);
    
    log.info("Create_New_Customer_01 - Step 20: Verify text displayed at State with value: " + state);
    verifyEquals(newCustomerPage.getRowValueByRowName(driver, "State"), state);
    
    log.info("Create_New_Customer_01 - Step 21: Verify text displayed at Pin with value: " + pin);
    verifyEquals(newCustomerPage.getRowValueByRowName(driver, "Pin"), pin);
    
    log.info("Create_New_Customer_01 - Step 22: Verify text displayed at Mobile No. with value: " + phone);
    verifyEquals(newCustomerPage.getRowValueByRowName(driver, "Mobile No."), phone);
    
    log.info("Create_New_Customer_01 - Step 23: Verify text displayed at Email with value: " + email);
    verifyEquals(newCustomerPage.getRowValueByRowName(driver, "Email"), email);
  }
  
  @Test
  public void Payment_02_Edit_Customer() {
  
  }
  
  @Test
  public void Payment_03_Add_New_Account() {
  
  }
  
  @Test
  public void Payment_04_Edit_Account() {
  
  }
  
  @Test
  public void Payment_05_Transfer_Money_Into_Current_Account() {
  
  }
  
  @Test
  public void Payment_06_Withdraw_Money_Into_Current_Account() {
  
  }
  
  @Test
  public void Payment_07_Transfer_Money_Into_Another_Account() {
  
  }
  
  @Test
  public void Payment_08_Check_Current_Account_Balance() {
  
  }
  
  @Test
  public void Payment_09_Delete_All_Account() {
  
  }
  
  @Test
  public void Payment_10_Delete_Exist_Customer_Account() {
  
  }
  
  @AfterClass
  public void afterClass() {
    driver.quit();
  }
}
