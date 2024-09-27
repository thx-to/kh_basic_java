package 강의_240926_05_영화표예매;
// 예매하기와 종료하기 메뉴 작성
// 총 좌석은 10개
// 좌석당 가격은 생성자를 통해서 입력
// 좌석 정보에 대한 메소드 작성 ([][][][][]) 요런 형태
// 총 판매 금액에 대한 메소드 작성


import java.util.Scanner;

public class MovieMain {
    public static void main(String[] args) {

        // MovieTicket 클래스에 대한 객체 생성
        // 입력받기 위한 스캐너 생성
        // 메뉴 작성은 무한 반복문으로 구현
        // 1. 좌석 예약하기 메소드 호출
        // 2. 종료하기 누르면 총 판매 금액 표시하고 종료

        // MovieTicket 클래스에 대한 객체 생성 (동작 구현을 위해 MovieTicket을 객체로 만듦)
        MovieTicket ticket = new MovieTicket(12000);

        // 입력받기 위한 스캐너 객체 생성
        Scanner sc = new Scanner(System.in);

        // 메뉴 작성은 무한 반복문으로 구현
        while (true) {
            System.out.println("[1] 예매하기");
            System.out.println("[2] 취소하기");
            System.out.println("[3] 종료하기");
            System.out.print("메뉴를 선택하세요 : ");
            int select = sc.nextInt(); // 인스턴스 필드
            switch (select) {
                case 1 :
                    ticket.selectSeat();
                    break;
                case 2 :
                    ticket.cancelSeat();
                    break;
                case 3 :
                    System.out.println(ticket.totalAmount());
                    return;
                default :
                    System.out.println("메뉴 선택이 잘못되었습니다.");
            }
        }


    }
}
