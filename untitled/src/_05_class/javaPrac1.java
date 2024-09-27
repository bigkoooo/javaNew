package _05_class;

public class javaPrac1 {
    // 필드: 접근 제어자를 private로 변경
    private int width;
    private int height;

    // 정적 필드: 인스턴스 개수를 추적
    private static int instanceCount = 0;

    // 생성자
    public javaPrac1(int width, int height) {
        this.width = width;
        this.height = height;
        instanceCount++; // 객체가 생성될 때마다 카운터 증가
    }

    // getter 메서드
    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    // setter 메서드
    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    // 넓이를 계산하는 메서드
    public int getArea() {
        return this.width * this.height;
    }

    // 정적 메서드: 인스턴스 개수를 반환
    public static int getInstanceCount() {
        return instanceCount;
    }

    // 객체의 문자열 표현
    @Override
    public String toString() {
        return "가로 길이는: " + width + "\n세로 길이는: " + height + "\n넓이는: " + getArea();
    }
}
