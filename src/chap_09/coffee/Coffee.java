package chap_09.coffee;

public class Coffee <T>{
    public T name;      // 어떤 타입인지 몰라서 임의로 T라고 설정

    public Coffee(T name) {
        this.name = name;
    }

    public void ready() {
        System.out.println("커피 주문 완료 : " + name);
    }
}
