package JAVA_241004_07_ObjectClass;
// Object 클래스 : 모든 자바 클래스의 조상 클래스
// Object 클래스는 필드 없이 11개의 메소드로 구성

public class ObjectClassEx {
    public static void main(String[] args) {

        Student student1 = new Student();
        Student student2 = new Student();

        // getClass() : 해당 객체의 클래스 타입을 반환
        // 클래스 타입을 확인하기 어려운 안드로이드에서 많이 쓰는 문법
        System.out.println(student1.getClass());

        // equals() : 해당 객체(인스턴스)와 비교 객체(매개변수로 전달받은 참조변수)가 같은지 여부를 boolean으로 반환
        // 해당 인스턴스와 매개변수로 전달받는 참조 변수와 비교하여 결과 반환
        // 해시코드가 같은지를 비교(참조변수)
        // String(문자열) 타입의 경우 문자열의 내용을 비교하는 동작
        System.out.println(student1.equals(student2));
        student1 = student2;
        System.out.println(student1.equals(student2));

        // hashCode() : 해당 객체의 해시코드값(주소, 10진수)을 반환
        // 메모리에 로딩된 객체의 주소를 해시함수에 키값으로 전달하고 해시함수로 생성된 해시코드를 비교
        // 자바는 메모리에 대한 직접 접근을 허용하지 않기 때문에, 실제 주소 대신 해시코드가 쓰임
        // hash function에 입력값(주소, 문자열 등) 들어오면 특정한 배열의 인덱스(임의의 값)를 만들어냄
        // hash code : hash function에 입력된 주소로 만들어진 배열의 인덱스, 암호화 등(블록체인, 전자지갑)에 사용됨
        // 추후 스프링부트에서 활용 예정
        System.out.println(student1.hashCode());
        System.out.println(student2.hashCode());

        // toString() : 해당 인스턴스에 대한 정보를 문자열로 반환
        // 대부분의 경우는 오버라이딩해서 객체 내부의 정보를 표시함
        // 오버라이딩을 하지 않는 경우, 해당 객체의 정보를 문자열로 출력
        // 클래스 정보 + @16진수 해시코드로 구성
        System.out.println(student1.toString());
        System.out.println(student2.toString());


    }
}


class Student {

    int id;
    String name;

}