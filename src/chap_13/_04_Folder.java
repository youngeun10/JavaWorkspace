package chap_13;

import java.io.File;

public class _04_Folder {
    public static void main(String[] args) {
        String folderName = "A";
        File folder = new File(folderName);
        folder.mkdir();     // folderName에 해당하는 folder 생성

        if (folder.exists()) {
            System.out.println("폴더가 존재합니다." + folder.getAbsolutePath());
        }

        System.out.println("--------------------------------------");

        folderName = "A/B/C";
        // 윈도우/맥 상관없이 쓸 수 있는 것: "A" + File.separator + "B" + File.separator + "C"
        // 윈도우: C:\\Users\\NadoCoding\\Desktop
        // 맥: /Users/NadoCoding/Desktop
        // → Windows와 Mac에서 폴더를 구분하는 문자가 다름! but, '/'를 써서 폴더를 구분해도 상관 없다!
        folder = new File(folderName);
        // folder.mkdir();      // 폴더 1개만 생성
        folder.mkdirs();        // 입력한 폴더의 중간이 없으면 중간 폴더까지 필요한 폴더 다 생성
        if (folder.exists()) {
            System.out.println("폴더가 존재합니다." + folder.getAbsolutePath());
        } else {
            /*
                folder.mkdir() : 만들려고 하는 폴더의 상위 폴더가 다 있어야 만들어진다.
                                현재 A폴더는 있으나 C폴더 위에 있는 B폴더가 없어서 C폴더가 안만들어진것!
                → folder.mkdirs()로 해결 가능
            */
            System.out.println("폴더 생성 실패 (mkdirs)");
        }
    }
}
