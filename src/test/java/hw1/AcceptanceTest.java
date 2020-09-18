package hw1;




import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;
import io.cucumber.junit.CucumberOptions.*;

  @RunWith(Cucumber.class)
  @CucumberOptions(features ="cases",
  plugin = { "html:target/cucumber/wikipedia.html"},
  monochrome = true,
  snippets = SnippetType.CAMELCASE,
  glue = { "hw1"},
  strict = true)
 
   

  public class AcceptanceTest {


  }

