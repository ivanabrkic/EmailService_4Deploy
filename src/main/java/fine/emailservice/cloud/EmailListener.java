package fine.emailservice.cloud;

import fine.emailservice.Email;
import fine.emailservice.EmailService;
import fine.emailservice.logs.Log;
import fine.emailservice.logs.LogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;

@EnableBinding(EmailBinding.class)
public class EmailListener {

    @Autowired
    EmailService emailService;

    @Autowired
    LogRepository logRepository;

    @StreamListener(target = EmailBinding.EMAIL)
    public void processEmailChannelEmail(Email email) {
        logRepository.save(new Log("Received message from RabbitMQ!"));
        emailService.sendEmail(email);
        logRepository.save(new Log("Sent email to " + email.getEmailTo()));
    }
}
