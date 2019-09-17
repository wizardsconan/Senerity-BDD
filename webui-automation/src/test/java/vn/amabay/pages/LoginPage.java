package vn.amabay.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import vn.amabay.MyPageObject;

public class LoginPage extends MyPageObject  {
	@FindBy(xpath="//a[@href='/register']")
	WebElementFacade registerLink;
	public void clickOnRgisterLink() {
		highlightElement(registerLink);
		registerLink.click();
	}
}
