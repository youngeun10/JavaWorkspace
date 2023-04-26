package chap_99_JavaBasic.chap_06_ObjectOrientedProgramming.ex05;

public class ParserManager {
    // 리턴 타입이 Parseable 인터페이스이다.
    public static Parseable getParser(String type) {
        if (type.equals("XML")) {
            return new XMLParser();
        } else {
            Parseable p = new HTMLParser();
            System.out.println("ParserManager: " + p);
            return p;
        }
    }
}
