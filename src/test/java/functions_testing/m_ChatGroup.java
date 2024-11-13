package functions_testing;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class m_ChatGroup {
	
	
	
	
	
	
	    @FindBy(xpath="//span[text()=\"Conversation\"]")private WebElement conversation ;
		@FindBy(xpath="//span[text()=\"Groups\"]")private WebElement groups;
		@FindBy(xpath="//a[@href=\"http://testing.retteralarm.de/admin/GroupChat/groupList\"]")private WebElement groupList;
		@FindBy(xpath="//button[@class=\"btn btn-success\"]")private WebElement createNewChatGroup;
		@FindBy(xpath = "//span[@id=\"select2-selectFiredepartment-container\"]")private WebElement fireDepartmentField;
		@FindBy(xpath = "//input[@placeholder=\"Please select firestation.\"]")private WebElement fireStationField;
	    @FindBy(xpath="//input[@placeholder=\"Please enter group name.\"]")private WebElement groupNameField ;
	    @FindBy(xpath = "//input[@id=\"inlineRadio1\"]")private WebElement userTypeAttribute;
	    
	    
	    
		@FindBy(xpath = "//input[@id=\"user_id\" and @value=\"2170\"]")
		private WebElement D1St04A1;
	    @FindBy(xpath="//button[@id=\"addSubmit\"]")private WebElement saveGroup;

	    
	    @FindBy(xpath="//a[@href=\"http://testing.retteralarm.de/admin/GroupChat/index\"]")private WebElement groupConversation ;
	    @FindBy(xpath="//input [@placeholder=\"Search Group..\"]")private WebElement searchGroup;
	    @FindBy(xpath="(//a[@class=\"actionShowGroup\"])[1]")private WebElement charGroup;
	    @FindBy(xpath = "//input[@placeholder=\"Write your message...\"]")
		private WebElement writemessageField;
		@FindBy(xpath = "//button[@id=\"actionSendMessage\"]")
		private WebElement sendmessageButton;
		@FindBy(xpath = "(//i[@class=\"fa fa-user-plus\"])[4]")private WebElement extendAlarmButton;
		
		
		
	  @FindBy(xpath="//input[@id=\"selectCheckboxes\"]")private WebElement selectAll;
	  
	  
	 @FindBy(xpath="//input[@class=\"form-control input-sm\"]")private WebElement searchField;
	 @FindBy(xpath = "(//i[@class=\"fa fa-trash-o\"])[1]")private WebElement delete;
	 @FindBy(xpath = "//button[@id=\"delYes\"]")private WebElement deleteYes;
	 @FindBy(xpath="//input[@id=\"inlineRadio3\"]")private WebElement userTypeFirefighter;
	 // @FindBy(xpath="")private WebElement ;
	// @FindBy(xpath="")private WebElement ;
	// @FindBy(xpath="")private WebElement ;
	// @FindBy(xpath="")private WebElement ;
	 // @FindBy(xpath="")private WebElement ;
	// @FindBy(xpath="")private WebElement ;
	// @FindBy(xpath="")private WebElement ;
	// @FindBy(xpath="")private WebElement ;
	

		public m_ChatGroup(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
		
		
		
		public void commonForCreateGroup(WebDriver driver) 
		
		
		{
             conversation.click();
			 groups.click();
		}
		
		




		public void createGroupByAttribute(WebDriver driver, String date, String gCurrntTime) throws Throwable {
			Actions act = new Actions(driver);
            
			
			
			groupList.click();
		
			createNewChatGroup.click();
	
			fireDepartmentField.click();

			act.sendKeys("D1").build().perform();
			Thread.sleep(1000);
			act.sendKeys(Keys.ENTER).build().perform();
			Thread.sleep(2000);
			fireStationField.click();
	
			act.sendKeys("04").build().perform();
			Thread.sleep(1000);
			act.sendKeys(Keys.ENTER).build().perform();
			Thread.sleep(2000);
			groupNameField.click();
			act.sendKeys("BG").sendKeys(date).sendKeys(gCurrntTime).sendKeys("ChatGroup").build().perform();
		
			userTypeAttribute.click();
		
			D1St04A1.click();
			Thread.sleep(2000);
			saveGroup.click();
			Thread.sleep(1000);
			
		}
	
		
		
		public void sendMessageToGtoup(WebDriver driver , String date, String gCurrntTime) throws Throwable
		{
			Actions act = new Actions(driver);
			
			
			groupConversation.click();
		
			searchGroup.click();
	
			act.sendKeys("BG").sendKeys(date).sendKeys(gCurrntTime).sendKeys("ChatGroup").build().perform();
			Thread.sleep(5000);
			charGroup.click();
		
			writemessageField.click();
		
			act.sendKeys("message-chat group users").build().perform();
			Thread.sleep(2000);
			sendmessageButton.click();
			driver.navigate().refresh();
			Thread.sleep(1000);
			
		}

		
		
		public void createNewChatGroupForNewFirefighter(WebDriver driver, String dateDDMMYY, String gTimeHHMM) throws Throwable 
		
		{
			Actions act = new Actions(driver);
			
			
			
			
			
			groupList.click();
		
			createNewChatGroup.click();
	
			fireDepartmentField.click();

			act.sendKeys("D1").build().perform();
			Thread.sleep(1000);
			act.sendKeys(Keys.ENTER).build().perform();
			Thread.sleep(2000);
			fireStationField.click();
	
			act.sendKeys("BG D1 station "+dateDDMMYY+gTimeHHMM).build().perform();
			Thread.sleep(1000);
			act.sendKeys(Keys.ENTER).build().perform();
			Thread.sleep(2000);
			groupNameField.click();
			act.sendKeys("BG").sendKeys(dateDDMMYY).sendKeys(gTimeHHMM).sendKeys("ChatGroup").build().perform();
		
			userTypeFirefighter.click();
			Thread.sleep(2000);
			
			selectAll.click();
			saveGroup.click();
			Thread.sleep(1000);
			
			
			
			
		}
	
		
		
		public void sendMessageToNewChatGroupForNewFirefighter(WebDriver driver , String dateDDMMYY, String gTimeHHMM) throws Throwable
		
		{
			Actions act = new Actions(driver);
			
			
			groupConversation.click();
		
			searchGroup.click();
	
			act.sendKeys("BG").sendKeys(dateDDMMYY).sendKeys(gTimeHHMM).sendKeys("ChatGroup").build().perform();
			Thread.sleep(5000);
			charGroup.click();
		
			writemessageField.click();
		
			act.sendKeys("message-chat group new users").build().perform();
			Thread.sleep(2000);
			sendmessageButton.click();
			driver.navigate().refresh();
			Thread.sleep(1000);
			
		}
		
		
		
		
		
       public void deleteChatGroup (WebDriver driver ) throws Throwable
		
		{
    	   Actions act = new Actions(driver);
    	   
    	   groupList.click();
    	   
    	   for (int i=1;i<=20;i++)
    	   {
    	   searchField.click();
    	   act.sendKeys("BG").build().perform();
    	   Thread.sleep(3000);
    	   delete.click();
   		
			deleteYes.click();
			Thread.sleep(2000);
			
			Reporter.log("Chat group number-" + i + " is deleted sucessfully.", true);
		
		driver.navigate().refresh();
		
    	   }
    	   
    	   
    	   
    	   
	  
	  
	 
	
		}
		


		
		

	
	
	
	

}
