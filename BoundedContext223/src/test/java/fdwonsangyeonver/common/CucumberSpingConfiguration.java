package fdwonsangyeonver.common;


import fdwonsangyeonver.BoundedContext223Application;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { BoundedContext223Application.class })
public class CucumberSpingConfiguration {
    
}
