package az.bankrespublika.camunda.demo.camundafirsttouch.endpoints;


import org.camunda.bpm.engine.RuntimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageEndpoint {

    @Autowired
    private RuntimeService runtimeService;

    @GetMapping("sendMessage")
    public String sendMessage() {
        runtimeService.createMessageCorrelation("close_account_message").correlate();
        return "success";
    }

}
