package SendmeldingTest;

import org.openqa.selenium.By;

public class EpostVarsel {
	
	public static String Checkepostmsg() throws InterruptedException {
		
		  Thread.sleep(1000);
		InitBrowser.driver.findElement(By.xpath("//*[@data-action='showToolsDialog']")).click();
		   Thread.sleep(1000);
		   InitBrowser.driver.findElement(By.xpath("//img[@class='header__tools__item__icon'][1]")).click();
		   
		   for(String winHandle : InitBrowser.driver.getWindowHandles()){
			   InitBrowser.driver.switchTo().window(winHandle);
	        }
		   InitBrowser.driver.findElement(By.xpath("//div[@class='idp'][2]")).click();
		   Thread.sleep(3000);
		   InitBrowser.driver.findElement(By.xpath("//span[@class='lvHighlightAllClass lvHighlightSubjectClass'][1]")).click();
		  String TitleInbox =  InitBrowser.driver.findElement(By.xpath("//*[@id=\"Item.MessageUniqueBody\"]/div/div/div/div[1]")).getText();
		  Log.info("Title from Epost: " + TitleInbox);
		  return TitleInbox;
	}
	public static String CheckepostTime() {
		String epostTime= InitBrowser.driver.findElement(By.xpath("//*[@id=\"Item.MessageUniqueBody\"]/div/div/div/div[2]")).getText();
		return epostTime;
	}
}
