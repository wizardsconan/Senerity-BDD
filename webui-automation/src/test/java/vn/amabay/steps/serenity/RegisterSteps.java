package vn.amabay.steps.serenity;

//import static org.hamcrest.MatcherAssert.assertThat; 
//import static org.hamcrest.Matchers.*;
import static org.assertj.core.api.Assertions.assertThat;

import net.thucydides.core.annotations.Step;
import vn.amabay.pages.RegisterPage;

public class RegisterSteps {
	
	RegisterPage onRegisterPage;
	
	public void register_new_Account(String fullName, String email, String Phone,String pwd, String cofirmPwd) {
		enter_full_name(fullName);
		enter_email_address(email);
		enter_phone_number(Phone);
		enter_password(pwd);
		enter_confirm_password(cofirmPwd);
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
