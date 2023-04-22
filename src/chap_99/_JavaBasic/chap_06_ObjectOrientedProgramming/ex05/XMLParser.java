package chap_99._JavaBasic.chap_06_ObjectOrientedProgramming.ex05;

public class XMLParser implements Parseable{
    @Override
    public void parse(String fileName) {
        System.out.println(fileName + "- XML parsing completed.");
    }
}
