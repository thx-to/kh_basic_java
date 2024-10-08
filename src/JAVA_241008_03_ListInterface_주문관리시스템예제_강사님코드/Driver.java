package JAVA_241008_03_ListInterface_주문관리시스템예제_강사님코드;

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
                case 2 :
                    System.out.print("제거할 제품의 이름을 입력하세요 : ");
                case 3 :
                    System.out.print("제품 목록 : ");
                case 4 :
                    System.out.print("상세 정보를 볼 제품의 이름을 입력하세요 : ");
                case 5 :
                    System.out.print("세율을 입력하세요 예 ) 0.1 : ");
                case 6 :
                    System.out.print("프로그램을 종료합니다.");
            }
        }

    }
}
