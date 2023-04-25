package chap_13;

import java.io.*;

public class _06_ReadWriteFile {
    public static void main(String[] args) {
        /*
            * BufferedReader: 파일의 내용을 읽어올 떄
            * BufferedWriter: 파일에 내용을 쓸 때

            ex)
            BufferedWriter bw = new BufferedWriter(new FileWriter("goodjob.txt"))
            → goodjob.txt의 내용에 bw를 이용해 값을 입력 (append옵션이 false가 default이므로,
                "_06_ReadWriteFile"을 실행할 때마다 밑에 입력한 내용만 보임.

            BufferedWriter bw = new BufferedWriter(new FileWriter("goodjob.txt", true))
            → append 옵션을 true로 설정해놓아서, "_06_ReadWriteFile"을 실행하면
              원래 goodjob.txt의 내용에 추가로 밑에 내용이 쓰여짐.

        */

//        // 파일 쓰기 - try문 ()에 써놓은 것은 무조건 close가 실행됨!
//        try(BufferedWriter bw = new BufferedWriter(new FileWriter("goodjob.txt", true))) {
////            bw.write("1. 이제 거의 끝이 보여요.");
////            bw.newLine();
////            bw.write("2. 여기까지 오신 여러분들 정말 대단해요!");
////            bw.newLine();
//            bw.write("3. 조금만 더 힘내요!");
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }

        // 파일 읽기
        try(BufferedReader br = new BufferedReader(new FileReader("goodjob.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
