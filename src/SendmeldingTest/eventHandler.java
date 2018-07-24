package SendmeldingTest;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.WebDriverEventListener;

public class eventHandler implements WebDriverEventListener{
	
	public void afterChangeValueOf(WebElement arg0, WebDriver arg1) {
		// TODO Auto-generated method stub
		Log.info("inside method afterChangeValueOf on " + arg0.toString());
	}
	public void afterClickOn(WebElement arg0, WebDriver arg1) {
		// TODO Auto-generated method stub
		Log.info("Clicked on: " + arg0.toString());
	}
/*	public void afterFindBy(By arg0, WebElement arg1, WebDriver arg2) {
		// TODO Auto-generated method stub
		System.out.println("Find happened on " + arg1.toString() 
		+ " Using method " + arg0.toString());
	} */
	public void afterNavigateBack(WebDriver arg0) {
		// TODO Auto-generated method stub
		Log.info("Inside the after navigateback to " + arg0.getCurrentUrl());
	}
 
	public void afterNavigateForward(WebDriver arg0) {
		// TODO Auto-generated method stub
		Log.info("Inside the afterNavigateForward to " + arg0.getCurrentUrl());
	}
 
	public void afterNavigateTo(String arg0, WebDriver arg1) {
		// TODO Auto-generated method stub
		Log.info("Navigated to:'" + arg0 + "'");
	}
	public void beforeChangeValueOf(WebElement arg0, WebDriver arg1) {
		// TODO Auto-generated method stub
		Log.info("Inside the beforeChangeValueOf method");
	}
 
	public void beforeClickOn(WebElement arg0, WebDriver arg1) {
		// TODO Auto-generated method stub
		Log.info("Trying to click on: " + arg0.toString());
	}
 
	/* public void beforeFindBy(By arg0, WebElement arg1, WebDriver arg2) {
		// TODO Auto-generated method stub
		System.out.println("Just before finding element " + arg1.toString());
	} */
 
	public void beforeNavigateBack(WebDriver arg0) {
		// TODO Auto-generated method stub
		Log.info("Just before beforeNavigateBack " + arg0.getCurrentUrl());
	}
	public void beforeNavigateForward(WebDriver arg0) {
		// TODO Auto-generated method stub
		Log.info("Just before beforeNavigateForward " + arg0.getCurrentUrl());
	}
 
	public void beforeNavigateTo(String arg0, WebDriver arg1) {
		// TODO Auto-generated method stub
		Log.info("Before navigating to: '" + arg0 + "'");
	}
	
	public void onException(Throwable arg0, WebDriver arg1) {
		// TODO Auto-generated method stub
		Log.info("Error occurred: " + arg0);
	}
	@Override
	public void afterAlertAccept(WebDriver arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void afterAlertDismiss(WebDriver arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void afterChangeValueOf(WebElement arg0, WebDriver arg1, CharSequence[] arg2) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void afterFindBy(By arg0, WebElement arg1, WebDriver arg2) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public <X> void afterGetScreenshotAs(OutputType<X> arg0, X arg1) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void afterNavigateRefresh(WebDriver arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void afterScript(String arg0, WebDriver arg1) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void afterSwitchToWindow(String arg0, WebDriver arg1) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void beforeAlertAccept(WebDriver arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void beforeAlertDismiss(WebDriver arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void beforeChangeValueOf(WebElement arg0, WebDriver arg1, CharSequence[] arg2) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void beforeFindBy(By arg0, WebElement arg1, WebDriver arg2) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public <X> void beforeGetScreenshotAs(OutputType<X> arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void beforeNavigateRefresh(WebDriver arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void beforeScript(String arg0, WebDriver arg1) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void beforeSwitchToWindow(String arg0, WebDriver arg1) {
		// TODO Auto-generated method stub
		
	}
	}
