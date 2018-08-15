package SendmeldingTest;




public class OpenBrowser {
	
	
	public  static  void openUrl(String Url) {
		
		InitBrowser.driver.get(Url);
		Log.info("OPen Url OK");
    System.out.println("Successfully opened");
	}
}
