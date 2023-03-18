package chap_08.camera;

import chap_08.detector.Detectable;
import chap_08.reporter.Reporterable;

public class SpeedCam extends  Camera implements Detectable, Reporterable {

    private Detectable detector;
    private Reporterable reporter;

    public void setDetector(Detectable detector) {
        this.detector = detector;
    }

    public void setReporter(Reporterable reporter) {
        this.reporter = reporter;
    }

    @Override
    public void showMainFeature() {
        System.out.println("속도 측정, 번호 인식");
    }

    @Override
    public void detect() {
        this.detector.detect();
    }

    @Override
    public void report() {
        this.reporter.report();
    }
}
