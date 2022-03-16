package pageObjects;

import commons.BasePage;
import commons.PageGeneratorManager;
import org.openqa.selenium.WebDriver;
import pageUIs.LoginPageUI;

public class LoginPageObject extends BasePage {
  WebDriver driver;
  
  public LoginPageObject(WebDriver driver) {
    this.driver = driver;
  }
  
  public ManagerPageObject loginToSystem(String userName, String password) {
    waitForElementVisible(driver, LoginPageUI.USERNAME_TEXTBOX);
    senkeyToElement(driver, LoginPageUI.USERNAME_TEXTBOX, userName);
    
    waitForElementVisible(driver, LoginPageUI.PASSWORD_TEXTBOX);
    senkeyToElement(driver, LoginPageUI.PASSWORD_TEXTBOX, password);
    
    waitForElementClickable(driver, LoginPageUI.LOGIN_BUTTON);
    clickToElement(driver, LoginPageUI.LOGIN_BUTTON);
    return PageGeneratorManager.getManagerPageObject(driver);
  }
}
