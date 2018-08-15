package SendmeldingTest;




import java.io.IOException;


import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;


public class SendMessage {

	public static void sendMsg() throws IOException {
		
		InitBrowser.driver.findElement(By.linkText("Meldinger")).click();
		InitBrowser.driver.findElement(By.linkText("Skriv ny melding")).click();
		InitBrowser.driver.findElement(By.id("btnAddRecivers")).click();
		InitBrowser.driver.manage().window().setSize(new Dimension(1440, 900));//1920,1200
		//take screen shot
		ScreenShot.TakeScreenShot("AfterMaxmize");
		InitBrowser.driver.findElement(By.cssSelector("input[value='user']")).click();
		InitBrowser.driver.findElement(By.name("toSearch")).sendKeys("masya010");
		 
		
		InitBrowser.driver.findElement(By.xpath("//span[contains(@class,'ng-binding')][contains(text(),'Magnhild Cgi Syversen')]/following::div[2]/a[1]")).click();
		InitBrowser.driver.findElement(By.xpath("//button[contains(@class,'btn btn-primary')][contains(text(),'Ok')]")).click();
		//take screen shot
		ScreenShot.TakeScreenShot("AfterSelect");		
		InitBrowser.driver.findElement(By.id("inpTitle")).sendKeys(Constant.Title);
		InitBrowser.driver.switchTo().frame(0);
		InitBrowser.driver.findElement(By.id("tinymce")).sendKeys(Constant.msg);
		InitBrowser.driver.switchTo().defaultContent();
		InitBrowser.driver.findElement(By.id("btnSubmitform")).click();
	
		
	}
	
}
