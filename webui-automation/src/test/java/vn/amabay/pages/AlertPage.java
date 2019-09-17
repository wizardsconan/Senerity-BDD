package vn.amabay.pages;

import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import vn.amabay.MyPageObject;

public class AlertPage extends MyPageObject{
	public void answerAlertPopup(String answer) {
		getDriver().switchTo().frame("iframeResult");
		$("//button[.='Try it']").click();
		getAlert().sendKeys(answer);
		waitABit(5000);
	}

	public void acceptAlertPopup() {
		getAlert().accept();
		
	}
	public void cancelAlertPopup() {
		getAlert().dismiss();
	}
	public void waitForAlert() {
		new WebDriverWait(getDriver(), 60)
                        .ignoring(NoAlertPresentException.class)
						.until(ExpectedConditions.alertIsPresent());
	}
	

}
