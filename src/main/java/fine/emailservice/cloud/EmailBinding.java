package fine.emailservice.cloud;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

public interface EmailBinding {

    String EMAIL = "emailChannel";

    @Input(EMAIL)
    SubscribableChannel publishMessage();
}
