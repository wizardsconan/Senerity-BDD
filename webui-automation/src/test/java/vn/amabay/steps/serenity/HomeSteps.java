package vn.amabay.steps.serenity;

import net.thucydides.core.annotations.Step;
import vn.amabay.pages.HomePage;

public class HomeSteps {
	HomePage onHomePage;
	@Step
	public void visit_application() {
		onHomePage.open();
		
	}
	@Step
	public void click_on_login_link() {
		onHomePage.clickOnLoginLink();
	}

}
