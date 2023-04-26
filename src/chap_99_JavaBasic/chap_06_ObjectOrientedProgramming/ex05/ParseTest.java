package chap_99_JavaBasic.chap_06_ObjectOrientedProgramming.ex05;

public class ParseTest {
    public static void main(String[] args) {
        Parseable parser = ParserManager.getParser("XML");
        parser.parse("document.xml");
        parser = ParserManager.getParser("HTML");
        System.out.println("main : " + parser);
        parser.parse("document2.html");
    }
}
