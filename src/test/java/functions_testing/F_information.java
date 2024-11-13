package functions_testing;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

public class F_information extends B_baseClass {

	@FindBy(xpath = "//span[text()=\"Calendar\"]")private WebElement calendarModule;
	@FindBy(xpath = "//a[@href=\"http://testing.retteralarm.de/admin/Informations/index\"]")private WebElement manageInformation;
	@FindBy(xpath = "//button[@class=\"btn btn-success\"]")private WebElement createNewButton;
	@FindBy(xpath = "//span[@id=\"select2-selectFiredepartment-container\"]")private WebElement fireDepartmentField;
	@FindBy(xpath = "//input[@placeholder=\"Select Firestation\"]")private WebElement fireStationField;
	@FindBy(xpath = "//select[@id=\"selectType\"]")private WebElement selectType;
	@FindBy(xpath = "//input[@id=\"InformationTitleDe\"]")
	private WebElement titleField;
	@FindBy(xpath = "//input[@id=\"InformationLocation\"]")
	private WebElement loacationField;
	@FindBy(xpath = "//input[@id=\"inlineRadio1\"]")
	private WebElement userTypeAttribute;

	@FindBy(xpath = "//input[@id=\"selectCheckboxes\"]")
	private WebElement selectAllCheckBox;
	@FindBy(xpath = "//input[@id=\"user_id\" and @value=\"2170\"]")
	private WebElement D1St04A1;

	@FindBy(xpath = "//button[@id=\"addSubmit\"]")
	private WebElement saveInfo;

	@FindBy(xpath = "//input[@id=\"inlineRadio2\"]")
	private WebElement userTypeResource;
	@FindBy(xpath = "//input[@class=\"user-checkbox\" and @value=\"472\"]")
	private WebElement D1ST04R2;

	@FindBy(xpath = "//input[@id=\"inlineRadio3\"]")
	private WebElement userTypeFireFighter;
	@FindBy(xpath = "//input[@class=\"user-checkbox\" and @value=\"18952\"]")
	private WebElement BHTest;
	@FindBy(xpath = "//input[@class=\"user-checkbox\" and @value=\"19045\"]")
	private WebElement Honey1;
	@FindBy(xpath = "//input[@value=\"3138\" and @class=\"user-checkbox\" ]")
	private WebElement ADST06REsc;

	@FindBy(xpath = "//input[@aria-controls=\"example1\"]")
	private WebElement searchField;
	@FindBy(xpath = "//button[@id=\"dt_actionSearch\"]")
	private WebElement searchButton;
	@FindBy(xpath = "(//i[@class=\"fa fa-trash-o\"])[1]")
	private WebElement delete;
	@FindBy(xpath = "//button[@id=\"call_delete_ajax\"]")
	private WebElement deleteYes;

	@FindBy(xpath = "(//a[text()=\"Chat\"])[1]")
	private WebElement infoChatButton;
	@FindBy(xpath = "//input[@placeholder=\"Write your message...\"]")
	private WebElement writemessageField;
	@FindBy(xpath = "//button[@id=\"actionSendMessage\"]")
	private WebElement sendmessageButton;

	@FindBy(xpath = "//input[@id=\"inlineRadio4\"]")
	private WebElement userTypeMonitor;
	@FindBy(xpath = "//input[@value=\"14551\"]")
	private WebElement D1ST04M1;
	@FindBy(xpath = "//input[@id=\"InfoStartDate\"]")
	private WebElement infoStartDateField;
	@FindBy(xpath = "//input[@id=\"InfoEndDate\"]")
	private WebElement infoEndDateField;
	@FindBy(xpath = "//input[@id=\"InfoStartTime\"]")
	private WebElement infoStartTimeField;
	@FindBy(xpath = "//input[@id=\"InfoEndTime\"]")
	private WebElement infoEndTimeField;
	// @FindBy(xpath="")private WebElement ;
	// @FindBy(xpath="")private WebElement ;
	// @FindBy(xpath="")private WebElement ;
	// @FindBy(xpath="")private WebElement ;
	// @FindBy(xpath="")private WebElement ;
	// @FindBy(xpath="")private WebElement ;

