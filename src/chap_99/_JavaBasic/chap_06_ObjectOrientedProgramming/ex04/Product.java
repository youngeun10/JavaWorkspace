package chap_99._JavaBasic.chap_06_ObjectOrientedProgramming.ex04;

public class Product {
    int price;
    int bonusPoint;
    Product(int price) {
        this.price = price;
        bonusPoint = (int) (price / 10.0);
    }
    Product() { };
}
