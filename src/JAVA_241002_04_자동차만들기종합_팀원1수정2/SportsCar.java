package JAVA_241002_04_자동차만들기종합_팀원1수정2;

import java.util.Scanner;

public class SportsCar extends Vehicle {
    public SportsCar(String vehicleType, int mileage, int seat, double speed, int fuelTank) {
        super(vehicleType, 8, 2, 250, 30);
    }

    // 메서드 오버라이드
    @Override
    void drive() {
        Scanner sc = new Scanner(System.in);

        System.out.print("이동 지역 선택 [1]부산 [2]대전 [3]강릉 [4]광주 : ");
        int sel_location = sc.nextInt();
        double distance = DESTINATION_DIST[sel_location]; // 선택된 목적지의 거리
        double fuelConsumption = distance / mileage; // 1번 편도당 소모되는 연료 양
        //디버깅용 로그 따기. 추후에 지워야함. 일단 부산 선택시 50이 나오는거 봐서.. 400/8 은 정상 작동.
        System.out.println((int)distance + "km 가는데, 1회 기준으로 소모되는 연료 양은 " + fuelConsumption);

        System.out.print("부가 기능 [1]ON [2]OFF : ");
        int sel_option = sc.nextInt();
        if (sel_option == 1) { // 옵션이 1 = 부가기능을 킨다
            speed *= 1.2; // 속도 1.2배
        }

        System.out.print("이동할 승객 수 입력 : ");
        int sel_passenger_num = sc.nextInt();

        System.out.print("날씨 [1]맑음 [2]비 [3]눈 : ");
        int sel_weather = sc.nextInt();
        double weather_factor = 0;

        switch (sel_weather) {
            case 1 :
                weather_factor = 1;
                break;
            case 2 :
                weather_factor = 1.2;
                break;
            case 3 :
                weather_factor = 1.4;
                break;
            default :
                System.out.println("날씨를 다시 입력해 주세요.");
        }

        // 총 주유횟수 = (인원수 / 해당 차량의 태울 수 있는 최대수) * 거리 / (연비 * 연료탱크); Math.ceil 소숫점 올려버림
        //double count = Math.ceil((double)(sel_passenger_num / seat) * distance / (mileage * fuelTank));

        double count = (distance/mileage)/fuelTank; // 총주유
        if ((distance/mileage)%fuelTank >= 1) count += 1;

        // 총 이동 횟수
        //double totalMove = (sel_passenger_num / seat) + (sel_passenger_num / sel_passenger_num);

        double totalMove = sel_passenger_num/seat; // 총이동
        if (sel_passenger_num/seat >= 1) totalMove += 1;

        // 총 주유 비용
        //double totalFuelCost = Math.ceil((double)(sel_passenger_num / 2) * distance / mileage);
        //double totalCost = totalFuelCost * FUEL_PRICE;
        double totalFuelCost = FUEL_PRICE * count * fuelTank; //총주유

        double hour = weather_factor * ((distance * (double)(sel_passenger_num / 2)) / speed);
        double minute = hour * 60;
        double adjusted_hour = minute / 60;
        int intAdjustedValue = (int)adjusted_hour;  //난잡하지만 정수 변환을 이런식으로 처리.
        double adjusted_min = minute % 60;

        // 기본편도
        double def1hour = distance / speed;
        double def1minute = (distance % speed) * 60;

        //날씨편도
        double def2hour = distance / (weather_factor * speed);
        double def2minute = (distance % (weather_factor * speed)) * 60;

        System.out.println("=====" + vehicleType + "=====");
        System.out.println("좌석 수 : " + (int)seat + "개");
        System.out.println("총 이동 횟수 : " + (int)totalMove + "번");
        System.out.println("총 비용 : " + (int)totalFuelCost + "원");
        System.out.println("총 주유 횟수 : " + (int)count + "회");
        System.out.println("기본 편도 1회 이동 시간 : " + (int)def1hour + "시간" + (int)def1minute + "분");
        //System.out.println("날씨 편도 1회 이동 시간 : ") + (int)def2hour + "시간" + (int)def2minute + "분");
        System.out.println("총 이동 시간 : " + intAdjustedValue + "시간 " + (int)adjusted_min + "분");
    }
}
