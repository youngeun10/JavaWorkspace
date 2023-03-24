package chap_09.coffee;

import chap_09.user.User;

// <T extends User> : 들어올 수 있는 타입을 User안에 있는 클래스만 허용한다로 제한.
public class CoffeeByUser <T extends User>{
    public T user;

    public CoffeeByUser(T user) {
        this.user = user;
    }

    public void ready() {
        System.out.println("커피 준비 완료 : " + user.name);
        user.addPoint();
    }
}
