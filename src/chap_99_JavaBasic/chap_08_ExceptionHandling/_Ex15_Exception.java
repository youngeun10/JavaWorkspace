package chap_99_JavaBasic.chap_08_ExceptionHandling;

import java.io.File;

public class _Ex15_Exception {
    public static void main(String[] args) {
        // command line 에서 입력 받은 값을 이름으로 갖는 파일을 생성한다.
        File f = creatFile(args[0]);
        System.out.println(f.getName() + " 파일이 성공적으로 생성되었습니다.");
    }   // main the end

    static File creatFile(String fileName) {
        try {
            if (fileName == null || fileName.equals("")) throw new Exception("파일이름이 유효하지 않습니다.");
        } catch (Exception e) {
            // fileName이 부적절한 경우, 파일 이름을 '제목없음.txt'로 한다.
            fileName = "제목없음.txt";
        } finally {
            File f = new File(fileName);
            createNewFile(f);
            return f;
        }
    }   // creatFile end

    static void createNewFile(File f) {
        try {
            f.createNewFile();
        } catch (Exception e) { }
    }
}
