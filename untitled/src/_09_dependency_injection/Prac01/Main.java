package _09_dependency_injection.Prac01;

public class Main {
    public static void main(String[] args) {
        // 1. 생성자 주입
        NotificationService emailService = new EmailNotificationService();
        OrderService orderService1 = new OrderService(emailService);
        orderService1.processOrder();

        System.out.println("---");

        // 2. Setter 주입
        NotificationService smsService = new SMSNotificationService();
        OrderService orderService2 = new OrderService(null);  // 생성자에 null로 초기화
        orderService2.setNotificationService(smsService);  // Setter를 이용해 의존성 주입
        orderService2.processOrder();
    }
}
