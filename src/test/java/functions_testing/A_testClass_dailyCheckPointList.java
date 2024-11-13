package functions_testing;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;




public class A_testClass_dailyCheckPointList extends B_baseClass {

	String date;
	String gCurrntTime;
	
	String gTimeA3min;
	String gTimeA5min;
	String gTimeA7min;
	String gTimeA9min;
	String gTimeA11min;
	String gTimeA15min;
	String gTimeA22min;
	String gTimeA30min;
	String gTimeA67min;
	String gTimeA82min;
	
	String gTime2A7min;
	String gTime2A9min;
	String gTime2A11min;
	String gTime2A15min;
	String gTime2A22min;
	String gTime2A30min;
	String gTime2A67min;
	String gTime2A88min;
	
	
	
	
	String gTimeHHMM;
	String dateDDMMYY;

	String date2;
	String dateAft2Days;
	String today;
	String dayCount ;
	String dayAf2day;
	String dayAf4day;
	
	String newStationUser;
	
	String userName = "914-IN-U11-U011-1";
	
	
	

	

	String password = "Qwerty@123";

	C_logIn_logOut lp;
	D_homePage hp;
	E_manualAlarm ma;
	F_information ip;
	G_InfoEvent ep;
	AAA_timeClasss tmc;
	H_testAlarm ta;
	I_availabilityRequest ar;
	j_calendarEvent ce;
	k_monitorUser mu;
	m_ChatGroup cg;
	l_attribute at;
	j_resource rec;
	n_addUsers ff;
	o_fireStation st;
	p_vehicleUser vu;
	q_checkList cl;
	r_permissionGroup pg;
	j_alarmLoop al;
	s_alarmTemplate atem;
	t_stormAlarm salm;
	
	
	
	
	
	
	
	

	@BeforeClass
	public void lounchBrowser() throws Throwable {

		browserLounch();
		

		lp = new C_logIn_logOut(driver);
		hp = new D_homePage(driver);

		lp.logIn(userName, password, driver);

		hp.langChange(driver);
		ma = new E_manualAlarm(driver);
		ip = new F_information(driver);
		ep = new G_InfoEvent(driver);
		tmc = new AAA_timeClasss();
		ta = new H_testAlarm(driver);

		ar = new I_availabilityRequest(driver);

		ce = new j_calendarEvent(driver);
		
		salm=new t_stormAlarm (driver) ;

		tmc.catchTime(driver);
		
		
		
	
		date = tmc.germanyTodaysDate;
		gCurrntTime = tmc.germanycurrentTime;
		gTimeA3min = tmc.germanyTimeAfter3Minutes;
		gTimeA7min = tmc.germanyTimeAfter7Minutes;
		gTimeA9min = tmc.germanyTimeAfter9Minutes;
		gTimeA11min = tmc.germanyTimeAfter11Minutes;
		gTimeA15min = tmc.germanyTimeAfter15Minutes;
		gTimeA22min = tmc.germanyTimeAfter22Minutes;
		gTimeA30min = tmc.germanyTimeAfter30Minutes;
		gTimeA67min = tmc.germanyTimeAfter67Minutes;
		
		gTime2A7min= tmc.germanyTime2After7Minutes;
		gTime2A9min= tmc.germanyTime2After9Minutes;
		gTime2A11min=tmc.germanyTime2After11Minutes;
		gTime2A15min=tmc.germanyTime2After15Minutes;
		gTime2A22min=tmc.germanyTime2After22Minutes;
		gTime2A30min=tmc.germanyTime2After30Minutes;
		
		gTime2A67min =tmc.germanyTime2After67Minutes;
	    gTime2A88min =tmc.germanyTime2After88Minutes;
		
		
				
		
		
		gTimeHHMM =tmc.germanycurrentTimeHHMM;
		dateDDMMYY =tmc.germanyTodaysDate2;
		
		
		date2 = tmc.germanyTomorrowDate2;
		dateAft2Days = tmc.germanyDateAfterTwoDyas;

		tmc.getDays(driver);
		tmc.getDaysDetail(driver);
		today = tmc.TodaysDay;
		dayCount = String.valueOf(tmc.count);
		dayAf2day = tmc.dayTow;
		dayAf4day = tmc.dayFour;
	
		
		
	

		mu = new k_monitorUser(driver);
		cg = new m_ChatGroup (driver) ;
		
		at=new l_attribute(driver) ;
		
	
		
		rec=new j_resource (driver);
		ff=new n_addUsers (driver);
		st=new o_fireStation (driver) ;
		vu=new p_vehicleUser (driver) ;
		cl=new q_checkList (driver) ;
		
		pg=new r_permissionGroup (driver);
		al = new j_alarmLoop (driver);
		atem=new s_alarmTemplate(driver);
		
		
		
		
		Reporter.log("Hello, Daily check point checking process has started.-"+date+">"+gCurrntTime, true);
		
		Reporter.log(" ", true);
		Reporter.log("Todays is "+dayCount+" "+today+" of this month.", true);
		Reporter.log(" ", true);
		
		
		

	}

