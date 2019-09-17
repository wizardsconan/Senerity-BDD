package vn.amabay.features.alert;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.WithTag;
import net.thucydides.core.annotations.WithTags;
import vn.amabay.steps.AlertSteps;
import vn.amabay.steps.serenity.HomeSteps;

@RunWith(SerenityRunner.class)
@WithTags({
	@WithTag("Popup")
})
public class WhenUsserInteractAlertPop {
	@Managed
	WebDriver driver;
	@Steps
		HomeSteps hienab;
	@Steps
	AlertSteps alertStep;
	@Test
	@WithTag("alert")
	public void when_alertbox_pops_up_then_click_OK_button_to_proceed() {
		hienab.visit_application();
	}
	@Test
	@WithTag("confirm")
	public void when_confirm_box_pops_up_then_click_OK_button_to_proceed() {
		hienab.visit_application();
	}
	@Test
	@WithTag("confirm")
	public void when_confirm_box_pops_up_then_click_cancel_button_to_proceed() {
		hienab.visit_application();
	}
	@Test
	@WithTag("prompt")
	public void when_prompt_box_pops_up_then_click_OK_button_to_proceed() {
		hienab.visit_application();
	}
	@Test
	@WithTag("prompt_cancel")
	public void when_prompt_box_pops_up_then_click_cancel_button_to_proceed() {
		hienab.visit_application();
		alertStep.anser_the_promt("Serenity online course");
		alertStep.accept_alert_popup();
	}



}
