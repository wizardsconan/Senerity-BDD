package vn.amabay.steps;

import net.thucydides.core.annotations.Step;
import vn.amabay.pages.AlertPage;

public class AlertSteps {
	AlertPage onAlertPopup;
	@Step
	public void anser_the_promt(String answer) {
		onAlertPopup.answerAlertPopup(answer);
		// TODO Auto-generated method stub
		
	}
	@Step
	public void accept_alert_popup() {
		onAlertPopup.acceptAlertPopup();
		// TODO Auto-generated method stub
		
	}
	@Step
	public void cancel_alert_popup() {
		onAlertPopup.cancelAlertPopup();
	}

}
