package 강의_241002_03_디폴트메소드;

// RemoteControl로부터 인터페이스 상속을 받음
public class Audio implements RemoteControl {

    // 인스턴스 필드 (객체로 만들어진 변수)
    private int volume;

    @Override
    public void turnON() {
        System.out.println("Audio의 전원을 켭니다.");
    }

    @Override
    public void turnOFF() {
        System.out.println("Audio의 전원을 끕니다.");
    }

    @Override
    public void setVolume(int volume) {

        // 입력값이 100(최대값)보다 크면 허용 범위를 벗어남, 최대값 100으로 적용
        // 입력값이 0(최소값)보다 작으면 허용 범위를 벗어남, 최소값 0으로 적용
        if (volume > RemoteControl.MAX_VOLUME) {
            this.volume = RemoteControl.MAX_VOLUME;
        } else if (volume < RemoteControl.MIN_VOLUME) {
            this.volume = RemoteControl.MIN_VOLUME;
        } else {
            this.volume = volume;
        }
    }

    void getInfo() {
        System.out.println("Audio 입니다.");
        System.out.println("현재 볼륨은 " + volume + "입니다.");
    }

    @Override
    public void setMute(boolean mute) {
        if(mute) System.out.println("오디오를 무음처리합니다.");
        else System.out.println("오디오 무음처리를 해제합니다.");
    }
}
