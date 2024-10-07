package JAVA_240926_05_영화표예매예제;

import java.util.Scanner;

public class MovieTicket {
    // 좌석 10개에 대한 정수형 배열의 인스턴스 변수 생성
    // 좌석당 가격에 대한 인스턴스 필드
    // 생성자는 좌석당 가격 정보를 객체 생성 시 넣어야 하므로 매개변수가 있는 생성자 생성
    // 좌석 상태 표시 메소드 구현
    // 좌석 예약 메소드 구현
    // 총 판매금액 메소드 구현 (총 판매금액은 인스턴스 필드로 만들지 말고, 결과로 반환)

    // 좌석 10개에 대한 정수열 배열의 인스턴스 변수 생성
    private final int[] seat = new int[10];

    // 좌석당 가격에 대한 인스턴스 필드
    private final int price;

    // 입력을 받기 위한 스캐너 객체 생성
    private final Scanner sc = new Scanner(System.in);


    // 생성자는 좌석당 가격 정보를 객체 생성 시 넣어야 하므로 매개변수가 있는 생성자 생성
    public MovieTicket(int price) {
        this.price = price;
    }


    // 좌석 상태 표시 메소드
    public void printSeat() {
        for(int e : seat) { // 좌석 정수 배열 길이 전체 10 반복
            if(e == 0) System.out.print("[ ]"); // 해당 좌석이 0이면 [ ] 출력
            else System.out.print("[V]"); // 0이 아니면 [V] 출력
        }
        System.out.println(); // 개행

    }


    // 좌석 예약 메소드
    public void selectSeat() {
        printSeat();
        System.out.println("좌석번호 : "); // 좌석번호를 입력받음
        int seatPos = sc.nextInt();

        // 1은 예약된 좌석, 0은 빈 좌석
        // 좌석 상태가 0이라면, 1로 만들어 예약 상태로 바꾸어줌
        if (seat[seatPos - 1] == 0) {
            seat[seatPos - 1] = 1;
            System.out.println("예매 완료");
            printSeat(); // 변경된 좌석 상태 출력
        } else {
            System.out.println("예매 불가");
        }
    }


    // optional 예약 취소 메소드
    public void cancelSeat() {
        printSeat();
        System.out.print("취소할 좌석번호 : ");
        int seatPos = sc.nextInt();

        // 1은 예약된 좌석, 0은 빈 좌석
        // 좌석 상태가 1이라면 다시 0으로 만들어 공석으로 바꾸어줌
        if (seat[seatPos - 1] == 1) {
            seat[seatPos - 1] = 0;
            System.out.println("취소 완료");
            printSeat();
        } else {
        System.out.println("예약되지 않은 좌석");
        }
    }


    // 총 판매 금액 구현 메소드
    public int totalAmount() {
        int cnt = 0;
            for(int e : seat) { // 좌석 전체에 대해서 반복
                if (e == 1) cnt++; // 1이면 cnt에 1씩 더함
            }
            return cnt * price; // 총 좌석수 * 12000
    }


}
