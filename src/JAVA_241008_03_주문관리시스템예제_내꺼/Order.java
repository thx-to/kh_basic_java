package JAVA_241008_03_주문관리시스템예제_내꺼;

import java.util.ArrayList;
import java.util.List;

// 2. Order 클래스 생성 및 클래스 정의
public class Order {

    // 모든 Order 객체가 가질 멤버 변수 정의
    // 1. products : Product 객체를 저장하는 ArrayList
    // 2. total : 각 제품 가격의 합계를 BigDecimal로 저장하는 변수
    List<String> products = new ArrayList<>();
    int total;

    // 입력값이 없는 생성자를 작성하여 ArrayList와 BigDecimal을 적절히 초기화
    public Order() {
        this.products = products;
        this.total = 0;
    }

    // Order 객체가 수행해야 할 아래의 메소드 작성
    // 1. addItem : Product를 입력으로 받아 ArrayList와 total을 업데이트하는 메소드
    // 2. getItem : 사용자가 제품 이름을 입력하면 Order 내에서 해당 이름과 일치하는 Product를 찾아 반환하는 메소드
    // 제품을 찾으면 해당 제품 반환, 제품을 찾지 못하면 null 반환
    // 여러 제품이 같은 이름을 가질 경우 첫번째로 찾은 제품 반환
    // 문자열 비교에 == 연산자 대신 Java API를 참색하여 두 문자열이 같은지를 비교하는 적절한 메소드를 찾아 사용
    // 3. removeItem : 제품 이름을 입력받아 ArrayList에서 해당 이름의 제품을 제거하고 total을 업데이트하는 메소드
    // 이름이 일치하는 제품을 찾으면 제거 후 true 반환, 찾지 못하면 false 반환
    // 여러 제품이 같은 이름을 가질 경우 첫번째로 찾은 제품 제거
    // 4. calculateFinalPrice : 판매세를 저장하는 BigDecimal을 입력으로 받아 판매세가 적용된 Order의 최종 가격을 계산하는 메소드
    // 이 메소드는 계산이 끝나면 BigDecimal을 반환
    // 판매세 적용 후 소숫점 이하 자릿수 발생 시 가장 가까운 센트로 내림하여 반올림? (소숫점 2자리만 남기기)

    //public void addItem {
    //    products.add(this.products);
    //    total += Product.this.price();
    }

    //public void getItem {
    //    for (String e : products) {
            //if String
    //    }
    //}



//}
