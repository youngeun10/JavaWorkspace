package chap_13;

public class _02_Output {
    public static void main(String[] args) {
        /*
            * 출력문
            1. System.out.println();    // 단축어: sout
            2. System.out.printf("");   // 단축어: souf
            3. System.out.format();
        */

        System.out.println("---------- 정수 ----------");
        // 형식: System.out.printf("포맷", [값]);
        System.out.printf("%d%n", 1);
        System.out.printf("%d %d %d%n", 1, 2, 3);
        System.out.printf("%d%n", 1234);
        System.out.printf("%6d%n", 1234);       // %[숫자]d: [숫자]만큼의 공간을 만든다음 입력한 값을 출력
        System.out.printf("%06d%n", 1234);       // %[숫자]d: [숫자]만큼의 공간을 0으로 채운 뒤 입력한 값을 출력
        System.out.printf("%6d%n", -1234);
        System.out.printf("%+6d%n", 1234);
        System.out.printf("%,15d%n", 1000000000);
        System.out.printf("%-6d%n", 1234);      // 1234__

        System.out.println("---------- 실수 ----------");
        System.out.printf("%f%n", Math.PI);     // 3.141593
        System.out.printf("%.2f%n", Math.PI);     // 소숫점 둘째자리까지 출력
        System.out.printf("%6.2f%n", Math.PI);      // 6자리마련한 후 소숫점 둘째자리까지 출력: __3.14
        System.out.printf("%-6.2f%n", Math.PI);     // 3.14__
        System.out.printf("%06.2f%n", Math.PI);    // 003.14
        System.out.printf("%+6.2f%n", Math.PI);    // _+3.14

        System.out.println("---------- 문자열 ----------");
        System.out.printf("%s%n", "Java");          // Java 일반 출력
        System.out.printf("%6s%n", "Java");       // __Java: 6자리 공간 확보 후 "Java" 출력
        System.out.printf("%-6s%n", "Java");       // Java__ : 6자리 공간 확보 후 왼쪽 정렬 "Java" 출력
        System.out.printf("%6.2s%n", "Java");         // ____Ja : 6자리 확보 후 앞에 두글자만 출력
        System.out.printf("%-6.2s%n", "Java");         // Ja____ : 6자리 확보 후 앞에 두글자만 왼쪽정렬해서 출력

        System.out.println("---------- 응용1 ----------");
        System.out.println("이름 영어 수학 평균");
        System.out.println("강백호 " + 90 + " " + 80 + " " + 85.0);    // 강백호 90 80 85.0
        System.out.println("서태웅 " + 100 + " " + 100 + " " + 100.0);    // 서태웅 100 100 100.0
        System.out.println("채치수 " + 95 + " " + 100 + " " + 97.5);    // 서태웅 100 100 100.0

        System.out.println("---------- 응용2 ----------");
        System.out.println("이름      영어   수학   평균");     // 공백이 각각 6, 3, 3칸으로 구분
        System.out.printf("%-6s %4d %4d %6.1f%n", "강백호", 90, 80, 85.0);
        System.out.printf("%-6s %4d %4d %6.1f%n", "서태웅", 100, 100, 100.0);
        System.out.printf("%-6s %4d %4d %6.1f%n", "채치수", 95, 100, 97.5);

        System.out.println("---------- 참고 ----------");
        System.out.println("ABCDEFG");
        System.out.println("가나다라마바사");
    }
}
