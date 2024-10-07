package JAVA_241004_08_CloneMethod;
// clone() 메소드 : 해당 인스턴스를 복제하여 새로운 인스턴스를 생성해 반환 (얕은 복사가 발생하는 경우에 해당함)
// 얕은 복사 : 필드의 값만 복사하는 방법, 기본 타입의 경우 값이 복사되고 참조 타입의 경우에는 참조하는 곳의 주소가 복사

public class CloneMethodEx {
    public static void main(String[] args) {

        Member mem1 = new Member("PHAM", "HANNI", "PHNJS2022", 21, true);


        // 얕은 복사가 일어나는 상황
        // Member mem2 = mem1;

        // 깊은 복사가 일어나는 상황
        Member mem2 = mem1.getMember();

        mem2.id = "KIM";
        mem2.name = "MINJI";

        // 얕은 복사가 일어나 코드 뒤쪽에 쓴게 값이 됨
        System.out.println("ID : " + mem1.id);
        System.out.println("ID : " + mem2.id);

        System.out.println("이름 : " + mem1.name);
        System.out.println("이름 : " + mem2.name);


    }
}
