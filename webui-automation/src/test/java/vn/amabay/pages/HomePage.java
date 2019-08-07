package vn.amabay.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

//@DefaultUrl("https://www.amabuy.vn/")
public class HomePage extends PageObject{
	@FindBy(xpath="//a[@href='/login']")
	WebElementFacade loginLink;
	public void clickOnLoginLink() {
		loginLink.click();
	}

}
