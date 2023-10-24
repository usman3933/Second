package firstTestNGPackage;

import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.TestListenerAdapter;
//import org.testng.annotations.Test;

public class MyTestListener extends TestListenerAdapter {
  //@Test
  //public void f() {
  //}
	//private int m_count = 0;
	 
	  @Override
	  public void onTestFailure(ITestResult result) {
		  Reporter.log("<br>INSIDE---MyTestListener-onTestFailure(ITestResult result)<br>", true);//true is set to print in Console also along with index.html
		  
		Reporter.log("<br>Test Step Failed--Result GetName--"+result.getName()
		+"--Result GetStatus--"+result.getStatus(), true);//true is set to print in Console also along with index.html
	    
	    ///Overriding the method
	    Reporter.log("<br>Test Case ----"+ result.getMethod().getMethodName()+"Failed because of "
	    		+result.getThrowable(), true); //true is set to print in Console also along with index.html
	    Reporter.setCurrentTestResult(result);
	    Reporter.log("<br>After Reporter---setCurrentTestResult(result)---", true);//true is set to print in Console also
	    Reporter.log("<br>OUTSIDE---MyTestListener-onTestFailure(ITestResult result)<br>", true);//true is set to print in Console also along with index.html
	  }
	 
	  @Override
	  public void onTestSkipped(ITestResult result) {
		  Reporter.log("<br>Test Step Skipped", true);//true is set to print in Console also along with index.html
	  }
	 
	  @Override
	  public void onTestSuccess(ITestResult result) {
		  Reporter.setCurrentTestResult(result);
		  Reporter.log("<br>Test Step Passed", true);//true is set to print in Console also along with index.html
		  
	  }
	 
	  
}
