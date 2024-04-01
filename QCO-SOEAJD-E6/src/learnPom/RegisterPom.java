package learnPom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPom {

	public RegisterPom(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "gender-female")
	private WebElement femaleRadioButton;
	
	@FindBy(id = "gender-male")
	private WebElement maleRadioButton;
	
	@FindBy(id = "FirstName")
	private WebElement firstNameBox;
	
	@FindBy(id = "LastName")
	private WebElement lastNameBox;
	
	@FindBy(id = "Email")
	private WebElement emailBox;

	public WebElement getFemaleRadioButton() {
		return femaleRadioButton;
	}

	public WebElement getMaleRadioButton() {
		return maleRadioButton;
	}

	public WebElement getFirstNameBox() {
		return firstNameBox;
	}

	public WebElement getLastNameBox() {
		return lastNameBox;
	}

	public WebElement getEmailBox() {
		return emailBox;
	}
}
