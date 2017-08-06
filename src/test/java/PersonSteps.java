import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

import java.util.List;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class PersonSteps{

	@Given("^the person system is initialized with the following data$")
	public void the_person_system_is_initialized_with_the_following_data(List<Person> arg1)  {
		List<Person> list = arg1;
		assertThat(list.size(), equalTo(3));
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
	    
	}

	@When("^a new person were created with name 'donald' and age (\\d+)$")
	public void a_new_person_were_created_with_name_donald_and_age(int arg1)  {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("^return a name validation error with 'name must be different'$")
	public void return_a_name_validation_error_with_name_must_be_different() {
	    // Write code here that turns the phrase above into concrete actions
	   
	}

}