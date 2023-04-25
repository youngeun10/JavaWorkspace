package chap_13;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class _Quiz_13 {
    public static void main(String[] args) {

        System.out.println("속담 퀴즈입니다. 빈 칸에 알맞은 말을 입력하세요. (주관식)");
        System.out.println("------------------------------------------------------------");
        try (BufferedReader br = new BufferedReader(new FileReader("src/chap_13/saying.txt"))) {
            String line;
            while(true) {
                line = br.readLine();
                if (line == null) break;
                System.out.println("(문제) " + line);
                String answer = br.readLine();

                Scanner sc = new Scanner(System.in);
                System.out.print(" 정답 입력 => ");
                String input = sc.nextLine();

                if (answer.equals(input)) {
                    System.out.println("정답입니다!!!");
                } else {
                    System.out.println("틀렸습니다. 정답은 " + answer + "입니다.");
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println("------------------------------------------------------------");
        System.out.println("모든 퀴즈가 완료 되었습니다.");
        System.out.println("수고하셨습니다. ^^");

    }
}
