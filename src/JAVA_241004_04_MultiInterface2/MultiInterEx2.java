package JAVA_241004_04_MultiInterface2;

public class MultiInterEx2 {
    public static void main(String[] args) {

        Customer customer = new Customer();

        // Customer 클래스 타입의 참조 변수를 Buy 인터페이스형에 대입
        Buy buyer = customer;
        buyer.buy();

        // Customer 클래스 타입의 참조 변수를 Sell 인터페이스형에 대입
        Sell seller = customer;
        seller.sell();

        // Customer타입으로 형변환, 원래 자기꺼니까
        Customer customer2 = (Customer) seller;
        customer2.buy();
        customer2.sell();
        customer2.order();

    }
}

interface Buy {
    void buy();

    // 디폴트 메소드는 구현부를 넣어줘야 함
    // order라는 메소드는 Buy와 Sell에서 중복 상속
    default void order() {
        System.out.println("구매 주문");
    }
}

interface Sell {
    void sell();

    // 디폴트 메소드는 구현부를 넣어줘야 함
    // order라는 메소드는 Buy와 Sell에서 중복 상속
    default void order() {
        System.out.println("판매 주문");
    }
}

// Buy, Sell로부터 상속받아 Customer 클래스 생성
// 자바에서는 다중상속에서 모호성을 피하기 위해 인터페이스 사용
// 파이썬에서 두개의 부모에서 같은 내용을 상속받으면 우선순위에 의해 하나는 받고 하나는 버림
// 자바에서는 두개가 내려오면(인터페이스) 누구의 것이 우선인지 모르기 때문에 오버라이딩이 필요함
// 위와 같은 경우에는 Buy 인터페이스, Sell 인터페이스에서 동명의 order 메소드가 내려욤
// 자식이 본인만의 order 메소드 구현을 해줘야 함 (반드시)
// 디폴트 구현부가 있으면 자식이 오버라이딩을 해도 되고 안해도 됨 (구현을 안해주면 부모의 것, 구현을 해주면 자신의 것 사용)
// 다중 상속 등의 문제를 감안하고도 디폴트 메소드가 존재하는 이유 : 상속받은 메소드를 자식 각각에 맞게 구현할 때 기존 인터페이스를 확장하여 새로운 기능을 추가하기 위해
class Customer implements Buy, Sell {

    // generator로 오버라이드 메소드 생성
    @Override
    public void buy() {
        System.out.println("구매하기");
    }

    @Override
    public void order() {
        System.out.println("고객 주문");
    }

    @Override
    public void sell() {
        System.out.println("판매하기");
    }
}