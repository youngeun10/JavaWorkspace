package chap_07;

import chap_07.camera.Camera;

public class _16_Reference {
    public static void main(String[] args) {
        // 참조
        // 기본 자료형 (Primitive Data Types) : int, float, double, long, boolean, ...
        // -> 소문자로 시작
        // -> 값을 넣어주지 않으면 0으로 자동으로 초기화 되어있음.
        // -> 변수.* 을 입력했을 때 사용할 수 있는 메소드가 없음. (ex. i[0].~)
        int[] i = new int[3];
        System.out.println(i[0]);

        double[] d = new double[3];
        System.out.println(d[0]);

        // 참조 자료형 (Non-Primitive, Reference Data Types) : String, Camera, FactoryCam, SpeedCam
        // -> 대문자로 시작
        // -> 값을 넣어주지 않으면 null로 초기화 되어있음.
        // -> 변수.* 을 입력했을 때 사용할 수 있는 메소드가 있음. (ex. c[0].takePicture(), c[0].recordVideo(), ...)
        String[] s = new String[3];
        System.out.println(s[0]);

        Camera[] c = new Camera[3];
        System.out.println(c[0]);

        ///////////////////////////////////////////////
        System.out.println("-----------------------------------------");
        int a = 10;
        int b = 20;
        b = a;
        System.out.println(a);
        System.out.println(b);
        b = 30;
        System.out.println(a);
        System.out.println(b);

        System.out.println("-----------------------------------------");
        Camera c1 = new Camera();
        Camera c2 = new Camera();
        c1.name = "카메라1";
        c2.name = "카메라2";
        System.out.println(c1.name);
        System.out.println(c2.name);
        c2 = c1;        // c2의 손이 c1의 손을 잡고있음.
        System.out.println(c1.name);
        System.out.println(c2.name);
        c2.name = "고장난 카메라";
        System.out.println(c1.name);
        System.out.println(c2.name);
        System.out.println("-----------------");
        changeName(c2);
        System.out.println(c1.name);
        System.out.println(c2.name);

        // 참조 해제 하고 싶을 때
        c2 = null;

    }

    public static void changeName(Camera camera) {
        camera.name = "잘못된 카메라";
    }
}
