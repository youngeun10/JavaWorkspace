package chap_04;

public class _04_SwitchCase {
    public static void main(String[] args) {
        // Switch Case

        // 석차에 따른 장학금 지급
        // 1등 : 전액 장학금
        // 2등 : 반액 장학금
        // 3등 : 반액 장학금
        // 그 외 : 장학금 대상 아님

        // If Else 문을 이용 (여러 조건 또는 명확한 범위가 주어질 때 If문 사용)
        int ranking = 2;        // 등수
        if (ranking == 1) {
            System.out.println("전액 장학금");
        } else if (ranking == 2 || ranking == 3) {
            System.out.println("반액 장학금");
        } else {
            System.out.println("장학금 대상 아님");
        }
        System.out.println("조회 완료 #1\n");

        // Switch Case 문을 이용 (명확한 케이스가 있는 경우 사용)
        /*switch (expression) {
            case A: ... 수행할 명령
                    break;
            case B: ... 수행할 명령
                break;
            case C: ... 수행할 명령
                break;
            default: ... 수행할 명령
        }*/
        ranking = 4;
        switch (ranking) {
            case 1:
                System.out.println("전액 장학금");
                break;
            case 2:
            case 3:
                System.out.println("반액 장학금");
                break;
            default:
                System.out.println("장학금 대상 아님");
        }
        System.out.println("조회 완료 #2\n");

        // 중고 상품의 등급에 따른 가격 책정 (1급: 최상, 4급: 최하)
        int grade = 1;      // 등급
        int price = 7000;   // 기본 가격
        switch (grade) {
            case 1:
                price += 1000;
            case 2:
                price += 1000;
            case 3:
                price += 1000;
                break;
        }
        System.out.println(grade + "등급 제품의 가격 : " + price + "원");

        // 여러 조건 또는 명확한 범위가 주어질 때는 If문, 명확한 값이 나올 때는 switch문을 사용한다.
    }
}
