package vn.amabay.features.browser;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.WithTag;
import net.thucydides.core.annotations.WithTags;
import vn.amabay.steps.serenity.HomeSteps;
import vn.amabay.steps.serenity.PracticeSteps;
@WithTags({
	@WithTag("parallel"),
	@WithTag("chrome")
})
@RunWith(SerenityRunner.class)
public class WhenOpenLinkTheWeb {

	@Managed
	WebDriver driver;
	@Steps
	HomeSteps jacob;
	@Steps
	PracticeSteps practiceSteps;
	@Test
	@WithTag("open")
	public void launch_web_application() {
		jacob.visit_application();
		/*try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		practiceSteps.cut("Teaching webdriver online");
		jacob.click_on_login_link();
		practiceSteps.paste();
		
		//jacob.select_states("Alaska","New Mexico");
	}

}
