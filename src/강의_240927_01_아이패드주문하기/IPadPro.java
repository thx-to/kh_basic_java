package 강의_240927_01_아이패드주문하기;

import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import static java.lang.Thread.sleep;

public class IPadPro {

    // 각각의 제품마다 있어야 하는 것들 : 인스턴스 필드
    private final Scanner sc; // 입력을 받기 위한 스캐너 참조 변수 생성
    private int screen; // 디스플레이 : 11인치, 13인치
    private int color; // 컬러 : 스페이스블랙, 실버
    private int memory; // 용량 : 256GB, 512GB, 1TB, 2TB
    private int network; // 네트워크 : Wi-Fi, Wi-Fi + Cellular
    private int setName; // 각인 옵션 : 각인 추가하기, 각인 없음
    private String name; // 각인 서비스 이름 저장
    private String productDate; // 제품 생산 일자
    String serialNum; // 일련번호
    private static int cnt = 0; // 제품 생산 대수, 클래스 변수
    private int price; // 제품 구매 가격


    // 생성자
    // 받아서 입력할거라 매개변수 없이 혹은 이름만 받아서 가볍게 생성
    // 생성자는 클래스가 객체로 만들어질 때 호출
    public IPadPro(String name) {

        this.sc = new Scanner(System.in);
        this.name = name; // 생성자 호출시 이름을 전달받아 초기값 지정 (공장초기화)
        Date now = new Date(); // 현재 시간을 운영체제로부터 받아옴 (시리얼넘버 생성을 위해)
        SimpleDateFormat sdf = new SimpleDateFormat("yyMMdd"); // 자바에서 month는 대문자 M, minute은 소문자 m
        productDate = sdf.format(now); // 지정된 포맷(형태)으로 시간정보가 가공되어 반환 (문자열로 반환)
        cnt++;
        productDate += cnt; // 문자열을 연결 (산술연산이 아님, sdf는 문자열로 반환됨)

    }


    // 주문을 계속할지 말지를 boolean으로 결정
    public boolean continueOrder() {

        System.out.println("======= iPad Pro 구입하기 =======");
        System.out.print("구입을 진행하려면 YES / 종료는 NO : ");
        String isContinue = sc.next();

        // YES 입력시 true 반환, 아닐시(NO 입력시) false 반환
        if (isContinue.equalsIgnoreCase("yes")) return true;
        else return false;

    }


    // 디스플레이 선택
    public int setScreen() {

        while (true) {

            System.out.println("모델.");
            System.out.println("[1] 11 모델 : Ultra Retina XDR 디스플레이");
            System.out.println("[2] 13 모델 : Ultra Retina XDR 디스플레이");
            System.out.print("원하는 사이즈를 선택하세요 : ");

            screen = sc.nextInt();
            if (screen == 1) return 1;
            else if (screen == 2) return 2;
            System.out.println("잘못 입력하셨습니다. 원하는 사이즈를 다시 선택하세요.");

        }

    }


    // 컬러 선택
    public void setColor() {

        while (true) {

            System.out.println("색상.");
            System.out.println("[1] 실버");
            System.out.println("[2] 스페이스 블랙");
            System.out.print("맘에 드는 색상을 선택하세요 : ");

            color = sc.nextInt();
            if (color == 1 || color == 2) return;
            System.out.println("잘못 입력하셨습니다. 원하는 색상을 다시 선택하세요.");

        }
    }


    // 용량 선택
    public void setMemory() {

        while (true) {

            System.out.println("저장 용량.");
            System.out.println("[1] 256GB");
            System.out.println("[2] 512GB");
            System.out.println("[3] 1TB");
            System.out.println("[4] 2TB");
            System.out.print("원하는 용량을 선택하세요 : ");

            memory = sc.nextInt();
            if (memory == 1 || memory == 2 || memory == 3 || memory == 4) return;
            System.out.println("잘못 입력하셨습니다. 원하는 용량을 다시 선택하세요.");

        }

    }


