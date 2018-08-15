package SendmeldingTest;

import org.openqa.selenium.By;

public class LoginPage {
	
	public static void login(String username, String password) throws Exception
	{

	    	
		    String FP = "//*[@id=\"divMyPageFrontPage\"]/a/div[1]";
			InitBrowser.driver.findElement(By.xpath(FP)).click();
			
			InitBrowser.driver.findElement(By.linkText("Elever og ansatte")).click();

	       
			InitBrowser.driver.findElement(By.id("username")).click();
			InitBrowser.driver.findElement(By.id("username")).clear();
			InitBrowser.driver.findElement(By.id("username")).sendKeys(username);
			Log.info("Username entered in the Username text box");
			InitBrowser.driver.findElement(By.id("password")).click();
			InitBrowser.driver.findElement(By.id("password")).clear();
			InitBrowser.driver.findElement(By.id("password")).sendKeys(password);
			Log.info("Password entered in the Password text box");
			InitBrowser.driver.findElement(By.xpath("//*[@id=\"feide:login\"]/div/div[3]/form/div[3]/div/button")).click();
	     
			Log.info("Click action performed on Login button");
	  }

}
