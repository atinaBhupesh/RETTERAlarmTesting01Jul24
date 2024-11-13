package functions_testing;

import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

public class j_calendarEvent {

	@FindBy(xpath = "//span[text()=\"Calendar\"]")
	private WebElement calendarModule;
	@FindBy(xpath = "//span[text()=\"Manage Event\"]")
	private WebElement manageEvent;
	@FindBy(xpath = "//a[@href=\"http://testing.retteralarm.de/admin/Firestations/eventCalendar\"]")
	private WebElement calendar;

	@FindBy(xpath = "//a[text()=\"Add New Event\"]")
	private WebElement addNewEvent;
	@FindBy(xpath = "//span[@id=\"select2-selectFireDepartment-container\"]")
	private WebElement fireDepartmentField;
	@FindBy(xpath = "//input[@placeholder=\"Select Firestation\"]")
	private WebElement fireStastionField;
	@FindBy(xpath = "//input[@id=\"InformationTitle\"]")
	private WebElement eventTitleField;
	@FindBy(xpath = "//textarea[@id=\"InformationDescription\"]")
	private WebElement eventDescriptionField;
	@FindBy(xpath = "//input[@id=\"InformationLocation\"]")
	private WebElement eventLocation;
	 @FindBy(xpath="//input[@id=\"selectDatePic1\"]")private WebElement eventStartDate;
     @FindBy(xpath="//input[@id=\"selectDatePic2\"]")private WebElement eventEndDate;
	 @FindBy(xpath="(//label[@class=\"col-sm-3 control-label\"])[1]")private WebElement label;
	 @FindBy(xpath="//input[@id=\"startTime\"]")private WebElement eventStartTime;
	 @FindBy(xpath="//input[@id=\"endTime\"]")private WebElement eventEndTime;
	@FindBy(xpath="//input[@id=\"reminderTimeStatus\"]")private WebElement setReminder;
	@FindBy(xpath="//select[@id=\"InformationReminderType\"]")private WebElement reminderType;
	 @FindBy(xpath="//select[@id=\"InformationReminderMin\"]")private WebElement reminderInMin;
	 @FindBy(xpath="//input[@id=\"inlineRadio1\"]")private WebElement userTypeAttribute;
	 @FindBy(xpath = "//input[@id=\"user_id\" and @value=\"2170\"]")
		private WebElement D1St04A1;
		 @FindBy(xpath="//span[@class=\"slider round\"]")private WebElement sendPush;
	 @FindBy(xpath="//button[@id=\"actionsubmit\"]")private WebElement saveEvent;
	 
		@FindBy(xpath="//select[@id=\"InformationReminderHours\"]")private WebElement reminderInHour;
		 @FindBy(xpath="//input[@id=\"inlineRadio2\"]")private WebElement userTypeResource;
			@FindBy(xpath = "//input[@class=\"user-checkbox\" and @value=\"472\"]")
			private WebElement D1ST04R2;
		 @FindBy(xpath="//select[@id=\"InformationReminderDay\"]")private WebElement reminderInDay;
		@FindBy(xpath="//input[@id=\"inlineRadio3\"]")private WebElement userTypeFirefighter;
		@FindBy(xpath = "//input[@class=\"user-checkbox\" and @value=\"18952\"]")
		private WebElement BHTest;
		@FindBy(xpath = "//input[@class=\"user-checkbox\" and @value=\"19045\"]")
		private WebElement Honey1;
	 @FindBy(xpath="//button[@class=\"fc-month-button fc-button fc-state-default fc-corner-left fc-corner-right fc-state-active\"]")private WebElement monthButton;
	 @FindBy(xpath="(//span[text()=\"General : BG-calendar event by attribute.\"])[1]")private WebElement EventByAttribute;
	 @FindBy(xpath="//a[@id=\"actionDeleteEvent\"]")private WebElement deleteEvent;
	
		 @FindBy(xpath="(//span[text()=\"General : BG-calendar event by Resorce.\"])[1]")private WebElement EventByResource;
     @FindBy(xpath="(//span[text()=\"General : BG-calendar event by firfighter.\"])[1]")private WebElement EventByFirefighter;
     
     
     
