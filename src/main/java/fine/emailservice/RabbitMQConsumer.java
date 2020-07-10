package fine.emailservice;

import fine.emailservice.logs.Log;
import fine.emailservice.logs.LogRepository;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;

import java.util.Collection;
import java.util.Map;

//@Component
//public class RabbitMQConsumer {
//
//    @Autowired
//    EmailService emailService;
//
//    @Autowired
//    LogRepository logRepository;
//
//    @RabbitListener(queues = "${rabbitmq.queue}")
//    public void recievedMessage(Email email) {
//
//        logRepository.save(new Log("Recieved Message From RabbitMQ. Sending email to : " + email.getEmailTo()));
//        System.err.println("Recieved Message From RabbitMQ. Sending email to : " + email);
//
//        String message = emailService.sendEmail(email);
//
//        logRepository.save(new Log(message));
//        System.err.println(message);
//
//
//    }
//}
