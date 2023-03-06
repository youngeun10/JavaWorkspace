package chap_05;

public class _Quiz_05 {
    public static void main(String[] args) {
        int[] shoes = new int[10];

        // insert
        for (int i = 0; i < 10; i++) {
            shoes[i] = 250 + (5 * i);
        }

        // print
        for (int i = 0; i < 10; i++) {
            System.out.println("사이즈 " + shoes[i] + " (재고 있음)");
        }
    }
}
