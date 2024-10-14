package _09_dependency_injection.Prac01;

public class SMSNotificationService implements NotificationService {
    @Override
    public void sendNotification(String message) {
        System.out.println("Sending SMS notification: " + message);
    }
}
