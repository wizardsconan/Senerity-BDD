package vn.amabay.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import vn.amabay.MyPageObject;

public class PracticePage extends MyPageObject {
	@FindBy(xpath = "//input[@id='searchKeyword']")
	WebElementFacade searchTexbox;
	@FindBy(xpath = "//input[@placeholder='Email hoặc số điện thoại']")
	private WebElementFacade pasteText;
	@FindBy(xpath = "//button[contains(.,gửi)]")
	private WebElementFacade sendButton;
	private WebElementFacade searchKeyword;

	public void inputSearch(String text) {
		searchTexbox.type(text);
	}

	public void cutString(String text) {
		cutTextFrom(searchTexbox, text);
		waitABit(5000);

	}
	public void openContentMenuOnSearcBox(String value) {
		openContentMenu(searchTexbox, value);
		waitABit(5000);
	}
	//Press in coppy on context menu
	public void copyTextFromSearchBoxMouse() {
		pressItemOnContentMenu(searchKeyword,3);
		waitABit(5000);

	}
	

	public void pasteToEmailLoginByMouse() {
		selectElementToPaste(pasteText);
		pasteTextInto(pasteText);
		waitABit(5000);

	}

	public void scrollToFooter() {

		ScrollTo(pasteText);
	}

	public void highLight() {

		highlightElement(pasteText);
	}

	public void jsclickButton() {

		JsClickOn(sendButton);
	}
}
