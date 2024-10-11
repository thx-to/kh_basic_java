package JAVA_241008_03_주문관리시스템예제_강사님코드;

import java.math.BigDecimal;
import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Order order = new Order();
        while (true) {
            System.out.println("\n==== 주문 관리 시스템 ====");
            System.out.println("[1] 제품 추가");
            System.out.println("[2] 제품 제거");
            System.out.println("[3] 제품 목록 보기");
            System.out.println("[4] 제품 상세 보기");
            System.out.println("[5] 최종 가격 계산 (세금 포함)");
            System.out.println("[6] 프로그램 종료");
            System.out.print("메뉴를 선택하세요: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1 :
                    System.out.print("추가할 제품의 이름을 입력하세요 : ");
                    String name = sc.nextLine();
                    System.out.print("추가할 제품의 가격을 입력하세요 : ");
                    BigDecimal price = sc.nextBigDecimal();
                    order.addItem(new Product(name, price));
                    System.out.println(name + " 제품이 추가되었습니다.");
                    break;
                case 2 :
                    // name이라는 변수가 위에 지역변수로 들어가서 이쪽 이름은 remove로 바꿔줌
                    // name을 전역 변수로 선언하고 사용하는 방법도 있음
                    System.out.print("제거할 제품의 이름을 입력하세요 : ");
                    String remove = sc.nextLine();
                    if (order.removeItem(remove)) {
                        System.out.println(remove + " 제품이 제거되었습니다.");
                    } else {
                        System.out.println(remove + " 제품을 찾을 수 없습니다.");
                    }
                    break;
                case 3 :
                    System.out.println("---- 제품 목록 ----");
                    for (Product e : order.getProducts()) {
                        System.out.println(e.getName() + " : " + e.getPrice() + "원");
                    }
                    break;
                case 4 :
                    System.out.print("상세 정보를 볼 제품의 이름을 입력하세요 : ");
                    String find = sc.nextLine();
                    Product product = order.getItem(find);
                    System.out.println(product.getName() + " : " + product.getPrice() + "원");
                    break;
                case 5 :
                    System.out.print("세율을 입력하세요 예 ) 0.1 : ");
                    BigDecimal taxRate = new BigDecimal(sc.nextLine());
                    // 실제 final 가격에 세금을 더해줘서 결과를 만들어냄
                    BigDecimal finalPrice = order.calculateFinalPrice(taxRate);
                    System.out.println("최종 가격 (세금 포함) : " + finalPrice);
                    break;
                case 6 :
                    System.out.print("프로그램을 종료합니다.");
                    // 여기서 끝내기
                    return;

                default :
                    System.out.println("잘못된 요청입니다. 다시 선택하세요.");

            }
        }

    }
}
