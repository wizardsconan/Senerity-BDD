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
@WithTags({
	@WithTag("parallel"),
	@WithTag("firefox")
})
@RunWith(SerenityRunner.class)
public class WhenOpenLinkTheWeb {

	@Managed
	WebDriver driver;
	@Steps
	HomeSteps jacob;
	@Test
	public void launch_web_application() {
		jacob.visit_application();
		//jacob.select_states("Alaska","New Mexico");
	}

}
