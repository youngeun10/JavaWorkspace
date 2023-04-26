package chap_99_JavaBasic.chap_06_ObjectOrientedProgramming.ex05;

public class HTMLParser implements Parseable{
    @Override
    public void parse(String fileName) {
        System.out.println(fileName + "- HTML parsing completed.");
    }
}
