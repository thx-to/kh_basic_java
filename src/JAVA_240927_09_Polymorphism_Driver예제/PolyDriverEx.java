package JAVA_240927_09_Polymorphism_Driver예제;

import java.util.Scanner;

public class PolyDriverEx {
    public static void main(String[] args) {

        Driver driver = new Driver("PHAM");

        Scanner sc = new Scanner(System.in);
        System.out.print("운전하고 싶은 차 선택 [1] 스포츠카 [2] 버스 [3] 택시 : ");
        int sel = sc.nextInt();

        switch (sel) {
            case 1 : driver.drive(new SportsCar()); break;
            case 2 : driver.drive(new Bus()); break;
            case 3 : driver.drive(new Taxi()); break;
            default : System.out.println("선택한 차가 준비되지 않았습니다.");

        }
    }
}


class Driver {

    String name;
    Driver(String name) {

        this.name = name;

    }

    void drive(Vehicle v) {

        System.out.print(name + "의 ");
        v.run();

    }

}


class Vehicle {

    void run() {

        System.out.println("탈것이 달립니다.");

    }

}


class SportsCar extends Vehicle {

    @Override
    void run() {

        System.out.println("스포츠카가 달립니다.");

    }

}


class Bus extends Vehicle {

    @Override
    void run() {

        System.out.println("버스가 달립니다.");

    }

}


class Taxi extends Vehicle {

    @Override
    void run() {

        System.out.println("택시가 달립니다.");

    }
}