	@BeforeMethod
	public void backToHomePage() throws Throwable {
		hp.backToHomePage(driver);

	}
	@Test

	public void time() throws Throwable {
		tmc.catchTime(driver);

		
	}
	
	
	
	

	
	@Test

	public void userDetails() throws Throwable 
	{

		Reporter.log(" ", true);
		Reporter.log("live department user # " + userName + " # log in sucessfully", true);
		Reporter.log(" ", true);
	}

	

	@Test

	public void createStormAlarm() throws Throwable {
		Reporter.log(" ", true);
		Reporter.log("The process of create new storm is started.", true);
		salm.stormAlarm(driver, dateDDMMYY, gTimeHHMM);
		Reporter.log("The process of create new storm is complete.", true);
		Reporter.log(" ", true);
		Reporter.log("The process of extend storm is started.", true);
		salm.extendStormAlarm(driver);
		Reporter.log("The process of extend storm is complete.", true);
		Reporter.log(" ", true);
		
		
		
	
	}
	
	
	@Test

	public void addEventCategory() throws Throwable {
		Reporter.log(" ", true);
		Reporter.log("The process of adding new event category is started.", true);
		ce.calendarEventCommon(driver);
		ce.addEventCategory(driver, dateDDMMYY, gTimeHHMM);
		
		Reporter.log("The process of new event category is complete.", true);
		Reporter.log(" ", true);
		
	
	}
	
	
	
	
	
	
	
	
	
	@Test

	public void createAlamTemplate() throws Throwable {
		Reporter.log(" ", true);
		Reporter.log("The process of adding new alarm template is started.", true);
		atem.commonForAlarmTemplate(driver);
		atem.addAlarmTemplate(driver, dateDDMMYY, gTimeHHMM);
		
		Reporter.log("The process of adding new alarm template is complete.", true);
		Reporter.log(" ", true);
		
	
	}
	
	
	
	
	
	
	
	@Test

	public void createAlamLoop() throws Throwable {
		Reporter.log(" ", true);
		Reporter.log("The process of adding new alarm loop is started.", true);
		al.commonForAlarmLoop(driver);
		al.addAlarmLoop(driver, dateDDMMYY, gTimeHHMM);
		Reporter.log("The process of adding new alarm loop is complete.", true);
		Reporter.log(" ", true);
		
	
	}

	
	
	
	
	@Test

	public void createResource() throws Throwable {
		Reporter.log(" ", true);
		Reporter.log("The process of adding new resource is started.", true);
		rec.addResource(driver, dateDDMMYY, gTimeHHMM);
		Reporter.log("The process of adding new resource is complete.", true);
		Reporter.log(" ", true);
		
	
	}

	
	
	@Test

	public void createPermissionGroupDefaultStation() throws Throwable {
		Reporter.log(" ", true);
		Reporter.log("The process of creating permission group for default station is started.", true);
		pg.createPrmissionGroup(driver, dateDDMMYY, gTimeHHMM);
		Reporter.log("The process of creating permission group for default station is complete.", true);
		Reporter.log(" ", true);
		Thread.sleep(3000);
	}
	
	
	
	
	@Test

	public void createNormalCheckList() throws Throwable {
		Reporter.log(" ", true);
		Reporter.log("The process of creating normal check list is started.", true);
		cl.commonForCheckList(driver);
		cl.createCheckListNormal(driver, dateDDMMYY, gTimeHHMM);
		Reporter.log("The process of creating normal check list is complete.", true);
		Reporter.log(" ", true);
		Thread.sleep(3000);
	}
	
	@Test

	public void createAlarmCheckList() throws Throwable {
		Reporter.log(" ", true);
		Reporter.log("The process of creating alarm check list is started.", true);
		cl.commonForCheckList(driver);
		cl.createCheckListAlarm(driver, dateDDMMYY, gTimeHHMM);
		Reporter.log("The process of creating alarm check list is complete.", true);
		Reporter.log(" ", true);
		Thread.sleep(3000);
	}
	
	
	
	
	
	
	@Test

