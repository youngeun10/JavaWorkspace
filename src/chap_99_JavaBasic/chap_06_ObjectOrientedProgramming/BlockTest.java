package chap_99_JavaBasic.chap_06_ObjectOrientedProgramming;

public class BlockTest {
    static {        // class initialization block
        System.out.println("static { }");
    }

    {               // instance initialization block
        System.out.println("{ }");
    }

    public BlockTest() {
        System.out.println("생성자");
    }

    public static void main(String[] args) {
        System.out.println("BlockTest bt = new BlockTest(); ");
        BlockTest bt = new BlockTest();

        System.out.println("BlockTest bt2 = new BlockTest(); ");
        BlockTest bt2 = new BlockTest();
    }
}
