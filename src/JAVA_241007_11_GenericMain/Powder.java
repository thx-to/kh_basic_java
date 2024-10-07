package JAVA_241007_11_GenericMain;

public class Powder extends Material {

    @Override
    public void doPrinting() {
        System.out.println("Powder 재료로 출력합니다.");
    }

    // 원래 클래스에 toString()이라는 메소드가 있었음
    // toString() : 클래스 이름 @ 해시코드 주소값을 16진수로 바꿔서 반환
    // 오버라이딩으로 다른 기능으로 사용하기 때문에 어떤 메소드를 사용해도 상관이 없지만, 일반적으로 toString을 기본적으로 사용함
    public String toString() {
        return "재료는 Powder입니다.";

    }

}
