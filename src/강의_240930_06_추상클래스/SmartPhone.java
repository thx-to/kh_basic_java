package 강의_240930_06_추상클래스;

public class SmartPhone extends Phone {

    // 생성자
    public SmartPhone(String name) {
        super(name);
    }

    // 부모 추상 메소드의 구현부
    @Override
    void call() {
        System.out.println("부모의 요청으로 통화 기능을 구현합니다.");
    }

    public void internet() {
        System.out.println("인터넷을 검색합니다.");
    }

}
