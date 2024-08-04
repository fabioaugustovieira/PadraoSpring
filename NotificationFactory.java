import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class NotificationFactory {

    private final EmailNotification emailNotification;
    private final SmsNotification smsNotification;

    @Autowired
    public NotificationFactory(EmailNotification emailNotification, SmsNotification smsNotification) {
        this.emailNotification = emailNotification;
        this.smsNotification = smsNotification;
    }

    public NotificationService getNotificationService(String type) {
        switch (type.toLowerCase()) {
            case "email":
                return emailNotification;
            case "sms":
                return smsNotification;
            default:
                throw new IllegalArgumentException("Tipo de notificação desconhecido: " + type);
        }
    }
}
