package vn.amabay.steps.serenity;

import net.thucydides.core.annotations.Step;
import vn.amabay.pages.PracticePage;

public class PracticeSteps {
	PracticePage practicePage;
	
	@Step
	public void enterSearch(String inputtext) {
		practicePage.inputSearch(inputtext);
	}
	@Step
	public void cut(String text) {
		practicePage.cutString(null);
		
	}
	@Step
	public void paste() {
		practicePage.pasteString();
		
	}
	

}
