package functions_testing;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class j_resource {
	
	@FindBy(xpath = "//span[text()=\"Alarm\"]")private WebElement manualAlarmModule ;
	
	 @FindBy(xpath="//button[@class=\"btn btn-success\"]")private WebElement createNew ;
	 @FindBy(xpath="//a[@href=\"http://testing.retteralarm.de/admin/AlarmResources/resources\"]")private WebElement alarmResource;
	 @FindBy(xpath = "//span[@id=\"select2-selectFiredepartment-container\"]")private WebElement fireDepartmentField;
	 @FindBy(xpath = "//input[@placeholder=\"Select Firestation\"]")	private WebElement fireStationField;
	 @FindBy(xpath="//input[@id=\"AlarmResourceName\"]")private WebElement alarmResourceNameField;
	 @FindBy(xpath="//input[@id=\"selectCheckboxes\"]")private WebElement selectAll;

	 @FindBy(xpath="//button[@id=\"addSubmit\"]")private WebElement save;
		
		 @FindBy(xpath="//input[@class=\"form-control input-sm\"]")private WebElement searchField;
		@FindBy(xpath="(//i[@class=\"fa fa-trash-o\"])[1]")private WebElement delete ;
		 @FindBy(xpath="//button[@id=\"delYes\"]")private WebElement deleteYes;

		// @FindBy(xpath="")private WebElement ;
		// @FindBy(xpath="")private WebElement ;
		// @FindBy(xpath="")private WebElement ;
		// @FindBy(xpath="")private WebElement ;

		public j_resource(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
		
		
		
		
		
		public void addResource(WebDriver driver,String dateDDMMYY,String gTimeHHMM ) throws Throwable {
			
			Actions act = new Actions(driver);
			manualAlarmModule.click();
			alarmResource.click();
			
			
			createNew.click();
			fireDepartmentField.click();
			act.sendKeys("D1").build().perform();
			Thread.sleep(2000);
			act.sendKeys(Keys.ENTER).build().perform();
			fireStationField.click();
			act.sendKeys("04").build().perform();
			//act.sendKeys(dateDDMMYY).sendKeys(gTimeHHMM).build().perform();
			act.sendKeys(Keys.ENTER).build().perform();
			alarmResourceNameField.click();
			act.sendKeys("BG:Resorce-"+ dateDDMMYY+"_"+gTimeHHMM).build().perform();
			selectAll.click();
			save.click();
			Reporter.log("BG:Resorce-" + dateDDMMYY+"_"+gTimeHHMM+"> added successfully", true);
			
			
			
			
		
			
			
			}
			
		
		
		
		
		
		
		
		
		
		
		public void addResourceForNewStation(WebDriver driver,String dateDDMMYY,String gTimeHHMM ) throws Throwable {
			
		Actions act = new Actions(driver);
		manualAlarmModule.click();
		alarmResource.click();
		
		
		createNew.click();
		fireDepartmentField.click();
		act.sendKeys("andrew").build().perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ENTER).build().perform();
		fireStationField.click();
		//act.sendKeys("06").build().perform();
		act.sendKeys(dateDDMMYY).sendKeys(gTimeHHMM).build().perform();
		act.sendKeys(Keys.ENTER).build().perform();
		alarmResourceNameField.click();
		act.sendKeys("BG:Resorce>"+ dateDDMMYY+gTimeHHMM).build().perform();
		selectAll.click();
		save.click();
		Reporter.log("BG:Resorce>" + dateDDMMYY+gTimeHHMM+"> aded successfully", true);
		
		
		
		
	
		
		
		}
		
		public void deleteResource(WebDriver driver) throws Throwable {

			Actions act = new Actions(driver);
			manualAlarmModule.click();
			alarmResource.click();

			for (int i = 1; i <= 15; i++) {
				searchField.click();
				act.sendKeys("BG").build().perform();
			
				act.sendKeys(Keys.ENTER).build().perform();
				Thread.sleep(2000);
				
				delete.click();
				Thread.sleep(2000);
				deleteYes.click();
				Thread.sleep(2000);
				Reporter.log("Resource number-"+ i + " deleted successfully", true);
				driver.navigate().refresh();

			}
			
		}

		
		
		
		

}
