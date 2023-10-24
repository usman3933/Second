package firstTestNGPackage;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
//import org.testng.Reporter;

public class CaptureScreenShot {
public CaptureScreenShot() {
		
	}
	public static void getScreenShot(WebDriver driver, String filepath) {
		try {//using try catch method to reduce the errors
			
			System.out.println("STEP:1--In getScreenShot method");
			//Reporter.log("<br>STEP:1--In getScreenShot method<br>");
			TakesScreenshot ts = (TakesScreenshot)driver;
			System.out.println("STEP:2--before getScreenShotAs");
			//Reporter.log("<br>STEP:2--before getScreenShotAs<br>");
			File source = ts.getScreenshotAs(OutputType.FILE);
			System.out.println(" STEP:3--After getScreenShotAs");
			//Reporter.log("<br> STEP:3--After getScreenShotAs<br>");
			FileUtils.copyFile(source, new File(filepath));
			
		} catch (WebDriverException e) {
			e.printStackTrace();
			
		} catch (IOException e) {
			e.printStackTrace();
			
		}
		
	}
	
	public static String getDateTimeStamp() {
		Date oDate;
		String[] sDatePart;
		String sDateStamp;
		oDate = new Date();
		System.out.println(oDate.toString());
		sDatePart = oDate.toString().split(" ");
		sDateStamp = sDatePart[5] + "_" +
				sDatePart[1] + "_" +
				sDatePart[2] + "_" +
				sDatePart[3] ;
		sDateStamp = sDateStamp.replace(":", "_");
		System.out.println(sDateStamp);
		return sDateStamp;
	
				
	}

}