	public void createChatGrouForStation06Users() throws Throwable {
		Reporter.log(" ", true);
		Reporter.log("The process of creating a chat group is started.", true);
		cg.commonForCreateGroup(driver);
		cg.createGroupByAttribute(driver, date, gCurrntTime);
		Reporter.log("The process of creating a chat group is complete.", true);
		Reporter.log(" ", true);
		Thread.sleep(3000);
	}
	
	
	
	
	
	@Test

	public void createChatGrouForNewStation() throws Throwable {
		Reporter.log(" ", true);
		Reporter.log("The process of creating a chat group is started.", true);
		cg.commonForCreateGroup(driver);
		cg.createNewChatGroupForNewFirefighter(driver, dateDDMMYY, gTimeHHMM);
		Reporter.log("The process of creating a chat group is complete.", true);
		Reporter.log(" ", true);
		Thread.sleep(3000);
	}
	
	@Test

	public void sendMessageChatGrouForStation06Users() throws Throwable {
		Reporter.log(" ", true);
		Reporter.log("The process of sending message to a chat group is started.", true);
		cg.commonForCreateGroup(driver);
		cg.sendMessageToGtoup(driver, date, gCurrntTime);
	
		Reporter.log("The process of sending message to a chat group is complete.", true);
		Reporter.log(" ", true);
		Thread.sleep(3000);
	}
	
	
	@Test

	public void sendMessageChatGrouForNewStation() throws Throwable {
		Reporter.log(" ", true);
		Reporter.log("The process of sending message to a chat group is started.", true);
		cg.commonForCreateGroup(driver);
		cg.sendMessageToNewChatGroupForNewFirefighter(driver, dateDDMMYY, gTimeHHMM);
	
		Reporter.log("The process of sending message to a chat group is complete.", true);
		Reporter.log(" ", true);
		Thread.sleep(3000);
	}
	
	
	
	
	
	
	
	@Test

	public void createManualAlarmByNewAttributeForNewStation() throws Throwable {
		Reporter.log(" ", true);
		Reporter.log("The process of creating a manual alarm by new attribute is started.", true);
		ma.manualAlarmCommon(driver);
		ma.manualAlarmByNewAttribute(driver, dateDDMMYY, gTimeHHMM);
		Reporter.log("The process of creating a manual alarm by new attribute is complete.", true);
		Reporter.log(" ", true);
		Thread.sleep(3000);
	}
	
	
	

	@Test

	public void createManualAlarmByNewResourceForNewStation() throws Throwable {
		Reporter.log(" ", true);
		Reporter.log("The process of creating a manual alarm by new resource is started.", true);
		ma.manualAlarmCommon(driver);
		ma.manualAlarmByNewResource(driver, dateDDMMYY, gTimeHHMM);
		Reporter.log("The process of creating a manual alarm by new resource is complete.", true);
		Reporter.log(" ", true);
		Thread.sleep(3000);
	}
	
	
	@Test

	public void createManualAlarmByNewFireighterForNewStation() throws Throwable {
		Reporter.log(" ", true);
		Reporter.log("The process of creating a manual alarm by new firefighter is started.", true);
		ma.manualAlarmCommon(driver);
		ma.manualAlarmByNewFireFighter(driver, dateDDMMYY, gTimeHHMM);
		Reporter.log("The process of creating a manual alarm by new firefighter is complete.", true);
		Reporter.log(" ", true);
		Thread.sleep(3000);
	}
	
	@Test

	public void addVehicleUser() throws Throwable {
		Reporter.log(" ", true);
		Reporter.log("The process of add new vehicle for station 06 is started.", true);
		
	vu.commonForVehicleUser(driver);
	vu.addVehicleUser(driver);
		
		Reporter.log("The process of aadd new vehicle for station 06 is complete.", true);
		Reporter.log(" ", true);
		Thread.sleep(3000);
		
	}
	
	
	@Test

	public void addVehicleUserForNewStation() throws Throwable {
		Reporter.log(" ", true);
		Reporter.log("The process of add new vehicle is started.", true);
		
	vu.commonForVehicleUser(driver);
	vu.addVehicleUserForNewStation(driver, dateDDMMYY, gTimeHHMM);
		
		Reporter.log("The process of aadd new vehicle is complete.", true);
		Reporter.log(" ", true);
		Thread.sleep(3000);
		
	}
	
	
	
