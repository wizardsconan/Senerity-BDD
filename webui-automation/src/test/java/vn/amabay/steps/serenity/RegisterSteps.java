package vn.amabay.steps.serenity;

//import static org.hamcrest.MatcherAssert.assertThat; 
//import static org.hamcrest.Matchers.*;
import static org.assertj.core.api.Assertions.assertThat;

import net.serenitybdd.core.Serenity;
import net.thucydides.core.annotations.Step;
import vn.amabay.models.Account;
import vn.amabay.pages.RegisterPage;

public class RegisterSteps {
	
	RegisterPage onRegisterPage;
	@Step
	public void register_new_Account_With(Account account) {
		Serenity.setSessionVariable("Phone").to(account.getPhone());
		Serenity.setSessionVariable("Email").to(account.getEmail());
		enter_full_name(account.getFullName());
		enter_email_address(account.getEmail());
		enter_phone_number(account.getPhone());
		enter_password(account.getPassword());
		enter_confirm_password(account.getRePassword());
		click_on_register_button();
	}
	public void click_on_register_button() {
		// TODO Auto-generated method stub
		onRegisterPage.Click_on_Register_button();
	}
	@Step
	private void enter_password(String pws) {
		onRegisterPage.enterTextIntoPass(pws);
		
	}
	@Step
	public void enter_confirm_password(String cofirmPwd) {
		
		onRegisterPage.enterTextIntoConfirmPass(cofirmPwd);
	}
	@Step
	public void enter_phone_number(String phone) {
		onRegisterPage.enterTextIntoPhoneNumber(phone);
	}
	@Step
	public void enter_email_address(String email) {
		onRegisterPage.enterTextIntoEmailAddress(email);
		
		
	}
	@Step
	public void enter_full_name(String fullName) {
		onRegisterPage.enterTextIntoFullName(fullName);
	}
	@Step
	public void should_see_waring_message_correct(String expectederrMsg) {
		String actultMsg=onRegisterPage.getWarringErrMessg();
		//Junit
		//assertEquals(expectederrMsg, onRegisterPage.getWarringErrMessg());
		//Hamcrest
		//assertThat(expectederrMsg, equalTo(actultMsg)); 
		//AssertJ
		assertThat(expectederrMsg).isEqualTo(actultMsg); 
	}

}
