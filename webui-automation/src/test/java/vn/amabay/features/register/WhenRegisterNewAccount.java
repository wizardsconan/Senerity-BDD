package vn.amabay.features.register;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.WithTag;
import net.thucydides.core.annotations.WithTags;
import vn.amabay.models.Account;
import vn.amabay.steps.serenity.HomeSteps;
import vn.amabay.steps.serenity.LoginSteps;
import vn.amabay.steps.serenity.RegisterSteps;

@RunWith(SerenityRunner.class)
@WithTags({
	@WithTag("parallel"),
	@WithTag("firefox")
})
public class WhenRegisterNewAccount {
	
	
	@Managed
	WebDriver driver;
	@Steps
	HomeSteps onPage;
	
	@Steps
	 LoginSteps loginSteps;
	
	@Steps
	 RegisterSteps registerSteps;
	Account info= new Account("ABCD","abcd@gmail.com","0984763622","123456","1234567");
	@Test
	public void launch_web_application() {
		String errMsg="Mật khẩu xác nhận không chính xác";
		onPage.visit_application();
		onPage.click_on_login_link();
		loginSteps.click_on_register_link();
		registerSteps.register_new_Account_With(info);
		registerSteps.should_see_waring_message_correct(errMsg);
	}

}
