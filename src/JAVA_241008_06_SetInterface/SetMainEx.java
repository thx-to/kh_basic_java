package JAVA_241008_06_SetInterface;

import java.util.Arrays;
import java.util.HashSet;

public class SetMainEx {
    public static void main(String[] args) {

        // HashSet은 요소의 순서를 유지하지 않음
        // HashSet은 요소의 중복을 허용하지 않음 (set, 집합)
        HashSet<String> set = new HashSet<>(Arrays.asList("H", "E", "L", "L", "O"));
        System.out.println(set);
        System.out.println(); // 단순 개행

        // ID가 같은데 계속 입력되는 경우
        // 출력값에 동일 ID로 출력되는 문제 발생
        HashSet<Member> hashSet = new HashSet<>();
        hashSet.add(new Member(1004, "PHAM"));
        hashSet.add(new Member(1005, "KIMMZ"));
        hashSet.add(new Member(1006, "MODD"));
        hashSet.add(new Member(1004, "HANNI"));
        for(Member e : hashSet) e.showMember();
        System.out.println(); // 단순 개행

        // 오버라이딩으로 중복 제거하기
        HashSet<Member1> hashSet1 = new HashSet<>();
        hashSet1.add(new Member1(1004, "PHAM"));
        hashSet1.add(new Member1(1005, "KIMMZ"));
        hashSet1.add(new Member1(1006, "MODD"));
        hashSet1.add(new Member1(1004, "HANNI"));
        for(Member1 e : hashSet1) e.showMember1();



    }
}

class Member {
    int id;
    String name;

    public Member(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void showMember() {
        System.out.println("ID : " + id);
        System.out.println("이름 : " + name);
    }
}


// 중복 개체 해결하기
// hashCode(), equals() 둘 다 오버라이딩 걸기
class Member1 {
    int id1;
    String name1;

    @Override
    public int hashCode() {
        return id1;
    }

    @Override
    public boolean equals(Object obj) {

        if (obj instanceof Member1) {
            // 형변환 및 다운캐스팅
            Member1 member1 = (Member1) obj;
            if (this.id1 == member1.id1) return true;
            else return false;
        }
        return false;
    }


    public Member1(int id1, String name1) {
        this.id1 = id1;
        this.name1 = name1;
    }

    public void showMember1() {
        System.out.println("ID : " + id1);
        System.out.println("이름 : " + name1);
    }
}