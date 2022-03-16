package commons;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.Reporter;
import reportConfig.VerificationFailures;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class BaseTest {
  protected WebDriver driver;
  protected final Log log;
  
  protected BaseTest() {
    log = LogFactory.getLog(getClass());
  }
  
  public WebDriver getDriver() {
    return this.driver;
  }
  
  public WebDriver getBrowserDriver(String browserName, String appUrl){
    if (browserName.equals("firefox")){
      WebDriverManager.firefoxdriver().setup();
      driver = new FirefoxDriver();
      
    } else if( browserName.equals("chrome")){
      WebDriverManager.chromedriver().setup();
      driver = new ChromeDriver();
    }
  
    driver.manage().timeouts().implicitlyWait(GlobalConstants.SHORT_TIME, TimeUnit.SECONDS);
    driver.manage().window().maximize();
    driver.get(appUrl);
    return driver;
  }
  
  protected int getRandomNumber() {
    Random random = new Random();
    return random.nextInt(999);
  }
  
  protected boolean verifyTrue(boolean condition) {
    boolean pass = true;
    try {
      Assert.assertTrue(condition);
      log.info(" -------------------------- PASSED -------------------------- ");
    } catch (Throwable e) {
      pass = false;
      log.info(" -------------------------- FAILED -------------------------- ");
      VerificationFailures.getFailures().addFailureForTest(Reporter.getCurrentTestResult(), e);
      Reporter.getCurrentTestResult().setThrowable(e);
    }
    return pass;
  }
  
  protected boolean verifyFalse(boolean condition) {
    boolean pass = true;
    try {
      Assert.assertFalse(condition);
      log.info(" -------------------------- PASSED -------------------------- ");
    } catch (Throwable e) {
      pass = false;
      log.info(" -------------------------- FAILED -------------------------- ");
      VerificationFailures.getFailures().addFailureForTest(Reporter.getCurrentTestResult(), e);
      Reporter.getCurrentTestResult().setThrowable(e);
    }
    return pass;
  }
  
  protected boolean verifyEquals(Object actual, Object expected) {
    boolean pass = true;
    try {
      Assert.assertEquals(actual, expected);
      log.info(" -------------------------- PASSED -------------------------- ");
    } catch (Throwable e) {
      pass = false;
      log.info(" -------------------------- FAILED -------------------------- ");
      VerificationFailures.getFailures().addFailureForTest(Reporter.getCurrentTestResult(), e);
      Reporter.getCurrentTestResult().setThrowable(e);
    }
    return pass;
  }
}
