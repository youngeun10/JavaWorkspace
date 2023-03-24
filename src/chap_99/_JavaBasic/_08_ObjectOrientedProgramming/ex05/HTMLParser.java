package chap_99._JavaBasic._08_ObjectOrientedProgramming.ex05;

public class HTMLParser implements Parseable{
    @Override
    public void parse(String fileName) {
        System.out.println(fileName + "- HTML parsing completed.");
    }
}
