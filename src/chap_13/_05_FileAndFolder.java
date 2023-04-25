package chap_13;

import java.io.File;

public class _05_FileAndFolder {
    public static void main(String[] args) {
        //String folder = ".";        // . : 현재 위치 (상대경로): /Users/youngeun_1010/Desktop/JavaWorkspace
        String folder = "/Users/youngeun_1010/Desktop/JavaWorkspace/src/chap_13";
        File filesAndFolders = new File(folder);
        System.out.println("현재 폴더 경로 : " + filesAndFolders.getAbsolutePath());
        /*
            filesAndFolders.listFiles(): filesAndFolders 내에 있는 파일/폴더이름을 리스트로 반환
            file.isFile(): file이 파일이면 True, 아니면 False 반환
            file.isDirectory(): file이 폴더면 True, 아니면 False 반환
        */
        for (File file : filesAndFolders.listFiles()) {
            if (file.isFile()) {
                System.out.println("(파일) " + file.getName());
            } else if (file.isDirectory()) {
                System.out.println("(폴더) " + file.getName());
            }
        }
    }
}
