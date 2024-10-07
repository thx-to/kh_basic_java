package JAVA_241002_01_InterfaceBasic;
// New - Java Class - Interface 생성
// 클래스 대신 인터페이스로 생성

public interface NetworkAdapter {

    // 인터페이스 만들기
    // 인터페이스에 포함된 메소드는 자동으로 public abstract가 붙는 추상 메소드
    // 완전 추상화이기 때문에
    // 필요한 기능을 목차처럼 나열만 해주면 되고, 구현할 필요가 없음
    // 상속받은 자식클래스에서 구현 필요
    void connect();

}

class WiFi implements NetworkAdapter {

    String company;

    WiFi(String company) {
        this.company = company;
    }

    // 추상화와 상속은 한끗차이
    // 상속이 일어날 때 실체가 있는 부모가 상속을 주면 오버라이딩를 해도 되고 안해도 됨 (일반 상속)
    // 추상 상속이 일어나면 부모가 메소드를 구현하지 않음, 반드시 오버라이딩 해야함(강제조항), 부모가 구현하지 않았기 때문에 완성되지 않음
    // 일반 메소드가 포함되는 순간 다중 상속이 되기 때문에, 다중 상속의 문제점을 피하기 위해 사용하는 자바의 인터페이스에서는 일반 메소드 포함 불가능
    @Override
    public void connect() {
        System.out.println(company + " Wi-Fi에 연결했습니다.");

    }

}

class FiveG implements NetworkAdapter {
    String company;
    FiveG(String company) {
        this.company = company;
    }
    @Override
    public void connect() {
        System.out.println(company + " 5G에 연결했습니다.");
    }
}

class Lte implements NetworkAdapter {
    String company;
    Lte(String company) {
        this.company = company;
    }
    @Override
    public void connect() {
        System.out.println(company + " LTE에 연결했습니다.");


    }
}

