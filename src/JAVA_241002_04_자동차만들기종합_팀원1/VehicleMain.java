package JAVA_241002_04_자동차만들기종합_팀원1;

import java.util.Scanner;

public class VehicleMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("이동에 사용할 차량을 선택하세요 : [1]스포츠카 [2]승용차 [3]버스 : ");
        int sel_vehicle = sc.nextInt();

        switch (sel_vehicle) {
            case 1:
                SportsCar sportsCar = new SportsCar(sc.next(), 8, 2, 250, 30);
                sportsCar.drive();
                break;
            case 2:

                break;
            case 3:
                break;
            default: System.out.println("정보를 잘못 기입하셨습니다.");
        }

    }
}
