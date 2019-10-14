package vn.amabay.steps.serenity;

import net.thucydides.core.annotations.Step;
import vn.amabay.pages.PracticePage;

public class PracticeSteps {
	PracticePage practicePage;
	
	@Step
	public void enterSearch() {
		practicePage.inputSearch(null);
	}
	@Step
	public void copyByMouse(String value) {
		practicePage.openContentMenuOnSearcBox(value);
		practicePage.copyTextFromSearchBoxMouse();
		
	}
	@Step
	public void paste() {
		practicePage.pasteToEmailLoginByMouse();
		
	}
	@Step
	public void pasteByMouse() {
		practicePage.pasteToEmailLoginByMouse();
		
	}
	@Step
	public void jsclick() {
		practicePage.jsclickButton();
	}
	@Step
	public void scrollToElement() {
		practicePage.scrollToFooter();
	}
	@Step
	public void highLightElement() {
		practicePage.highLight();
	}

}
