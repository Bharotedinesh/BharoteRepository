package pageObjectModelPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	// Store all the webelement of login page 
	
		// declare with @FindBy annotation
		@FindBy(name="username") private WebElement usernameTB;
		@FindBy(name="pwd") private WebElement passwordTB;
		@FindBy(id="loginButton") private WebElement loginButton;
		@FindBy(id="keepLoggedInCheckBox") private WebElement keepLoggedInCheckBox;
		@FindBy(linkText = "Actimind Inc.") private WebElement actiMindLink;
		
		
		//initilization
		
		public LoginPage(WebDriver driver) {
			// TODO Auto-generated constructor stub
		}


		public LoginPage(WebDriver driver) {
			// TODO Auto-generated constructor stub
		}


		public void LoginPage(WebDriver driver)
		{
			PageFactory.initElements(driver,this);
		}
        
		
		//utilization

		public WebElement getUsernameTB() {
			return usernameTB;
		}


		public WebElement getPasswordTB() {
			return passwordTB;
		}


		public WebElement getLoginButton() {
			return loginButton;
		}


		public WebElement getKeepLoggedInCheckBox() {
			return keepLoggedInCheckBox;
		}


		public WebElement getActiMindLink() {
			return actiMindLink;
		}
		//operational method
		
		
		public  void validLogin(String validUserName,String validPassword) 
		{
			usernameTB.sendKeys(validUserName);
			passwordTB.sendKeys(validPassword);
			loginButton.click();
			
		}
		public void invalidLogin(String invalidUserName,String invalidPassword) throws InterruptedException
		{
			usernameTB.sendKeys(invalidUserName);
			passwordTB.sendKeys(invalidPassword);
			loginButton.click();
			Thread.sleep(2000);
			usernameTB.clear();
			
			
			
		}
        
		 
		
}
