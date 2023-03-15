package chap_07;

import java.util.Random;

public class _11_Package {
    public static void main(String[] args) {
        // 패키지 : 서로 연관된 클래스들을 모아놓는 것 (랜덤 클래스)
        Random random = new Random();
        System.out.println("랜덤 정수 : " + random.nextInt());      // int범위 내에서 정수형 반환
        System.out.println("랜덤 정수 (범위) : " + random.nextInt(10));   // 0에서 9시에 값
        System.out.println("랜덤 실수 : " + random.nextDouble());   // 0.0이 1.0미만의 실수 값
        // System.out.println("랜덤 실수 (범위) : " + random.nextDouble(10.0));   // 0에서 9시에 값

        // 만약 5.0 이상 10.0 미만의 실수를 뽑으려면?
        double min = 5.0;
        double max = 10.0;
        System.out.println("랜덤 실수 (범위) : " + (min + (max - min) * random.nextDouble()));   // 0에서 9시에 값

        System.out.println("랜덤 boolean : " + random.nextBoolean());

        // 로또 번호 랜덤으로 뽑으려면? 1 ~ 45
        System.out.println("로또 번호 : " + (1 + random.nextInt(45)));
        System.out.println("로또 번호 : " + (1 + random.nextInt(45)));
        System.out.println("로또 번호 : " + (1 + random.nextInt(45)));
        System.out.println("로또 번호 : " + (1 + random.nextInt(45)));
        System.out.println("로또 번호 : " + (1 + random.nextInt(45)));
        System.out.println("로또 번호 : " + (1 + random.nextInt(45)));

        // Math, Scanner, StringBuilder, StringBuffer, StringTokenizer
        // BigInteger, BigDecimal
        // LocalDate, LocalTime, LocalDateTime, DateTimeFormatter, ...
    }
}
