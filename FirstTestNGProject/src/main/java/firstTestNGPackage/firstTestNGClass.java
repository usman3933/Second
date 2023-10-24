package firstTestNGPackage;

import static org.testng.Assert.assertEquals;
import java.io.File;

//import java.io.File;
//import java.io.IOException;
//import java.util.Date;

//import org.apache.commons.io.FileUtils;

/*
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.openqa.selenium.OutputType;
*/
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
//import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
//import org.testng.TestListenerAdapter;
import org.testng.annotations.Test;

//import co.frameworkPackage.BrowserFactory;
//import co.frameworkPackage.CaptureScreenShot;

@Listeners (firstTestNGPackage.MyTestListener.class) //To Implement Listeners for result
public class firstTestNGClass {
	
	
	@Test
  public void firstTest() throws InterruptedException {
	  System.out.println("Hello world!");
		//System.setProperty("webdriver.chrome.driver", "C:\\JavaWork\\Selenium\\chromedriver_win32\\chromedriver.exe");
		//System.setProperty("webdriver.chrome.driver", "C:\\JavaWork\\Selenium\\chromedriver_win32\\chromedriver.exe");
		//System.setProperty("org.slf4j.LoggerFactory","org.apache.logging.log4j.simple.SimpleLoggerContextFactory"); 		
		
		System.setProperty("webdriver.chrome.driver", "C:\\JavaWork\\Selenium\\ChromeDriverLatestVersion116\\chromedriver-win64\\chromedriver.exe");
				
				//System.setProperty("webdriver.chrome.whitelistedIps", "");
				
				WebDriver driver = new ChromeDriver();
				Thread.sleep(8000);
				//driver.get("https://www.amazon.com/");
				driver.get("https://www.google.com/");
				Thread.sleep(8000); //ie 8 seconds or 8000 milliseconds
				driver.manage().window().maximize();
				Thread.sleep(8000);
				JavascriptExecutor js = (JavascriptExecutor)driver;
				//--------------------
				WebElement GmailLink = driver.findElement(By.linkText("Gmail"));
				GmailLink.click();
				Thread.sleep(3000);
				//--------------------
				//public void verify() {
				try {
					String expectedVal="Hello";
					  assertEquals("Hello",expectedVal);
					  // Assert.assertEquals("Hello".contains("Hello"), true);
					  Reporter.log("<br>Test STEP:1--Passed--Hello matched Hello",true);
					  Assert.assertTrue(true);
					  
					
				}catch(AssertionError ae) {
				   Assert.fail();
				   Reporter.log("<br>Test STEP:1--Failed--Hello didnot match Hello",true);
					   String bookingDetailsFile = System.getProperty("user.dir")+"\\"+"ScreenShots\\FlightConfirmationDetails - "+ CaptureScreenShot.getDateTimeStamp()+".png";
						  try {
							  CaptureScreenShot.getScreenShot(driver, bookingDetailsFile);
							  File imgPathofbookingDetailsFile = new File(bookingDetailsFile);
							  Reporter.log("<a href='"+ imgPathofbookingDetailsFile.getAbsolutePath()+"'> <img src='" +imgPathofbookingDetailsFile.getAbsolutePath()+"' height ='200' width='200'/></a> ");
							  
						  }catch(Exception e) {
							  
							  e.printStackTrace();
							  
						  }
					////////
		           ae.getMessage();
		           driver.quit();
				}
				
				//	}
				
				if (driver.getTitle() == "not match") {
					Assert.assertTrue(true);
					Reporter.log("<br>Test STEP:2--PASSED--driver.getTitle() matched driver.getTitle()",true);
				} else {
					
					Reporter.log("<br>Test STEP:2--FAILED--driver.getTitle() DID Not match driver.getTitle()",true);
					String bookingDetailsFile = System.getProperty("user.dir")+"\\"+"ScreenShots\\FlightConfirmationDetails - "+ CaptureScreenShot.getDateTimeStamp()+".png";
					  try {
						  CaptureScreenShot.getScreenShot(driver, bookingDetailsFile);
						  File imgPathofbookingDetailsFile = new File(bookingDetailsFile);
						  Reporter.log("<a href='"+ imgPathofbookingDetailsFile.getAbsolutePath()+"'> <img src='" +imgPathofbookingDetailsFile.getAbsolutePath()+"' height ='200' width='200'/></a> ");
						  
					  }catch(Exception e) {
						  
						  e.printStackTrace();
						  
					  }
					  driver.quit();
					  Assert.fail();
				
				}

				
				//WebElement SearchBox = (WebElement) driver.findElements(By.id("two tab search text box"));
				//SearchBox.sendKeys("ear phone");
				//WebElement SearchIcon = driver.findElement(By.className("nav-input nav-progressive-attribute"));
				//SearchIcon.click();
				//WebElement theHelpText = driver.findElement(By.name("qna_question_expander"));
				//theHelpText.click();
				//Thread.sleep(4000);
				
				js.executeScript("window.scrollBy(0,6000)");
				Thread.sleep(8000);
				
				//Adding the ScreenShot to TestNG Report test
				Reporter.log("<br>this is the screenshot of the applictaion attached in TestNG<br> ");
				////////
				
				driver.quit();

  }
  
}


///For test report look into following
/*
public void fail setup(ITestResult result) throw IOException{
	Reporter.setCurrentTestResult(result);
	
			
	if(result.getStatus()== 2) {
		Reporter.log("this is failed log", true);
		
		
	}
	
	
	File img = new File(pathname: System.getProperty("user.dir")+"/screen_"+result.getMethod().getMethodName()+'.png");"

		
	FileOutputStream screenshotStream = null;
	try {
		screenshotStream =  new FileOutStream(img);
		screenshotStream.write(((TakesScreenshot)driver).getScreenShotAs(OutputType.BYTES));
		screenshotStream.close();
		Reporter.log("<a href='"+ img.getAbsolutePath()+"'> <img src='" +img.getAbsolutePath()+"' height ='200' width='200'/></a> ");
	} catch(FileNotFoundException e) {
		e.printStackTrace();
	} catch(IOException e) {
		
	}
	}
*/
	