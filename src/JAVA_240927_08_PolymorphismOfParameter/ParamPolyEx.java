package JAVA_240927_08_PolymorphismOfParameter;
// 상속 관계를 이용해 매개변수에 자식 타입의 객체를 대입함


public class ParamPolyEx {
    public static void main(String[] args) {

        // 바이어라는 객체를 하나 만들고
        Buyer buyer = new Buyer();

        // 매개변수로 TV, Computer, PlayStation이 올 수 있음
        // 부모 클래스의 참조변수로 자식클래스의 인스턴스가 옴
        buyer.buy(new PlayStation()); // 풀어 쓰면 PlayStation playstation = new Playstation(); buyer.buy(playstation);
        buyer.buy(new TV()); // 풀어 쓰면 TV tv = new TV(); buyer.buy(tv);
        buyer.buy(new Computer()); // 풀어 쓰면 Computer computer = new Computer(); buyer.buy(computer);

        buyer.viewInfo();

    }
}


class Product {

    int price;
    int bonusPoint;

}


class TV extends Product {

    // 기본 생성자 만들기
    public TV() {

        this.price = 100;
        this.bonusPoint = 10;

    }
}


class Computer extends Product {

    // 기본 생성자 만들기
    public Computer() {

        this.price = 200;
        this.bonusPoint = 20;

    }
}


class PlayStation extends Product {

    // 기본 생성자 만들기
    public PlayStation() {

        this.price = 120;
        this.bonusPoint = 12;

    }
}


// 구매자
class Buyer {

    int money = 1000;
    int bonusPoint = 0;

    // 물건을 사게 하는, buy라는 메소드 구현
    // Product는 제품(부모 클래스)에 대한 참조 변수
    void buy(Product p) {

        // 제품을 구매할때마다 돈은 깎이고
        money -= p.price;

        // 보너스포인트는 올라감
        bonusPoint += p.bonusPoint;

    }


    void viewInfo() {

        System.out.println("잔액 : " + money + "원");
        System.out.println("포인트 : " + bonusPoint + "점");

    }

}