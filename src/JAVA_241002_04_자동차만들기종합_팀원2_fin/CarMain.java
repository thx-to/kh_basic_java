package JAVA_241002_04_자동차만들기종합_팀원2_fin;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CarMain {
    public static void main(String[] args) {

        DecimalFormat df = new DecimalFormat("#,###");
        Scanner sc = new Scanner(System.in);
        SportsCar sportsCar = new SportsCar("Ferrari");
        PassengerCar passengerCar = new PassengerCar("GV80");
        Bus bmwXBus = new Bus("관광버스");

        do {

            System.out.print("이동 지역 선택 [1]부산 [2]대전 [3]강릉 [4]광주 : ");
            int area = sc.nextInt();
            System.out.print("이동 할 승객 수 입력 : ");
            int nop = sc.nextInt();
            System.out.print("이동 할 차량 선택 [1]스포츠카 [2]승용차 [3]버스 : ");
            int carType = sc.nextInt();
            System.out.print("부가 기능 [1]ON [2]OFF : ");
            int add_Ons = sc.nextInt();
            System.out.print("날씨 [1]맑음 [2]비 [3]눈 : ");
            int weather = sc.nextInt();
            System.out.println();

            if (area >= 1 && area <= 4 && nop > 0 && nop < 100 && carType >= 1 && carType <= 3 && add_Ons >= 1 && add_Ons <= 2 && weather >= 1 && weather <= 3) {
                if (carType == 1) {
                    System.out.println("========== " + sportsCar.name + " ==========");
                    System.out.println("총 비용 : " + df.format((long)(sportsCar.totalPrice(nop, area, add_Ons))) + "원");
                    System.out.println("총 주유 횟수 : " + (long) sportsCar.totalOilCnt(nop, area, add_Ons) + "회");
                    System.out.println("총 이동 시간 : " + (long) (sportsCar.totalDistanceTime(nop, area, weather, add_Ons) / 60) + "시간" + (long) (sportsCar.totalDistanceTime(nop, area, weather, add_Ons) % 60) + "분");
                }
                if (carType == 2) {
                    System.out.println("========== " + passengerCar.name + " ==========");
                    System.out.println("총 비용 : " + df.format((long)(passengerCar.totalPrice(nop, area, add_Ons))) + "원");
                    System.out.println("총 주유 횟수 : " + (long) passengerCar.totalOilCnt(nop, area, add_Ons) + "회");
                    System.out.println("총 이동 시간 : " + (long) (passengerCar.totalDistanceTime(nop, area, weather, add_Ons) / 60) + "시간" + (long) (passengerCar.totalDistanceTime(nop, area, weather, add_Ons) % 60) + "분");
                }
                if (carType == 3) {
                    System.out.println("========== " + bmwXBus.name + " ==========");
                    System.out.println("총 비용 : " + df.format((long)(bmwXBus.totalPrice(nop, area, add_Ons))) + "원");
                    System.out.println("총 주유 횟수 : " + (long) bmwXBus.totalOilCnt(nop, area, add_Ons) + "회");
                    System.out.println("총 이동 시간 : " + (long) (bmwXBus.totalDistanceTime(nop, area, weather, add_Ons) / 60) + "시간" + (long) (bmwXBus.totalDistanceTime(nop, area, weather, add_Ons) % 60) + "분");
                }break;
            } else {
                if (area < 1 || area > 4) System.out.println("이동 지역을 잘못입력하셨습니다.");
                else if (nop < 0 || nop > 100) System.out.println("이동 승객 수를 잘못입력하셨습니다.");
                else if (carType < 1 || carType > 3) System.out.println("이동 차량 선택을 잘못입력하셨습니다.");
                else if (add_Ons < 1 || add_Ons > 2) System.out.println("부가 기능 선택을 잘못입력하셨습니다.");
                else if (weather < 1 || weather > 3) System.out.println("날씨 선택을 잘못입력하셨습니다.");
            }
            System.out.println("=========================");
        } while (true);
    }
}
