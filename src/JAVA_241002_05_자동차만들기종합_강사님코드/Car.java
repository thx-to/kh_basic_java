package JAVA_241002_05_자동차만들기종합_강사님코드;

import java.text.DecimalFormat;
import static JAVA_241002_05_자동차만들기종합_강사님코드.Common.FUEL_PRICE;

public abstract class Car {
    protected int maxSpeed; // 최고 속도
    protected int fuelEff; // 연비 (리터당 주행 거리(Km))
    protected int fuelTank; // 연료 탱크 크기
    protected int seatCnt; // 좌석수
    protected String name; // 자동차 이름

    public Car(int maxSpeed, int fuelEff, int fuelTank, int seatCnt, String name) {
        this.maxSpeed = maxSpeed;
        this.fuelEff = fuelEff;
        this.fuelTank = fuelTank;
        this.seatCnt = seatCnt;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // 총 이동 횟수
    // 승객수/좌석수에 나머지가 있으면 +1 (2인승에 3명이면 2번가야함)
    int getMovingCnt(int passCnt) { // 입력값으로 승객 수가 필요
        if(passCnt % seatCnt != 0) return (passCnt / seatCnt) + 1;
        return passCnt / seatCnt;
    }
    // 총 주유 횟수
    // ((거리*이동횟수)/연비)/연료탱크에 나머지가 있으면 +1 (50L필요한데 연료탱크 30L면 2번주유)
    int getRefuelCnt(int dist, int moveCnt) { // 이동 거리와 이동 횟수를 매개 변수로 전달 받음
        if (((dist * moveCnt) / fuelEff) % fuelTank != 0) return (((dist * moveCnt) / fuelEff) / fuelTank) + 1;
        return ((dist * moveCnt) / fuelEff) / fuelTank;
    }
    // 총 이동 비용
    // (거리/연비)*기름값*이동횟수
    String getTotalCost(int dist, int moveCnt) {
        DecimalFormat df = new DecimalFormat("#,###");
        return df.format(((long) dist / fuelEff) * FUEL_PRICE * moveCnt);
    }
    // 총 소요 시간
    // (거리*이동횟수)/속도
    // 시간은 [1]맑음 이면 1배, [2]비 면 1.2배, [3]눈 이면 1.4배 더 걸림
    String getMovingTime(int dist, int moveCnt, int weather) {
        double getTime = (double) dist * moveCnt / maxSpeed;

        switch (weather) {
            case 2: getTime *= 1.2; break;
            case 3: getTime *= 1.4; break;
            default:
        }

        // 시와 분으로 나눠주기 위해 시간에 60을 곱하고, 60으로 나눈 몫이 시간 / 나머지가 분
        int totalMinute = (int) (getTime * 60);
        int hour = totalMinute / 60;
        int minute = totalMinute % 60;
        return String.format("%d시간 %d분", hour, minute);
    }

    // 스포츠카, 승용차, 버스 개별 클래스에서 구현부를 가져올 추상 메소드(부가 기능) 생성
    abstract void setMode(boolean isMode); // 상속 받은 각각의 자동차의 특수 기능

}
