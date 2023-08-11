package newProject.newProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage {
	WebDriver driver;

	public loginPage(WebDriver driver) {
		super();
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	 @FindBy(id="usernameField")
	 private WebElement username;
	 @FindBy(id="passwordField")
	 private WebElement password;
	 @FindBy(xpath="//button[text()='Login']")
	 private WebElement loginButton;

	/**
	 * @return the username
	 */
	public WebElement getUsername() {
		return username;
	}
	/**
	 * @return the password
	 */
	public WebElement getPassword() {
		return password;
	}
	/**
	 * @return the loginButton
	 */
	public WebElement getLoginButton() {
		return loginButton;
	}
}
