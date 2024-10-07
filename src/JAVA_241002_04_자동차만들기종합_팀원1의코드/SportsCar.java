package JAVA_241002_04_자동차만들기종합_팀원1의코드;

import java.util.Scanner;

public class SportsCar extends Vehicle{
    public SportsCar(String vehicleType, int mileage, int seat, double speed, int fuelTank) {
        super(vehicleType, 8, 2, 250, 30);
    }

    // 메서드 오버라이드
    @Override
    void drive() {
        Scanner sc = new Scanner(System.in);
//        System.out.println("당신의 스포츠 카 이름은? : ");
//        String name = sc.nextLine();

        System.out.println("이동할 지역을 선택하세요 : [1]부산 [2]대전 [3]강릉 [4]광주 : ");
        int sel_location = sc.nextInt();
        double distance = DESTINATION_DIST[sel_location]; // 선택된 목적지의 거리
        double fuelConsumption = distance / mileage; // 1번 편도당 소모되는 연료 양
        //디버깅용 로그 따기. 추후에 지워야함. 일단 부산 선택시 50이 나오는거 봐서.. 400/8 은 정상 작동.
        System.out.println(distance + "에 가는데, 1회 기준으로 걸리는 연료 양은 " + fuelConsumption);

        System.out.println("부가기능을 켜겠습니까? : [1]yes [2]no ");
        int sel_option = sc.nextInt();
        if (sel_option == 1) { // 옵션이 1 = 부가기능을 킨다
            speed *= 1.2; // 속도 1.2배
        }

        System.out.println("탑승할 인원을 기입해주세요 :  ");
        int sel_passenger_num = sc.nextInt();
        // 인원을 넘길 시 한번 더 가야한다.. 이 경우 소수.
        if (sel_passenger_num % 2 != 0) sel_passenger_num += 1;

        // 총 주유횟수 = (인원수 / 해당 차량의 태울 수 있는 최대수) * 거리 / (연비 * 연료탱크); Math.ceil 소숫점 올려버림
        double count = Math.ceil((double)(sel_passenger_num / seat) * distance / (mileage * fuelTank));


        double totalFuelCost = Math.ceil((double)(sel_passenger_num / 2) * distance / mileage);
        double totalCost = totalFuelCost * FUEL_PRICE;

        double hour = ((distance * (double)(sel_passenger_num / 2)) / speed);
        double minute = hour * 60;
        double adjusted_hour = minute / 60;
        int intAdjustedValue = (int)adjusted_hour;  //난잡하지만 정수 변환을 이런식으로 처리.
        double adjusted_min = minute % 60;

        System.out.println("====" + vehicleType + "====");
        System.out.println("총 탑승 인원 (소수의 경우 +1 판정) : " + sel_passenger_num);
        System.out.println("총 비용은 : " + totalCost);
        System.out.println("총 주유 횟수는 : " + count);
        System.out.println("총 이동 시간은 : " + intAdjustedValue + "시간 " + adjusted_min + "분입니다.");
    }
}
