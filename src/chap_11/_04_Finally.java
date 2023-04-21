package chap_11;

public class _04_Finally {
    public static void main(String[] args) {
        /*
            finally: try문에서 문제가 발생하든 발생하지 않든 무조건 실행되어야 하는 내용을 기입.

            예외처리 사용 방법 3가지
            1. try + catch(s: 여러 개 가능)
            2. try + catch(s) + finally
            3. try + finally
                → 만약에 try 이 없이 오류나는 구문을 그대로 사용하면 해당 위치에서 프로그램은 바로 종료.
                  finally 가 있으면 무조건 에러가 나도 finally 안에 있는 내용까지 실행되고,
                   마지막에 오류 메시지(e.printStackTrace()) 띄움.

            * try만 쓰는 것은 안됩니다!!!!
        */
        try {
            System.out.println("택시의 문을 연다.");
            throw new Exception("휴무 택시") ;
            //  System.out.println("택시에 탑승한다.");
        } catch (Exception e) {
            System.out.println("!! 문제 발생: " + e.getMessage());
        } finally {
            System.out.println("택시의 문을 닫는다.");
        }

        System.out.println("---------------------------");

        try {
            System.out.println(3 / 0);
        } finally {
            System.out.println("프로그램 정상 종료");
        }

    }
}
