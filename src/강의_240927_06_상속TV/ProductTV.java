package 강의_240927_06_상속TV;

// 아이패드 주문하기 패키지의 MIN_VOLUME, MAX_VOLUME 변수를 가져옴
// 실제 현업에서 이런 고정 설정값은 하나의 파일에 저장해두고 임포트해서 사용

import static 강의_240927_01_아이패드주문하기.Common.*;

public class ProductTV extends ProtoTypeTV {

    String name;

    // 인터넷을 ON/OFF하는 기능 추가
    boolean isInternet;


    // 생성자
    public ProductTV(String name) {

        // 생성자 : 객체(인스턴스)가 생성될 때 자동으로 호출되는 인스턴스 초기화 메소드
        // 부모의 생성자가 기본생성자(매개변수가 아닌 빈 생성자)가 아니고 매개변수가 3개가 아니기 때문에 명시적으로 불러줘야 함
        // 생성자 없이 가면 빈 생성자 자동 생성, 임의로 생성자를 만들면 빈 생성자는 없어짐
        // 내 생성자를 만들기 전에 부모에게서 받은걸 먼저 넣어줘야 함 (생성은 부모가 먼저, 소멸은 자식이 먼저)
        // 불러주지 않았을 때 오류 발생했음 - 오류 자동 수정버튼 이용함 (create constuctor matching super)
        // super() 상속받은 부모의 생성자를 호출하는 메소드
        // super(isPower, channel, volume); // 오류 자동 수정버튼 이용해서 생성한 부모 생성자 호출 메소드, 자식 클래스(ProductTV)에는 다른 값으로 적용하기 위해 비활성화함
        super(false, 10, 10); // 그대로 안받고 매개변수를 넣어서 받아도 됨

        this.name = name;

    }


    void setPower(boolean isPower) {
        this.isPower = isPower;

    }


    void setVolume(int vol) {
        if (vol >= MIN_VOLUME && vol <= MAX_VOLUME) {
            this.volume = vol;
        } else {
            System.out.println("볼륨 설정 범위가 아닙니다.");
        }

    }


    @Override
    public void setChannel(int cnl) {

        if (cnl > 0 && cnl < PRODUCT_CHANNEL_MAX) {
            channel = cnl;
            System.out.println("채널을 " + channel + "번으로 변경합니다.");
        } else {
            System.out.println("채널 설정 범위가 아닙니다.");
        }

    }


    // 오버로딩
    // 인터넷 모드..라고 정의한건 OTT나 유튜브 보는 모드로, 기본 셋탑의 채널 설정이 되지 않는 모드
    public void setChannel(int cnl, boolean isInternet) {
        if (isInternet) {
            System.out.println("인터넷 모드입니다.");
            this.isInternet = true; // this 빼면 isInternet이 안됨? 이름이 같기 때문에
        } else {
            this.isInternet = false; //
            if (cnl > 0 && cnl < PRODUCT_CHANNEL_MAX) {
                channel = cnl;
                System.out.println("채널을 " + channel + "번으로 변경합니다.");
            } else {
                System.out.println("채널 설정 범위가 아닙니다.");
            }
        }

    }


    // 정보 출력
    void tvInfo() {

        System.out.println("이름 : " + name);
        System.out.println("전원 : " + isPower);
        System.out.println("채널 : " + channel);
        System.out.println("볼륨 : " + volume);
        System.out.println("인터넷 모드 : " + isInternet);

    }

}
