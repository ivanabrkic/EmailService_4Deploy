package fine.emailservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("email")
public class EmailController {

    @Autowired
    EmailService emailService;

    @PostMapping(value="/send", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> sendEmail(@RequestBody Email email){
        try{
            return new ResponseEntity<>(emailService.sendEmail(email), HttpStatus.OK);
        }
        catch(Exception e){

        }
        return new ResponseEntity<>(emailService.sendEmail(email), HttpStatus.BAD_REQUEST);
    }
}
