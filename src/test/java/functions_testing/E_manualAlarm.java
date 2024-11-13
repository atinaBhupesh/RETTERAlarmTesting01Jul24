package functions_testing;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

public class E_manualAlarm extends B_baseClass




{

	@FindBy(xpath = "//span[text()=\"Alarm\"]")
	private WebElement manualAlarmModule;
	@FindBy(xpath = "//a[@href=\"http://testing.retteralarm.de/admin/Alarms/index\"]")
	private WebElement manageAlarm;

	@FindBy(xpath = "//button[@class=\"btn btn-success\"]")
	private WebElement createNewButton;
	@FindBy(xpath = "//span[@id=\"select2-selectFiredepartment-container\"]")
	private WebElement fireDepartmentField;
	@FindBy(xpath = "//input[@placeholder=\"Select Firestation\"]")
	private WebElement fireStationField;
	@FindBy(xpath = "//textarea[@id=\"AlarmTitleDe\"]")
	private WebElement titlefield;
	@FindBy(xpath = "//textarea[@id=\"AlarmDescriptionDe\"]")
	private WebElement descriptionField;
	@FindBy(xpath = "//input[@id=\"inlineRadio1\"]")
	private WebElement userTypeAttribute;
	@FindBy(xpath = "//input[@placeholder=\"Select Vehicle/Cars\"]")
	private WebElement vehicleField;
	@FindBy(xpath = "//input[@id=\"selectCheckboxes\"]")
	
	private WebElement selectAllCheckBox;
	
	
	@FindBy(xpath = "//input[@id=\"user_id\" and @value=\"18336\"]")private WebElement RA1;
	//@FindBy(xpath = "//input[@id=\"user_id\" and @value=\"18336\"]")private WebElement RA1;
	@FindBy(xpath = "//textarea[@id=\"AlarmAddress\"]")
	private WebElement adressFeild;
	@FindBy(xpath = "//input[@id=\"locationDrag\"]")
	private WebElement dragMarkerOnMapCheckBox;
	@FindBy(xpath = "//button[@id=\"addSubmit\"]")
	private WebElement grenrateAlarmButton;
	@FindBy(xpath = "//button[@id=\"addSubForm\"]")
	private WebElement alarmYesButton;

	@FindBy(xpath = "//input[@id=\"inlineRadio2\"]")private WebElement userTypeResource;
	

	@FindBy(xpath = "//input[@id=\"inlineRadio3\"]")private WebElement userTypeFireFighter;
	
	


	@FindBy(xpath = "//input[@aria-controls=\"alarmTable\"]")
	private WebElement searchField;
	@FindBy(xpath = "//button[@id=\"dt_actionSearch\"]")
	private WebElement searchButton;
	@FindBy(xpath = "(//i[@class=\"fa fa-trash-o\"])[1]")
	private WebElement delete;
	@FindBy(xpath = "//button[@id=\"delRec\"]")
	private WebElement deleteYes;

	@FindBy(xpath = "(//a[@title=\"Chat\"])[1]")
	private WebElement chatOptions;
	@FindBy(xpath = "//input[@placeholder=\"Write your message...\"]")
	private WebElement writemessageField;
	@FindBy(xpath = "//button[@id=\"actionSendMessage\"]")
	private WebElement sendmessageButton;
	@FindBy(xpath = "(//i[@class=\"fa fa-user-plus\"])[1]")
	private WebElement extendAlarmButton;


	@FindBy(xpath = "//input[@id=\"information_1\"]")
	private WebElement addInfoField1;
	@FindBy(xpath = "//input[@id=\"information_2\"]")
	private WebElement addInfoField2;
	@FindBy(xpath = "//input[@id=\"information_3\"]")
	private WebElement addInfoField3;
	@FindBy(xpath = "//input[@id=\"information_4\"]")
	private WebElement addInfoField4;
	@FindBy(xpath = "//input[@id=\"information_5\"]")
	private WebElement addInfoField5;
	@FindBy(xpath = "//button[@id=\"addSubmit\"]")
	private WebElement save;

	@FindBy(xpath = "//input[@name=\"data[Alarm][low_priority]\"]")
	private WebElement lowPriorityCheckBox;