    // 네트워크 선택
    public void setNetwork() {

        while (true) {

            System.out.println("연결성.");
            System.out.println("[1] Wi-Fi : 모든 iPad는 Wi-Fi 연결을 지원해 언제나 소통을 이어갈 수 있습니다.");
            System.out.println("[2] Wi-Fi + Wi-Fi 연결이 불가능한 환경에서도 인터넷에 연결할 수 있죠.");
            System.out.print("인터넷 연결 방식을 선택하세요 : ");

            network = sc.nextInt();
            if (network == 1 || network == 2) return;
            System.out.println("잘못 입력하셨습니다. 원하는 인터넷 연결 방식을 다시 선택하세요.");

        }

    }

    // 각인 서비스
    public void setName() {

        while (true) {

            System.out.println("각인.");
            System.out.println("[1] 각인 추가하기 : Apple에 반품하거나 보상 판매할 때 어떠한 불이익도 없습니다.");
            System.out.println("[2] 각인 없음");
            System.out.print("무료 각인 서비스로 나만의 iPad Pro 만들기 : ");

            setName = sc.nextInt();
            if (setName == 1) {
                System.out.print("각인 메시지 입력하기 : ");
                name = sc.next();
                return;
            } else if (setName == 2) return;
            else System.out.println("잘못 입력하셨습니다. 원하는 각인 서비스를 다시 선택하세요.");

        }

    }


    // 일련번호 만들기
    public void setSerialNum() {
        String screenStr = (screen == 1) ? "11" : "13";
        String [] memoryStr = {"", "256", "512", "1024", "2048"};
        String networkStr = (network == 1) ? "W" : "C";
        serialNum = "iPadPro" + screenStr + memoryStr[memory] + networkStr + productDate;

    }


    // 옵션 선택 완료시 출고까지 30초동안 제품 생산 진행 상황 출력 후 출고
    public void progressIPadPro() throws InterruptedException {
        int cnt = 0;
        setSerialNum(); // 시리얼 넘버 생성
        while (true) {
            sleep(300); // 해당하는 스레드가 잠시 잠을 잠, 300은 0.3초를 의미 (3/1000초)
            cnt++;
            // printf는 + 연산자가 없음, cnt를 문자열로 출력하기 위해 %d, 퍼센트를 찍기 위해서 %%(서식 지정자에서 필요한 % 하나와 %를 찍을거라고 알려주는 %)
            System.out.printf("<< iPad Pro 제작 중 : [%d%%] >>\r", cnt);
            if (cnt >= 100) break; // 30초, 0.3초가 100개면 break

        }

    }


    // 출고 아이패드 정보 출력
    // 선택 옵션과 일련번호, 총 가격
    public void iPadProInfo() {

        String[] screenType = {"","11인치", "13인치"};
        String[] colorType = {"", "실버", "스페이스 블랙"};
        String[] memoryType = {"", "256GB", "512GB", "1TB", "2TB"};
        String[] networkType = {"", "Wi-Fi", "Wi-Fi + Cellular"};
        String[] nameType = {"", name, "각인 없음"};


        System.out.println("================================");
        System.out.println("고객님의 iPad Pro가 출고되었습니다.");
        System.out.println("디스플레이 : " + screenType[screen]);
        System.out.println("컬러 : " + colorType[color]);
        System.out.println("용량 : " + memoryType[memory]);
        System.out.println("네트워크 : " + networkType[network]);
        System.out.println("각인 서비스 : " + nameType[setName]);
        System.out.println("일련번호 : " + serialNum);
        System.out.println("가격 : " + iPadProCalcPrice() + "원");
        System.out.println("================================");

    }


    // 선택 옵션 추가비용 반영된 제품 가격
    public String iPadProCalcPrice() {
        NumberFormat numberFormat = NumberFormat.getInstance();
        int[] screenPrice = {0, 1499000, 1999000};
        int[] memoryPrice = {0, 0, 300000, 900000, 1500000};
        int[] networkPrice = {0, 0, 300000};

        price += screenPrice[screen];
        price += memoryPrice[memory];
        price += networkPrice[network];
        return numberFormat.format(price);

    }


}
