package chap_99_JavaBasic;

public class _01_Array {
    public static void main(String[] args) {
        int[] arr = new int[5];

        System.out.println(arr);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i+1;
        }

        int[] tmp = new int[arr.length * 2];
        System.out.println(tmp);
        for (int i = 0; i < arr.length; i++) {
            tmp[i] = arr[i];
        }
        arr = tmp;
        System.out.println("arr : " + arr);
        System.out.println("tmp : " + tmp);

        // System.arraycopy()
        char[] abc = {'A', 'B', 'C', 'D'};
        char[] num = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        System.out.println(abc);
        System.out.println(num);

        // 배열 abc와 num을 붙여서 하나의 배열(result)로 만든다.
        char[] result = new char[abc.length + num.length];
        // 복사할 배열, 복사할 배열의 시작 위치, 복사될 배열, 복사될 배열의 시작위치, 복사할 배열의 사이즈
        System.arraycopy(abc, 1, result, 0, abc.length-1);
        System.arraycopy(num, 0, result, abc.length, num.length);
        System.out.println(result);
    }
}
