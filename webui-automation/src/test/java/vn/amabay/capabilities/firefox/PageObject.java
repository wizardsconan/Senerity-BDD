package vn.amabay.capabilities.firefox;

import java.time.Clock;
import java.util.logging.Logger;

import org.jruby.util.log.LoggerFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Sleeper;


import groovy.time.Duration;
import net.serenitybdd.core.pages.MatchingPageExpressions;
import net.serenitybdd.core.pages.PageUrls;
import net.serenitybdd.core.pages.RenderedPageObjectView;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.util.EnvironmentVariables;
import net.thucydides.core.webdriver.javascript.JavascriptExecutorFacade;

public abstract class PageObject {
	private static final int WAIT_FOR_ELEMENT_PAUSE_LENGH=250;
	private static final Logger LOGGER = LoggerFactory.getLogger(PageObject.class);
	private WebDriver driver;
	private Pages pages;
	private MatchingPageExpressions matchingPageExpressions;
	private RenderedPageObjectView renderedView;
	private PageUrls pageUrls;
	private net.serenitybdd.core.time.SystemClock clock;
	private Duration waitForTimeout;
	private Duration waitForElementTimeout;
	private final Sleeper sleeper;
	private final Clock webdriverClock;
	private JavascriptExecutorFacade javascriptExecutorFacade;
	private EnvironmentVariables environmentVariables;
	

}
