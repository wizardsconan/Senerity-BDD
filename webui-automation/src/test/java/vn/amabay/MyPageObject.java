package vn.amabay;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import com.google.common.base.Predicate;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.util.EnvironmentVariables;

public class MyPageObject extends PageObject{
	
	protected MyPageObject() {
      super();
    }

    protected MyPageObject(final WebDriver driver, Predicate<? super PageObject> callback) {
        super(driver,callback);
    }

    public MyPageObject(final WebDriver driver, final int ajaxTimeout) {
       
        super(driver, ajaxTimeout);
    }

    public MyPageObject(final WebDriver driver) {
       super(driver);
    }

    public MyPageObject(final WebDriver driver, final EnvironmentVariables environmentVariables) {
    	 super(driver, environmentVariables);
    }
	
	public void highlightElement(WebElementFacade webElement) {
		for(int i=0; i<10;i++) {
			evaluateJavascript("arguments[0].setAttribute('stype',arguments[1]);",webElement,
					"color:red;border:2px solid red;");
			evaluateJavascript("arguments[0].setAttribute('stype',arguments[1]);",webElement,"");
		}
	}
	public void cutTextFrom(WebElementFacade webElement, String value) {
		withAction()
			.moveToElement(webElement)
			.click()
			.keyDown(webElement, Keys.SHIFT)
			.sendKeys(webElement, value)
			.keyUp(webElement, Keys.SHIFT)
			.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL)
			.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL)
			.build().perform();
		waitABit(3000);
	}
	public void pasteTextInto(WebElementFacade webElement) {
		withAction()
			.moveToElement(webElement)
			.click()
			.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL)
			.contextClick()
			.build()
			.perform();
		
	}
}