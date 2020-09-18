package hw1;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import hw1_0.calculater;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class calc {
	
	calculater c= new calculater();
	int priceB , priceA =0;
	

	@Given("the price of a {string} is {int}")
	public void price_of_a_is(  String Item , Integer price){
		
		if (Item.equals("banana")) {
			priceB = price;
			}
			else {
			priceA = price;
			}
		
	}  
	
	
	@When ("I checkout {int} {string}")
	public void ICheckedOut( Integer ItemCount , String st) {
		if (st.equals("banana")) {
			c.add(ItemCount, priceB);
			}
			else {
			c.add(ItemCount, priceA);
			}

	}
	

	@Then("the total price should be {int}")
	public void TheTotalPriceshouldBe(Integer preice2) {
		assertEquals(preice2.intValue(),(c.total()));
		
	}

}
