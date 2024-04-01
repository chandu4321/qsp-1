package learnPom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePagePom {

	public HomePagePom(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(id = "newsletter-email")
	private WebElement newsLetterEmailBox;
	
	public WebElement getNewsLetterEmailBox() {
		return newsLetterEmailBox;
	}


	@FindBy(linkText = "Register")
	private WebElement registerLink;
	
	@FindBy(linkText = "Log in")
	private WebElement loginButton;
	
	public WebElement getRegisterLink() {
		return registerLink;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}

	public WebElement getWelcomeText() {
		return welcomeText;
	}

	public WebElement getSearchBox() {
		return searchBox;
	}

	public WebElement getShoppingCartButton() {
		return shoppingCartButton;
	}

	@FindBy(xpath = "//h2[contains(text(),'Welcome to our store')]")
	private WebElement welcomeText;
	
	@FindBy(id = "small-searchterms")
	private WebElement searchBox;
	
	@FindBy(xpath = "//span[text()='Shopping cart']")
	private WebElement shoppingCartButton;
	
	
}
