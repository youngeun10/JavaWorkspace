package chap_06;

public class _05_Overloading {

    public static int getPower(int x) {
        return x * x;
    }

    public static int getPower(String strNumber) {
        int number = Integer.parseInt(strNumber);
        return number * number;
    }

    public static int getPower(int x, int exp) {
        int result = 1;
        for (int i = 0; i < exp; i++) {
            result *= x;
        }
        return result;
    }


    public static void main(String[] args) {
        // 메소드 오버로딩
        // 같은 이름의 메소드를 여러 번 선언
        // 1. 전달값의 타입이 다르거나
        // 2. 전달값의 개수가 다르거나
        // * Return 값만 다른것은 안됨! (무조건, 파라미터의 자료형/ 개수)
        System.out.println(getPower(3));
        System.out.println(getPower("3"));
        System.out.println(getPower(2, 3));
    }
}
