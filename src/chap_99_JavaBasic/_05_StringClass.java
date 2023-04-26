package chap_99_JavaBasic;

public class _05_StringClass {
    public static void main(String[] args) {
        String s = "123";
        char c = s.charAt(1);
        int len = s.length();
        String str = s.substring(0, 2);
        boolean equResult = s.equals("123");
        char[] result = s.toCharArray();

        System.out.println("s.charAt(1) : " + c);
        System.out.println("s.length() : " + len);
        System.out.println("s.substring(0, 2) : " + str);
        System.out.println("s.equals(\"123)\" : " + equResult);
        System.out.println("s.toCharArray() : " + result);
    }
}
