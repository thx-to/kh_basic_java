package JAVA_240926_04_ConstructorOverloading;
// 생성자는 클래스가 객체로 만들어질 때 호출
// 생성자의 주요 사용 용도는 인스턴스 필드를 초기화하기 위한 용도
// 생성자는 만들지 않으면 기본 생성자가 자동으로 생성됨 (매개변수가 없는 빈 생성자, 기본 생성자)
// 용도에 맞게 다양한 생성자를 만들 수 있음 (생성자 오버로딩)

public class OverloadingEx {
    public static void main(String[] args) {

        // 기본적인 TV 생성, 매개변수 없는 첫번쨰 생성자로 내부값으로 초기화 (공장초기화값)
        Television lgTV = new Television();
        lgTV.getTV();

        // 기본적인 TV 생성, 두번째 생성자에 매개변수를 넣음
        Television ssTV = new Television(true, 100, 100);
        ssTV.getTV();

        // 이런식으로 내수용/수출용 TV 초기설정을 다르게 내보낼 수도 있음
        Television localTV = new Television();
        localTV.getTV();
        Television globalTV = new Television(false, 20, 20);
        globalTV.getTV();

        // 가정에서 전원/채널/볼륨 변경시
        globalTV.setON(true);
        globalTV.setChannel(777);
        globalTV.setVolume(25);

    }
}
