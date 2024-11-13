package functions_testing;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

public class n_addUsers {
	
	String newStationUser;
	
	 @FindBy(xpath="//span[text()=\"Administration\"]")private WebElement admin;
	 @FindBy(xpath="//span[text()=\"Manage Users\"]")private WebElement manageUsers;
	 @FindBy(xpath="//a[@href=\"http://live.retteralarm.de/admin/Users/index\"]")private WebElement list ;
	 @FindBy(xpath="//button[@class=\"btn btn-success\"]")private WebElement createNew;
	 @FindBy(xpath="//input[@id=\"UserFirstName\"]")private WebElement userNameField;
     @FindBy(xpath="//input[@id=\"UserLastName\"]")private WebElement userLastNameField;
	
		 @FindBy(xpath="//input[@id=\"UserAlarmEmail\"]")private WebElement emailField;
		 @FindBy(xpath="//span[@id=\"select2-selectCountry-container\"]")private WebElement country;
		 @FindBy(xpath="//select [@id=\"select-alert-lang\"]")private WebElement selectLang;
		 @FindBy(xpath="//input[@id=\"UserPassword\"]")private WebElement userPasswordField;
		 @FindBy(xpath="//button[@id=\"actionAddSubmit\"]")private WebElement saveBasicDetails;
		 @FindBy(xpath="//input[@id=\"chkUsertypeFF\"]")private WebElement userFireFighter;
		 @FindBy(xpath="//input[@placeholder=\"Select Department\"]")private WebElement departmentField;
	     @FindBy(xpath="//span[@id=\"select2-ffSDepartmetnBox-container\"]")private WebElement mainDepartmentField;
		 @FindBy(xpath="(//input[@placeholder=\"Select Fire Station\"])[2]")private WebElement stationField;
		 @FindBy(xpath="//button[@id=\"actionSubmit\"]")private WebElement saveUserRole;
		 @FindBy(xpath="//a[@id=\"specialshowdisplayviewgroup\"]")private WebElement specialGroupPermission;
		 @FindBy(xpath="//input[@id=\"additional_info\"]")private WebElement permssionAdditional_info;
		 @FindBy(xpath="//input[@id=\"avaibility_dashboard\"]")private WebElement permssionAvaibility_dashboard;
		 @FindBy(xpath="//input[@id=\"alarm_permission_in_app\"]")private WebElement permssionAlarm_permission_in_app;
		 @FindBy(xpath="//input[@id=\"select_all_special\"]")private WebElement selectAllPermission;
		 @FindBy(xpath="//div[@id=\"special_submit\"]")private WebElement updatespecialGroupPermission;
		 @FindBy(xpath="//button[@class=\"btn btn-green\"]")private WebElement permissionOk;
		 @FindBy(xpath="//button[@id=\"actionEditSubmit\"]")private WebElement savePermission;
	
		 @FindBy(xpath="//a[text()=\"Attributes\"]")private WebElement attributeTab;
		 @FindBy(xpath="//span[@id=\"select2-actionDepartment-container\"]")private WebElement atrriDepartmentField;
		 @FindBy(xpath="//input[@placeholder=\"Select Attribute\"]")private WebElement attributeFiled;
		@FindBy(xpath="//button[@id=\"addSubmit\"]")private WebElement saveAttribute;
		 @FindBy(xpath="//a[text()=\"Continue\"]")private WebElement atrriContinue;
		 
		 
		 @FindBy(xpath="//span[@class=\"select2-selection__placeholder\"]")private WebElement resourceDepartmentFiled;
		 @FindBy(xpath="//input[@placeholder=\"Please select firestation.\"]")private WebElement resourceStationFiled;
		@FindBy(xpath="//input[@placeholder=\"Please select resource.\"]")private WebElement resourceField;
		 @FindBy(xpath="//button[@id=\"addSubmit\"]")private WebElement saveResource;
		 
		 
		 @FindBy(xpath="//a[text()=\"Finish\"]")private WebElement finishAddUserProcess;
		
		 
		// @FindBy(xpath="")private WebElement ;
		// @FindBy(xpath="")private WebElement ;
		// @FindBy(xpath="")private WebElement ;
		// @FindBy(xpath="")private WebElement ;
		// @FindBy(xpath="")private WebElement ;
		 @FindBy(xpath="//a[@href=\"/admin/Users\"]")private WebElement userList;
		 
