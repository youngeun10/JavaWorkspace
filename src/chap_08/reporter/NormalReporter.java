package chap_08.reporter;

public class NormalReporter implements Reporterable {
    @Override
    public void report() {
        System.out.println("일반 화재 신고를 진행합니다.");
    }
}
