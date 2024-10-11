package JAVA_241011_02_ThreadStop;
// 스레드의 안전한 종료 : 원래는 stop() 메소드 존재, 현재는 사용 중지
// 대체 방법으로는 stop 플래그 사용 또는 interrupt() 사용

public class ThreadStopEx {
    public static void main(String[] args) throws InterruptedException {


        // stop 플래그 사용
        RunThread runThread = new RunThread();
        runThread.start();

        // 현재 메인 스레드가 sleep 상태가 됨
        // 1000 밀리세컨드 = 1초
        Thread.sleep(1000);
        runThread.setStop(true);


        // interrupt() 사용
        InterruptThread interruptThread = new InterruptThread();
        interruptThread.start();

        Thread.sleep(1000);
        interruptThread.interrupt();

    }
}

// stop 플래그를 사용하는 방식
class RunThread extends Thread {

    // stop 플래그 설정
    private boolean stop;

    // generate로 setter 자동 생성
    public void setStop(boolean stop) {
        this.stop = stop;
    }

    // run 메소드가 끝나면 실행 종료되게끔 만듦
    // stop이라는 외부 시그널에서 죽여버림
    @Override
    public void run() {

        // stop이 아니면 반복
        while (!stop) {
            System.out.println("Thread 실행 중.....");
        }
        System.out.println("자원 정리");
        System.out.println("실행 종료");

    }
}


// interrupt()를 사용하는 방식
// 예외 발생시 catch구문으로 떨어짐
class InterruptThread extends Thread {

    @Override
    public void run() {
        try {
            while (true) {
                System.out.println("Thread 실행 중.....");
                Thread.sleep(1);
                }
        } catch(InterruptedException e) {
                System.out.println(e + "예외 발생!");
            }
            System.out.println("자원 정리");
            System.out.println("실행 종료");
        }
    }
