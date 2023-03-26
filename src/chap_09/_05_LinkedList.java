package chap_09;

import com.sun.xml.internal.ws.addressing.WsaActionUtil;

import java.util.Collections;
import java.util.LinkedList;

public class _05_LinkedList {
    public static void main(String[] args) {
        // 링크드 리스트
        LinkedList<String> list = new LinkedList<>();

        // 데이터 추가
        list.add("장우영");
        list.add("이준호");
        list.add("옥택연");
        list.add("황찬성");
        list.add("닉쿤");

        // 데이터 조회 (인덱스)
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.getFirst());        // ArrayList에는 없고 LinkedList에 있는 것
        System.out.println(list.getLast());

        System.out.println("---------------------------");

        // 추가
        list.addFirst("김준수");
        for (String s: list) {
            System.out.println(s);
        }
        System.out.println("---------------------------");
        list.addLast("박재범");
        for (String s: list) {
            System.out.println(s);
        }
        System.out.println("---------------------------");

        System.out.println("학생 추가 전 (index 1): " + list.get(1));
        list.add(1, "김영은");
        System.out.println("학생 추가 후 (index 1): " + list.get(1));
        System.out.println("학생 추가 후 (index 2): " + list.get(2));

        System.out.println("---------------------------");

        // 삭제
        System.out.println("남은 학생 수 (제외 전) : " + list.size());
        list.remove(list.size()-1);
        System.out.println("남은 학생 수 (제외 후) : " + list.size());

        System.out.println("---------------------------");

        // 처음 학생과 마지막 학생이 전학
        for (String s: list) {
            System.out.println(s);
        }
        System.out.println("남은 학생 수 (전학 전) : " + list.size());
        list.removeFirst();     // 처음 데이터 삭제
        list.removeLast();      // 마지막 데이터 삭제
        System.out.println("남은 학생 수 (전학 후) : " + list.size());
        for (String s: list) {
            System.out.println(s);
        }

        System.out.println("---------------------------");

        // 변경 (수강권 양도)
        list.set(0, "이재욱");
        System.out.println(list.get(0));

        System.out.println("---------------------------");

        // 확인
        System.out.println(list.indexOf("장우영"));
        if (list.contains("장우영")) {
            System.out.println("수강 신청 성공 !");
        } else {
            System.out.println("수강 신청 실패 ㅠ");
        }

        System.out.println("---------------------------");
        // 전체 삭제
        list.clear();
        if (list.isEmpty()) {
            System.out.println("학생 수 : "+ list.size());
            System.out.println("리스트가 비었습니다.");
        }

        System.out.println("---------------------------");

        // 새로운 학기
        list.add("장우영");
        list.add("이준호");
        list.add("옥택연");
        list.add("황찬성");
        list.add("닉쿤");
        Collections.sort(list);     // 정렬
        for (String s : list) {
            System.out.println(s);
        }
    }
}
