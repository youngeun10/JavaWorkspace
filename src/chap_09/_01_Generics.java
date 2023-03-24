package chap_09;

public class _01_Generics {
    public static void main(String[] args) {
        /*
            제네릭스: 다양한 타입의 객체를 지원하는 클래스나 인터페이스 또는 메소드를 정의하는 방법
            -> 똑같은 동작을 하는 클래스나 메소드를 여러번 만들 필요없이 딱 한 번 정의함으로써 여러 타입에서 지원 가능하도록 하는 것.
            - 제네릭스에서 지원하는 것은 객체. 기본자료형은 사용할 수 없음 -> 기본자료형은 wrapper class로 감싸줘야함.

            Ex)
                int -> Integer.parseInt();
                String.valueOf();
                double -> Double.toString();
                float -> Float
         */
        Integer[] iArray = {1, 2, 3, 4, 5};     // int의 wrapperClass = Integer
        Double[] dArray = {1.0, 2.0, 3.0, 4.0, 5.0};        // double의 wrapperClass = Double
        String[] sArray = {"A", "B", "C", "D", "E"};

        printIntArray(iArray);
        printDoubleArray(dArray);
        printStringArray(sArray);

        System.out.println("-------------------------------");

        printAnyArray(iArray);
        printAnyArray(dArray);
        printAnyArray(sArray);
    }

    // T : Type (T값 대신 아무거나 써도 됨.)
    // 많이 사용하는 것들 (K: Key, V: Value, E: Element)
    private static <T> void printAnyArray(T[] array) {
        for (T t : array) {
            System.out.print(t + " ");
        }
        System.out.println();
    }

    private static void printStringArray(String[] sArray) {
        for (String s : sArray) {
            System.out.print(s + " ");
        }
        System.out.println();
    }

    private static void printDoubleArray(Double[] dArray) {
        for (double d : dArray) {
            System.out.print(d + " ");
        }
        System.out.println();
    }

    private static void printIntArray(Integer[] iArray) {
        for (int i : iArray) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}