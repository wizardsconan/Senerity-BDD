package vn.amabay.capabilities.chrome;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import net.serenitybdd.core.webdriver.enhancers.BeforeAWebdriverScenario;
import net.thucydides.core.model.TestOutcome;
import net.thucydides.core.util.EnvironmentVariables;
import net.thucydides.core.webdriver.SupportedWebDriver;

public class MyCapabilityEnhancer implements BeforeAWebdriverScenario{
	@Override
	public DesiredCapabilities apply(EnvironmentVariables environnmentVariables,
									SupportedWebDriver driver,
									TestOutcome testOutcome,
									DesiredCapabilities capabilities) {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--incognito");
		//options.addArguments("start-maximized");
		options.addArguments("--window size=500,500");
		options.addArguments("--window-position=0,500");
		capabilities.setCapability(ChromeOptions.CAPABILITY, options);
		return capabilities;
	}

}
