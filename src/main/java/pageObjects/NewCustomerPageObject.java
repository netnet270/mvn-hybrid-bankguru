package pageObjects;

import commons.BasePage;
import org.openqa.selenium.WebDriver;
import pageUIs.NewCustomerPageUI;

public class NewCustomerPageObject extends BasePage {
  WebDriver driver;
  
  public NewCustomerPageObject(WebDriver driver) {
    this.driver = driver;
  }
  
  public String getCreateCustomerSuccessMessage() {
    waitForElementVisible(driver, NewCustomerPageUI.CREATE_CUSTOMER_SUCCESS_MESSAGE);
    return getTextElement(driver, NewCustomerPageUI.CREATE_CUSTOMER_SUCCESS_MESSAGE);
  }
}
