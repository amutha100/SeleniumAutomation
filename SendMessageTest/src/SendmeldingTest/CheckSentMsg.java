package SendmeldingTest;

import org.openqa.selenium.By;

import org.openqa.selenium.support.ui.ExpectedConditions;

public class CheckSentMsg {

	@SuppressWarnings("deprecation")
	public static void sentmsgCheck() {
		
		try{
			//
		//	System.out.println(InitBrowser.driver.findElement(By.xpath("//*[@id='MessageCenterAppId']/div[2]/div/div[2]/h3")).getText());
			InitBrowser.wait.until(ExpectedConditions.textToBePresentInElement(By.xpath("//*[@id='MessageCenterAppId']/div[2]/div/div[2]/h3"), "Meldingen er sendt"));

			InitBrowser.wait.until(ExpectedConditions.invisibilityOfElementWithText(By.xpath("//*[@id='MessageCenterAppId']/div[2]/div/div[2]/h3"), "Meldingen er sendt"));

			InitBrowser.driver.findElement(By.xpath("//span[contains(@class, 'ng-binding')][contains(text(),'Sendte meldinger')]")).click();

		    	//eventDriver.navigate().refresh(); 
			//*[@id="MessageCenterAppId"]/div[1]/div/section/div/div[4]/ul[2]/li/a/span
	//	   System.out.println("Got it");
		} 
		    	
		    
		 catch (Exception e) {
		   System.out.println(e);
		   Log.info("Sending message is not OK");

		}
		
    	
		
	}
	public static String getTitle() throws InterruptedException {
		
		String MTitle="";
	//	System.out.println("inside");//*[@id="MessageCenterAppId"]/div[1]/div/section/div/div[4]/ul[2]/li/a/span

Thread.sleep(1000);
		 MTitle = InitBrowser.driver.findElement(By.xpath("//div[@class='mymessages--wrapper']/ul/li[1]/descendant::h3[@class='mymessages__content--headline']/span[2]")).getText();
	 // System.out.println("Title: " + MTitle);
	  Log.info("Title from Message: " + MTitle);
	  




 return MTitle;
	}
	
	public static String getMessage() {
		
	  String MMessage = InitBrowser.driver.findElement(By.xpath("//div[@class='mymessages--wrapper']/ul/li[1]/descendant::p[@class='mymessages__content--text ng-binding']")).getText();
	  //System.out.println("Message: " + MMessage);
	  Log.info("Message body from message: " + MMessage);
		return MMessage;
	}
	
	public static String getTime() {
		
		  String msgTime = InitBrowser.driver.findElement(By.tagName("time")).getText();
		  //System.out.println("Message: " + MMessage);
		  Log.info("Message body from message: " + msgTime);
			return msgTime;
		}
		
	
	
}
