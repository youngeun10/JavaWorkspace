package chap_98_Beakjoon;

import java.util.*;

public class Test03 {
    public static int[] solution(String[][] folders, String[][] files, String[] selected, String[] excepted) {
        int[] answer = {0, 0};
        HashMap<String, ArrayList<String>> folder = new HashMap<String, ArrayList<String>>();

        for (int i = 0; i < folders.length; i++) {
            ArrayList<String> tmp = new ArrayList<>();
            if (folder.containsKey(folders[i][1])) {
                tmp = folder.get(folders[i][1]);
                tmp.add(folders[i][0]);
                folder.put(folders[i][1], tmp);
            } else {
                tmp.add(folders[i][0]);
                folder.put(folders[i][1], tmp);
            }
        }

        Map<String, Integer> info = new HashMap<>();
        for (int i = 0; i < files.length; i++) {
            ArrayList<String> tmp = new ArrayList<>();
            int size;
            // 계산
            if (files[i][1].endsWith("KB")) {
                size = Integer.parseInt(files[i][1].substring(0, files[i][1].indexOf("K"))) * 1024;
            } else {
                size = Integer.parseInt(files[i][1].substring(0, files[i][1].indexOf("B")));
            }
            if (folder.containsKey(files[i][2])) {
                tmp = folder.get(files[i][2]);
                tmp.add(files[i][0]);
                folder.put(files[i][2], tmp);
                info.put(files[i][0], size);
            } else {
                tmp.add(files[i][0]);
                folder.put(files[i][2], tmp);
                info.put(files[i][0], size);
            }
        }

        ArrayList<String> result = new ArrayList<>();
        PriorityQueue<String> q = new PriorityQueue<>();
        for (String s: selected) q.add(s);
        System.out.println(q.toString());
        while (q.size() > 1) {
            String t = q.remove();
            if (folder.containsKey(t)) {
                for (String s: folder.get(t)) q.add(s);
            } else {
                result.add(t);
            }
        }

        result.remove(excepted);
        System.out.println(result.toString());
        int value = 0;
        for (String s: result) {
            value += info.get(s);
        }

        answer[0] = value;
        answer[1] = result.size();
        System.out.println(answer[0]);
        System.out.println(answer[1]);
        return answer;
    }

    public static void main(String[] args) {
        String[][] fo1 = {{"animal", "root"}, {"fruit", "root"}};
        String[][] fi1 = {{"cat", "1B", "animal"}, {"dog", "2B", "animal"}, {"apple", "4B", "fruit"}};
        String[] s1 = {"animal"};
        String[] e1 = {"apple"};

        String[][] fo2 = {{"food", "root"}, {"meat", "food"}, {"fruit", "food"}, {"animal", "root"}};
        String[][] fi2 = {{"cat", "1B", "animal"}, {"dog", "2B", "animal"}, {"fork", "1KB", "meat"}
                        , {"beef", "8KB", "meat"}, {"apple", "4B", "fruit"}, {"fire", "83B", "root"}};

        System.out.println(solution(fo2, fi2, s1, e1));
    }
}
