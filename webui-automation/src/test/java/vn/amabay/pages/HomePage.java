package vn.amabay.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import vn.amabay.MyPageObject;

//@Demo 
public class HomePage extends MyPageObject{
	@FindBy(xpath="//a[@href='/login']")
	WebElementFacade loginLink;
	@FindBy(xpath="//a[text()='Chính sách bảo mật']")
	WebElementFacade footer;
	
	public void clickOnLoginLink() {
		//withTimeoutOf(Duration.ofSeconds(20)).find("does-not-exist").click();
		//find("does-not-exist").click();
		//loginLink.click();
		loginLink.waitUntilClickable().click();
	}
	private WebElementFacade uploadmode1;
	public void uploadFileToSomeWhere(String pathFile) {
		element(uploadmode1).click();
		uploadFile(pathFile);
		
	}
	/*public void SelectMultiState(String... states) {
		for(String state : states) {
			element("//input[@type='search']").waitUntilPresent().typeAndEnter(state);
		}
		// TODO Auto-generated method stub

	}*/

}
