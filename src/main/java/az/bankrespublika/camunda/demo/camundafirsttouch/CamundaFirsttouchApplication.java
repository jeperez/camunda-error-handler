package az.bankrespublika.camunda.demo.camundafirsttouch;

import org.camunda.bpm.spring.boot.starter.annotation.EnableProcessApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableProcessApplication
public class CamundaFirsttouchApplication {
    public static void main(String[] args) {
        SpringApplication.run(CamundaFirsttouchApplication.class, args);
    }

}
