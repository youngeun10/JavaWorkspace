package chap_07.camera;

// Speed is a Camera
public class SpeedCam extends Camera{         // Camera의 자식 클래스
    public SpeedCam() {
        this.name = "과속단속 카메라";
    }

    public void checkSpeed() {
        // 속도 체크
        System.out.println("속도를 측정합니다.");
    }

    public void recognizeLicensePlate() {
        //  번호 인식
        System.out.println("차량 번호를 인식합니다.");
    }

    @Override           // annotation 주석 : 컴파일러에게 부모 클래스의 메소드를 오버라이딩 시켜준다라는 싸인
    public void showMainFeature() {
        System.out.println(this.name + "의 주요 기능 : 속도 측정, 번호 인식");
        }
}