	public F_information(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void infoEventCommon(WebDriver driver) throws Throwable {
		calendarModule.click();
		
		manageInformation.click();
	

	}

	public void createInformationByAttribute(WebDriver driver) throws Throwable {
		Actions act = new Actions(driver);
		createNewButton.click();
		fireDepartmentField.click();
		act.sendKeys("D1").build().perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(2000);
		fireStationField.click();
		act.sendKeys("04").build().perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(2000);
		Select se = new Select(selectType);
		se.selectByVisibleText("Information");
		titleField.click();
		act.sendKeys("BG-Information created by attribute.").build().perform();
		loacationField.click();
		act.sendKeys("Manewada graound, Nagpur").build().perform();
		act.sendKeys(Keys.TAB).build().perform();
		act.sendKeys("BG-Information created by attribute checking.").build().perform();
		act.sendKeys(Keys.PAGE_DOWN).build().perform();
		userTypeAttribute.click();
		D1St04A1.click();
		saveInfo.click();
		
	

	}

	public void createInformationByResource(WebDriver driver) throws Throwable {
		Actions act = new Actions(driver);

		createNewButton.click();
		fireDepartmentField.click();
		act.sendKeys("D1").build().perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(2000);
		fireStationField.click();
		act.sendKeys("04").build().perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(2000);
		Select se = new Select(selectType);
		se.selectByVisibleText("Information");
		titleField.click();
		act.sendKeys("BG-Information created by resource.").build().perform();
		loacationField.click();
		act.sendKeys("Manewada graound, Nagpur").build().perform();
		act.sendKeys(Keys.TAB).build().perform();
		act.sendKeys("BG-Information created by resource checking.").build().perform();
		userTypeResource.click();
		D1ST04R2.click();
		saveInfo.click();
		
	

	}

	public void createInformationByfireFighter(WebDriver driver) throws Throwable {
		Actions act = new Actions(driver);

		createNewButton.click();
		fireDepartmentField.click();
		act.sendKeys("D1").build().perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(2000);
		fireStationField.click();
		act.sendKeys("04").build().perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(2000);
		Select se = new Select(selectType);
		se.selectByVisibleText("Information");
		titleField.click();
		act.sendKeys("BG-Information created by firefighter.").build().perform();
		loacationField.click();
		act.sendKeys("Manewada graound, Nagpur").build().perform();
		act.sendKeys(Keys.TAB).build().perform();
		act.sendKeys("BG-Information created by firefighter checking.").build().perform();
		userTypeFireFighter.click();
		Honey1.click();
		BHTest.click();
		saveInfo.click();
		
	

	}

	public void createInformationForMonitor(WebDriver driver, String gTimeA5min, String gTimeA15min, String date)
			throws Throwable {
		Actions act = new Actions(driver);

		createNewButton.click();
		fireDepartmentField.click();
		act.sendKeys("D1").build().perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(2000);
		fireStationField.click();
		act.sendKeys("04").build().perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(2000);
			Select se = new Select(selectType);
		se.selectByVisibleText("Information");
    	titleField.click();
		act.sendKeys("BG-Monitor information for-" + date).build().perform();
		loacationField.click();
		act.sendKeys("Manewada graound, Nagpur").build().perform();
		act.sendKeys(Keys.TAB).build().perform();
		act.sendKeys("BG-Monitor information for-" + date + " from " + gTimeA5min + " to " + gTimeA15min).build().perform();
		act.sendKeys(Keys.PAGE_DOWN).build().perform();
		userTypeMonitor.click();
		D1ST04M1.click();
		infoStartDateField.click();
		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
		act.sendKeys(date).build().perform();
		infoEndDateField.click();
		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
		act.sendKeys(date).build().perform();
		infoStartTimeField.click();
		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
		act.sendKeys(gTimeA5min).build().perform();
		infoEndTimeField.click();
		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
		act.sendKeys(gTimeA15min).build().perform();
		saveInfo.click();
		
		
	}
	
	
	

	public void sendmessageToInfoUsers(WebDriver driver) throws Throwable {
		Actions act = new Actions(driver);

		searchField.click();
		act.sendKeys("BG-Information").build().perform();
		searchButton.click();
		Thread.sleep(2000);
		infoChatButton.click();
		writemessageField.click();
		act.sendKeys("message-info users").build().perform();
		sendmessageButton.click();
		


	}

	public void deleteInfoEvent(WebDriver driver) throws Throwable {
		Actions act = new Actions(driver);
		calendarModule.click();
		manageInformation.click();

		for (int i = 1; i <= 100; i++) {

			searchField.click();
			act.sendKeys("BG").build().perform();
			searchButton.click();
			Thread.sleep(2000);
			delete.click();
			deleteYes.click();
			Reporter.log("information number-" + i + " is deleted sucessfully.", true);
			driver.navigate().refresh();			
			

		}

	}

}
