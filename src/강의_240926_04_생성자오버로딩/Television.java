package 강의_240926_04_생성자오버로딩;
// 생성자는 클래스 이름과 같고, 반환 타입이 없음 (void 안됨)
// 생성자는 외부에서 접근해야 하기 때문에 일반적으로 public 접근 제한자를 사용
// 싱글톤 객체를 생성할 때는 접근제한자로 private을 사용해 객체 생성을 제한할 수 있음

public class Television {

    // private 접근제한자 : 전원, 채널, 볼륨의 제한 범위를 설정함
    // 아래 setON, setChannel, setVolume에서 세부 범위를 지정
    // 허용 범위를 벗어난 수가 입력되어도 반영되지 않음
    private boolean isON; // 전원 ON/OFF
    private int channel; // 채널 설정
    private int volume; // 볼륨 설정

    // 첫번째 생성자
    // 기본 생성자는 생성자가 없는 경우에 자동생성됨
    public Television() {

        isON = false;
        channel = 10;
        volume = 10;
        System.out.println("매개변수가 없는 생성자 호출");

    }

    // 두번째 생성자 만들어보기
    public Television(boolean isON, int channel, int volume) {

        this.isON = isON;
        this.channel = channel;
        this.volume = volume;
        System.out.println("매개변수가 전부 있는 생성자 호출");

    }

    public void setON(boolean onOff) {

        // 삼항연산자 : 조건식이 참이면 앞, 거짓이면 뒤
        // (조건식) ? true : false
        isON = onOff;
        String onOffStr = (isON) ? "ON" : "OFF"; // 삼항연산자
        System.out.println("TV : " + onOffStr);

    }

    public void setChannel(int cnl) {

        if (cnl >= 1 && cnl <= 999) { // 요 범위를 boolean 값으로 봄
            channel = cnl;
            System.out.println("채널을 " + channel + "번으로 변경합니다.");
        }

    }

   public void setVolume(int vol) {

        if (vol >= 0 && vol <= 100) {
            volume = vol;
            System.out.println("볼륨을 " + volume + "으로 변경합니다.");
        }

   }

   public void getTV() {

        String onOffStr = (isON) ? "ON" : "OFF"; // 삼항연산자
        System.out.println("====== TV 정보 ======");
        System.out.println("전원 : " + onOffStr);
        System.out.println("채널 : " + channel);
        System.out.println("볼륨 : " + volume);

   }



}
