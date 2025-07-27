package utilities;
import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class screenshotClass {
	
	public static void screenshotMethod(WebDriver driver) {
		TakesScreenshot sc = (TakesScreenshot) driver;
		File source = sc.getScreenshotAs(OutputType.FILE);
		File dest = new File("abc.png");
		try {
			FileUtils.copyFile(source, dest);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}
