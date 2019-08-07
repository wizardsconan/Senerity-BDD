package vn.amabay.features.browser;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import vn.amabay.steps.serenity.HomeSteps;

@RunWith(SerenityRunner.class)
public class WhenOpenLinkTheWeb {

	@Managed
	WebDriver driver;
	@Steps
	HomeSteps jacob;
	@Test
	public void launch_web_application() {
		jacob.visit_application();
	}

}