	 @FindBy(xpath="//span[@class=\"select2-selection__placeholder\"]")private WebElement selectStationForStationAlarm;
	 @FindBy(xpath="//select[@name=\"alarmTable_length\"]")private WebElement alarmLength;
	 @FindBy(xpath="(//span[text()=\"Active\"])[1]")private WebElement deactiveAlarm;
	 @FindBy(xpath="//button[@id=\"statChange\"]")private WebElement changeStatusYes;
	 
	 
	 @FindBy(xpath = "//input[@id=\"user_id\" and @value=\"2170\"]")private WebElement D1St04A1;
	 @FindBy(xpath = "//input[@class=\"user-checkbox\" and @value=\"472\"]")private WebElement D1ST04R2;
	 @FindBy(xpath = "//input[@class=\"user-checkbox\" and @value=\"18952\"]")private WebElement BHTest;
	 @FindBy(xpath = "//input[@class=\"user-checkbox\" and @value=\"19045\"]")private WebElement Honey1;
     @FindBy(xpath = "//input[@class=\"user-checkbox\" and @value=\"476\"]")private WebElement D1St04REsc;
 	 @FindBy(xpath = "//input[@id=\"user_id\" and @value=\"3078\"]")private WebElement ADST05A1;
	 
	// @FindBy(xpath="")private WebElement ;
	// @FindBy(xpath="")private WebElement ;
	// @FindBy(xpath="")private WebElement ;
	// @FindBy(xpath="")private WebElement ;
	// @FindBy(xpath="")private WebElement ;
	// @FindBy(xpath="")private WebElement ;
	// @FindBy(xpath="")private WebElement ;
	// @FindBy(xpath="")private WebElement ;
	// @FindBy(xpath="")private WebElement ;
	// @FindBy(xpath="")private WebElement ;
	// @FindBy(xpath="")private WebElement ;
	// @FindBy(xpath="")private WebElement ;
	// @FindBy(xpath="")private WebElement ;
	// @FindBy(xpath="")private WebElement ;
	// @FindBy(xpath="")private WebElement ;
	// @FindBy(xpath="")private WebElement ;
	// @FindBy(xpath="")private WebElement ;
	// @FindBy(xpath="")private WebElement ;
	// @FindBy(xpath="")private WebElement ;
	// @FindBy(xpath="")private WebElement ;
	// @FindBy(xpath="")private WebElement ;
	// @FindBy(xpath="")private WebElement ;
	// @FindBy(xpath="")private WebElement ;
	// @FindBy(xpath="")private WebElement ;
	// @FindBy(xpath="")private WebElement ;
	// @FindBy(xpath="")private WebElement ;
	// @FindBy(xpath="")private WebElement ;
	// @FindBy(xpath="")private WebElement ;
	// @FindBy(xpath="")private WebElement ;
	// @FindBy(xpath="")private WebElement ;
	// @FindBy(xpath="")private WebElement ;
	// @FindBy(xpath="")private WebElement ;
	// @FindBy(xpath="")private WebElement ;
	// @FindBy(xpath="")private WebElement ;
	// @FindBy(xpath="")private WebElement ;
	// @FindBy(xpath="")private WebElement ;
	// @FindBy(xpath="")private WebElement ;
	// @FindBy(xpath="")private WebElement ;
	// @FindBy(xpath="")private WebElement ;
	// @FindBy(xpath="")private WebElement ;
	// @FindBy(xpath="")private WebElement ;
	// @FindBy(xpath="")private WebElement ;
	// @FindBy(xpath="")private WebElement ;
	// @FindBy(xpath="")private WebElement ;
	// @FindBy(xpath="")private WebElement ;
	// @FindBy(xpath="")private WebElement ;
	// @FindBy(xpath="")private WebElement ;
	// @FindBy(xpath="")private WebElement ;
	// @FindBy(xpath="")private WebElement ;
	// @FindBy(xpath="")private WebElement ;
	// @FindBy(xpath="")private WebElement ;
	// @FindBy(xpath="")private WebElement ;

