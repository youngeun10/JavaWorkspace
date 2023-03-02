package chap_04;

public class _05_For {
    public static void main(String[] args) {
        // 반복문 For
        // 나코 매장
        System.out.println("어서오세요. 나코입니다.");
        // 또다른 손님이 들어오면?
        System.out.println("어서유세요. 나코입니다.");
        System.out.println("어서유세요. 나코입니다.");
        System.out.println("어서유세요. 나코입니다.");
        System.out.println("어서유세요. 나코입니다.");
        System.out.println("어서유세요. 나코입니다.");

        // 만약에 인사 법이 바뀌면?
        System.out.println("환영합니다. 나코입니다.");
        System.out.println("환영합니다. 나코입니다.");
        System.out.println("환영합니다. 나코입니다.");

        // 매장 이름이 바뀌면?
        // 나코 -> 코나
        System.out.println("환영합니다. 코나입니다.");
        System.out.println("환영합니다. 코나입니다.");
        System.out.println("환영합니다. 코나입니다.");

        System.out.println("----- 반복문 사용 -----");

        // 반복문 For
        /*
        for ([선언] ; [조건] ; [증감]) {
            ... 수행 명령 ...
        }
        */
        for (int i = 0; i < 10; i++) {
            // System.out.println("어서요세요. 나코입니다. " + i);
            // System.out.println("환영합니다. 나코입니다. " + i);
            System.out.println("환영합니다. 코나입니다. " + i);
        }

        // 짝수만 출력 (fori 만 적고 엔터)
        for (int i = 0; i < 10; i += 2) {
            System.out.println(i);
        }

    }
}
