package JAVA_240930_02_StaticMethod_은행예제;
// static 멤버와 메소드는 클래스 생성 시 함께 생성되고, 객체가 생성 시 만들어
// 하나의 클래스에 하나만 존재
// 한번 생성되면 프로그램 종료 시까지 사라지지 않음
// 정적(static) 메소드에서는 인스턴스 필드나 메소드를 사용할 수 없음
// 정적 메소드는 클래스에서 만들어졌기 때문에 당연함
// 인스턴스 필드나 인스턴스 메소드는 객체에서 만들어짐 - 접근이 안됨

public class StaticBankMain {
    public static void main(String[] args) {

        Bank kakao = new Bank("카카오뱅크", 1000);
        Bank shinhan = new Bank("신한은행", 1000);
        Bank nh = new Bank("NH농협은행", 500);

        kakao.setDeposit(3000);
        kakao.setWithdraw(2000);
        System.out.println(kakao.getBank() + "에 " + kakao.getAccount() +"원이 있습니다.");

        System.out.println("계좌가 " + Bank.getCount() + "개 개설되었습니다.");


        // static 메소드로 유틸리티성 메소드 만들어 사용하기
        System.out.println(Util.max(100, 200));
        System.out.println(Util.isEven(123));
        System.out.println(Util.getCurrentDate("yyyyMMdd"));
    }
}
