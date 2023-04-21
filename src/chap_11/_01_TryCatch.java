package chap_11;

public class _01_TryCatch {
    public static void main(String[] args) {
        // 예외 처리
        // 오류: 컴파일 오류, 런타임 오류
        // int i = "문자열";       // 컴파일 오류
        /*
            // 런타임 오류: 컴파일은 되는데 실행하는 과정에서 오류
                1. 에러 Error → 코드로 처리 불가         ex) StackOverflowError
                2. 예외 exception → 코드로 처리 가능     ex) NullPointerException
            int[] arr = new int[3];
            arr[5] = 100;

         */
//        S s = null;
//        s.methodA();

        try {
            // System.out.println(3 / 0);
//            int[] arr = new int[3];
//            arr[5] = 100;
            Object obj = "test";
            System.out.println((int) obj);
        } catch (Exception e) {
            System.out.println("이런 문제가 발생했어요 => " + e.getMessage());
            e.printStackTrace();        // 에러가 발생하는 이유와 장소 알려줌
        }

        System.out.println("프로그램 정상 종료");
    }
}

/*
class S {
    public void methodA() {
        this.methodA();
    }
}
 */
