package JAVA_241011_01_MultiThreadBasic;
// 멀티스레드 : 하나의 어플리케이션 내에서 동시에 여러 가지 일을 수행하는 것
// 자바는 main() 메소드 호출 시 하나의 스레드가 생성됨
// 멀티스레드가 수행중인 경우 main() 스레드가 종료되더라도 어플리케이션은 종료되지 않음
// 스레드 생성 방법 1) 스레드 클래스 상속 (스레드 클래스 상속시 다른 상속은 받을 수 없음)
// 스레드 생성 방법 2) Runnable 인터페이스를 상속받아 구현
// 스레드 생성 방법 3) 익명의 객체로 만들기
// 스레드 생성 방법 4) 람다식으로 구현

public class ThreadBasicEx {
    public static void main(String[] args) {

        // 스레드를 상속받은 객체 생성
        Thread subThread1 = new CustomThread();

        // Runnable 인터페이스에 대한 참조변수를 가지고 해당하는 객체를 바라봄
        // 작업 내용은 가지고 있지만 실제 스레드 동작은 없음
        // 동작부는 아래 클래스에서 구현했으나 실제 스레드는 아닌 상태 (상속 안받음)
        // 위처럼 실제 스레드를 만들어줘야함
        Runnable runTask = new CustomRunnable();

        // Runnable에 대한 실제 스레드 객체 만들어주기
        // 동작을 만들어줬으니 생성자쪽에 넣어줘야함
        Thread subThread2 = new Thread(runTask);

        // 익명의 객체로 스레드 만들기
        // 익명의 객체로 만들었지만 얘도 인터페이스기 때문에 작업 내용은 만들어주고 스레드 생성
        Runnable task = new Runnable() {
            @Override
            public void run() {

                int sum = 0;
                for (int i = 0; i <= 10; i++) {
                    sum += i;
                    System.out.println(sum);

                }

                //currentThread() : 지금 스레드가 누군지 알려줌
                System.out.println(Thread.currentThread() + "합계 : " + sum);

            }
        };

        Thread subThread3 = new Thread(task);


        // 람다식으로 스레드 만들기
        // 익명의 객체로 만들고 인텔리제이의 제안을 눌러 식 변환
        Runnable task1 = () -> {

            int sum = 0;
            for (int i = 0; i <= 10; i++) {
                sum += i;
                System.out.println(sum);

            }

            //currentThread() : 지금 스레드가 누군지 알려줌
            System.out.println(Thread.currentThread() + "합계 : " + sum);

        };

        Thread subThread4 = new Thread(task1);


        // 이 start는 운영체제에게 요청
        // 내가 스레드를 하나 만들었는데 시작해주세요 (운영체제의 자원을 씀)
        // 운영체제가 개입을 해야 하기 때문에 약간의 텀이 생김
        subThread1.start();

        // Runnable 인터페이스로 한 subThread2 스타트
        subThread2.start();

        // 익명의 객체로 만든 subThread3 스타트
        subThread3.start();

        // 람다식으로 만든 subThread4 스타트
        subThread4.start();

        // 스레드가 아니고 일반 메소드였다면 메소드 값이 먼저 찍히고 아래 문구가 출력됨
        // main()은 스레드 스타트만 시켜주고 끝나버림 (제일 먼저 나옴)
        System.out.println("여기는 메인 스레드가 끝나는 지점입니다.");

    }
}

// Thread 클래스 상속, 다른 상속은 못받음
class CustomThread extends Thread {

    @Override
    // run 내부구간이 thread로 동작되는 구간
    // thread 동작부 구현
    public void run() {

        int sum = 0;
        for (int i = 0; i <= 10; i++) {
            sum += i;
            System.out.println(sum);

        }

        //currentThread() : 지금 스레드가 누군지 알려줌
        System.out.println(Thread.currentThread() + "합계 : " + sum);

    }

}


// Runnable 인터페이스 구현, 다른 상속도 받을 수 있음
// implements로 인터페이스상속, 추상메소드이기때문에 구현해줘야함
class CustomRunnable implements Runnable {


    @Override
    public void run() {

        int sum = 0;
        for (int i = 0; i <= 10; i++) {
            sum += i;
            System.out.println(sum);

        }

        //currentThread() : 지금 스레드가 누군지 알려줌
        System.out.println(Thread.currentThread() + "합계 : " + sum);

    }

}