	public E_manualAlarm(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void manualAlarmCommon(WebDriver driver) throws Throwable {
		manualAlarmModule.click();
	
		manageAlarm.click();
		

	}

	public void manualAlarmByAttribute(WebDriver driver, String date) throws Throwable {
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
	
		titlefield.click();
	
		act.sendKeys("BG-manual alarm by attribute-" + date).build().perform();
	
		descriptionField.click();
	
		act.sendKeys("BG-manual alarm by attribute checking.").build().perform();
	
		
	
		userTypeAttribute.click();
		Thread.sleep(2000);
		vehicleField.click();

		act.sendKeys("04v1").build().perform();
		Thread.sleep(3000);
		act.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(2000);
		selectAllCheckBox.click();
		
		selectAllCheckBox.click();
	
		D1St04A1.click();
		//RA1.click();

		adressFeild.click();
		Thread.sleep(2000);
		act.sendKeys("BAPS Swaminarayan mandir, Wathoda Layout, Nagpur, Maharashtra 440035").build().perform();
	
		
	
		dragMarkerOnMapCheckBox.click();
	
		grenrateAlarmButton.click();
	
		alarmYesButton.click();

	
		

	}
	
	
	
	public void manualAlarmByNewAttribute(WebDriver driver, String dateDDMMYY,String gTimeHHMM) throws Throwable {
		Actions act = new Actions(driver);

		createNewButton.click();
	
		fireDepartmentField.click();
	
		act.sendKeys("D1").build().perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(2000);
		fireStationField.click();
		
		act.sendKeys("BG andrew station "+dateDDMMYY+gTimeHHMM).build().perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ENTER).build().perform();
	
		titlefield.click();
	
		act.sendKeys("BG-manual alarm by new attribute-" + dateDDMMYY+gTimeHHMM).build().perform();
	
		descriptionField.click();
	
		act.sendKeys("BG-manual alarm by attribute checking.").build().perform();
	
		
	
		userTypeAttribute.click();
		Thread.sleep(2000);
		vehicleField.click();

		act.sendKeys("BG-V"+ dateDDMMYY+gTimeHHMM).build().perform();
		Thread.sleep(3000);
		act.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(2000);
		selectAllCheckBox.click();
		
		

		adressFeild.click();
		Thread.sleep(2000);
		act.sendKeys("BAPS Swaminarayan mandir, Wathoda Layout, Nagpur, Maharashtra 440035").build().perform();
	
		
	
		dragMarkerOnMapCheckBox.click();
	
		grenrateAlarmButton.click();
	
		alarmYesButton.click();
		
		Reporter.log("Manual alarm > BG-manual alarm by new attribute-" + dateDDMMYY+gTimeHHMM+ "added successfully", true  );
		
		
	}


	public void manualAlarmByResource(WebDriver driver, String date) throws Throwable {
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
		
		titlefield.click();
		
		act.sendKeys("BG-manual alarm by resource-" + date).build().perform();
	
		descriptionField.click();
		
		act.sendKeys("BG-manual alarm by resource checking.").build().perform();
	
		
	
		userTypeResource.click();
		Thread.sleep(2000);
		selectAllCheckBox.click();

		selectAllCheckBox.click();
		
		D1ST04R2.click();
	
		adressFeild.click();
	
		act.sendKeys("YES Hospital, Plot no. 1 & 1A, Dighori Flyover Square, Dighori, Nagpur, Maharashtra 440017").build().perform();
		
		
	
		dragMarkerOnMapCheckBox.click();
		
		grenrateAlarmButton.click();
		alarmYesButton.click();
		

	
		

	}
	
	
	public void manualAlarmByNewResource(WebDriver driver, String dateDDMMYY,String gTimeHHMM) throws Throwable
	{Actions act = new Actions(driver);

		createNewButton.click();
		
		fireDepartmentField.click();
	
		act.sendKeys("D1").build().perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(2000);
		fireStationField.click();
		
		act.sendKeys("BG andrew station "+dateDDMMYY+gTimeHHMM).build().perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ENTER).build().perform();
	
		titlefield.click();
	
		act.sendKeys("BG-manual alarm by new resource-" + dateDDMMYY+gTimeHHMM).build().perform();
	
		descriptionField.click();
	
		act.sendKeys("BG-manual alarm by attribute checking.").build().perform();
	
		
	
		userTypeResource.click();
		Thread.sleep(2000);
		selectAllCheckBox.click();



	
		adressFeild.click();
		Thread.sleep(2000);
		act.sendKeys("BAPS Swaminarayan mandir, Wathoda Layout, Nagpur, Maharashtra 440035").build().perform();
	
		
	
		dragMarkerOnMapCheckBox.click();
	
		grenrateAlarmButton.click();
	
		alarmYesButton.click();
		
