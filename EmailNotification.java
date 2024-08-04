import org.springframework.stereotype.Component;

@Component
public class EmailNotification implements NotificationService {
    @Override
    public void sendNotification(String message) {
        System.out.println("Enviando email com a mensagem: " + message);
    }
}
