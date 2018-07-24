package SendmeldingTest;



import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class SendMessage {

	public static void sendMsg() throws IOException {
		
		InitBrowser.eventDriver.findElement(By.linkText("Meldinger")).click();
		InitBrowser.eventDriver.findElement(By.linkText("Skriv ny melding")).click();
		InitBrowser.eventDriver.findElement(By.id("btnAddRecivers")).click();
		InitBrowser.eventDriver.manage().window().setSize(new Dimension(1440, 900));//1920,1200
		//take screen shot
		ScreenShot.TakeScreenShot("AfterMaxmize");
		InitBrowser.eventDriver.findElement(By.cssSelector("input[value='user']")).click();
		InitBrowser.eventDriver.findElement(By.name("toSearch")).sendKeys("masya");
		 
		
		InitBrowser.eventDriver.findElement(By.xpath("//span[contains(@class,'ng-binding')][contains(text(),'Magnhild Cgi Syversen')]/following::div[2]/a[1]")).click();
		InitBrowser.eventDriver.findElement(By.xpath("//button[contains(@class,'btn btn-primary')][contains(text(),'Ok')]")).click();
		//take screen shot
		ScreenShot.TakeScreenShot("AfterSelect");		
		InitBrowser.eventDriver.findElement(By.id("inpTitle")).sendKeys(Constant.Title);
		InitBrowser.eventDriver.switchTo().frame(0);
		InitBrowser.eventDriver.findElement(By.id("tinymce")).sendKeys(Constant.msg);
		InitBrowser.eventDriver.switchTo().defaultContent();
		InitBrowser.eventDriver.findElement(By.id("btnSubmitform")).click();
		Log.info("Send message OK");
		
	}
	
}
