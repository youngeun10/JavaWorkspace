package chap_10;

public class _03_Lambda {
    public static void main(String[] args) {
        // 람다식
        // (전달값1, 전달값2, ...) -> { 코드 }

    }

//    public void print() {
//        String s = "test";
//        System.out.println(s);
//    }

//    람다식 : 접근제어자, 메소드 이름, 반환 타입(반환형도 알아서 처리함) 다 필요 없다~ 대신 -> 기호!
//    () -> {
//        String s = "test";
//        System.out.println(s);
//    }

//    public void print(String s ) {
//        System.out.println(s);
//    }

    // 만약 코드가 1줄이면 { } 괄호와 ; 세미콜론 지워도 됨! 그리고 ()와 타입또한 지워도 됨.
//    s -> System.out.println(s)

//    public int add(int x, int y) {
//        return x + y;
//    }

    // 반환형도 알아서 처리함
    // return이 포함되는 코드는 { } 생략도 가능... (안된다매)
//    (x, y) -> x + y
}