package vn.amabay.features.register;
//import static org.hamcrest.MatcherAssert.assertThat; 
import static org.assertj.core.api.Assertions.assertThat;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.WebDriver;
//import static org.hamcrest.CoreMatchers.equalTo;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.UsePersistantStepLibraries;
import net.thucydides.core.annotations.WithTag;
import net.thucydides.core.annotations.WithTags;
import vn.amabay.steps.serenity.HomeSteps;
import vn.amabay.steps.serenity.RegisterSteps;
@RunWith(SerenityRunner.class)
@WithTags({
	@WithTag("parael"),
	@WithTag("sharing")
})
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
@UsePersistantStepLibraries
public class WhenUseSerenitySession {
	
	@Managed
	WebDriver driver;
	@Steps
		HomeSteps hienab;
	@Steps(shared=true)
	RegisterSteps registerSteps;
	@Test
	public void sessionVariableCalledFromOther() {
		hienab.visit_application();
		assertThat("0984763622").isEqualTo(Serenity.setSessionVariable("Phone"));
	}
	
	/*@Test 
	public void verify_variable_session() {
		assertThat("abcd@gmail.com").isEqualTo(Serenity.setSessionVariable("Email"));
	}*/
}
