package vn.amabay.features;
import static com.google.common.truth.Truth.assertThat;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.seleniumhq.jetty9.server.Authentication.User;

import com.google.common.base.Optional;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
@RunWith(SerenityRunner.class)
public class  WhenAssertWithTruth {
	//@Managed
//	WebDriver driver;
	
	@Test
	public void whenCheckingGuavaOptional_thenIsAbsent() {
		Optional<Integer> anOptional = Optional.of(1);
		 
	    assertThat(anOptional).hasValue(1);
	}
	

}
