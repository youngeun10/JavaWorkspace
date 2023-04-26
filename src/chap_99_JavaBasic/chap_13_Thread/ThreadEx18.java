package chap_99_JavaBasic.chap_13_Thread;

public class ThreadEx18 {
    public static void main(String[] args) {
        ThreadEx18_1 th1 = new ThreadEx18_1("*");
        ThreadEx18_1 th2 = new ThreadEx18_1("**");
        ThreadEx18_1 th3 = new ThreadEx18_1("***");
        th1.start();
        th2.start();
        th3.start();

        try {
            Thread.sleep(2000);
            th1.suspend();                  // suspend(): 쓰레드를 일시정지 시킴
            Thread.sleep(2000);
            th2.suspend();
            Thread.sleep(3000);
            th1.resume();                   // resume(): suspend()로 인해 일시정지인 상태를 실행대기 상태로 만들어 줌.
            Thread.sleep(3000);
            th1.stop();                     // stop(): 쓰레드를 일시정지 시킴
            th2.stop();
            Thread.sleep(2000);
            th3.stop();
        } catch (InterruptedException e) {

        }
    }
}

class ThreadEx18_1 implements Runnable {
    boolean suspended = false;
    boolean stopped = false;

    Thread th;

    ThreadEx18_1(String name) {
        th = new Thread(this, name);        // Thread(Runnable r, String name)
    }

    public void run() {
        String name = th.getName();

        while(!stopped) {
            if(!suspended) {
                System.out.println(name);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println(name + " - interrupted");
                }
            } else {
                Thread.yield();
            }
        }
        System.out.println(name + " - stopped");
    }

    public void suspend() {
        suspended = true;
        th.interrupt();
        System.out.println(th.getName() + " - interrupt() by suspend()");
    }

    public void stop() {
        stopped = true;
        th.interrupt();
        System.out.println(th.getName() + " - interrupt() by stop()");
    }

    public void resume() { suspended = false; }
    public void start() { th.start(); }
}
