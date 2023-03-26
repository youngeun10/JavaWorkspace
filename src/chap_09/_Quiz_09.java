package chap_09;

import java.util.ArrayList;
import java.util.Iterator;

public class _Quiz_09 {
    public static void main(String[] args) {
        ArrayList<Student> std = new ArrayList<>();

        std.add(new Student("유재석", "파이썬"));
        std.add(new Student("박명수", "자바"));
        std.add(new Student("김종국", "자바"));
        std.add(new Student("조세호", "C"));
        std.add(new Student("서장훈", "파이썬"));

        System.out.println("자바 자격증을 보유한 학생 ");
        System.out.println("------------------------------");

        Iterator<Student> itstd = std.iterator();
        while (itstd.hasNext()) {
            Student tmpStd = itstd.next();
            if (tmpStd.license.equals("자바")) {
                System.out.println(tmpStd.name);
            }
        }
    }
}

class Student {
    public String name;
    public  String license;

    public Student(String name, String license) {
        this.name = name;
        this.license = license;
    }
}
