package chap_09;

import java.util.*;

public class _08_Iterator {
    public static void main(String[] args) {
        // 이터레이터 : 컬렉션 프레임워크에서 배운 ArrayList, LinkedList를 순회하는 것
        List<String> list = new ArrayList<>();
        list.add("유재석");
        list.add("(알 수 없음)");
        list.add("김종국");
        list.add("(알 수 없음)");
        list.add("강호동");
        list.add("(알 수 없음)");
        list.add("박명수");
        list.add("(알 수 없음)");
        list.add("조세호");

        for (String s: list) {
            System.out.println(s);
        }

        System.out.println("--------------------------------");

        Iterator<String> it = list.iterator();  // list의 맨 앞에 커서 위치
        System.out.println(it.next());
        System.out.println(it.next());
        System.out.println(it.next());
        System.out.println(it.next());

        System.out.println("--------------------------------");

        it = list.iterator();       // 커서를 처음 위치로 이동
        while (it.hasNext()) {      // 다음에 가지고 올 내용이 있는지 확인
            System.out.println(it.next());
        }

        System.out.println("--------------------------------");

        it = list.iterator();       // 커서를 처음 위치로 이동
        while (it.hasNext()) {      // 다음에 가지고 올 내용이 있는지 확인
            String s = it.next();
            if (s.contains("(알 수 없음)")) {
                it.remove();    // 삭제
            }
        }

        it = list.iterator();       // 커서를 처음 위치로 이동
        while (it.hasNext()) {      // 다음에 가지고 올 내용이 있는지 확인
            System.out.println(it.next());
        }

        System.out.println("--------------------------------");

        HashSet<String> set = new HashSet<>();

        set.add("유재석");
        set.add("박명수");

        Iterator<String> itSet = set.iterator();
        while (itSet.hasNext()) {
            System.out.println(itSet.next());
        }

        System.out.println("--------------------------------");

        HashMap<String, Integer> map = new HashMap<>();
        map.put("유재석", 10);
        map.put("박명수", 5);

        // map.iterator() -> map에서는 iterator 적용되지 않음 (key 또는 value를 선택해서 iterator)
        Iterator<String> itMapKey = set.iterator();
        while (itMapKey.hasNext()) {
            System.out.println(itMapKey.next());
        }

        Iterator<Integer>itMapValue = map.values().iterator();
        while (itMapValue.hasNext()) {
            System.out.println(itMapValue.next());
        }

        System.out.println("--------------------------------");

        // entrySet -> key, value가 세트로 옴!
        Iterator<Map.Entry<String, Integer>> itMap = map.entrySet().iterator();
        while (itMap.hasNext()) {
            System.out.println(itMap.next());
        }


    }
}
