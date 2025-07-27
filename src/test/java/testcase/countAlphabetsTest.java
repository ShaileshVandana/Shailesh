package testcase;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import base.testbase;
import pages.countAlphabets;

public class countAlphabetsTest extends testbase{
	countAlphabets ca;
	@BeforeClass(alwaysRun=true)
	public void createClassObject() {
		ca = new countAlphabets();
	}
	@BeforeMethod(alwaysRun=true)
	public void beforeMethodRun() {
		
	}
	@Test (priority=1)
	public void countTotalAlphabetsOccuranceTest() {
		ca.countTotalAlphabetsOccurance();
	}
	
	@Test (priority=2)
	public void swapAlphabetsTest() {
		ca.swapAlphabets();
	}
	@Test (priority=3)
	public void normalSwapTest() {
		ca.normalSwap();
	}
	
	@AfterMethod(alwaysRun=true)
	public void closeTestObject() {
		//screenshotClass.screenshotMethod(driver);
	}
	
	@AfterClass(alwaysRun=true)
	public void closeClassObject() {
		
	}
	@AfterTest(alwaysRun=true)
	public void closeTestOb() {
		
	}

}
