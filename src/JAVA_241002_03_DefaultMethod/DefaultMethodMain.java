package JAVA_241002_03_DefaultMethod;
// 인터페이스의 모든 문법과 디폴트메소드에 대해서 학습

import java.util.Scanner;

public class DefaultMethodMain {
    public static void main(String[] args) {

        RemoteControl rc;

        Scanner sc = new Scanner(System.in);

        System.out.print("제품을 선택하세요. [1] TV [2] Audio : ");
        int sel = sc.nextInt();

        if(sel == 1) {
            rc = new Television();
            rc.turnON();
            rc.setVolume(20);
            RemoteControl.changeBattery();
            rc.setMute(true);
        } else {
            rc = new Audio();
            rc.turnON();
            rc.setVolume(102);
            rc.setMute(true);
        }

        // 직접 구현부를 넣어 메소드 오버라이딩을 해도 됨
        // 익명의 클래스(선언과 동시에 객체 생성)
        // 그 자체로 구현과 인스턴스화가 결합
        // 1회용 클래스를 한 번 만드는 방법
        RemoteControl rc2 = new RemoteControl() {

            int volume;

            @Override
            public void turnON() {
                System.out.println("PS의 전원을 켭니다.");
            }

            @Override
            public void turnOFF() {
                System.out.println("PS의 전원을 끕니다.");
            }

            @Override
            public void setVolume(int volume) {
                if (volume > RemoteControl.MAX_VOLUME) {
                    this.volume = RemoteControl.MAX_VOLUME;
                } else if (volume < RemoteControl.MIN_VOLUME) {
                    this.volume = RemoteControl.MIN_VOLUME;
                } else {
                    this.volume = volume;
                }

            }

        };

    }

}
