package SendmeldingTest;

import org.apache.log4j.xml.DOMConfigurator;


import SendmeldingTest.InitBrowser;
import SendmeldingTest.OpenBrowser;
import SendmeldingTest.LoginPage;




public class Message {
	
	
	public static void main(String[] args) throws Exception {
		
		DOMConfigurator.configure("log4j.xml");
		 
		Log.startTestCase("Selenium_Test_001");
		InitBrowser.initBrowser();
		eventHandler handler = new eventHandler();
		InitBrowser.eventDriver.register(handler);
		OpenBrowser.openUrl(Constant.URL);
		ExcelUtils.setExcelFile();
		String username = ExcelUtils.getCellData(1,1);
		Log.info("Username picked from Excel is "+ username );
		String password = ExcelUtils.getCellData(1,2);
		Log.info("Password picked from Excel is "+ password );
		LoginPage.login(username, password);
		 
		SendMessage.sendMsg();
		CheckSentMsg.sentmsgCheck();
		String Title = CheckSentMsg.getTitle();
		String Message = CheckSentMsg.getMessage();
		String TitleInbox = EpostVarsel.Checkepost();
		String sendResult = "";
		String epostResult="";
		if(Title.equals(Constant.Title) && Message.equals(Constant.msg)) {
	    	Log.info("Send Message Test OK");  
			sendResult = "Send message Test OK";
	      }
	      else {
	    	  sendResult = "Send Message Test not OK"; 
	    		Log.info("Send Message Test OK");  
	      }
		
		
		
		if(Title.equals(TitleInbox)) {
			Log.info("Varsel OK");  
	    	  epostResult ="Varsel OK";
	      }
	      else {
	    	  
	    	  Log.info("Varsel not OK");  
	    	  epostResult = "Varsel not OK"; 
	      }
		
		ExcelUtils.writeCellData(sendResult,1,3);
		ExcelUtils.writeCellData(epostResult,1,4);
		InitBrowser.eventDriver.quit();
		System.out.println("Finished");
		Log.endTestCase("Selenium_Test_001");
		InitBrowser.eventDriver.unregister(handler);
		  }
	
		
	}