		 @FindBy(xpath="//a[@href=\"http://testing.retteralarm.de/admin/Firestations/events\"]")private WebElement eventCatogery;
		@FindBy(xpath="//a[@href=\"/admin/firestations/createEvent\"]")private WebElement addEventCatogery;
			 @FindBy(xpath="//span[@id=\"select2-mainDepartment-container\"]")private WebElement SelectDepartment ;
			 @FindBy(xpath="//span[@class=\"select2-selection__placeholder\"]")private WebElement selectStation;
			 @FindBy(xpath="//input[@id=\"FirestationEventTitle\"]")private WebElement eventCategoryTitle;
			 @FindBy(xpath="//button[@name=\"colorpalettebutton\"]")private WebElement chooseColor;
			 @FindBy(xpath="//div[@data-color=\"rgb(255, 140, 0)\"]")private WebElement orange;
			 @FindBy(xpath="//button[@id=\"addSubmit\"]")private WebElement saveCategory;
			 @FindBy(xpath="//input[@class=\"form-control input-sm\"]")private WebElement search;
			 @FindBy(xpath="(//i[@class=\"fa fa-trash-o\"])[1]")private WebElement deleteCategory;
			 @FindBy(xpath="//button[@id=\"delYes1\"]")private WebElement deleteYes;
			// @FindBy(xpath="")private WebElement ;
			// @FindBy(xpath="")private WebElement ;
			// @FindBy(xpath="")private WebElement ;
			// @FindBy(xpath="")private WebElement ;
			// @FindBy(xpath="")private WebElement ;
			// @FindBy(xpath="")private WebElement ;
			// @FindBy(xpath="")private WebElement ;
			// @FindBy(xpath="")private WebElement ;
			// @FindBy(xpath="")private WebElement
	public j_calendarEvent(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void calendarEventCommon(WebDriver driver) throws Throwable {
		calendarModule.click();
		Thread.sleep(2000);
		manageEvent.click();
		Thread.sleep(2000);
		

	}

	public void calendarEventByAttributeSchedul(WebDriver driver, String date,String gCurrntTime,String gTimeA7min,String gTimeA22min) throws Throwable {
		calendar.click();
		Thread.sleep(2000);
		Actions act = new Actions(driver);
		addNewEvent.click();
		Thread.sleep(1000);
		fireDepartmentField.click();
		
		act.sendKeys("D1").build().perform();
		Thread.sleep(1000);
		act.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(2000);
		fireStastionField.click();
		Thread.sleep(1000);
		act.sendKeys("04").build().perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ENTER).build().perform();

		eventTitleField.click();
		
		act.sendKeys("BG-calendar event by attribute.").build().perform();
		
		eventDescriptionField.click();

		act.sendKeys("checking calendar event by attribute with 1 min reminder."
				+ "Calendar event creation date andt time-"+date+"_"+gCurrntTime).build().perform();

		eventLocation.click();

		act.sendKeys("Nagpur").build().perform();

		eventStartDate.click();
	
		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys(Keys.BACK_SPACE).build().perform();

		act.sendKeys(date).build().perform();
	
		label.click();

		eventEndDate.click();

		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys(Keys.BACK_SPACE).build().perform();
	
		act.sendKeys(date).build().perform();

		label.click();

		
		eventStartTime.click();

		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys(Keys.BACK_SPACE).build().perform();

		act.sendKeys(gTimeA7min).build().perform();
		label.click();

		
		eventEndTime.click();
	
		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys(Keys.BACK_SPACE).build().perform();
	
		act.sendKeys(gTimeA22min).build().perform();
		label.click();
		
		setReminder.click();
	
		
		Select se = new Select(reminderType);
		
		se.selectByVisibleText("One time");

        Select se2 = new Select (reminderInMin);
 
		se2.selectByVisibleText("1");
		
		
		userTypeAttribute.click();

		
		D1St04A1.click();
	
		
		sendPush.click();
		saveEvent.click();
		Thread.sleep(1000);
		
		Reporter.log("calendar event by attribute from-"+date+(gTimeA7min)+" to "+date+(gTimeA22min),true);
	
		driver.navigate().refresh();
		
	

	}
	public void calendarEventByResorceSchedul(WebDriver driver, String date,String gCurrntTime, String gTimeA7min,String gTimeA22min) throws Throwable {
		calendar.click();
		Thread.sleep(2000);
		Actions act = new Actions(driver);
		addNewEvent.click();
		Thread.sleep(1000);
		fireDepartmentField.click();
		
		act.sendKeys("D1").build().perform();
		Thread.sleep(1000);
		act.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(2000);
		fireStastionField.click();
		Thread.sleep(1000);
		act.sendKeys("04").build().perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ENTER).build().perform();

