package JAVA_240930_02_StaticMethod_은행예제;

public class Bank {

    // 정적 멤버
    // 클래스 생성 시 생성
    private static int count = 0;

    // 인스턴스 필드
    // 객체가 생성될 때 함께 생성됨
    private int account; // 잔액 표시
    private String bank; // 은행 이름

    // 생성자 만들기
    // 생성자도 메소드기때문에 접근제한자를 붙일 수 있음
    // default는 같은 클래스에서만 객체를 생성할 수 있음
    // public을 붙이면 다른 클래스에서도 객체를 생성할 수 있음
    public Bank(String name, int account) {

        // 정적 멤버
        // 생성자가 호출될 때 값이 증가됨
        count++; // 계좌 개설 개수 확인용

        this.bank = name;
        this.account = account;
    }


    // 정적 메소드
    public static int getCount() {

        return count; // bank, account에는 접근 불가, count에만 접근 가능

    }


    // 외부에서 입금된 금액이 내부 시스템에 의해 바뀌면 안됨
    // dep(입금 금액)에 final 붙여줌
    public void setDeposit(final int dep) {

        account += dep; // 잔액에 입금금액을 더해서 잔액 누적
        System.out.println(dep + "원을 입금했습니다.");

    }


    public void setWithdraw(final int with) {
        if (with > account) {
            System.out.println("잔액이 부족합니다.");
        } else {
            account -= with;
            System.out.println(with + "원을 출금했습니다.");
        }
    }

    public String getBank() {
        return bank;
    }

    public int getAccount() {
        return account;
    }



}
