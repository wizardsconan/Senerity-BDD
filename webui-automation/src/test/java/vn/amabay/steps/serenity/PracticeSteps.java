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
	public void cut(String text) {
		practicePage.cutString(text);
		
	}
	@Step
	public void paste() {
		practicePage.paste();
		
	}
	

}
