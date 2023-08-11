package newProject.newProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
	public WebDriver driver;
	public fileUtils file=new fileUtils();
	public webdriverUtils waiting=new webdriverUtils();
	@BeforeMethod
	public void beforeConfiguration() throws Throwable {
		String browser=file.readDataFromPropertis("browser");
		if (browser.equals("Chrome")) {
			driver=new ChromeDriver();
		}else if (browser.equals("Edge")) {
			driver=new EdgeDriver();
		}else {
			driver=new ChromeDriver();
		}
		driver.get(file.readDataFromPropertis("URL"));
		driver.manage().window().maximize();
	}
	@AfterMethod
	public void afterConfiguration() {
		driver.manage().window().minimize();
		driver.quit();
	}
}