	@Test

	public void addFireStation() throws Throwable {
		Reporter.log(" ", true);
		Reporter.log("The process of add new station is started.", true);
		st.CommonForStation(driver);
		st.createStation(driver, dateDDMMYY, gTimeHHMM);
		
		
		Reporter.log("The process of aadd new station is complete.", true);
		Reporter.log(" ", true);
		Thread.sleep(3000);
		
	}
	
	@Test

	public void addNewStationUserForNewStation() throws Throwable {
		Reporter.log(" ", true);
		Reporter.log("The process of add station user is started.", true);
		ff.commonForAddUers(driver);
	    ff.addStationUser(driver, dateDDMMYY, gTimeHHMM);
	    newStationUser=ff.newStationUser;
		
		
		Reporter.log("The process of add station uers is complete.", true);
		Reporter.log(" ", true);
		Thread.sleep(3000);
		
	}
	
	@Test

	public void addFirefighterForNewStation() throws Throwable {
		Reporter.log(" ", true);
		Reporter.log("The process of add fire fighter is started.", true);
		ff.commonForAddUers(driver);
		ff.addfireFighter(driver, dateDDMMYY, gTimeHHMM);
		
		
		Reporter.log("The process of add fire fighter is complete.", true);
		Reporter.log(" ", true);
		Thread.sleep(3000);
		
	}
	
	
	
	 
	
	
	@Test

	public void addResourceForNewStation() throws Throwable {
		Reporter.log(" ", true);
		Reporter.log("The process of creating resorce is started.", true);
		
		
		rec.addResourceForNewStation(driver, dateDDMMYY, gTimeHHMM);
		
		
		
		Reporter.log("The process of creating resorce is is complete.", true);
		Reporter.log(" ", true);
		Thread.sleep(3000);
	}
	
	
	
	
	@Test 

	public void CreateAttributeForDepartment() throws Throwable {

		Reporter.log(" ", true);
		Reporter.log("The process of creating attribute is started.", true);
		
		at.addAttribute(driver,dateDDMMYY,gTimeHHMM);
		
		
		Reporter.log("The process of creating attribute is is complete.", true);
		Reporter.log(" ", true);
		Thread.sleep(3000);
	}

	
	@Test

	public void createMonitorInformation01() throws Throwable {

		Reporter.log(" ", true);
		Reporter.log("The process of creating information 1 from " + gTimeA7min + " to " + gTimeA22min
				+ " for monitor is started.", true);
		ip.infoEventCommon(driver);
		ip.createInformationForMonitor(driver, gTimeA7min, gTimeA22min, date);
		Reporter.log("The process of creating information 1 for monitor is complete.", true);
		Reporter.log(" ", true);
		Thread.sleep(3000);
	}

	@Test


