package JAVA_241008_05_HashMap_커피메뉴만들기예제_내꺼;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CoffeeMain {

    // 객체 안만들기 위해 클래스로 static 클래스를 만들어줌
    // key는 String이고 value는 객체(MenuInfo)
    // 이렇게 하면 key값 하나에 key에 대한 value가 여러개 올 수 있음
    static Map<String, MenuInfo> map = new HashMap<>();

    public static void main(String[] args) {
        makeMenu();
        selectMenu();

    }

    // 첫번째 메소드) 초기메뉴 만들어주기
    static void makeMenu() {

        map.put("Americano", new MenuInfo("Americano", 2000, "Coffee", "기본 커피 입니다."));
        map.put("Espresso", new MenuInfo("Espresso", 2500, "Coffee", "진한 커피 입니다."));
        map.put("Latte", new MenuInfo("Latte", 4000, "Coffee", "우유가 들어 있는 커피 입니다."));
        map.put("ColdBrew", new MenuInfo("ColdBrew", 4500, "Coffee", "연유가 들어 있는 커피 입니다."));
        map.put("GreenTea", new MenuInfo("GreenTea", 4500, "Tea", "녹차 입니다."));
        map.put("BlackTea", new MenuInfo("BlackTea", 4500, "Tea", "홍차 입니다."));
        map.put("MilkTea", new MenuInfo("MilkTea", 4000, "Tea", "우유가 포함된 차 입니다."));
        map.put("PeachAde", new MenuInfo("PeachAde", 5000, "Ade", "복숭아 에이드 입니다."));
        map.put("GreenAde", new MenuInfo("GreenAde", 5000, "Ade", "포도 에이드 입니다."));
        map.put("LemonAde", new MenuInfo("LemonAde", 4500, "Ade", "레몬 에이드입니다."));

    }

    // 두번째 메소드 ) 메뉴 고르기
    static void selectMenu() {

        Scanner sc = new Scanner(System.in);
        String key;

        while (true) {
            System.out.println("메뉴를 선택하세요.");
            System.out.print("[1] 메뉴 보기 [2] 메뉴 조회 [3] 메뉴 추가 [4] 메뉴 삭제 [5] 메뉴 수정 [6] 종료 : ");

            int choice = sc.nextInt();

            switch (choice) {

                case 1 : // 메뉴 보기
                    // keySet을 이용한 반복순회
                    System.out.println("==================== 메뉴 리스트 보기 ====================");
                    for (String e : map.keySet()) {
                        System.out.println("[" + map.get(e).getCategory() + "] " + map.get(e).getName() + " : " + map.get(e).getPrice() + "원, " + map.get(e).getDesc());
                    }
                    System.out.println("=========================================================");
                    break;

                case 2 : // 메뉴 조회
                    // containsKey(key) : 해당 키가 map 내에 존재하는지 확인
                    System.out.print("조회할 메뉴 입력 : ");
                    String key2 = sc.next();

                    if (map.containsKey(key2)) {
                        System.out.println("==================== 선택한 메뉴 보기 ====================");
                        System.out.println("메뉴 : " + map.get(key2).getName());
                        System.out.println("가격 : " + map.get(key2).getPrice());
                        System.out.println("분류 : " + map.get(key2).getCategory());
                        System.out.println("설명 : " + map.get(key2).getDesc());
                        System.out.println("=========================================================");
                    } else {
                        System.out.println("찾는 메뉴(" + key2 + ")가 없습니다.");
                    }
                    break;

                case 3 : // 메뉴 추가
                    // containsKey(key)로 존재 여부 확인 후 없으면 key와 value를 입력받아서 put()
                    System.out.print("추가할 메뉴 입력 : ");
                    String key3 = sc.next();

                    if (map.containsKey(key3)) {
                        System.out.println(key3 + "메뉴가 이미 존재합니다.");
                    } else {
                        System.out.print("메뉴의 가격 입력 : ");
                        int price = sc.nextInt();
                        System.out.print("메뉴의 분류 입력 : ");
                        String category = sc.next();
                        System.out.print("메뉴의 설명 입력 : ");
                        String desc = sc.next();
                        map.put(key3, new MenuInfo(key3, price, category, desc));
                        System.out.println(key3 + " 메뉴가 추가되었습니다.");
                    }
                    break;

                case 4 : // 메뉴 삭제
                    // containsKey(key)로 존재 여부 확인 후 있으면 remove(key)
                    System.out.print("삭제할 메뉴 입력 : ");
                    String key4 = sc.next();

                    if (map.containsKey(key4)) {
                        map.remove(key4);
                        System.out.println(key4 + " 메뉴가 삭제되었습니다.");
                    } else {
                        System.out.println(key4 + " 메뉴가 이미 존재합니다.");
                    }
                    break;

                case 5 : // 메뉴 수정
                    // containsKey(key)로 존재 여부 확인 후 값 변경 후 put()
                    System.out.print("수정할 메뉴 입력 : ");
                    String key5 = sc.next();

                    if (map.containsKey(key5)) {
                        System.out.print("메뉴의 가격 입력 : ");
                        int price = sc.nextInt();
                        System.out.print("메뉴의 분류 입력 : ");
                        String category = sc.next();
                        System.out.print("메뉴의 설명 입력 : ");
                        String desc = sc.next();
                        map.put(key5, new MenuInfo(key5, price, category, desc));
                        System.out.println(key5 + " 메뉴가 수정되었습니다.");
                    } else {
                        System.out.println("찾는 메뉴(" + key5 + ")가 없습니다.");
                    }
                    break;
                case 6 : // 종료
                    System.out.println("종료합니다.");
                    return;
                default :
                    System.out.println("잘못된 입력입니다.");

            }

        }

    }

}
