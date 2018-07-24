package SendmeldingTest;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class ScreenShot {

	
	public static void TakeScreenShot(String name) throws IOException {
		File scrFile = ((TakesScreenshot)InitBrowser.eventDriver).getScreenshotAs(OutputType.FILE);
		 //save screenshot to C:\\Workspace\\dev2qa.com\\Images\\screenshot.png
		String fileName = name  + ".png";
		String Path = "C:\\Users\\amutha.chellappa\\eclipse-workspace\\SendMessageTest\\Images\\" + fileName;
		 FileUtils.copyFile(scrFile, new File(Path));
		 

	}
}
