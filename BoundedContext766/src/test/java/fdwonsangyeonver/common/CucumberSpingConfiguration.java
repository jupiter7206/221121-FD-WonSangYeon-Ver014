package fdwonsangyeonver.common;


import fdwonsangyeonver.BoundedContext766Application;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { BoundedContext766Application.class })
public class CucumberSpingConfiguration {
    
}
