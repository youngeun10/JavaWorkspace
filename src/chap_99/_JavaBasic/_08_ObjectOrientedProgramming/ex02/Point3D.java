package chap_99._JavaBasic._08_ObjectOrientedProgramming.ex02;

public class Point3D extends Point{
    int z;

    Point3D(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }

    String getLocation() {
        return super.getLocation() + ", z=" + z;
    }
}
