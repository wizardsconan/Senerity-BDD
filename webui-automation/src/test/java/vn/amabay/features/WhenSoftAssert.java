package vn.amabay.features;

import org.junit.Test;
import org.junit.runner.RunWith;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Pending;
import net.thucydides.core.util.EnvironmentVariables;

@RunWith(SerenityRunner.class)
public class WhenSoftAssert {
	private EnvironmentVariables environments;
	
	@Test
	public void get_properties_from_serenity_config_test() {
		String myProperties= environments.optionalProperty("dev.name").orElse("Nguyen Hien");
		System.out.println(myProperties);
	}
	@Pending @Test 
	public void soft_assertion_assertj_test() {}

}
