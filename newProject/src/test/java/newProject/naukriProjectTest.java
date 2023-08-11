package newProject;

import java.io.File;
import java.io.FileInputStream;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import newProject.newProject.BaseClass;
import newProject.newProject.loginPage;
import newProject.newProject.profilePage;

public class naukriProjectTest extends BaseClass {
	@Test
	public void resumeUpload() throws Throwable {
		waiting.implicitWait(driver);
		loginPage elements=new loginPage(driver);
		elements.getUsername().sendKeys(file.readDataFromPropertis("UserName"));
		elements.getPassword().sendKeys(file.readDataFromPropertis("Password"));
		elements.getLoginButton().click();
		profilePage pg=new profilePage(driver);
		File f = new File("C:\\Users\\Admin\\Downloads\\Resume\\Shivaraj_BE_ME_2020_QA.pdf") ;
		String absPath = f.getAbsolutePath();
		pg.getAttachFile().sendKeys(absPath);
		Reporter.log("Resume is uploaded",true);
	}
}
