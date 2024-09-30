package _07_generic.Prac._01;

public class Pair<K, V> {
    // 두 개의 프라이빗 멤버 변수: key와 value
    private K key;
    private V value;

    // 생성자를 통해 key와 value를 초기화
    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    // getter 메서드들
    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }
}

