package chap_07;

public class BlackBox {
    String modelName;   // 모델명
    String resolution;  // 해상도
    int price;          // 가격
    String color;       // 색상

//     앞에 static이 붙는 변수는 클래스 변수로 BlackBox의 인스턴스에서 공통으로 사용할 수 있는 변수이다.
//     위의 변수처럼 static이 붙지 않은 변수들은 각 인스턴스에서만 값이 유효하다.
    static boolean canAutoReport = false;       // 자동 신고 가능
}
