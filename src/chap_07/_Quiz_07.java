package chap_07;

public class _Quiz_07 {
    public static void main(String[] args) {
        HamBurger[] hamBurgers = new HamBurger[3];
        hamBurgers[0] = new HamBurger();
        hamBurgers[1] = new CheeseBurger();
        hamBurgers[2] = new ShrimpBurger();

        System.out.println("주문하신 메뉴를 만듭니다.");
        System.out.println("--------------------");
        for (HamBurger hamBurger : hamBurgers) {
            hamBurger.cook();
            System.out.println("--------------------");
        }
        System.out.println("메뉴 준비가 완료되었습니다. ");


    }
}

class HamBurger {

    public String name;

    public HamBurger() {
        this("햄버거");
    }
    public HamBurger(String name) {
        this.name = name;
    }

    public void cook() {
        System.out.println(this.name + "를 만듭니다.");
        System.out.println("빵 사이에 들어가는 재료는?");
        System.out.printf("> 양상추 \n+ 패티 \n+ 피클\n");
    }

}
// 햄버거 : 양상추, 패티, 피클
// 치즈버거 : 양상추, 패티, 피클, 치즈
// 새우버거 : 양상추, 패티, 피클, 새우

class CheeseBurger extends HamBurger{

    CheeseBurger() {
        this.name = "치즈버거";
    }

    public void cook() {
        super.cook();
        System.out.println("+ 치즈");
    }

}

class ShrimpBurger extends HamBurger{

    ShrimpBurger() {
        this.name = "새우버거";
    }

    public void cook() {
        super.cook();
        System.out.println("+ 새우");
    }

}