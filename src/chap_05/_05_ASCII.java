package chap_05;

public class _05_ASCII {
    public static void main(String[] args) {
        // 아스키 코드 (ANSI) : 미국 표준 코드
        char c = 'A';       // 알파벳 대문자(A)는 65부터 시작, 소문자(a)는 97부터 시작, 숫자(0)는 48부터 시작.
        System.out.println(c);
        System.out.println((int)c);

        c = 'B';
        System.out.println(c);
        System.out.println((int)c);

        c++;
        System.out.println(c);
        System.out.println((int)c);

        char ch = 'A';
        String[][] seats3 = new String[10][15];
        for (int i = 0; i < seats3.length; i++) {
            for (int j = 0; j < seats3[i].length; j++) {
                seats3[i][j] = ch + String.valueOf(j+1);
            }
            ch++;
        }

        for (int i = 0; i < seats3.length; i++) {
            for (int j = 0; j < seats3[i].length; j++) {
                System.out.print(seats3[i][j] + " ");
            }
            System.out.println();
        }
    }
}
