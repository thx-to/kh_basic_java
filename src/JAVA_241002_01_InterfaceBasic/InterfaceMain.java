package JAVA_241002_01_InterfaceBasic;
// 인터페이스 : 자바에서 다중 상속을 지원하기 위해 만들어짐
// 인터페이스는 개발에 있어 '설계 명세서'의 개념 (클래스는 '설계도')
// 완벽한 추상화 : 모든 메소드가 추상메소드 (단, 예외가 있음)
// 인터페이스에 포함되는 필드 : final static (컴파일러가 자동으로 추가, final은 변경 불가 / static은 1개만 만들어짐, 상수 처리)
// 그냥 '필드'라고 하면 인터페이스 필드를 의미함, 객체로 만들어지기 때문에
// 인터페이스에 포함되는 메소드 : public abstract (컴파일러가 자동으로 추가, 추상 메소드 : 자식 클래스에서 반드시 오버라이딩 및 구현해야 사용할 수 있는 메소드 / 부모가 이름만 정하고 메소드를 만들지 않았기 때문에)
// 정적 메소드(static이 들어가는 메소드) : 객체와 상관없으므로 사용 가능, 구현부가 있음
// 인터페이스 상속은 implements 키워드 사용, 상속은 무한으로 받을 수 있음
// 인터페이스 문법은 느슨한 결합관계를 달성하기 위해 사용

import java.util.Scanner;

public class InterfaceMain {
    public static void main(String[] args) {

        // adapter는 연결통로 같은 것, Wi-Fi가 붙을 수도 5G가 붙을 수도 LTE가 붙을 수도 있음, 결정이 안 된 상태
        // 실제로는 감도 등을 체크하여 연결 가능한 네트워크 자동으로 연결
        // 이 자체로 객체화가 될 수는 없음, NetworkAdapter에 대한 참조변수 필요
        NetworkAdapter adapter;

        // 입력을 받기 위한 스캐너 객체 생성
        Scanner sc = new Scanner(System.in);

        // 연결할 네트워크 입력받기
        System.out.print("연결할 네트워크를 선택하세요. [1] Wi-Fi [2] 5G [3] LTE : ");
        int num = sc.nextInt();

        switch(num) {
            // 인터페이스를 통해 실체화된 객체에 접근
            case 1 :
                adapter = new WiFi("KT");
                adapter.connect();
                break;
            case 2 :
                adapter = new FiveG("SKT");
                adapter.connect();
                break;
            case 3 :
                adapter = new Lte("LGU+");
                adapter.connect();
                break;
            default :
                System.out.println("연결 가능한 네트워크가 없습니다.");
                break;
        }




    }
}
