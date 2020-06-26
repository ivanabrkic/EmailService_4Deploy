package fine.emailservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailService {

    @Autowired
    private JavaMailSender emailSender;

    public String sendEmail(Email email){
        try{
            SimpleMailMessage message = new SimpleMailMessage();
            message.setFrom("rento.office@gmail.com");
            message.setTo(email.getEmailTo());
            message.setSubject(email.getSubject());
            message.setText(email.getBody());
            emailSender.send(message);

            return "Your email has been sent to : " + email.getEmailTo();
        }
        catch(Exception e){
            return "There was an exception : " + e.toString();
        }
    }

}
