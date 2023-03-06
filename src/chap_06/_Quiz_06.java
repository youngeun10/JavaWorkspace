package chap_06;

public class _Quiz_06 {
    public static String getHiddenData(String value, int startNumber) {
        String result = value.substring(0, startNumber);
        for (int i = 0; i < value.length(); i++) {
            if (i >= startNumber) {
                result += "*";
            }
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(getHiddenData("나코딩", 1));
        System.out.println(getHiddenData("990130-1234567", 8));
        System.out.println(getHiddenData("010-7222-8269", 9));
    }
}
