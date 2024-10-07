package JAVA_240930_03_SingleTon;

public class Student {

    // private으로 막아둬서 new Singleton 못만듦
    // 이미 만들어진 Singleton 객체의 주소를 대입
    // 생성을 new로 하는게 아니고 static 메서드에서 유일하게 반환받은 static 메소드의 주소를 반환받는 것
    Singleton singleton = Singleton.getSingleton();

    void setInfo(String name, int id) {

        // singleton 객체의 인스턴스 필드 객체 접근 (name과 id 두 가지 값 접근)
        singleton.name = name;
        singleton.id = id;

    }


    void viewInfo() {

        System.out.println("이름 : " + singleton.name);
        System.out.println("ID : " + singleton.id);

    }

}