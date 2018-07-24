package SendmeldingTest;

import org.openqa.selenium.By;

public class EpostVarsel {
	
	public static String Checkepost() throws InterruptedException {
		
		
		InitBrowser.eventDriver.findElement(By.xpath("//*[@data-action='showToolsDialog']")).click();
		   Thread.sleep(2000);
		   InitBrowser.eventDriver.findElement(By.xpath("//img[@class='header__tools__item__icon'][1]")).click();
		   
		   for(String winHandle : InitBrowser.eventDriver.getWindowHandles()){
			   InitBrowser.eventDriver.switchTo().window(winHandle);
	        }
		   InitBrowser.eventDriver.findElement(By.xpath("//div[@class='idp'][2]")).click();
		   InitBrowser.eventDriver.findElement(By.xpath("//span[@class='lvHighlightAllClass lvHighlightSubjectClass'][1]")).click();
		  String TitleInbox =  InitBrowser.eventDriver.findElement(By.xpath("//*[@id=\"Item.MessageUniqueBody\"]/div/div/div/div[1]")).getText();
		  Log.info("Title from Epost: " + TitleInbox);
		  return TitleInbox;
	}
	
}