		 @FindBy(xpath="//input[@name=\"data[User][is_station]\"]")private WebElement userFireStation;
		 @FindBy(xpath="//span[@class=\"select2-selection__placeholder\"]")private WebElement departmerntFieldForStationUser;
		@FindBy(xpath="//input[@placeholder=\"Select Fire Station\"]")private WebElement stationFieldForStationUser;
			@FindBy(xpath="//button[@id=\"actionEditSubmit\"]")private WebElement saveStationUserPermission;
			 @FindBy(xpath="//div[@style=\"text-align: center; font-size: 22px;\"]")private WebElement StationUserName;
			// @FindBy(xpath="")private WebElement ;
			// @FindBy(xpath="")private WebElement ;
		 
		 
		 @FindBy(xpath="//input[@aria-controls=\"actionUser\"]")private WebElement searchField ;
		 @FindBy(xpath="//button[@id=\"dt_actionSearch\"]")private WebElement searchButton;
			 @FindBy(xpath="(//i[@class=\"fa fa-trash-o\"])[1]")private WebElement deleteUser1;
			 @FindBy(xpath="//button[text()=\"Remove\"]")private WebElement remove;
			 @FindBy(xpath="//button[text()=\"Yes, Please\"]")private WebElement yesPlease;
			
		 

		public n_addUsers(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}

		public void commonForAddUers (WebDriver driver) throws Throwable
		{
            admin.click();
			
			manageUsers.click();
		
			list.click();
			
		}
		
		
		public void addStationUser (WebDriver driver,String dateDDMMYY,String gTimeHHMM) throws Throwable
		{
			Actions act = new Actions(driver);
			
			createNew.click();
			
		
			userNameField.click();
		
			act.sendKeys("ghatole"+dateDDMMYY+gTimeHHMM).perform();
	
			userLastNameField.click();
		
			act.sendKeys("Station").perform();
		
			emailField.click();
			
			act.sendKeys(dateDDMMYY+"ghatole"+gTimeHHMM+".station@feuerwehr-musterstadt.de").perform();
			

			
			country.click();
	
			
			act.sendKeys("india").perform();
			Thread.sleep(2000);
			
			act.sendKeys(Keys.DOWN).sendKeys(Keys.ENTER).build().perform();
	
			
		Select se= new Select(selectLang);
		se.selectByVisibleText("English");
		
		userPasswordField.click();
		act.sendKeys("123456").perform();
		
		saveBasicDetails.click();
		
		Thread.sleep(2000);	
		
		userFireStation.click();
		Thread.sleep(2000);		
		
		departmerntFieldForStationUser.click();
		act.sendKeys("andrew").perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(2000);
	
		stationFieldForStationUser.click();
		act.sendKeys(dateDDMMYY).sendKeys(gTimeHHMM).build().perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ENTER).build().perform();
		saveUserRole.click();
		
		
		newStationUser=StationUserName.getText();
		
		saveStationUserPermission.click();
		
		
		
		
		
		
		
		
		
