package JAVA_241011_03_Synchronized;
// 동기화(Synchronized) : 한번에 한개의 스레드만 공유 자원에 접근할 수 있도록 락(Lock)을 걸어 다른 스레드가 진행 중인 작업을 간섭하지 못하도록 하는 것

public class SyncMainEx {
    public static void main(String[] args) {

        ShareThread shareThread = new ShareThread();

        // 익명의 클래스 생성
        Thread thread1 = new Thread(() ->{
            shareThread.setValue(100);
        });

        Thread thread2 = new Thread(()->{
            shareThread.setValue(10);
        });

        // ShareThread를 공유하고 있음
        // 다른 값을 설정했는데도 아래 Synchronized 없이는 같은 값으로 반환됨, 동시성 문제
        thread1.setName("스레드 1");
        thread2.setName("스레드 2");
        thread1.start();
        thread2.start();

    }
}


class ShareThread {

    private int value = 0;

    // generate를 사용해 getter / setter 자동 생성
    public int getValue() {
        return value;
    }

    // synchronized를 찍어주면 값이 보장됨
    public synchronized void setValue(int value) {
        this.value = value;

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(Thread.currentThread().getName() + "의 Value 값은 " + this.value + "입니다.");
    }

}