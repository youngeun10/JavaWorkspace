package chap_09;

import java.util.ArrayList;
import java.util.Collections;

public class _04_ArrayList {
    public static void main(String[] args) {
        /*
            컬렉션 프레임워크
            : 많은 데이터를 쉽고 편리하게, 그리고 효과적으로 관리하기 위해서 자바에서 제공해주는 클래스들의 모음
            ex) List(ArrayList, LinkedList), Set, Map
        */
        ArrayList<String> list = new ArrayList<>();

        // 데이터 추가
        list.add("이재욱");
        list.add("공유");
        list.add("최우식");
        list.add("박서준");
        list.add("장우영");

        // 데이터 조회 (인덱스기준)
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
        System.out.println(list.get(3));
        System.out.println(list.get(4));

        System.out.println("------------------------------");

        // 데이터 삭제 (박서준 이사)
        System.out.println("신청 학생 수 (이사 전): " + list.size());
        list.remove("박서준");
        System.out.println("신청 학생 수 (이사 후): " + list.size());
        System.out.println(list.get(3));

        System.out.println("------------------------------");

        System.out.println("남은 학생 수 (제외 전): " + list.size());
        list.remove(list.size()-1);
        System.out.println("남은 학생 수 (제외 후): " + list.size());

        System.out.println("------------------------------");

        // 순회
        for (String s :list  ) {
            System.out.println(s);
        }

        System.out.println("------------------------------");

        // 변경 (수강권 양도)
        System.out.println("수강권 양도 전 : " + list.get(0));
        list.set(0, "조승연");
        System.out.println("수강권 양도 후 : " + list.get(0));

        System.out.println("------------------------------");

        // 확인
        System.out.println(list.indexOf("최우식"));

        // 선착순 5명 내에 포함 여부 확인
        if (list.contains("최우식")) {
            System.out.println("수강 신청 성공");
        } else {
            System.out.println("수강 신청 실패");
        }

        System.out.println("------------------------------");

        // 전체 삭제
        list.clear();
        if (list.isEmpty()) {
            System.out.println("학생 수 : " + list.size());
            System.out.println("리스트가 비었습니다.");
        }

        System.out.println("------------------------------");

        // 다음 학기 새로 공부 시작
        list.add("이재욱");
        list.add("공유");
        list.add("최우식");
        list.add("박서준");
        list.add("장우영");

        // 정렬
        Collections.sort(list);
        for (String s :list) {
            System.out.println(s);
        }
    }
}
