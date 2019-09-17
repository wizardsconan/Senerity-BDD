package vn.amabay.features.register;

//import static org.hamcrest.MatcherAssert.assertThat; 
//import static org.hamcrest.CoreMatchers.equalTo;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Pending;
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
	//Account info= new Account("ABCD","abcd@gmail.com","0984763622","123456","1234567");
	Account info= Account
			.named("ABCD")
			.withRandomEmail("abcd@gmail.com")
			.withPhone("0984763622")
			.withPassword("123456")
			.withConfirmPassword("1234567")
			.build();
	@Test
	@WithTag("register")
	public void launch_web_application() {
		String errMsg="Mật khẩu xác nhận không chính xác";
		onPage.visit_application();
		onPage.click_on_login_link();
		loginSteps.click_on_register_link();
		registerSteps.register_new_Account_With(info);
		registerSteps.should_see_waring_message_correct(errMsg);
		assertThat("0984763622").isEqualTo(Serenity.setSessionVariable("Phone"));
	}
	@Pending @Test
	public void verify_shared_steps() {
		
	}
	@Test 
	public void verify_variable_session1() {
		assertThat("0984763622").isEqualTo(Serenity.setSessionVariable("Phone"));
	}


	@Test 
	public void verify_variable_session() {
		assertThat("abcd@gmail.com").isEqualTo(Serenity.setSessionVariable("Email"));
	}
	

}
