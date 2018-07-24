package SendmeldingTest;

import org.openqa.selenium.By;

public class CheckSentMsg {

	public static void sentmsgCheck() {
		
		try{
		    if(InitBrowser.eventDriver.findElement(By.xpath("//*[@id=\"MessageCenterAppId\"]/div[2]/div/div[2]/h3")).isDisplayed()) {
		    	Thread.sleep(4000);
		    	//eventDriver.navigate().refresh(); 
		    	InitBrowser.eventDriver.findElement(By.xpath("//span[contains(@class, 'ng-binding')][contains(text(),'Sendte meldinger')]")).click();
		    } else {
		        // Do nothing...
		    }
		} catch (Exception e) {
		   System.out.println(e);

		}
		Log.info("Check Sent message OK");
	}
	public static String getTitle() {
	  
	  String MTitle = InitBrowser.eventDriver.findElement(By.xpath("//div[@class='mymessages--wrapper']/ul/li[1]/descendant::h3[@class='mymessages__content--headline']/span[2]")).getText();
	 // System.out.println("Title: " + MTitle);
	  Log.info("Title from Message: " + MTitle);
	  return MTitle;
	  
	}
	
	public static String getMessage() {
		
	  String MMessage = InitBrowser.eventDriver.findElement(By.xpath("//div[@class='mymessages--wrapper']/ul/li[1]/descendant::p[@class='mymessages__content--text ng-binding']")).getText();
	  //System.out.println("Message: " + MMessage);
	  Log.info("Message body from message: " + MMessage);
		return MMessage;
	}
	
	
}
