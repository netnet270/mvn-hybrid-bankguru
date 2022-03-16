package pageObjects;

import commons.BasePage;
import org.openqa.selenium.WebDriver;
import pageUIs.ManagerPageUI;

public class ManagerPageObject extends BasePage {
  WebDriver driver;
  
  public ManagerPageObject(WebDriver driver) {
    this.driver = driver;
  }
  
  public String getLoginSuccessMessage() {
    waitForElementVisible(driver, ManagerPageUI.LOGIN_SUCCESS_MESSAGE);
    return getTextElement(driver, ManagerPageUI.LOGIN_SUCCESS_MESSAGE);
  }
}
