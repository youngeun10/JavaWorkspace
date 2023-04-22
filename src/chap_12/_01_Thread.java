package chap_12;

import chap_12.Clean.CleanThread;

public class _01_Thread {
    public static void main(String[] args) {
        /*
            // 하나의 프로세스 (Process)
            쓰레드 (Thread): 여러가지 일을 동시에 하게 만드는 것.

            exe파일 == 프로그램
            프로세스 == exe파일을 더블클릭해서 실행되어 돌아가는 상태
            쓰레드 == 프로세스의 자원을 이용해서 실제로 작업을 수행하는 것

            ex. 호텔방 청소 (+ 직원 채용)
            // 방 위치     1 3 5 7 9
            //           2 4 6 8 10
            → 쓰레드: 사람 1명당 1개의 쓰레드
        */
        // cleanBySelf();
        CleanThread cleanThread = new CleanThread();
        // cleanThread.run();  // 직원 청소
        cleanThread.start();        // run에 있는 내용이 실행되면서 밑에 있는 내용도 작업을 함?

        cleanByBoss();      // 사장님 청소
    }

    public static void cleanBySelf() {
        System.out.println("-- 혼자 청소 시작 --");
        for (int i = 1; i <= 10; i++) {
            System.out.println("(혼자) " + i + "번 방 청소 중");
        }
        System.out.println("-- 혼자 청소 끝 --");
    }

    public static void cleanByBoss() {
        System.out.println("-- 사장 청소 시작 --");
        for (int i = 1; i <= 10; i += 2) {
            System.out.println("(사장) " + i + "번 방 청소 중");
        }
        System.out.println("-- 사장 청소 끝 --");
    }
}