		Reporter.log("Manual alarm > BG-manual alarm by new resource-" + dateDDMMYY+gTimeHHMM+ "added successfully", true  );
		

	
		

	}
	

	public void manualAlarmByFireFighter(WebDriver driver, String date) throws Throwable {
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
		titlefield.click();
		
		act.sendKeys("BG-manual alarm by firefighter-" + date).build().perform();
	
		descriptionField.click();
		
		act.sendKeys("BG-manual alarm by firefighter checking.").build().perform();
	
		
	
		userTypeFireFighter.click();
		Thread.sleep(2000);
		vehicleField.click();
	
		act.sendKeys("04V1").build().perform();
		Thread.sleep(3000);
		act.sendKeys(Keys.ENTER).build().perform();
		
		selectAllCheckBox.click();
	
		selectAllCheckBox.click();
	
		BHTest.click();
		Honey1.click();
	
		
		

		adressFeild.click();
	
		act.sendKeys("Imperial Celebration Hall, Power House, 35, Mankapur Ring Rd, Mhalgi Nagar, Nagpur, Maharashtra 440034").build().perform();
		
		
	
		dragMarkerOnMapCheckBox.click();
	
		grenrateAlarmButton.click();
		
		alarmYesButton.click();
		

	
	
	}
	public void manualAlarmLowPriorityByAttribute(WebDriver driver, String date) throws Throwable {
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
		titlefield.click();
		
		act.sendKeys("BG-low priority manual alarm by attribute-" + date).build().perform();
		
		descriptionField.click();
		
		act.sendKeys("BG-low priority manual alarm by attribute checking.").build().perform();
		
		
	
		userTypeAttribute.click();
	
		vehicleField.click();
		
		act.sendKeys("04v1").build().perform();
	
		act.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(2000);
		selectAllCheckBox.click();
	
		selectAllCheckBox.click();
	
		D1St04A1.click();
	
	
		lowPriorityCheckBox.click();
	
		adressFeild.click();
	
		act.sendKeys("Ranjana Celebration Hall, Suyog Nagar Square, Outer Ring Rd, Nagpur, Maharashtra 440015").build().perform();
	
		
	
		dragMarkerOnMapCheckBox.click();
	
		grenrateAlarmButton.click();
	
		alarmYesButton.click();
	
	


	}
	
	

	
	public void manualAlarmByNewFireFighter(WebDriver driver, String dateDDMMYY,String gTimeHHMM) throws Throwable {
		Actions act = new Actions(driver);

		createNewButton.click();
		
		fireDepartmentField.click();
		
		act.sendKeys("andrew").build().perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(2000);
		fireStationField.click();
		
		act.sendKeys("BG andrew station "+dateDDMMYY+gTimeHHMM).build().perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ENTER).build().perform();
	
		titlefield.click();
	
		act.sendKeys("BG-manual alarm by new firefighter-" + dateDDMMYY+gTimeHHMM).build().perform();
	
		descriptionField.click();
	
		act.sendKeys("BG-manual alarm by attribute checking.").build().perform();
	
		
	
		userTypeFireFighter.click();
		Thread.sleep(2000);
		vehicleField.click();
	
		act.sendKeys("BG-V"+ dateDDMMYY+gTimeHHMM).build().perform();
		Thread.sleep(3000);
		act.sendKeys(Keys.ENTER).build().perform();
		
		selectAllCheckBox.click();
	
				

		adressFeild.click();
	
		act.sendKeys("Imperial Celebration Hall, Power House, 35, Mankapur Ring Rd, Mhalgi Nagar, Nagpur, Maharashtra 440034").build().perform();
		
		
	
		dragMarkerOnMapCheckBox.click();
	
		grenrateAlarmButton.click();
		
		alarmYesButton.click();
		
		Reporter.log("Manual alarm > BG-manual alarm by new firefighter-" + dateDDMMYY+gTimeHHMM+ "added successfully", true  );
		

	
	
	}
	
	
	
	
	
	
	

	public void manualAlarmByEscalationResource(WebDriver driver, String date) throws Throwable {
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
		titlefield.click();
		
		act.sendKeys("BG-manual alarm by escalation resource-" + date).build().perform();
	
		descriptionField.click();
	
		act.sendKeys("BG-manual alarm by escalation resource checking.").build().perform();
		
		
		
		userTypeResource.click();
		
		selectAllCheckBox.click();
	
		selectAllCheckBox.click();
	
		D1St04REsc.click();
		
		adressFeild.click();
		
		act.sendKeys("Tapasya Vidya Mandir, 4446+52G, Vinkar Colony, Manewada, Nagpur, Maharashtra 440024").build().perform();
	
		
		
		dragMarkerOnMapCheckBox.click();
		
		grenrateAlarmButton.click();
		
		alarmYesButton.click();
		

	
		

	}
	
	
	public void manualAlarmByNewFireFighterFromStationLogin(WebDriver driver, String dateDDMMYY,String gTimeHHMM) throws Throwable {
		Actions act = new Actions(driver);
		
		
		
		

		createNewButton.click();
		Thread.sleep(2000);
	
		selectStationForStationAlarm.click();
		Thread.sleep(1000);		
		act.sendKeys(Keys.ENTER).build().perform();
	
		titlefield.click();
	
		act.sendKeys("BG-manual alarm by new firefighter from new station user-" + dateDDMMYY+gTimeHHMM).build().perform();
	
		descriptionField.click();
	
		act.sendKeys("checking manual alarm by new station user login.").build().perform();
	
		
	
		userTypeFireFighter.click();
		Thread.sleep(2000);
		vehicleField.click();
	
		act.sendKeys("BG-V"+ dateDDMMYY+gTimeHHMM).build().perform();
		Thread.sleep(3000);
		act.sendKeys(Keys.ENTER).build().perform();
		
		selectAllCheckBox.click();
	
				

		adressFeild.click();
	
		act.sendKeys("Imperial Celebration Hall, Power House, 35, Mankapur Ring Rd, Mhalgi Nagar, Nagpur, Maharashtra 440034").build().perform();
		
		
	
		dragMarkerOnMapCheckBox.click();
	
		grenrateAlarmButton.click();
		
		alarmYesButton.click();
		
		Reporter.log("Manual alarm >BG-manual alarm by new firefighter from new station user-" + dateDDMMYY+gTimeHHMM+ "added successfully", true  );
		

	
	
	}

		
	
	public void extendAlarm(WebDriver driver, String date) throws Throwable {
		Actions act = new Actions(driver);
		searchField.click();
		
		act.sendKeys("BG-low priority").build().perform();
		
		searchButton.click();
		Thread.sleep(2000);
		extendAlarmButton.click();
		Thread.sleep(2000);
		fireStationField.click();

		act.sendKeys("05").build().perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(2000);
		userTypeAttribute.click();
	

		
		
		ADST05A1.click();
		
		addInfoField1.click();
	
		act.sendKeys("additional info 1").build().perform();
	
		addInfoField2.click();

		act.sendKeys("additional info 2").build().perform();
	
		addInfoField3.click();
	
		act.sendKeys("additional info 3").build().perform();
	
		addInfoField4.click();
		
		act.sendKeys("additional info 4").build().perform();
		
		addInfoField5.click();
	
		act.sendKeys("additional info 5").build().perform();
	
		save.click();
	
	
		

	}
	
	
	
	
	
	

	public void sendmessageToAlarmUser(WebDriver driver, String date) throws Throwable
	{
		Actions act = new Actions(driver);

		searchField.click();

		act.sendKeys("BG-low priority manual").build().perform();
		
		searchButton.click();
		Thread.sleep(2000);
		chatOptions.click();
	
		writemessageField.click();
	
		act.sendKeys("message-alarm users").build().perform();
		
		sendmessageButton.click();
	
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	public void deleteAlarms(WebDriver driver, String date) throws Throwable {
		Actions act = new Actions(driver);
				
		
		manualAlarmModule.click();
		
		manageAlarm.click();
	

		for (int i = 1; i <= 750; i++) {
			searchField.click();
			
//			act.sendKeys("BG").build().perform();
//			
//			searchButton.click();
//			Thread.sleep(3000);
		
			delete.click();
		
			deleteYes.click();
			
			Reporter.log("Alarm number-" + i + " is deleted sucessfully.", true);
			Thread.sleep(2000);
		   driver.navigate().refresh();
		   Thread.sleep(1000);;

		}

	}
	
	
	
	public void deactiveManualAlarms(WebDriver driver, String date) throws Throwable {
		Actions act = new Actions(driver);
				
		
		manualAlarmModule.click();
		
		manageAlarm.click();
		
		Select se = new Select(alarmLength);
		se.selectByVisibleText("100");
		Thread.sleep(2000);
	

		for (int i = 1; i <= 100; i++) {
			searchField.click();
			
			act.sendKeys("BG").build().perform();
			
			searchButton.click();
			Thread.sleep(2000);
		
			deactiveAlarm.click();
			Thread.sleep(1000);
			changeStatusYes.click();
			Thread.sleep(1000);
			Reporter.log("Alarm number-" + i + " is deleted sucessfully.", true);
			Thread.sleep(2000);
		   driver.navigate().refresh();
		   Thread.sleep(1000);;

		}

	}

	

}