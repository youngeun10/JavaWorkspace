package chap_06;

public class _04_ParameterAndReturn {

    public static int getPower(int x) {
        return x * x;
    }

    public static int getPowerByExp(int x, int exp) {
        int result = 1;
        for (int i = 0; i < exp; i++) {
            result *= x;
        }
        return result;
    }

    // 전달값과 반환 값이 있는 메소드
    public static void main(String[] args) {
        System.out.println(getPower(2));
        System.out.println(getPowerByExp(2, 3));
    }
}
