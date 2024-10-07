package JAVA_241002_03_DefaultMethod;
// 디폴트 메소드 : 인터페이스에서 구현부가 있는 메소드를 의미

public interface RemoteControl {

    // 인터페이스에 포함된 필드는 모두 상수로 만들어짐 (final static 추가됨)
    // 설계명세에서 볼륨의 설정 범위를 표시하기 위해 사용할 수 있음
    int MAX_VOLUME = 100;
    int MIN_VOLUME = 0;

    // 인터페이스로 생성했기 때문에 자동으로 public abstract가 추가됨
    // 리모컨을 만들기 위해 설계명세에서 기능을 명시 (상속받을 때 무조건 명시해줘야 함, 이 기능은 무조건 있어야 함)
    // 리모컨이 형태를 갖추려면 반드시 필요한 기능들의 리스트 (필요한 기능을 목차처럼 나열)
    public void turnON();
    public void turnOFF();
    public void setVolume(int volume);

    // 디폴트 메소드
    // 다른 메소드는 추상메소드기 때문에 구현부가 필요없음
    // 기존 인터페이스를 확장해서 새로운 기능을 추가
    // 디폴트에 대해서만 내부적으로 다중상속이 발생하지 않도록 처리함
    // 상속받은 클래스에서 오버라이딩을 해도 되고, 하지 않아도 되는 메소드 (예외 조항)
    // 인터페이스에서 선언되지만, 인터페이스에서 사용할 수 없음
    default void setMute(boolean mute) {
        if(mute) System.out.println("무음처리합니다.");
        else System.out.println("무음처리를 해제합니다.");
    }

    // 상속받은 클래스가 알아서 구현해줘야 함
    // 공통사항으로 볼 수 있음
    // 상속이 안되고, 인터페이스로 접근해서 사용 (인터페이스 소속, 인터페이스 생성시 함께 생성됨)
    // static을 붙여버리면 어차피 상속이 안되기 때문에 구현부를 넣어도 아무 문제가 없음
    static void changeBattery() {
        System.out.println("건전지를 교환합니다.");

    }

}


