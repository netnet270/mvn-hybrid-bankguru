package commons;

import org.openqa.selenium.WebDriver;
import pageObjects.LoginPageObject;
import pageObjects.ManagerPageObject;
import pageObjects.NewCustomerPageObject;

public class PageGeneratorManager {
  public static LoginPageObject getLoginPageObject(WebDriver driver){
    return new LoginPageObject(driver);
  }
  
  public static ManagerPageObject getManagerPageObject(WebDriver driver){
    return new ManagerPageObject(driver);
  }
  
  public static NewCustomerPageObject getNewCustomerPageObject(WebDriver driver){
    return new NewCustomerPageObject(driver);
  }
}
