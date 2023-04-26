package chap_99_JavaBasic.chap_06_ObjectOrientedProgramming.ex02;

public class Point {
    int x, y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    String getLocation() {
        return "x=" + x + ", y=" + y;
    }
}
