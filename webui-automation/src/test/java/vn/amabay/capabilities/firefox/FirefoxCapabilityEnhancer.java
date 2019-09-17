package vn.amabay.capabilities.firefox;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import net.serenitybdd.core.webdriver.enhancers.BeforeAWebdriverScenario;
import net.thucydides.core.model.TestOutcome;
import net.thucydides.core.util.EnvironmentVariables;
import net.thucydides.core.webdriver.SupportedWebDriver;

public class FirefoxCapabilityEnhancer implements BeforeAWebdriverScenario{
	private static final String UnexpectedAlertBehaviour = null;

	@Override
	public DesiredCapabilities apply(EnvironmentVariables environnmentVariables,
			SupportedWebDriver driver,
			TestOutcome testOutcome,
			DesiredCapabilities capabilities) {
		// 1. Profile
				FirefoxProfile profile = new FirefoxProfile();
				profile.setPreference("browser.startup.homepage", "http://www.google.com");
				profile.setPreference("browser.privatebrowsing.autostart", true);

				// 2. DesiredCapabilities
				//DesiredCapabilities capabilities = DesiredCapabilities.firefox();
				capabilities.setCapability(CapabilityType.TAKES_SCREENSHOT, false);
				capabilities.setCapability(FirefoxDriver.PROFILE, profile);
				capabilities.setJavascriptEnabled(true);
				capabilities.setCapability("networkConnectionEnabled", false);
				capabilities.setCapability("browserConnectionEnabled", false);
				capabilities.setCapability(CapabilityType.UNEXPECTED_ALERT_BEHAVIOUR,UnexpectedAlertBehaviour);
				capabilities.setCapability("name", testOutcome.getStoryTitle()+"-"+ testOutcome);

				/* 3. FirefoxOptions
				FirefoxOptions options = new FirefoxOptions(options);
				 options.addArguments("--headless");
				options.addArguments("--width=800");
				options.addArguments("--height=800");
				options.addArguments("-private");

				// 4. Driver
				capabilities.setCapability(FirefoxOptions.FIREFOX_OPTIONS, options);*/
				return capabilities;
		
	}

}
