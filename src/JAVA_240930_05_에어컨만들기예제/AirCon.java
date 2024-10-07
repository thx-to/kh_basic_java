package JAVA_240930_05_에어컨만들기예제;

import java.util.Calendar;
import java.util.Scanner;

public class AirCon {

    // 1. 필요한 인스턴스 필드 만들기 (기능 설계)
    boolean isPower; // 전원 ON/OFF 기능
    int setTemp; // 온도 설정 기능 (1도 단위로 설정)
    int curTemp; // 현재 온도 표시 기능
    boolean isCooler; // 냉방기 전원 ON/OFF 기능
    boolean isHeater; // 난방기 전원 ON/OFF 기능
    int windStep; // 바람세기 설정 (1단계 / 2단계 / 3단계)

    // 2. 생성자 만들기
    // 인스턴스의 초기값을 부여
    // 현재 온도를 가져오기 위해 Calendar 클래스를 이용해 지금이 몇월인지를 운영체제로부터 가져옴
    // 미리 정해둔 배열에서 해당 월의 온도값을 가져옴
    public AirCon() {
        final int[] monthTemp = {-5, 3, 10, 15, 22, 28, 32, 30, 24, 16, 8, 1}; // 월별 평균 온도, 임의로 넣음

        // Calendar API 가져오기
        Calendar now = Calendar.getInstance();

        // 배열의 인덱스와 동일해서 -1을 해줄 필요가 없음 (ex 인덱스 0이 1월)
        int month = now.get(Calendar.MONTH);

        // 이번 달(now)의 API를 가져와 위 monthTemp 배열에서 해당 월을 찾아서 가져오기
        curTemp = monthTemp[month];

        // 나머지 값들에 대해 초기값 넣기
        isPower = false; // 전원이 꺼진 상태로 출고
        setTemp = 18; // 초기 설정온도 18도로 임의설정
        isCooler = false; // 냉방기 전원 꺼진 상태로 출고
        isHeater = false; // 난방기 전원 꺼진 상태로 출고
        windStep = 1; // 초기 바람세기 1단계로 임의설정

    }

    // 3. 콘솔 화면에 현재 에어컨 정보 출력하기
    // 온도가 바뀔 때 화면이 출력됨
    public void airConInfo() {

        // 삼항연산자로 출력문자 만들기
        String onOffStr = (isPower) ? "ON" : "OFF"; // isPower가 true면 ON, false면 OFF 출력
        String coolerStr = (isCooler) ? "ON" : "OFF"; // isCooler가 true면 ON, false면 OFF 출력
        String heaterStr = (isHeater) ? "ON" : "OFF"; // isHeater가 true면 ON, false면 OFF 출력

        // 바람세기 출력, 1이면 1단계, 2면 2단계, 3이면 3단계 / final로 단계를 3개로 고정
        final String[] windStr = {"", "1단계", "2단계", "3단계"};

        System.out.println("========== 에어컨 정보 ==========");
        System.out.println("전원 : " + onOffStr);
        System.out.println("현재 온도 : " + curTemp);
        System.out.println("설정 온도 : " + setTemp);
        System.out.println("난방기 : " + heaterStr);
        System.out.println("냉방기 : " + coolerStr);
        System.out.println("바람세기 : " + windStr[windStep]);

    }
    // 4. 에어컨 설정
    // 에어컨이 동작하는 부분 만들기

    public void setAirConState() {

        // 에어컨 ON/OFF 동작 입력을 위한 Scanner 객체 생성
        Scanner sc = new Scanner(System.in);

        // 현재 온도 출력
        System.out.println("현재 온도는 " + curTemp + "도 입니다.");

        // 설정 온도 입력받기
        System.out.print("희망 온도를 설정하세요 : ");
        setTemp = sc.nextInt();

        // 입력한 설정 온도 출력
        System.out.println("설정 온도는 " + setTemp + "도 입니다.");

        // 희망 바람세기 입력받기
        System.out.print("원하시는 바람 세기를 설정하세요(1~3단계) : ");
        windStep = sc.nextInt();

        // 현재온도가 설정온도보다 높은경우 냉방기를 작동하여 실내온도 낮추기
        if (curTemp > setTemp) {
            System.out.println("냉방기를 작동합니다.");

            // 냉방기 ON, 난방기 OFF
            isCooler = true;
            isHeater = false;

        // 현재온도가 설정온도보다 낮은경우 난방기를 작동하여 실내온도 높이기
        } else if (curTemp < setTemp) {
            System.out.println("난방기를 작동합니다.");
            // 냉방기 OFF, 난방기 ON
            isCooler = false;
            isHeater = true;
        } else {
            isCooler = false;
            isHeater = false;
        }

    }

    public void setPower(boolean power) {
        isPower = power;
    }

    public void setSetTemp(int setTemp) {
        this.setTemp = setTemp;
    }

    // 현재온도는 현재 온도에서 입력된 값의 크기만큼 변경 (증감, 누적)
    public void setCurTemp(int n) {
        this.curTemp += n;
    }

    public void setCooler(boolean cooler) {
        isCooler = cooler;
    }

    public void setHeater(boolean heater) {
        isHeater = heater;
    }

    public void setWindStep(int windStep) {
        this.windStep = windStep;
    }

    public boolean isPower() {
        return isPower;
    }

    public int getSetTemp() {
        return setTemp;
    }

    public int getCurTemp() {
        return curTemp;
    }

    public boolean isCooler() {
        return isCooler;
    }

    public boolean isHeater() {
        return isHeater;
    }

    public int getWindStep() {
        return windStep;
    }
}

