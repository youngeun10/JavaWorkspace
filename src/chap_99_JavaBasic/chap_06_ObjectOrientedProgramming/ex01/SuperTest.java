package chap_99_JavaBasic.chap_06_ObjectOrientedProgramming.ex01;

public class SuperTest {
    public static void main(String[] args) {
        Child c = new Child();
        c.method();
        System.out.println(c);
        System.out.println(c.x);
    }
}
