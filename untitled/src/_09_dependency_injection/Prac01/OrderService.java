package _09_dependency_injection.Prac01;

public class OrderService {
    private NotificationService notificationService;

    // 생성자 주입
    public OrderService(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    // Setter 주입
    public void setNotificationService(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    public void processOrder() {
        System.out.println("Order processed successfully");
        notificationService.sendNotification("Your order has been processed");
    }
}
