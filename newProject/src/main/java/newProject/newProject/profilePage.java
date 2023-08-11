package newProject.newProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class profilePage {
	WebDriver driver;

	public profilePage(WebDriver driver) {
		super();
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="attachCV")
	private WebElement attachFile;

	public WebElement getAttachFile() {
		return attachFile;
	}
}
