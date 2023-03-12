package chap_07;

public class BlackBox {
    String modelName;   // 모델명
    String resolution;  // 해상도
    int price;          // 가격
    String color;       // 색상

//     앞에 static이 붙는 변수는 클래스 변수로 BlackBox의 인스턴스에서 공통으로 사용할 수 있는 변수이다.
//     위의 변수처럼 static이 붙지 않은 변수들은 각 인스턴스에서만 값이 유효하다.
    static boolean canAutoReport = false;       // 자동 신고 가능

    void autoReport() {
        if (canAutoReport) {
            System.out.println("충돌이 감지되어 자동으로 신고합니다.");
        } else {
            System.out.println("자동 신고 기능이 지원되지 않습니다.");
        }
    }

    void insertMemoryCard(int capacity) {
        System.out.println("메모리 카드가 삽입되었습니다.");
        System.out.println("용량은 " + capacity + "GB 입니다.");
    }

    int getVideoFileCount(int type) {
        if (type == 1) {        // 일반 영상
            return 9;
        } else if (type == 2) { // 이벤트 영상
            return 1;
        }
        return 10;
    }
}
