package chap_99._JavaBasic.chap_06_ObjectOrientedProgramming.ex04;

public class PolyArgumentTest2 {
    public static void main(String[] args) {
        Buyer b = new Buyer();

        b.buy(new Tv());
        b.buy(new Computer());
        b.buy(new Audio());
        b.summary();
    }
}
