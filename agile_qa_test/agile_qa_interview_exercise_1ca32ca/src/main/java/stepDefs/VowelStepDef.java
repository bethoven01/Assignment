package stepDefs;
import com.exercise.CallVowelCount;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class VowelStepDef {

	public CallVowelCount variable_callCount = CallVowelCount.getInstance();
	
	
	@When("^user inputs string array \\\"([^\\\"]*)\\\" to method$")
    public void input_string(String values) throws Throwable {
		String[] arr_values = values.split(", ");
		variable_callCount.vowels(arr_values);
    }
	
	@Then("^verify vowel \\\"([^\\\"]*)\\\" for each string is returned$")
    public void verify_count_vowels(String count) throws Throwable {
		variable_callCount.verify_count_vowels(count);
    }
	
	@Then("^verify consonant \\\"([^\\\"]*)\\\" for each string is returned$")
    public void verify_count_consonants(String count) throws Throwable {
		variable_callCount.verify_count_consonants(count);        
    }
	
	@Then("^verify error message \\\"([^\\\"]*)\\\" is displayed$")
    public void verify_message(String message) throws Throwable {
		variable_callCount.verify_message(message);        
    }

}
