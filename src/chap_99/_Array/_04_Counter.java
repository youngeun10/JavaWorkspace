package chap_99._Array;

public class _04_Counter {
    public static void main(String[] args) {
        int[] counter = new int[10];

        for (int i = 0; i < 10; i++) {
            int n = (int) (Math.random() * 10);
            System.out.print(n);
            counter[n]++;

            for (int j = 0; j < counter.length; j++) {
                System.out.print(" " + counter[j] + " ");
            }

            System.out.println();
        }
    }
}
