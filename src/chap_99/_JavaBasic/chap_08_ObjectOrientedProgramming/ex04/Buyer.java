package chap_99._JavaBasic.chap_08_ObjectOrientedProgramming.ex04;

public class Buyer {
    int money = 1000;
    int bonusPoint = 0;
    Product[] item = new Product[10];
    int i = 0;

    void buy(Product p) {
        if (money < p.price) {
            System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
            return;
        }
        money -= p.price;
        bonusPoint += p.bonusPoint;
        item[i++] = p;
        System.out.println(p + "을/를 구입하셨습니다.");

    }

    void summary() {
        int sum = 0;
        String itemList = "";

        for (int j = 0; j < item.length; j++) {
            if (item[j] == null) break;
            sum += item[j].price;
            itemList += item[j] + ", ";
        }
        System.out.println("구매하신 물품의 총 금액은 " + sum + "만원입니다.");
        System.out.println("구입하신 제품은 " + itemList + "입니다.");
    }
}
