package SendmeldingTest;

import org.openqa.selenium.By;

public class Logout {

	
	public static void logout() {
		
		InitBrowser.driver.findElement(By.xpath("//*[@id=\"O365_MeFlexPane_ButtonID\"]/div[1]/div[2]/div[2]/div/div")).click();
		
		InitBrowser.driver.findElement(By.linkText("Logg av")).click();
		InitBrowser.driver.close();
		for(String winHandle : InitBrowser.driver.getWindowHandles()){
			   InitBrowser.driver.switchTo().window(winHandle);
	        }
		InitBrowser.driver.findElement(By.xpath("//header/div[1]/div[3]/div/div/div[2]/p[1]")).click();
		InitBrowser.driver.findElement(By.linkText("Logg ut")).click();
		InitBrowser.driver.close();
	}
	
	
}
