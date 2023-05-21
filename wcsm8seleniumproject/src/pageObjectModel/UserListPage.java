package pageObjectModel;

import org.openqa.selenium.WebElement;

public class UserListPage {

	
		@FindBy(xpath=	)private WebElement CreateNewUser;
		@FindBy (xpath=) private WebElement usernameTB;
		@findBy(xpath=)private WebElement passwordTB;
		@FindBy(xpath=)private WebElement passwordRetype;
		@FindBy (xpath=)private WebElement FirstName;
		@FindBy(xpath=)private WebElement LastName;
		@FindBy(xpath=)private WebElement CreateUserButton;
		@FindBy(xpath=)private WebElement Cancel;
		@FindBy(xpath=)private WebElement UserCreatedLink;
		@FindBy(xpath=)private WebElement DeleteUser;
		
		//inititalization
		
		public WebElement getCreateNewUser() {
			return CreateNewUser;
		}
		public WebElement getUsernameTB() {
			return usernameTB;
		}
		public WebElement getPasswordTB() {
			return passwordTB;
		}
		public WebElement getPasswordRetype() {
			return passwordRetype;
		}
		public WebElement getFirstName() {
			return FirstName;
		}
		public WebElement getLastName() {
			return LastName;
		}
		public WebElement getCreateUserButton() {
			return CreateUserButton;
		}
		public WebElement getCancel() {
			return Cancel;
		}
		public WebElement getUserCreatedLink() {
			return UserCreatedLink;
		}
		public WebElement getDeleteUser() {
			return DeleteUser;
		}
		
		
		public void createUserButton() 
		{
			CreateNewUserButton.click();
			Thread.sleep(2000);
			usernameTB.sendKeys(usn);
			Thread.sleep(2000);
			passwordTB.sendKeys(pwd);
			passwordRetype.sendKeys(pwd);
		
			
			Thread.sleep(2000);
			FirstName.sendKeys(Fn);
			Thread.sleep(2000);
			LastName.sendKeys(Ln);
			
			Thread.sleep(2000);
			CreateUserButton.click();
		}
		
		public void deleteUserButton()
		{
			UserCreatedLink.click();
			Thread.sleep(2000);
			DeleteUser.click();
			WorkLib wl = new WorkLib();
			wl.hand
			
			
			
		
		
		
		
		
				
				
	)

	}

}
