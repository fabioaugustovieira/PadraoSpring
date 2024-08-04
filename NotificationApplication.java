import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class NotificationApplication {

    public static void main(String[] args) {
        SpringApplication.run(NotificationApplication.class, args);
    }

    @Bean
    public CommandLineRunner demo(NotificationFactory notificationFactory) {
        return args -> {
            NotificationService emailService = notificationFactory.getNotificationService("email");
            emailService.sendNotification("Olá por email!");

            NotificationService smsService = notificationFactory.getNotificationService("sms");
            smsService.sendNotification("Olá por SMS!");
        };
    }
}
