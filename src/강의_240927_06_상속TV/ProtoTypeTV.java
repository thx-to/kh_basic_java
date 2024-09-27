package 강의_240927_06_상속TV;

// 아이패드 주문하기 패키지의 PROTOTYPE_CHANNEL_MAX 변수를 가져옴
// 실제 현업에서 이런 고정 설정값은 하나의 파일에 저장해두고 임포트해서 사용
import static 강의_240927_01_아이패드주문하기.Common.PROTOTYPE_CHANNEL_MAX;

public class ProtoTypeTV {

    // 기본 설정값
    boolean isPower; // 전원
    int channel; // 채널
    int volume; // 볼륨

    // 생성자 (매개변수가 3개인 생성자)
    // 생성자 없이 가면 빈 생성자 자동 생성, 임의로 생성자를 만들면 빈 생성자는 없어짐
    // 부모(ProtoType) 클래스에는 전원, 채널, 볼륨만 생성자로 정의함
    public ProtoTypeTV(boolean isPower, int channel, int volume) {
        this.isPower = isPower;
        this.channel = channel;
        this.volume = volume;
    }

    public void setChannel(int cnl) {

        if (cnl > 0 && cnl < PROTOTYPE_CHANNEL_MAX) {
            channel = cnl;
            System.out.println("채널을 " + channel + "번으로 변경합니다.");
        } else {
            System.out.println("채널 설정 범위가 아닙니다.");
        }

    }

}
