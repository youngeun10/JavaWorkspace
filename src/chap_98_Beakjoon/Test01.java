package chap_98_Beakjoon;

public class Test01 {
    public static int solution(String number) {

        number = number.replaceAll("12", "-");
        number = number.replaceAll("23", "-");
        number = number.replaceAll("34", "-");
        number = number.replaceAll("45", "-");
        number = number.replaceAll("56", "-");
        number = number.replaceAll("67", "-");
        number = number.replaceAll("78", "-");
        number = number.replaceAll("89", "-");
        number = number.replaceAll("90", "-");
        number = number.replaceAll("0", "-");

        int tot = number.length();
        int num = tot - number.replaceAll("-", "").length();

        return num + (tot - num)*2;
    }

    public static void main(String[] args) {
        System.out.println(solution("1234567"));
    }
}
