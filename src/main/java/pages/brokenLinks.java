package pages;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import base.testbase;

public class brokenLinks extends testbase{
	
	public brokenLinks() {
		PageFactory.initElements(driver, this);
	}
	
	public void brokenLinksMethod() {
		List<WebElement> all = driver.findElements(By.tagName("a"));
		for(WebElement ele : all) {
			String a = ele.getDomAttribute("href");
			try {
				HttpURLConnection url = (HttpURLConnection) new URL(a).openConnection();
				url.connect();
				int i = url.getResponseCode();
				if(i >= 400) {
					System.out.println("Broken link: " + a);
				} else {
					System.out.println("Valid link: " + a);
				}
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
	}

}
