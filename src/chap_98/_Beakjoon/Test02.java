package chap_98._Beakjoon;

import java.util.*;

import static chap_98._Beakjoon.Test02.solution;

public class Test02 {
    public static int solution(String[] kor, String[] usa, String[] incs) {

        int DAY = incs.length;

        Integer[][] korArr = new Integer[kor.length][DAY];
        Integer[][] usaArr = new Integer[usa.length][DAY];
        Map<String, Integer> kMap = new HashMap<>();
        Map<String, Integer> uMap = new HashMap<>();

        for (int i = 0; i < korArr.length; i++) {
            Arrays.fill(korArr[i], 0);
            kMap.put(kor[i], i);
        }
        for (int i = 0; i < usaArr.length; i++) {
            Arrays.fill(usaArr[i], 0);
            uMap.put(usa[i], i);
        }

        for (int i = 0; i < incs.length; i++) {
            String[] tmp = incs[i].split(" ");
            for (String t: tmp) {
                if (kMap.containsKey(t)) korArr[kMap.get(t)][i] = 1;
                if (uMap.containsKey(t)) usaArr[uMap.get(t)][i] = 1;
            }
        }

        int answer = 0;
        for (int i = 0; i < korArr.length; i++) {
            for (int j = 0; j < usaArr.length; j++) {
                Integer[] tmp = new Integer[DAY];
                for (int k = 0; k < DAY; k++) {
                    tmp[k] = korArr[i][k] + usaArr[j][k];
                }
                answer = Math.max(answer, Collections.frequency(Arrays.asList(tmp), 2));
            }
        }

        return answer;
    }


    public static void main(String[] args) {
        String[] k1 = {"AAA", "BCD", "AAAAA", "ZY"};
        String[] k2 = {"CCC", "BCDF"};
        String[] u1 = {"AB", "AA", "TTTT"};
        String[] u2 = {"XXXX"};
        String[] i1 = {"AB BCD AA AAA TTTT AAAAA", "BCD AA", "AB AAA TTTT BCD", "AA AAAAA AB", "AAA AB BCD"};
        String[] i2 = {"BCDF CCC", "XXXX"};

        System.out.println(solution(k1, u1, i1));
    }

}
