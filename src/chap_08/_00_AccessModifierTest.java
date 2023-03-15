package chap_08;

import chap_07.BlackBoxRefurbish;

public class _00_AccessModifierTest {
    public static void main(String[] args) {
        BlackBoxRefurbish b1 = new BlackBoxRefurbish();
        b1.modelName = "까망이";       // public
        // b1.resolutio = "FHD";       // default (같은 패키지 내에서만 접근가능)
        //b1.price = 200000;             // private (같은 클래스 내에서만 접근가능)
        // b1.color = "화이트";               // protected (같은 클래스 내 + 다른 클래스일 경우 자식클래스에서만 접근가능)
    }
}
