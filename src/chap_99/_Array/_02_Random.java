package chap_99._Array;

public class _02_Random {
    public static void main(String[] args) {
        int[] ball = new int[45];
        for (int i = 0; i < ball.length; i++) {
            ball[i] = i+1;
        }

        int tmp = 0;
        int j = 0;

        for (int i = 0; i < 6; i++) {
            j = (int) (Math.random() * 45);
            System.out.print(j + " ");
            tmp = ball[i];
            ball[i] = ball[j];
            ball[j] = tmp;
        }
        System.out.println();
        for (int i = 0; i < 6; i++) {
            System.out.printf("ball[%d]=%d%n", i, ball[i]);
        }
        System.out.println();

        int[] num = new int[10];
        for (int i = 0; i < num.length; i++) {
            num[i] = i + 1;
        }

        int t = 0;
        int n = 0;
        for (int i = 0; i < num.length; i++) {
            n = (int) (Math.random() * 10);
            t = num[i];
            num[i] = num[n];
            num[n] = t;
        }
        for (int i = 0; i < num.length; i++) {
            System.out.printf("num[%d]=%d%n", i, num[i]);
        }
    }
}
