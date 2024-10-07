package JAVA_241002_04_자동차만들기종합_팀원1의코드수정1;

import java.util.Scanner;

public class VehicleMain {

    public static final int[] DESTINATION_DIST = {0, 400, 200, 150, 300};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("이동 지역 선택 [1]부산 [2]대전 [3]강릉 [4]광주 : ");
            int sel_location = sc.nextInt();

            if (sel_location == 1) {
                int distance = DESTINATION_DIST[1];
            } else if (sel_location == 2) {
                int distance = DESTINATION_DIST[2];
            } else if (sel_location == 3) {
                int distance = DESTINATION_DIST[3];
            } else if (sel_location == 4) {
                int distance = DESTINATION_DIST[4];
            } else System.out.println("잘못 입력하셨습니다. 이동하실 지역을 다시 선택하세요.");
        }

/*
        while (true) {
            System.out.println("이동할 승객 수 입력 : ");
            return;
        }

        while (true) {
            System.out.println("이동할 차량 선택 [1]스포츠카 [2]승용차 [3]버스 : ");
            int carType = sc.nextInt();

            switch (carType) {
                case 1 :
                    SportsCar sportsCar = new SportsCar(sc.next(), 8, 2, 250, 30);
                    sportsCar.drive();
                    break;
                case 2 :
                    break;
                case 3 :
                    break;
                default :
                        System.out.println("잘못 입력하셨습니다. 원하시는 차량을 다시 선택하세요.");
            }
        }

*/

    }
}
