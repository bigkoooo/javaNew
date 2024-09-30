package _05_class._05_class_Prac;

public class javaAnimal {
    // 필드: 종, 이름, 나이
    protected String species;
    protected String name;
    protected int age;

    // 생성자
    public javaAnimal(String species, String name, int age) {
        this.species = species;
        this.name = name;
        this.age = age;
    }

    // 동물이 소리를 내는 메서드 (기본적으로는 일반적인 동물 소리)
    public void makeSound() {
        System.out.println("동물은 소리를 낸다");
    }

    // 동물 정보 출력 메서드
    public void displayInfo() {
        System.out.println("종: " + species);
        System.out.println("이름: " + name);
        System.out.println("나이: " + age);
    }
}