		Reporter.log("user details", true);
		Reporter.log("User first name >"+"ghatole"+dateDDMMYY+gTimeHHMM,true);
		Reporter.log("User last name > Station", true);
		Reporter.log("User mail id >"+dateDDMMYY+"ghatole"+gTimeHHMM+".station@feuerwehr-musterstadt.de",  true);
		
		
		//userList.click();
		Thread.sleep(2000);driver.navigate().refresh();
			
		
			

		}
		
		
		public void addfireFighter (WebDriver driver,String dateDDMMYY,String gTimeHHMM) throws Throwable
		{
			Actions act = new Actions(driver);
			
			for (int i=1;i<=2;i++)
			{
				createNew.click();
			
		
			userNameField.click();
		
			act.sendKeys("ghatole"+dateDDMMYY+gTimeHHMM).perform();
	
			userLastNameField.click();
		
			act.sendKeys("firefighter"+i).perform();
		
			emailField.click();
			
			act.sendKeys(dateDDMMYY+"ghatole"+gTimeHHMM+"-"+i+".gh@feuerwehr-musterstadt.de").perform();
			

			
			country.click();
	
			
			act.sendKeys("india").perform();
			Thread.sleep(2000);
			
			act.sendKeys(Keys.DOWN).sendKeys(Keys.ENTER).build().perform();
	
			
		Select se= new Select(selectLang);
		se.selectByVisibleText("English");
		
		userPasswordField.click();
		act.sendKeys("123456").perform();
		
		saveBasicDetails.click();
		
		Thread.sleep(2000);	
		
		userFireFighter.click();
			
		Thread.sleep(2000);			
		departmentField.click();
		act.sendKeys("andrew").perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(2000);
		mainDepartmentField.click();
		act.sendKeys("andrew").perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(2000);
		stationField.click();
		//act.sendKeys("06").perform();
		act.sendKeys(dateDDMMYY).sendKeys(gTimeHHMM).build().perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ENTER).build().perform();
		saveUserRole.click();
		
		specialGroupPermission.click();
		permssionAdditional_info.click();
		Thread.sleep(500);
		permssionAvaibility_dashboard.click();
		Thread.sleep(500);
		permssionAlarm_permission_in_app.click();
		Thread.sleep(500);
		selectAllPermission.click();
		updatespecialGroupPermission.click();
		Thread.sleep(500);
		permissionOk.click();
		Thread.sleep(500);
		savePermission.click();
		
		
		attributeTab.click();
		Thread.sleep(500);
		atrriDepartmentField.click();
		act.sendKeys("andrew").perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(2000);
		attributeFiled.click();
		act.sendKeys("BG:Attribute>"+ dateDDMMYY+gTimeHHMM).perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(2000);
		saveAttribute.click();
		atrriContinue.click();
		
		resourceDepartmentFiled.click();
		act.sendKeys("andrew").perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(2000);
		resourceStationFiled.click();
		//act.sendKeys("06").perform();
		act.sendKeys(dateDDMMYY).sendKeys(gTimeHHMM).build().perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(2000);
		resourceField.click();
		act.sendKeys("BG:Resorce>"+ dateDDMMYY+gTimeHHMM).perform();
		Thread.sleep(500);
		act.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(500);
		saveResource.click();
		
		
		finishAddUserProcess.click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		Reporter.log("user details", true);
		Reporter.log("User first name > ghatole"+dateDDMMYY+gTimeHHMM, true);
		Reporter.log("User last name > firefighter-"+i, true);
		Reporter.log("User mail id >"+ dateDDMMYY+"bg"+gTimeHHMM+"-"+1+".gh@feuerwehr-musterstadt.de", true);
		
		
		//userList.click();
		Thread.sleep(2000);driver.navigate().refresh();
			
		
			}

		}
		
		public void deletfireFighter (WebDriver driver) throws Throwable
		{
			Actions act = new Actions(driver);
			
		
			for (int i=1;i<=2;i++)
					{
			searchField.click();
			act.sendKeys("ghatole").perform();
			Thread.sleep(2000);
			searchButton.click();
			Thread.sleep(2000);
			deleteUser1.click();
			Thread.sleep(2000);
			remove.click();
			Thread.sleep(2000);
			yesPlease.click();
			Thread.sleep(2000);
			Reporter.log("User number-" + i + " is deleted sucessfully.", true);
			Thread.sleep(2000);driver.navigate().refresh();
			Thread.sleep(2000);
					}
			
			
			
		}
		
		
}
