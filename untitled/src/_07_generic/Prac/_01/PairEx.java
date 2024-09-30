package _07_generic.Prac._01;

public class PairEx {
    public static void main(String[] args) {
        // 첫 번째 Pair: key가 String, value가 Integer
        Pair<String, Integer> pair1 = new Pair<>("One", 1);
        System.out.println("Key: " + pair1.getKey() + ", Value: " + pair1.getValue());

        // 두 번째 Pair: key가 Integer, value가 String
        Pair<Integer, String> pair2 = new Pair<>(2, "Two");
        System.out.println("Key: " + pair2.getKey() + ", Value: " + pair2.getValue());
    }
}

