package CrestDefinitions;

import io.cucumber.junit.CucumberOptions;

//RUnWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\Features" , glue={"CrestDefinitions"})
public class Run extends Rat {

}