		eventTitleField.click();
		
		act.sendKeys("BG-calendar event by Resorce.").build().perform();
		
		eventDescriptionField.click();

		act.sendKeys("checking calendar event by attribute with 1 hour reminder."
		+"Calendar event creation date andt time-"+date+"_"+gCurrntTime).build().perform();

		eventLocation.click();

		act.sendKeys("Nagpur").build().perform();

		eventStartDate.click();
	
		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys(Keys.BACK_SPACE).build().perform();

		act.sendKeys(date).build().perform();
	
		label.click();

		eventEndDate.click();

		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys(Keys.BACK_SPACE).build().perform();
	
		act.sendKeys(date).build().perform();

		label.click();

		
		eventStartTime.click();

		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys(Keys.BACK_SPACE).build().perform();

		act.sendKeys(gTimeA7min).build().perform();
		label.click();

		
		eventEndTime.click();
	
		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys(Keys.BACK_SPACE).build().perform();
	
		act.sendKeys(gTimeA22min).build().perform();
		label.click();
		
		setReminder.click();
	
		
		Select se = new Select(reminderType);
		
		se.selectByVisibleText("One time");

        Select se2 = new Select (reminderInHour);
 
		se2.selectByVisibleText("1");
		
		
		userTypeResource.click();

		
		D1ST04R2.click();
	
		
		sendPush.click();
		saveEvent.click();
		Thread.sleep(1000);
		
