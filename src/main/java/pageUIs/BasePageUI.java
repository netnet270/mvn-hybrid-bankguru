package pageUIs;

public class BasePageUI {
  public static final String DYNAMIC_MANAGER_TAB_BY_TEXT = "xpath=//ul[@class='menusubnav']//a[text()='%s']";
  public static final String DYNAMIC_TEXTBOX_BY_LABEL = "xpath=//td[text()='%s']//following-sibling::td/input";
  public static final String DYNAMIC_BUTTON_BY_VALUE = "xpath=//input[@value='%s']";
  public static final String RADIO_BUTTON = "xpath=//input[@type='radio' and @value='%s']" ;
  public static final String DYNAMIC_ROW_VALUE_BY_ROW_NAME = "xpath=//td[text()='%s']/following-sibling::td";
  public static final String DYNAMIC_TEXTAREA_BY_LABEL = "xpath=//td[text()='%s']//following-sibling::td/textarea";
}
