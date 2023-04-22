package chap_12;

import chap_12.Clean.CleanRunnable;

public class _02_Runnable {
    public static void main(String[] args) {
        /*
            Thread를 사용하는 방법 → 2가지
            1. Thread를 상속받아서 사용하는 방법
            2. Runnable 인터페이스를 구현해서 사용하는 방법.

            💡1번과 2번의 차이
            상속의 경우 단일 상속만 가능하다.
            다른 부모 클래스를 상속받고, Thread를 사용하고 싶을 때
            Runnable implements해서 사용하기 위해 2번의 방법이 있는 것! (인터페이스는 여러 개 구현 가능)
        */
        CleanRunnable cleanRunnable = new CleanRunnable();
        Thread thread = new Thread(cleanRunnable);
        thread.start();

        cleanByBoss();
    }

    public static void cleanByBoss() {
        System.out.println("-- 사장 청소 시작 --");
        for (int i = 1; i <= 10; i += 2) {
            System.out.println("(사장) " + i + "번 방 청소 중");
        }
        System.out.println("-- 사장 청소 끝 --");
    }
}
