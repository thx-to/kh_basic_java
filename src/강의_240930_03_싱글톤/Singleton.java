package 강의_240930_03_싱글톤;

public class Singleton {

    String name;
    int id;


    // 정적 변수로 Singleton 클래스에 대한 참조 변수(new Singleton 객체를 바라보고 있음)를 만들고
    // 클래스가 만들어질 때 singleton 변수도 만들어짐(static memory), 앞에 static이 붙었기 때문에 프로그램 종료시까지 사라지지 않는 변수
    // heap memory 영역에 new Singleton 생성, singleton 참조 변수가 사라질 때 사라짐
    // singleton은 객체의 주소를 가지고 있음
    private static Singleton singleton = new Singleton();

    // 싱글톤은 '단 하나'
    // 이미 하나 생성했으니까 더이상 객체로 만들지 못하도록 앞에 private 붙임
    // 외부에서 생성자를 만들 수 없기 때문에 외부에서 객체로 만들지 못함
    private Singleton() {

        name = "쿵";
        id = 100;

    }

    static Singleton getSingleton() {

        return singleton;

    }

}
