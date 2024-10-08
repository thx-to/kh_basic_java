package JAVA_241008_02_ListInterfacePractice;
// Vector는 ArrayList와 동일한 내부 구조를 가짐
// 차이점 : Vector는 '동기화된(Synchronized)' 메소드로 구성되어 있어 멀티스레드 환경에서 안전하다는 것

import java.util.List;
import java.util.Vector;

public class VectorMain {
    public static void main(String[] args) {

        // 객체기 때문에 new를 해줘야 함
        // Integer와 String은 오토박싱, Wrapper가 자동으로 해줌
        // 우리는 메모리를 잡아주고, 메모리에 대한 주소를 넣어야 함
        // 여러 개를 만들어서 list 안에 넣어줘야 함
        List<NameCard> list = new Vector<>();

        // 주소를 참조변수에 받은게 아니고 ArrayList에 해당하는 인덱스에 넣어 줌 (NameCard에 대한 주소 타입)
        list.add(new NameCard("PHAM", "hanni@nj.com", "010-1111-1111", "daughter"));
        list.add(new NameCard("KIM", "minji@nj.com", "010-2222-2222", "bread"));
        list.add(new NameCard("MO", "danielle@nj.com", "010-3333-3333", "sunflower"));
        list.add(new NameCard("KANG", "haerin@nj.com", "010-4444-4444", "cat"));
        list.add(new NameCard("LEE", "hyein@nj.com", "010-5555-5555", "student"));

        for(NameCard e : list) {
            System.out.println("이름 : " + e.name);
            System.out.println("메일 : " + e.email);
            System.out.println("전화 : " + e.phone);
            System.out.println("직업 : " +e.job);
            System.out.println("====================");

        }
    }
}

// 간단하게 클래스를 하나 만들어보께여~~
class NameCard {

    String name;
    String email;
    String phone;
    String job;

    // generator로 생성자 만들어주기
    // getter, setter는 필요 없을 것 같아 안만들게여~~
    public NameCard(String name, String email, String phone, String job) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.job = job;

    }
}