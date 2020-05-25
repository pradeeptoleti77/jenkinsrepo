package com.global.covid19;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class JenkinsTest extends BaseTest
{
 
  @BeforeMethod
  public void beforeMethod() throws Exception 
  {
	  init();
		
		test=report.startTest("TC_004");
		
	 	//log.info("\\..........Initializing properties files............//");
		test.log(LogStatus.INFO, "\\..........Initializing properties files............//");
		
		openBrowser("chromebrowser");
		//log.info("Opened the browser:" +p.getProperty("chromebrowser"));
		test.log(LogStatus.INFO, "Opened the browser:" +p.getProperty("chromebrowser"));
		
		navigateUrl("amazonurl");
		//log.info("navigating to url:" +subprop.getProperty("amazonurl"));
		test.log(LogStatus.INFO, "navigating to url:" +subprop.getProperty("amazonurl"));
		 
  }
  
  @Test
  public void amazon() 
  {
	  selectOption("amazondropdown_id","amazondropdowninput");
		//log.info("Selected the option:" +subprop.getProperty("amazondropdowninput") + "by using locator:"+subprop.getProperty("amazondropdown_id"));
		test.log(LogStatus.PASS, "navigating to url:-" +subprop.getProperty("amazonurl"));
		
		enterSearchText("amazontextfield_name","amazonsearchtext");
		//log.info("Entered the text:" +subprop.getProperty("amazonsearchtext") + "by using locator:" +subprop.getProperty("amazontextfield_name"));
		test.log(LogStatus.PASS, "Entered the text:-"  +subprop.getProperty("amazonsearchtext") +  "by using locator:-" +subprop.getProperty("amazontextfield_name"));
		
		clickSearch("amazonsearchbutton_class");
		//log.info("clicked on search option by using locator:" +subprop.getProperty("amazonsearchbutton_class"));
		test.log(LogStatus.PASS, "clicked on search option by using locator:-" +subprop.getProperty("amazonsearchbutton_class"));
		
  }
  @AfterMethod
  public void afterMethod()
  {
	  report.endTest(test);
	  report.flush();
	  driver.quit();
  }

}
