package chap_03;

public class _03_StringCompare {
    public static void main(String[] args) {
        // 문자열 비교
        String s1 = "Java";
        String s2 = "Python";

        // 문자열 내용이 같으면 true, 다르면 false
        System.out.println(s1.equals("Java"));
        System.out.println(s2.equals("python"));        // equals : 대소문자 구분함.
        System.out.println(s2.equalsIgnoreCase("python"));      // 대소문자 상관없이 내용이 같으면 true

        // 문자열 비교 심화
        s1 = "1234";        // 벽에 붙은 메모지의 비밀번호 정보 (참조)
        s2 = "1234";        // s1, s2 같은 곳을 참조

        System.out.println(s1.equals(s2));  // 내용을 비교
        System.out.println(s1 == s2);       // 참조하는 곳을 비교

        s1 = new String("1234");    // 메모리 상에 "1234"의 자리 마련
        s2 = new String("1234");    // 메모리 상에 "1234"의 자리 마련 -> s1과는 다른 장소에 자리 마련
        System.out.println(s1.equals(s2));  // 내용
        System.out.println(s1 == s2);       // 참조하는 곳

    }
}
