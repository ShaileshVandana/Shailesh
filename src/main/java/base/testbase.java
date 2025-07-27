package base;
import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.github.bonigarcia.wdm.WebDriverManager;

public class testbase {
	public static WebDriverWait wait;
	public static Properties prop;
	public static JavascriptExecutor js;
	public static WebDriver driver;
	
	public testbase() {
		prop = new Properties();
		try {
			FileInputStream fis = new FileInputStream("./src/main/java/configuration/config.properties");
			prop.load(fis);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void openWebpage() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(prop.getProperty("url"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
	}

}
