package hw1;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import hw1_0.calculater;
import hw1_0.settergetter;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class calc {
	
	calculater c= new calculater();
	settergetter sg;
	
	

settergetter ar[] = new  settergetter[20];

	@Given("the price of a {string} is {int}")
	public void price_of_a_is(  String Item , Integer price){
		sg = new settergetter(Item,price);
		c.addsg(sg);
		
	}  
	
	
	@When ("I checkout {int} {string}")
	public void ICheckedOut( Integer ItemCount , String st) {
		
		c.CalcPrices(ItemCount, st);
		
	}
	

	@Then("the total price should be {int}")
	public void TheTotalPriceshouldBe(Integer preice2) {
		assertEquals(preice2.intValue(),(c.total()));
		
	}

}
