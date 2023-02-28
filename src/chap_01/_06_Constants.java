package chap_01;

public class _06_Constants {
    public static void main(String[] args) {
        // 상수는 변하지 않는 값!
        final String KR_COUNTRY_CODE = "+82";
//        KR_COUNTRY_CODE = "+8282";
        System.out.println(KR_COUNTRY_CODE);

        // 상수의 경우 대문자로만 이루어져 있어 2단어 이상 사용할 떄는 언더바로 단어 구분!
        final double PI = 3.141592;     // 원주율
        final String DATE_OF_BIRTH = "1992-10-10";      // 생년월일


    }
}
