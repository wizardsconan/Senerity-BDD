package vn.amabay.steps.serenity;

import net.thucydides.core.annotations.Step;
import vn.amabay.pages.LoginPage;

public class LoginSteps {
	LoginPage onLoginPage;
	@Step
	public void click_on_register_link() {
		onLoginPage.clickOnRgisterLink();
	}

}
