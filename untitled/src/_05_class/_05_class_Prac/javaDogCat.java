package _05_class._05_class_Prac;

// Dog 클래스
class Dog extends javaAnimal {

    // 생성자
    public Dog(String name, int age) {
        super("강아지", name, age); // 종은 "강아지"로 고정
    }

    // 강아지 소리 출력 (메서드 오버라이드)
    @Override
    public void makeSound() {
        System.out.println(name + "는 멍멍 소리를 냅니다.");
    }
}

// Cat 클래스
class Cat extends javaAnimal {

    // 생성자
    public Cat(String name, int age) {
        super("고양이", name, age); // 종은 "고양이"로 고정
    }

    // 고양이 소리 출력 (메서드 오버라이드)
    @Override
    public void makeSound() {
        System.out.println(name + "는 야옹 소리를 냅니다.");
    }
}

// 실행 클래스
public class javaDogCat {
    public static void main(String[] args) {
        // 강아지 객체 생성
        Dog dog1 = new Dog("바둑이", 3);
        dog1.displayInfo();
        dog1.makeSound();

        System.out.println();

        // 고양이 객체 생성
        Cat cat1 = new Cat("나비", 2);
        cat1.displayInfo();
        cat1.makeSound();
    }
}
