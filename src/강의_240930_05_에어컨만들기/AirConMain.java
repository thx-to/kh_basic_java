package 강의_240930_05_에어컨만들기;

import java.util.Scanner;

import static java.lang.Thread.sleep;

public class AirConMain {
    public static void main(String[] args) throws InterruptedException {

        AirCon lgAirCon = new AirCon();
        Scanner sc = new Scanner(System.in);

        // 경과 시간 계산
        int elapsedTime = 0;

        // 온도가 변경될 상황인지 확인하는 조건
        boolean isSetTemp = false;

        // 에어컨 ON/OFF 동작을 위한 입력 받기
        System.out.print("에어컨을 켜시겠습니까? (YES / NO) : ");
        String isOn = sc.next();

        // YES를 입력받으면 에어컨 ON
        if (isOn.equals("YES")) {

            // 에어컨 전원 켜기
            lgAirCon.setPower(true);

            // 온도 및 바람세기 설정
            lgAirCon.setAirConState();

            while (true) { // 현재 온도와 설정 온도가 같아질 때까지 반복
                sleep(1000); // 1초마다
                elapsedTime++; // 경과시간 값이 1씩 증가(main 뒤에 throws InterruptedException 추가, 오류 자동수정)

                // 설정한 바람세기마다 현재 온도가 떨어지는 속도가 다름
                // 1단계 : 60초에 1도씩 떨어짐, 온도 떨어지면서 에어컨 정보 출력
                // 2단계 : 30초에 1도씩 떨어짐, 온도 떨어지면서 에어컨 정보 출력
                // 3단계 : 20초에 1도씩 떨어짐, 온도 떨어지면서 에어컨 정보 출력
                switch(lgAirCon.getWindStep()) {

                    // 60초마다(경과 시간) isSetTemp를 true로 바꿔줌
                    case 1 : if(elapsedTime >= 60) isSetTemp = true; break;

                    // 30초마다(경과 시간) isSetTemp를 true로 바꿔줌
                    case 2 : if(elapsedTime >= 30) isSetTemp = true; break;

                    // 20초마다(경과 시간) isSetTemp를 true로 바꿔줌
                    case 3 : if(elapsedTime >= 20) isSetTemp = true; break;

                    // default는 60초 이상
                    default : if(elapsedTime >= 61) isSetTemp = true;
                }


                // isSetTemp 코드에 들어오는 진입 조건이 위 switch ~ case문
                if(isSetTemp) {

                    // 난방기가 켜져있으면 (설정온도가 현재온도보다 높으면)
                    // 해당 시간마다 1도씩 올려줌
                    if (lgAirCon.isHeater()) lgAirCon.setCurTemp(1);

                    // 냉방기가 켜져있으면 (설정온도가 현재온도보다 낮으면)
                    // 해당 시간마다 1도씩 내려줌
                    if (lgAirCon.isCooler()) lgAirCon.setCurTemp(-1);

                    // 온도가 바뀌었으니 정보 출력
                    lgAirCon.airConInfo();
                    isSetTemp = false;
                    elapsedTime = 0;
                }

                // 현재 온도와 에어컨의 설정 온도가 같으면
                if(lgAirCon.getCurTemp() == lgAirCon.getSetTemp()) {
                    System.out.println("에어컨 실행을 종료합니다.");
                    break;
                }
            }

        }



    }
}
