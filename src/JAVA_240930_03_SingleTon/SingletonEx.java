package JAVA_240930_03_SingleTon;
// 싱글톤 : 단 하나의 객체만 생성하는 디자인 패턴
// 싱글톤 사용의 장점
// 1) 메모리 절약 (생성된 하나의 객체를 재활용해서 사용, 스프링부트 빈 컨테이너에서 자주 사용되는 방식)
// 2) 클래스로 생성된 객체 간의 정보 공유가 쉬움 (안드로이드나 iOS에서 주로 사용)
// 싱글톤 사용의 단점 : 동시성 문제가 발생할 수 있음

public class SingletonEx {
    public static void main(String[] args) {

        //Singleton은 이미 만들어져 있어서 만들 필요가 없음
        // Student의 빈 생성자(자동 생성)을 통해 학생 생성
        Student student1 = new Student();
        Student student2 = new Student();

        // 정보를 전달
        // 아래에서 set하지 않으면 Singleton.java에서 설정한 (쿵, 100)이 찍힘
        student1.setInfo("팜하니", 21);

        // 두 개는 다른 객체지만 똑같이 찍힘
        // 내부에 Singleton이라는 객체를 만들어 Singleton을 통해 정보 전달
        // 전달된 정보를 확인
        // 객체는 총 3개 : Singleton(Singleton 클래스 내부에서 먼저 만들어짐), student1, student2
        // Student.java setInfo에서 두 개의 전달받은 값(팜하니, 21)을 singleton.name과 singleton.id에 각각 들어감
        // 모든 곳에서 참조할 수 있는 singleton이라는 공용 변수를 만든 거라고 생각하면 됨
        // 전역 변수 대신 전역 객체를 만든 것
        student2.viewInfo();


    }
}
