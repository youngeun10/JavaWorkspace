package chap_07;

import chap_07.camera.ActionCam;
import chap_07.camera.SlowActionCam;

public class _17_Final {
    public static void main(String[] args) {
        // Final : 클래스의 변수를 고정시킬 때 사용
        ActionCam actionCam = new ActionCam();
        // actionCam.lens = "표준렌즈";
        actionCam.recordVideo();
        actionCam.makeVideo();

        System.out.println("----------------------------------");

        SlowActionCam slowActionCam = new SlowActionCam();
        slowActionCam.makeVideo();
    }
}
