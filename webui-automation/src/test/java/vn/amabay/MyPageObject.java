package vn.amabay;

import org.openqa.selenium.WebDriver;

import com.google.common.base.Predicate;

import net.serenitybdd.core.pages.PageObject;

public class MyPageObject extends PageObject{

	public void waitForAWhile(int time) {
		waitABit(time);
	}
	public void swicthToIframe(String nameOrId) {
		getDriver().switchTo().frame(nameOrId);
		
	}
	protected MyPageObject() {
		super();
		//create
	}
	protected MyPageObject(final WebDriver driver, Predicate<? super PageObject> callback) {
		super(driver, callback);
	//create
	}
	public MyPageObject(final WebDriver driver, final int ajaxTimeout) {
		super(driver, ajaxTimeout);
	}

}
