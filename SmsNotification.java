import org.springframework.stereotype.Component;

@Component
public class SmsNotification implements NotificationService {
    @Override
    public void sendNotification(String message) {
        System.out.println("Enviando SMS com a mensagem: " + message);
    }
}
