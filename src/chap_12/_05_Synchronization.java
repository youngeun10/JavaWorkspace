package chap_12;

import chap_12.Clean.Room;

public class _05_Synchronization {
    public static void main(String[] args) {

        /*
            동기화:   직원 별로 홀수, 짝수를 나눠서 청소하는 것이 아닌,
                    순서대로 방 순서대로 시간 나는 사람들이 청소하는 방법!
        */

        Room room = new Room();
        Runnable cleaner1 = new Runnable() {        // 익명 클래스 이용하는 방법
            @Override
            public void run() {
                System.out.println("-- 직원1 청소 시작 --");
                for (int i = 1; i <= 5; i++) {
                    room.clean("직원1");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }

                    if (i == 2) {
                        throw new RuntimeException("못해먹겠다!!!");
                    }
                }
                System.out.println("-- 직원1 청소 끝 --");
            }
        };

        Runnable cleaner2 = () -> {                 // 람다식 이용하는 방법
            System.out.println("-- 직원2 청소 시작 --");
            for (int i = 1; i <= 5; i++) {
                room.clean("직원2");

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            System.out.println("-- 직원2 청소 끝 --");
        };

        Thread cleanerThread1 = new Thread(cleaner1);
        Thread cleanerThread2 = new Thread(cleaner2);

        cleanerThread1.start();
        cleanerThread2.start();
    }
}
