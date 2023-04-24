package chap_12;

import chap_12.Clean.CleanRunnable;

public class _03_Join {
    public static void main(String[] args) {
        /*
            사장이 직원이 청소를 제대로 했는지 확인한 후에 청소 시작하고 싶음!
        */
        CleanRunnable cleanRunnable = new CleanRunnable();
        Thread thread = new Thread(cleanRunnable);
        thread.start();
        try {
            // join의 역할: 현재 있는 쓰레드가 끝날때 까지 기다린 다음 다음 줄 실행
            // 시간정보를 입력하면 해당 시간까지 기다리는데 이 시간이 지나도 쓰레드가 끝나지 않으면 그냥 넘어감.
            thread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        cleanByBoss();
    }

    public static void cleanByBoss() {
        System.out.println("-- 사장 청소 시작 --");
        for (int i = 1; i <= 10; i += 2) {
            System.out.println("(사장) " + i + "번 방 청소 중");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("-- 사장 청소 끝 --");
    }
}
