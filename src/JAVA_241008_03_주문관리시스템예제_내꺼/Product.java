package JAVA_241008_03_주문관리시스템예제_내꺼;

// 1. Product 클래스 생성 및 클래스 정의
public class Product {

    // 모든 Product 객체가 가질 멤버 변수 정의
    // 1. name : 제품의 이름을 저장하는 변수
    // 2. price : 제품 가격을 BigDecimal로 저장하는 변수
    String name;
    int price;


    // 두 개의 입력을 받는 생성자
    // 1. 제품의 이름을 나타내는 문자열
    // 2. 제품의 가격을 나타내는 문자열
    // generate로 자동 생성함
    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    // Product 객체가 수행해야 할 메소드 작성
    // 1. getName() : 제품의 이름을 반환하는 메소드
    // 2. getPrice() : 제품의 가격을 BigDecimal로 반환하는 메소드
    // generate로 자동 생성함
    public String getName() {
        return this.name;
    }
    //public BigDecimal getPrice() {
        //BigDecimal price = new BigDecimal(this.price);
        //return this.price;
    //}
}
