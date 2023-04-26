package chap_99_JavaBasic.chap_08_ExceptionHandling;

public class _Ex21_NewExceptionTest {
    public static void main(String[] args) {
        try {
            startInstall();
            copyFile();
        } catch (SpaceException e) {
            System.out.println("에러 메시지: " + e.getMessage());
            e.printStackTrace();
            System.out.println("공간을 확보한 후에 다시 설치하시기 바랍니다.");
        } catch (MemoryException me) {
            System.out.println("에러 메시지: " + me.getMessage());
            me.printStackTrace();
            System.gc();        // garbage Collection을 수행하여 메모리를 늘려준다.
            System.out.println("다시 설치를 시도하세요.");
        } finally {
            deleteTempFiles();
        }
    }

    static void startInstall() throws SpaceException, MemoryException {
        if (!enoughSpace()) throw new SpaceException("설치할 공간이 부족합니다.");
        if (!enoughMemory()) throw new SpaceException("메모리가 부족합니다.");
    }
    static void copyFile() { /* 파일들을 복사하는 코드를 적는다. */ }
    static void deleteTempFiles() { /* 임시 파일들을 삭제하는 코드를 적는다. */ }
    static boolean enoughSpace() {
        // 설치파는데 필요한 공간이 있는지 확인하는 코드를 적는다.
        return false;
    }

    static boolean enoughMemory() {
        // 설치하는데 필요한 메모리공간이 있는지 확인하는 코드를 적는다.
        return true;
    }
}

class SpaceException extends Exception {
    public SpaceException(String message) {
        super(message);
    }
}
class MemoryException extends Exception {
    public MemoryException(String message) {
        super(message);
    }
}
