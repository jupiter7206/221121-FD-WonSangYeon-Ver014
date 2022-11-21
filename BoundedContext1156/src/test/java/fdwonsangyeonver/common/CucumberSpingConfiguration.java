package fdwonsangyeonver.common;


import fdwonsangyeonver.BoundedContext1156Application;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { BoundedContext1156Application.class })
public class CucumberSpingConfiguration {
    
}
