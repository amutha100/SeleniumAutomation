package SendmeldingTest;

import org.apache.log4j.xml.DOMConfigurator;

import com.webdriver.framework.GenerateResult;

import SendmeldingTest.InitBrowser;
import SendmeldingTest.OpenBrowser;
import SendmeldingTest.LoginPage;



public class Message {
	
	
	public static void main(String[] args) throws Exception {
		
		
		
		DOMConfigurator.configure("log4j.xml");
		GenerateResult generateResult =  new GenerateResult(null);
		generateResult.generateResultfile("Portalen");

		Log.startTestCase("Selenium_Test_001");
		
		InitBrowser.initBrowser();
		
		/*eventHandler handler = new eventHandler();
		InitBrowser.eventDriver.register(handler);*/
		generateResult.AddTestCaseId("TestCase_001");
		generateResult.AddTestCaseDesc("Opening URL");
		OpenBrowser.openUrl(Constant.URL);
		ExcelUtils.setExcelFile();
		String username = ExcelUtils.getCellData(1,1);
		Log.info("Username picked from Excel is "+ username );
		String password = ExcelUtils.getCellData(1,2);
		Log.info("Password picked from Excel is "+ password );
		generateResult.AddTestCaseId("TestCase_002");
		generateResult.AddTestCaseDesc("Login");
		LoginPage.login(username, password);
		generateResult.AddTestCaseId("TestCase_003");
		generateResult.AddTestCaseDesc("Sending Message");		 
		SendMessage.sendMsg();
		generateResult.AddTestCaseId("TestCase_004");
		generateResult.AddTestCaseDesc("Checking Sent Message");	
		CheckSentMsg.sentmsgCheck();
		String Title = CheckSentMsg.getTitle();
		String Message = CheckSentMsg.getMessage();
		String msgSentTime = CheckSentMsg.getTime();
		generateResult.AddTestCaseId("TestCase_004");
		generateResult.AddTestCaseDesc("Check Message in Epost");	
		String TitleInbox = EpostVarsel.Checkepostmsg();
		String msgSenttimeEpost = EpostVarsel.CheckepostTime();
		String sendResult = "";
		String epostResult="";
		
		String[] parts = msgSenttimeEpost.split(",");
		System.out.println(msgSentTime);

		String[] parts1 = parts[1].split(":");
         String finalString = String.join("", parts1[1],".",parts1[2]);
         
         System.out.println(finalString);
		if(Title.equals(Constant.Title) && Message.equals(Constant.msg) ) {
	    	Log.info("Send Message Test OK");  
			sendResult = "Pass";
	      }
	      else {
	    	  sendResult = "Fail"; 
	    		Log.info("Send Message Test not OK");  
	      }
		
		
		
		if(Title.equals(TitleInbox) && msgSentTime.equals(finalString.trim())) {
			Log.info("Varsel OK");  
	    	  epostResult ="Pass";
	      }
	      else {
	    	  
	    	  Log.info("Varsel not OK");  
	    	  epostResult = "Fail"; 
	      }
		
		ExcelUtils.writeCellData(sendResult,1,3);
		ExcelUtils.writeCellData(epostResult,1,4);
		//InitBrowser.eventDriver.quit();
		System.out.println("Finished");
		generateResult.CreateLog();
		Log.endTestCase("Selenium_Test_001");
		
	//	InitBrowser.eventDriver.unregister(handler);
		generateResult.AddTestCaseId("TestCase_005");
		generateResult.AddTestCaseDesc("Logout");	
		Logout.logout();
		  }
	
		
	}


