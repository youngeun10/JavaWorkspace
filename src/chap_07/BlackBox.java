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

    // showDateTime     : 날짜정보 표시여부
    // showSpeed        : 속도정보 표시여부
    // min              : 영상 시간
    void record(boolean showDateTime, boolean showSpeed, int min) {
        System.out.println("녹화를 시작합니다.");
        if (showDateTime) {
            System.out.println("영상에 날짜정보가 표시됩니다.");
        }
        if (showSpeed) {
            System.out.println("영상에 속도정보가 표시됩니다.");
        }
        System.out.println("영상은 " + min + "분 단위로 기록됩니다.");
    }

    void record() {
        record(true, true, 5);
    }

    static void callServiceCenter() {
        System.out.println("서비스 센터(1588-oooo)로 연결합니다.");
        //  modelName = "test";         // 인스턴스의 변수같은 경우에는 객체가 생성되어야 쓸 수 있다. (클래스 메소드에서는 직접 접근 불가)
        // canAutoReport = false;          // 클래스변수는 클래스 메쏘드 안에서 사용가능.
    }

    void appendModelName(String modelName) {
        this.modelName += modelName;        // this.modelName (클래스 내의 인스턴스 변수에 접근), modelName은 파라미터로 받은 modelName
    }
}
