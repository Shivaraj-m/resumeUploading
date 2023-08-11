package newProject.newProject;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class webdriverUtils {
	public void implicitWait(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	public void explicitWait(WebDriverWait wait,WebDriver driver) {
		wait=new WebDriverWait(driver, Duration.ofSeconds(10));
	}
}
