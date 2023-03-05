package chap_04;

public class _Quiz_04 {
    public static void main(String[] args) {
        int time = 10;
        int price = 0;
        boolean obstacle = true;        // withDisablePerson
        boolean smallCar = false;       // isSmallCar

        if (time * 4000 > 30000) {
            price = 30000;
        } else {
            price = 4000 * time;
        }

        if (obstacle || smallCar) {
            price /= 2;
        }
        System.out.println("주차 요금은 " + price + " 원입니다.");
    }
}
