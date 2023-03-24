package chap_09;

import chap_09.coffee.*;
import chap_09.user.User;
import chap_09.user.VIPUser;

public class _02_GenericClass {
    public static void main(String[] args) {
        // 제네릭 클래스 : 하나의 클래스에서 서로 다른 형태의 데이터를 받아가지고 한꺼번에 처리하는 것이 가능하게 됨.
        // -> 코드의 중복을 없앨 수도 있고, 값을 가져올 때 형변환을 없앨 수 있기 때문에 개발상의 실수를 없앨 수 있고,
        //      정해진 타입의 데이터만 쓸 수 있음.
        CoffeeByNumber c1 = new CoffeeByNumber(33);
        c1.ready();

        CoffeeByNickname c2 = new CoffeeByNickname("유재석");
        c2.ready();

        System.out.println("---------------------------------");

        CoffeeByName c3 = new CoffeeByName(34);
        c3.ready();

        CoffeeByName c4 = new CoffeeByName("박명수");
        c4.ready();

        System.out.println("---------------------------------");

        /*
            Object클래스를 쓰면 문제가 되는 점: 만약 사용자가 실수를 해서
            c4Name = (String) c3.name;
            과같은 코드를 입력했을 경우
            Exception in thread "main" java.lang.ClassCastException: java.lang.Integer cannot be cast to java.lang.String
	        at chap_09._02_GenericClass.main(_02_GenericClass.java:38)
	        위와 같은 에러가 날 수 있다.
	        -> 이러한 문제를 해결하기 위해 GenericsClass를 사용한다.
         */

        int c3Name = (int)c3.name;
        System.out.println("주문 고객 번호 : " + c3Name);

        String c4Name = (String)c4.name;
        System.out.println("주문 고객 이름 : " + c4Name);

        // c4Name = (String) c3.name;

        System.out.println("---------------------------------");

        // 제네릭클래스를 정의할 때 클래스 이름 뒤에다가 임의의 자료형을 설정해놨다.
        // 이 위치에 사용할 자료형 객체를 <> 사이에 써주면 됨.
        Coffee<Integer> c5 = new Coffee<>(35);
        c5.ready();
        int c5Name = c5.name;
        System.out.println("주문 고객 번호 : " + c5Name);

        Coffee<String> c6 = new Coffee<>("조세호");
        c6.ready();
        String c6Name = c6.name;
        System.out.println("주문 고객 이름 : " + c6Name);

        System.out.println("---------------------------------");

        CoffeeByUser<User> c7 = new CoffeeByUser<User>(new User("강호동"));
        c7.ready();

        CoffeeByUser<User> c8 = new CoffeeByUser<>(new VIPUser("서장훈"));
        c8.ready();

        // CoffeeByUser<User> c9 = new CoffeeByUser<>(new BlackBox());
        // -> <T extends User> 들어올 수 있는 객체를 User로 제한해놔서 BlackBox가 T자리에 오면 Error

        System.out.println("---------------------------------");
        orderCoffee("김영철");
        orderCoffee(36);

        orderCoffee("이재욱", "아메리카노");
        orderCoffee(33, "카페라뗴");
    }

    // 매개변수로 값을 하나만 받을 떄는 <> 사이에 자료형? 하나만 입력
    public static <T> void orderCoffee(T name) {
        System.out.println("커피 주문 완료 - " + name);
    }

    // 매개변수로 2개이상의 값을 받을 때는 <>사이에 ','를 넣어 구분해 넣어주
    public static <T, V> void orderCoffee(T name, V coffee) {
        System.out.println(coffee + " 주문 완료 - " + name);
    }
}

class BlackBox {
    
}