package JAVA_241011_04_DaemonThread;
// 데몬스레드 : 다른 스레드의 작업을 돕는 보조적인 역할을 수행하는 스레드
// 데몬스레드 이외의 스레드가 모두 종료되면 데몬스레드도 강제종료됨

public class DaemonThEx {
    public static void main(String[] args) throws InterruptedException {

        AutoSaveThread autoSaveThread = new AutoSaveThread();

        // 데몬 스레드로 만듦
        autoSaveThread.setDaemon(true);
        autoSaveThread.start();
        Thread.sleep(3000);

    }
}

class AutoSaveThread extends Thread {

    public void save() {
        System.out.println("작업 내용을 저장합니다.");
    }

    @Override
    public void run() {
        while (true) {
            try {
                // 1초마다 '작업내용을저장합니다' 호출
                Thread.sleep(1000);

                // interrupted 걸리면 빠져나옴
            } catch (InterruptedException e) {
                break;
            }
            save();
        }
    }
}