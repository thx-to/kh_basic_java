package 강의_241002_02_코코아톡;

import java.util.Scanner;

public class CocoaMain {

    public static void main(String[] args) {

        CocoaTok cocoaTok = new CocoaTok("PHAM");
        cocoaTok.writeMsg("오늘 날씨가 갑자기 쌀쌀해졌어. 건강하게 활동 잘해🦦");

        // adapter 지역변수 초기값을 null로 넣어줌
        // 어떤 값이 올지 모르기 때문에 null
        // 상수가 아니고 변수이기 때문에 값이 1, 2, 3으로 업데이트 가능
        // 초기값 : 문자열은 "", 정수는 0, 참조변수인 경우에는 null
        NetworkAdapter adapter = null;

        Scanner sc = new Scanner(System.in);

        System.out.print("메시지를 전송할 네트워크를 선택하세요. [1] Wi-Fi [2] 5G [3] LTE : ");
        int sel = sc.nextInt();

        switch(sel) {
            case 1 :
                adapter = new WiFi();
                break;
            case 2 :
                adapter = new FiveG();
                break;
            case 3 :
                adapter = new Lte();
                break;
            default :
                System.out.println("연결 가능한 네트워크가 없습니다.");
                break;
        }

        // adapter를 사용해
        // 지역변수는 초기화를 안하면 초기값이 안들어감
        // 방어 코드, not null일 때만 전송
        // if문(if (adapter != null))을 빼면 null point exception(내가 참조하는 곳에 값이 없는 것)발생
        // adapter에는 실제 객체가 대입되어야 하는데, 객체가 대입되지 않고 넘어갔기 때문에 null point exception 발생
        if (adapter != null) cocoaTok.send(adapter);
    }
}
