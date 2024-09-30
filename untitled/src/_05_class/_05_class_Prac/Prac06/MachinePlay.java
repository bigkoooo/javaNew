package _05_class._05_class_Prac.Prac06;

public class MachinePlay {
    public static void main(String[] args) {
        // Vehicle 배열에 Car와 Airplane 객체 저장
        Vehicle[] vehicles = new Vehicle[2];
        vehicles[0] = new Car("자동차", 180);
        vehicles[1] = new Airplane("비행기", 900);

        // 반복문을 통해 각 객체의 move() 메소드와 getter 호출
        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle.getName() + "의 최고 속도는 " + vehicle.getMaxSpeed() + "km/h입니다.");
            vehicle.move();

            // Flyable 인터페이스를 구현한 객체인 경우 fly() 메소드 호출
            if (vehicle instanceof Flyable) {
                ((Flyable) vehicle).fly();
            }
        }

        // setter 메서드를 사용하여 이름과 최고 속도를 변경
        vehicles[0].setName("수정된 자동차");
        vehicles[0].setMaxSpeed(200);
        vehicles[1].setName("수정된 비행기");
        vehicles[1].setMaxSpeed(950);

        System.out.println("\n속성 값을 변경한 후:");

        // 변경된 속성을 출력
        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle.getName() + "의 최고 속도는 " + vehicle.getMaxSpeed() + "km/h입니다.");
            vehicle.move();

            // Flyable 인터페이스를 구현한 객체인 경우 fly() 메소드 호출
            if (vehicle instanceof Flyable) {
                ((Flyable) vehicle).fly();
            }
        }
    }
}
