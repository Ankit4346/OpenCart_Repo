package testRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)  //To indicate this class is a cucumber class
@CucumberOptions(

        features= {".//Features//Login.feature"},
        //features= {"@target/rerun.txt"},  // run only failures
        glue="stepDefinitions",  //package name 
        plugin= {
        		"pretty", "html:reports/myreport.html", 
        		"json:reports/myreport.json",
        		"rerun:target/rerun.txt"    //Mandatory to capture failures otherwise not show result
        		},    
       // dryRun=false,
      //  monochrome=true,
       // tags = "@regression"	//Scenarios tagged with @sanity,
       // tags="@sanity"
       // tags = "@regression and @sanity"
       // tags = "@regression or @sanity"  // inclue all
        tags = "@regression and not @sanity"
      )

public class TestRunner {

}
