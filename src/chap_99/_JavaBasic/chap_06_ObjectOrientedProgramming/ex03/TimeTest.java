package chap_99._JavaBasic.chap_06_ObjectOrientedProgramming.ex03;

public class TimeTest {
    public static void main(String[] args) {
        Time t = new Time(12, 35, 30);
        System.out.println(t.toString());
        t.setHour(t.getHour() + 1);
        System.out.println(t.toString());
    }
}
