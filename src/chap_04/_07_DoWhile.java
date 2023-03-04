package chap_04;

public class _07_DoWhile {
    public static void main(String[] args) {
        // 반복문 DoWhile
        int distance = 25;      // 전체 거리 25m
        int move = 0;           // 현재 이동 거리 0m
        int height = 2;         // 키 2m
        while (move + height < distance) {
            System.out.println("발차기를 계속 합니다.");
            System.out.println("현재 이동거리 : " + move);
            move += 3;          // 3m
        }
        System.out.println("도착했습니다.");

        System.out.println(" --- 반복문 #1 ---");

        // 키가 엄청나게 큰 사람?
        move = 0;
        height = 25;            // 키가 25m
        while (move + distance < distance) {
            System.out.println("발차기를 계속 합니다.");
            System.out.println("현재 이동거리 : " + move);
            move += 3;          // 3m
        }
        System.out.println("도착했습니다.");

        System.out.println(" --- 반복문 #2 ---");
        // Do While 반복문
        /*
        do {

        } while (조건);
        */
        do {
            System.out.println("발차기를 계속 합니다.");
            System.out.println("현재 이동거리 : " + move);
            move += 3;
        } while (move + height < distance);
        System.out.println("도착했습니다.");

        /*

        * do-while문 while문의 차이
            - while문은 조건을 먼저 실행한 뒤 안에 있는 내용을 실행시킴.
            - do-while문의 경우 안의 내용을 먼저 실행한 후, 조건을 확인.
        * */
    }
}
