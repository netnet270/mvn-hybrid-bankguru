package pageUIs.bankguru;

public class BasePageUI {
  // BankGuru
  public static final String DYNAMIC_MANAGER_TAB_BY_TEXT = "xpath=//ul[@class='menusubnav']//a[text()='%s']";
  public static final String DYNAMIC_TEXTBOX_BY_LABEL = "xpath=//td[text()='%s']//following-sibling::td/input";
  public static final String DYNAMIC_BUTTON_BY_VALUE = "xpath=//input[@value='%s']";
  public static final String RADIO_BUTTON = "xpath=//input[@type='radio' and @value='%s']" ;
  public static final String DYNAMIC_ROW_VALUE_BY_ROW_NAME = "xpath=//td[text()='%s']/following-sibling::td";
  public static final String DYNAMIC_TEXTAREA_BY_LABEL = "xpath=//td[text()='%s']//following-sibling::td/textarea";
  public static final String DYNAMIC_DROPDOWN_BY_NAME = "xpath=//select[@name='%s']";
  public static final String SUCCESS_MESSAGE_AT_TABLE_ID = "xpath=//table[@id='%s']//p[@class='heading3']";
  
  // Nopcommerce
  public static final String DYNAMIC_BUTTON_BY_TEXT = "xpath=//button[text()='%s']";
  public static final String DYNAMIC_ERROR_MESSAGE_AT_FIELD_BY_ID = "xpath=//span[@class='field-validation-error']/span[@id='%s']";
  public static final String DYNAMIC_PAGE_IN_AREA_BY_TEXT = "xpath=//div[@class='%s']//a[text()='%s']";
  public static final String DYNAMIC_TEXTBOX_BY_ID = "xpath=//input[@id='%s']";
}
