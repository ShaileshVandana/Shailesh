package testcase;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.testbase;
import pages.brokenLinks;
import utilities.screenshotClass;

public class brokenLinksTest extends testbase{
	brokenLinks bl;
	
	public brokenLinksTest() {
		super();
	}
	
	@BeforeSuite(alwaysRun=true)
	public void start() {
	}
	@BeforeTest(alwaysRun=true)
	public void createTestObject() {
		
	}
	@BeforeClass(alwaysRun=true)
	public void createClassObject() {
		bl = new brokenLinks();
	}
	@BeforeMethod(alwaysRun=true)
	public void beforeMethodRun() {
		openWebpage();
	}
	//@Test (priority=1)
	public void testFirst() {
		bl.brokenLinksMethod();
	}
	
	@AfterMethod(alwaysRun=true)
	public void closeTestObject() {
		screenshotClass.screenshotMethod(driver);
	}
	
	@AfterClass(alwaysRun=true)
	public void closeClassObject() {
		
	}
	@AfterTest(alwaysRun=true)
	public void closeTestOb() {
		
	}
	@AfterSuite(alwaysRun=true)
	public void close() {
		driver.quit();
	}

}