	public void createMonitorInformation02() throws Throwable {

		Reporter.log(" ", true);
		Reporter.log("The process of creating information 2 from " + gTimeA15min + " to " + gTimeA30min
				+ " for monitor is started.", true);
		ip.infoEventCommon(driver);
		ip.createInformationForMonitor(driver, gTimeA15min, gTimeA30min, date);
		Reporter.log("The process of creating information 2 for monitor is complete.", true);
		Reporter.log(" ", true);
		Thread.sleep(3000);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	




	
	
	
@Test
	
	public void createTestAlarmByAttributeOneTime() throws Throwable {
	
	tmc.catchTime2(driver);
	gTimeA3min =tmc.germanyTimeAfter3Minutes;

		Reporter.log(" ", true);
		Reporter.log("The process of creating a test alarm by attribute with remindar one time is started.",true);
		ta.testAlarmCommon(driver);
		ta.testAlarmByOnetime(driver, date, gTimeA3min, today);

		Reporter.log("The process of creating a test alarm by attribute with remindar one time is complete.",true);
		Reporter.log(" ", true);

		Thread.sleep(3000);
	}


@Test

public void createTestAlarmByAttributeRecursivedaily() throws Throwable {

tmc.catchTime2(driver);
gTimeA5min = tmc.germanyTimeAfter5Minutes;

	Reporter.log(" ", true);
	Reporter.log("The process of creating a test alarm by attribute with remindar recursive > daily is started.",true);
	ta.testAlarmCommon(driver);
	ta.testAlarmByRecursiveDaily(driver, date, gTimeA5min);

	Reporter.log("The process of creating a test alarm by attribute with remindar recursive > daily is complete.",true);
	Reporter.log(" ", true);

	Thread.sleep(3000);
}

@Test

public void createTestAlarmByAttributeRecursiveWeekly() throws Throwable {
tmc.catchTime2(driver);
gTimeA7min = tmc.germanyTimeAfter7Minutes;

	Reporter.log(" ", true);
	Reporter.log("The process of creating a test alarm by attribute with remindar recursive > weekly is started.",true);
	ta.testAlarmCommon(driver);
	ta.testAlarmByRecursiveWeekly(driver, date, gTimeA7min, today);

	Reporter.log("The process of creating a test alarm by attribute with remindar recursive > weekly is complete.",true);
	Reporter.log(" ", true);

	Thread.sleep(3000);
}

	
	
@Test
	
	public void testAlarmByRecursiveMonthlyDayWise() throws Throwable {
	
		tmc.catchTime2(driver);
		gTimeA9min = tmc.germanyTimeAfter9Minutes;

		Reporter.log(" ", true);
		Reporter.log("The process of creating a test alarm by attribute with remindar recirsive > monthly > day wise is started.",true);
		ta.testAlarmCommon(driver);
		ta.testAlarmByRecursiveMonthlyDayWise(driver, date, gTimeA9min, dayCount, today);
	
		Reporter.log("The process of creating a test alarm by attribute with remindar recirsive > monthly > day wise is complete.",true);
		Reporter.log(" ", true);

		Thread.sleep(3000);
	}
	
	


	
	
	
	@Test
	
	public void createTestAlarmByAttributeRecursiveMontlyDateWise() throws Throwable {

		tmc.catchTime2(driver);
		gTimeA11min = tmc.germanyTimeAfter11Minutes;

		Reporter.log(" ", true);
		Reporter.log("The process of creating a test alarm by attribute with remindar recursive > monthly > date wise is started.",true);
		ta.testAlarmCommon(driver);
		ta.testAlarmByRecursiveMonthlyDateWais(driver, date, gTimeA11min);

		Reporter.log("The process of creating a test alarm by attribute with remindar recursive > monthly > date wise is complete.",true);
		Reporter.log(" ", true);

		Thread.sleep(3000);
	}

	@Test

	public void createManualAlarmByAttribute() throws Throwable {
		Reporter.log(" ", true);
		Reporter.log("The process of creating a manual alarm by attribute is started.", true);
		ma.manualAlarmCommon(driver);
		ma.manualAlarmByAttribute(driver, date);
		Reporter.log("The process of creating a manual alarm by attribute is complete.", true);
		Reporter.log(" ", true);
		Thread.sleep(3000);
	}

	@Test

	public void createManualAlarmByResource() throws Throwable {
		Reporter.log(" ", true);
		Reporter.log("The process of creating a manual alarm by resource is started.", true);
		ma.manualAlarmCommon(driver);
		ma.manualAlarmByResource(driver, date);
		Reporter.log("The process of creating a manual alarm by resource is complete.", true);
		Reporter.log(" ", true);
		Thread.sleep(3000);
		
	}

	@Test

	public void createManualAlarmByFireFighte() throws Throwable {
		Reporter.log(" ", true);
		Reporter.log("The process of creating a manual alarm by firefighter is started.", true);
		ma.manualAlarmCommon(driver);
		ma.manualAlarmByFireFighter(driver, date);
		Reporter.log("The process of creating a manual alarm by firefighter is complete.", true);
		Reporter.log(" ", true);
		Thread.sleep(3000);
	}

	@Test

	public void createManualAlarmByEscalationResource() throws Throwable {
		Reporter.log(" ", true);
		Reporter.log("The process of creating a manual alarm by escaltion resource is started.", true);
		ma.manualAlarmCommon(driver);
		ma.manualAlarmByEscalationResource(driver, date);
		Reporter.log("The process of creating a manual alarm by escaltion resource is complete.", true);
		Reporter.log(" ", true);
		Thread.sleep(3000);
	}

	@Test

	public void createLowPriorityManualAlarmByAttribute() throws Throwable {
		Reporter.log(" ", true);
		Reporter.log("The process of creating low priority manual alarm by attribute is started.", true);
		ma.manualAlarmCommon(driver);
		ma.manualAlarmLowPriorityByAttribute(driver, date);
		Reporter.log("The process of creating low priority manual alarm by attribute is complete.", true);
		Reporter.log(" ", true);
		Thread.sleep(3000);
	}

	@Test

	public void sendmessageToAlarmUser() throws Throwable {
		Reporter.log(" ", true);
		Reporter.log("The Process of send message to user is started.", true);
		ma.manualAlarmCommon(driver);
		ma.sendmessageToAlarmUser(driver, date);
		Reporter.log("The Process of send message to user is complete.", true);
		Reporter.log(" ", true);
		Thread.sleep(3000);
	}

	@Test

	public void extendAlarmToSecondStation() throws Throwable {
		Reporter.log(" ", true);
		Reporter.log("The process of extend alarm is started.", true);
		ma.manualAlarmCommon(driver);
		ma.extendAlarm(driver, date);
		Reporter.log("The process of extend alarm is complete.", true);
		Reporter.log(" ", true);
		Thread.sleep(3000);
	}

	@Test

	public void createInformationByAttribute() throws Throwable {
		Reporter.log(" ", true);
		Reporter.log("The process of creating information by attribute is started.", true);
		ip.infoEventCommon(driver);
		ip.createInformationByAttribute(driver);
		Reporter.log("The process of creating information by attribute is complete.", true);
		Reporter.log(" ", true);
		Thread.sleep(3000);
	}

	@Test

	public void createInformationByResource() throws Throwable {
		Reporter.log(" ", true);
		Reporter.log("The process of creating information by resource is started.", true);
		ip.infoEventCommon(driver);
		ip.createInformationByResource(driver);
		Reporter.log("The process of creating information by resource is complete.", true);
		Reporter.log(" ", true);
		Thread.sleep(3000);
	}

	@Test

	public void createInformationByFirefighter() throws Throwable {
		Reporter.log(" ", true);
		Reporter.log("The process of creating information by firefighter is started.", true);
		ip.infoEventCommon(driver);
		ip.createInformationByfireFighter(driver);
		Reporter.log("The process of creating information by firefighter is complete.", true);
		Reporter.log(" ", true);
		Thread.sleep(3000);
	}

	@Test
	public void sendmessageToinfoUsers() throws Throwable {
		Reporter.log(" ", true);
		Reporter.log("The process of send message to information users is started.", true);
		ip.infoEventCommon(driver);
		ip.sendmessageToInfoUsers(driver);
		Reporter.log("The process of send message to information users is started is complete.", true);
		Reporter.log(" ", true);
		Thread.sleep(3000);
	}

	@Test

	public void createInfoEventByAttributeSchedule() throws Throwable {

		tmc.catchTime2(driver);
		date = tmc.germanyTodaysDate;
		gTimeA7min = tmc.germanyTimeAfter7Minutes;
		gTimeA22min = tmc.germanyTimeAfter22Minutes;
		Reporter.log(" ", true);
		Reporter.log("The process of create info-event schedule by attribute is started.", true);
		ip.infoEventCommon(driver);
		ep.createEventByAttributeSchedule(driver, date, gTimeA7min, gTimeA22min);
		Reporter.log("The process of create info-event schedule by attribute is complete.", true);
		Reporter.log(" ", true);
		Thread.sleep(3000);
	}

	@Test
	public void createInfoEventByResourceSchedule() throws Throwable {

		tmc.catchTime2(driver);
		date = tmc.germanyTodaysDate;
		gTimeA67min = tmc.germanyTimeAfter67Minutes;
		gTimeA82min = tmc.germanyTimeAfter82Minutes;

		Reporter.log(" ", true);
		Reporter.log("The process of create info-event schedule by resource is started.", true);
		ip.infoEventCommon(driver);
		ep.createEventByResourceSchedule(driver, date, gTimeA67min, gTimeA82min);
		Reporter.log("The process of create info-event schedule by attribute is complete.", true);
		Reporter.log(" ", true);
		Thread.sleep(3000);
	}

	@Test
	public void createInfoEventByFighterSchedule() throws Throwable {

		tmc.catchTime2(driver);
		gTimeA7min = tmc.germanyTimeAfter7Minutes;
		gTimeA22min = tmc.germanyTimeAfter22Minutes;

		Reporter.log(" ", true);
		Reporter.log("The process of create info-event schedule by firefighter is started.", true);
		ip.infoEventCommon(driver);
		ep.createEventByFireFightrSchedule(driver, date2, gTimeA7min, gTimeA22min);

		Reporter.log("The process of create info-event schedule by firefighter is complete.", true);
		Reporter.log(" ", true);
		Thread.sleep(3000);
	}

	@Test

	public void createInfoEventByAttribute() throws Throwable {
		Reporter.log(" ", true);
		Reporter.log("The process of create info-event by attribute is started.", true);
		ip.infoEventCommon(driver);
		ep.createEventByAttribute(driver, date);
		Reporter.log("The process of create info-event by attribute is complete.", true);
		Reporter.log(" ", true);
		Thread.sleep(3000);
	}

	@Test

	public void createInfoEventByResource() throws Throwable {
		Reporter.log(" ", true);
		Reporter.log("The process of create info-event by resource is started.", true);
		ip.infoEventCommon(driver);
		ep.createEventByResource(driver, date);
		Reporter.log("The process of create info-event by resource is complete.", true);
		Reporter.log(" ", true);
		Thread.sleep(3000);
	}

	@Test

	public void createInfoEventByFirefighter() throws Throwable {
		Reporter.log(" ", true);
		Reporter.log("The process of create info-event by firefighter is started.", true);
		ip.infoEventCommon(driver);
		ep.createEventByFirefighter(driver, date);
		Reporter.log("The process of create info-event by firefighter is complete.", true);
		Reporter.log(" ", true);
		Thread.sleep(3000);
	}

//	@Test
//
//	public void sendmessageToInfoEventUsers() throws Throwable {
//		Reporter.log(" ", true);
//		Reporter.log("The process of create info-event by firefighter is started.", true);
//		ip.infoEventCommon(driver);
//		ep.createEventByFirefighter(driver, date);
//		Reporter.log("The process of create info-event by firefighter is complete.", true);
//		Reporter.log(" ", true);
//		Thread.sleep(3000);
//	}

	@Test
	public void sendmessageToinfoEventUsers() throws Throwable {
		Reporter.log(" ", true);
		Reporter.log("The process of send message to info-event users is started.", true);
		ip.infoEventCommon(driver);
		ep.sendmessageToInfoEventUsers(driver);
		Reporter.log("The process of send message to info-event users is started is complete.", true);
		Reporter.log(" ", true);
		Thread.sleep(3000);
	}

	@Test
	public void createAvailabilityRequestSendImmediat() throws Throwable {
		Reporter.log(" ", true);
		Reporter.log("The process of create availability request > send imediate is started.", true);
		ar.availabilityRequestCommon(driver);
		ar.ARSendImmediate(driver,date, date2, gTimeA7min, dateAft2Days, gTimeA22min);
		Reporter.log("The process of create availability request > send imediate is complete.", true);
		Reporter.log(" ", true);
		Thread.sleep(3000);
	}

	@Test
	public void createAvailabilityRequestSendSchedule() throws Throwable {
		Reporter.log(" ", true);
		Reporter.log("The process of create availability request > schedule is started.", true);
		ar.availabilityRequestCommon(driver);
		ar.ARSendSchedule(driver, date, date2, gTimeA7min, dateAft2Days, gTimeA22min);
		Reporter.log("The process of create availability request > schedule is complete.", true);
		Reporter.log(" ", true);
		Thread.sleep(3000);
	}

	@Test
	public void createAvailabilityRequestSendRecursive() throws Throwable {
		Reporter.log(" ", true);
		Reporter.log("The process of create availability request > recursive is started.", true);
		ar.availabilityRequestCommon(driver);
		ar.ARRecursivee(driver,date, today, gTimeA7min, gTimeA22min, dayAf2day, dayAf4day);
		Reporter.log("The process of create availability request > recursive is complete.", true);
		Reporter.log(" ", true);
		Thread.sleep(3000);
	}

	@Test
	public void createAvailabilityRequestSendMultipleDays() throws Throwable {
		Reporter.log(" ", true);
		Reporter.log("The process of create availability request > multiple days is started.", true);
		ar.availabilityRequestCommon(driver);
		ar.ARSendMultiple(driver, date, gTimeA7min, gTimeA11min, gTimeA15min, dayAf2day, dayAf4day, gTimeA22min);
		Reporter.log("The process of create availability request > multiple days is complete.", true);
		Reporter.log(" ", true);
		Thread.sleep(3000);
	}

	@Test
	public void SendmessagetoARUsers() throws Throwable {
		Reporter.log(" ", true);
		Reporter.log("The process of send message to availability request users is started.", true);
		ar.availabilityRequestCommonDashboard(driver);
		ar.messageToARUser(driver);
		Reporter.log("The process of csend message to availability request users is complete.", true);
		Reporter.log(" ", true);
		Thread.sleep(3000);
	}

	@Test
	public void cretecalendarEventAttributeSchedule() throws Throwable {
		
		tmc.catchTime(driver);
		gTime2A7min = tmc.germanyTime2After7Minutes;
		gTime2A22min = tmc.germanyTime2After22Minutes;
		Reporter.log(" ", true);
		Reporter.log("The process of create calendar event by attribute is started.", true);
		ce.calendarEventCommon(driver);
		ce.calendarEventByAttributeSchedul(driver, date,gCurrntTime, gTime2A7min, gTime2A22min);
		Reporter.log("The process of create calendar event by attribute is complete.", true);
		Reporter.log(" ", true);
		Thread.sleep(3000);
		
	}
	
	@Test
	public void cretecalendarEventResourceSchedule() throws Throwable {
		
		tmc.catchTime(driver);
		gTime2A67min = tmc.germanyTime2After67Minutes;
		gTime2A88min = tmc.germanyTime2After88Minutes;
		Reporter.log(" ", true);
		Reporter.log("The process of create calendar event by resource is started.", true);
		ce.calendarEventCommon(driver);
		ce.calendarEventByResorceSchedul(driver, date,gCurrntTime, gTime2A67min, gTime2A88min);
		Reporter.log("The process of create calendar event by resource is complete.", true);
		Reporter.log(" ", true);
		Thread.sleep(3000);
		
		
	}
	
	
	@Test
	public void cretecalendarEventFirefighterSchedule() throws Throwable {
		
		tmc.catchTime(driver);
		gTime2A7min = tmc.germanyTime2After7Minutes;
		gTime2A22min = tmc.germanyTime2After22Minutes;
		Reporter.log(" ", true);
		Reporter.log("The process of create calendar event by Firefighter is started.", true);
		ce.calendarEventCommon(driver);
		ce.calendarEventByFirefighterSchedul(driver, date, date2, gCurrntTime, gTime2A7min, gTime2A22min);
		Reporter.log("The process of create calendar event by Firefighter is complete.", true);
		Reporter.log(" ", true);
		Thread.sleep(3000);
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	

	@Test
	public void sendmessageToTestAlarmUsers() throws Throwable {
		Reporter.log(" ", true);
		Reporter.log("The process of send message to test alarm user is started", true);
		ta.testAlarmOverviewCommon(driver);
		ta.semdmessageToTestAlarmUsers(driver, date, gTimeA11min);
		Reporter.log("The process of send message to test alarm user is complete.", true);
		Reporter.log(" ", true);
		Thread.sleep(3000);
	}

	@Test
	public void createNewStationMonitorUser() throws Throwable {
		Reporter.log(" ", true);
		Reporter.log("The process of create station monitor user is started.", true);
		mu.commonForMonitorUser(driver);
		mu.createNewMonitorUser(driver, dateDDMMYY, gTimeHHMM);
		Reporter.log("The process of create station monitor user is complete.", true);
		Reporter.log(" ", true);
		Thread.sleep(3000);
	}
	
	@Test
	public void logInNewMonitorUser() throws Throwable {
		Reporter.log(" ", true);
		Reporter.log("The process of login new monitor user is started.", true);
		browserLounch();
		lp.logInMonitor("BG andrew station "+dateDDMMYY+gTimeHHMM+"M1", password, driver);
		
		Reporter.log("The process of login new monitor user is complete.", true);
		Reporter.log(" ", true);
		Thread.sleep(3000);
	}
	
	
	
	

	@Test
	public void detailsAboutScript() throws Throwable

	{
		Reporter.log(" ", true);

		Reporter.log("Login  date-" + date + " & login  time -" + gCurrntTime, true);

		tmc.catchTime2(driver);
		date = tmc.germanyTodaysDate;
		gCurrntTime = tmc.germanycurrentTime;
		Reporter.log("Logout date-" + date + " & logout time -" + gCurrntTime, true);
		Reporter.log(" ", true);
		Thread.sleep(3000);

	}

	@AfterMethod

	public void backToHomePage2() throws Throwable {
		hp.backToHomePage(driver);

	}

	@AfterClass
	public void logOut() throws Throwable {

		lp.logOut(driver);
		Reporter.log("Logout sucessfully.", true);
		Reporter.log(" ", true);

		driver.quit();
		Reporter.log("Browser close sucessfully.", true);
		Reporter.log(" ", true);

	}
}