		Reporter.log("calendar event by attribute from-"+date+(gTimeA7min)+" to "+date+(gTimeA22min),true);
		driver.navigate().refresh();
		
	

	}
	
	public void calendarEventByFirefighterSchedul(WebDriver driver,String date, String date2,String gCurrntTime,String gTimeA7min,String gTimeA22min) throws Throwable {
		
		calendar.click();
		Thread.sleep(2000);Actions act = new Actions(driver);
		addNewEvent.click();
		Thread.sleep(1000);
		fireDepartmentField.click();
		
		act.sendKeys("D1").build().perform();
		Thread.sleep(1000);
		act.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(2000);
		fireStastionField.click();
		Thread.sleep(1000);
		act.sendKeys("04").build().perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ENTER).build().perform();

		eventTitleField.click();
		
		act.sendKeys("BG-calendar event by firfighter.").build().perform();
		
		eventDescriptionField.click();

		act.sendKeys("checking calendar event by attribute with 1 day reminder."
				+"Calendar event creation date andt time-"+date+"_"+gCurrntTime).build().perform();

		eventLocation.click();

		act.sendKeys("Nagpur").build().perform();

		eventStartDate.click();
	
		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys(Keys.BACK_SPACE).build().perform();

		act.sendKeys(date2).build().perform();
	
		label.click();

		eventEndDate.click();

		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys(Keys.BACK_SPACE).build().perform();
	
		act.sendKeys(date2).build().perform();

		label.click();

		
		eventStartTime.click();

		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys(Keys.BACK_SPACE).build().perform();

		act.sendKeys(gTimeA7min).build().perform();
		label.click();

		
		eventEndTime.click();
	
		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys(Keys.BACK_SPACE).build().perform();
	
		act.sendKeys(gTimeA22min).build().perform();
		label.click();
		
		setReminder.click();
	
		
		Select se = new Select(reminderType);
		
		se.selectByVisibleText("One time");

        Select se2 = new Select (reminderInDay);
 
		se2.selectByVisibleText("1");
		
		
		userTypeFirefighter.click();

		
		Honey1.click();
		BHTest.click();
		
		sendPush.click();
		saveEvent.click();
		Thread.sleep(2000);
		
		Reporter.log("calendar event by firefighter from-"+date2+(gTimeA7min)+" to "+date+(gTimeA22min),true);
		driver.navigate().refresh();
		
	

	}
	
	
	public void addEventCategory (WebDriver driver,String dateDDMMYY,String gTimeHHMM) throws Throwable
	{
		Actions act = new Actions(driver);
		eventCatogery.click();
		addEventCatogery.click();
		SelectDepartment.click();
		act.sendKeys("D1").build().perform();
		Thread.sleep(1000);
		act.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(2000);
		selectStation.click();
		act.sendKeys("04").build().perform();
		Thread.sleep(1000);
		act.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(2000);
		eventCategoryTitle.click();
		act.sendKeys("BG-EventCategoty-"+dateDDMMYY+"_"+gTimeHHMM).build().perform();
		chooseColor.click();
		Thread.sleep(2000);
		orange.click();
		Thread.sleep(2000);
		saveCategory.click();
		
		Reporter.log(" BG-EventCategoty-"+dateDDMMYY+"_"+gTimeHHMM+" added successfully.",true);
		
		
		
	}
	
	public void deletecalendarEventByAttribute(WebDriver driver) throws Throwable {
	
		calendar.click();
		Thread.sleep(2000);
		
		for (int i=1;i<=10;i++)
		{
		//monthButton.click();
		Thread.sleep(2000);

	    EventByAttribute.click();
	    deleteEvent.click();
	    Alert a=driver.switchTo().alert(); 
		Thread.sleep(2000);
	    a.accept();
	   
    
		Thread.sleep(3000);
		driver.navigate().refresh();
		Reporter.log("Calendar event create created by attribute no-"+i+" deleted successfully.",true);
		
		
		
		
		
		}
		
	}
		
		public void deletecalendarEventByResource(WebDriver driver) throws Throwable {
			calendar.click();
			Thread.sleep(2000);
			
			
			for (int i=1;i<=10;i++)
			{
			//monthButton.click();
			Thread.sleep(2000);
			Actions act = new Actions(driver);
			EventByResource.click();
		    deleteEvent.click();
		    Alert a=driver.switchTo().alert(); 
			Thread.sleep(2000);
		    a.accept();
		   
	    
			Thread.sleep(3000);
			driver.navigate().refresh();
			Reporter.log("Calendar event create created by resource no-"+i+" deleted successfully.",true);
			
			}
			
			
			
			}
			public void deletecalendarEventByFirefighter(WebDriver driver) throws Throwable {
				
				calendar.click();
				Thread.sleep(2000);
				
				for (int i=1;i<=10;i++)
				{
				//monthButton.click();
				Thread.sleep(2000);
				Actions act = new Actions(driver);
				EventByFirefighter.click();
			    deleteEvent.click();
			    Alert a=driver.switchTo().alert(); 
				Thread.sleep(2000);
			    a.accept();
			   
		    
				Thread.sleep(3000);
				driver.navigate().refresh();
				Reporter.log("Calendar event create created by firefighter no-"+i+" deleted successfully.",true);
				
				
				
				
				
				}
			}
				
				public void deleteEventCategory (WebDriver driver) throws Throwable
				{	eventCatogery.click();
					for (int i=1;i<=15;i++)
					{
					Thread.sleep(2000);
					Actions act = new Actions(driver);
				
					search.click();
					act.sendKeys("BG-EventCategoty").build().perform();
					Thread.sleep(2000);
					deleteCategory.click();
					deleteYes.click();
					driver.navigate().refresh();
					Reporter.log(" Event category number-"+i+" delete successfully deleted.",true);
					
					}
				
				}
				
	
	
}
