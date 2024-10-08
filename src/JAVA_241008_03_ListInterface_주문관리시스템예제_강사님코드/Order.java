package JAVA_241008_03_ListInterface_주문관리시스템예제_강사님코드;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;

// 2. Order 클래스 생성 및 클래스 정의
public class Order {

    // 모든 Order 객체가 가질 멤버 변수 정의
    // 1. products : Product 객체를 저장하는 ArrayList
    // 2. total : 각 제품 가격의 합계를 BigDecimal로 저장하는 변수
    // ArrayList에 대한 참조 변수를 만듦
    private ArrayList<Product> products;
    private BigDecimal total;

    // 입력값이 없는 생성자를 작성하여 ArrayList와 BigDecimal을 적절히 초기화
    // generate로 자동 생성 후 수정 (매개변수 없애기)
    // 초기값 넣어주기
    // ArrayList의 초기화는 new로 새로 만들어주는 것
    // BigDecimal의 초기화는 0을 넣어주는 것 (매개변수에 "0"을 넣어도 되고, .ZERO 이렇게 붙여줘도 됨)
    // BigDecimal은 참조타입, 자바에서 고정소수점 및 부동소수점 연산의 정확성을 요구할 때 사용됨 / 금융 계산이나 높은 정밀도가 필요한 경우 double이나 float보다 더 안정적으로 사용
    // BigDecimal 객체 생성 : BigDecimal bd = new BigDecimal("숫자");
    // BigDecimal 기본 연산 : BigDecimal sum = bd.add(bd1); / add, substract, multiply, divide
    public Order() {
        this.products = new ArrayList<>();
        this.total = new BigDecimal("0"); // this.total = BigDecimal.ZERO; 이렇게 넣어줘도 됨
    }

    // 기본생성자 샘플로 넣어둠 (참고용)
    /*
    public Order(BigDecimal total, ArrayList<Product> products) {
        this.total = total;
        this.products = products;
    }
    */

    // Order 객체가 수행해야 할 아래의 메소드 작성
    // 1. addItem : Product를 입력으로 받아 ArrayList와 total을 업데이트하는 메소드
    // 제품을 추가해줘야 함 (변수를 Product product로 넣어줌)
    // BigDecimal의 연산, += 대신 =을 써줌
    public void addItem(Product product) {
        products.add(product);
        total = total.add(product.getPrice());
    }

    // 2. getItem : 사용자가 제품 이름을 입력하면 Order 내에서 해당 이름과 일치하는 Product를 찾아 반환하는 메소드
    // 제품을 찾으면 해당 제품 반환, 제품을 찾지 못하면 null 반환
    // 여러 제품이 같은 이름을 가질 경우 첫번째로 찾은 제품 반환
    // 문자열 비교에 == 연산자 대신 Java API를 참색하여 두 문자열이 같은지를 비교하는 적절한 메소드를 찾아 사용
    // 제품의 이름을 입력받아서 해당 제품 찾기 (변수를 String name으로 넣어줌)
    public Product getItem(String name) {
        for (Product e : products) {
            if (e.getName().equals(name)) {
                return e;
            }
        }
        return null;
    }

    // 3. removeItem : 제품 이름을 입력받아 ArrayList에서 해당 이름의 제품을 제거하고 total을 업데이트하는 메소드
    // 이름이 일치하는 제품을 찾으면 제거 후 true 반환, 찾지 못하면 false 반환
    // 여러 제품이 같은 이름을 가질 경우 첫번째로 찾은 제품 제거
    public boolean removeItem(String name) {
        for (Product e : products) {
            if (e.getName().equals(name)) {
                products.remove(e);
                total = total.subtract(e.getPrice());
                return true;
            }
        }
        return false;
    }

    // 4. calculateFinalPrice : 판매세를 저장하는 BigDecimal을 입력으로 받아 판매세가 적용된 Order의 최종 가격을 계산하는 메소드
    // 이 메소드는 계산이 끝나면 BigDecimal을 반환
    // 판매세 적용 후 소숫점 이하 자릿수 발생 시 가장 가까운 센트로 내림하여 반올림? (소숫점 2자리만 남기기)
    // BigDecimal의 taxRate입력받기 ( > 매개변수로 넣어주기)
    public BigDecimal calculateFinalPrice(BigDecimal taxRate) {

        // 주문금액에 세금을 곱해서 세액 만들기
        BigDecimal taxAmount = total.multiply(taxRate);
        BigDecimal finalPrice = total.add(taxAmount);
        return finalPrice.setScale(2, RoundingMode.HALF_UP);

    }

    public ArrayList<Product> getProducts() {
        return products;
    }
}
