package chap_99._JavaBasic._08_ObjectOrientedProgramming.ex01;

public class Child extends Parent{
    void method() {
        System.out.println("x=" + x);
        System.out.println("this.x=" + this.x);
        System.out.println("super.x=" + super.x);
        System.out.println(this.x==super.x);
    }
}
