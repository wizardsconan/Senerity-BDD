package vn.amabay.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import vn.amabay.MyPageObject;

public class PracticePage extends MyPageObject {
	@FindBy(xpath="//input[@id='searchKeyword']")
	WebElementFacade searchTexbox;
	@FindBy(xpath="//input[@placeholder='Email hoặc số điện thoại']")
	WebElementFacade pasteText;
	public void inputSearch(String text) {
		searchTexbox.type(text);
	}
		public void cutString(String text) {
			cutTextFrom(searchTexbox, text);
			// TODO Auto-generated method stub
			
		}
		public void paste() {
			pasteTextInto(pasteText);
		}
}
