package chap_12;

public class _Quiz_12 {
    public static void main(String[] args) {
        Runnable boxReadyA = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    System.out.println("A 상품 준비 " + (i+1) + "/5");
                }
                System.out.println("-- A 상품 준비 완료 --");
            }
        };

        Runnable boxReadyB = () -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("B 상품 준비 " + (i+1) + "/5");
            }
            System.out.println("-- B 상품 준비 완료 --");
        };

        Thread threadA = new Thread(boxReadyA);
        Thread threadB = new Thread(boxReadyB);

        threadA.start();
        threadB.start();

        // Thread가 살아있는 동안에는 아무것도 안함.
        while(threadA.isAlive() || threadB.isAlive()) {

        }
//        try {
//            threadA.join();
//            threadB.join();
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }

        System.out.println("== 세트 상품 포장 시작 ==");
        for (int i = 0; i < 5; i++) {
            System.out.println("세트 상품 포장 " + (i+1) + "/5");
        }
        System.out.println("== 세트 상품 포장 완료 ==");


    }
}
