package JAVA_241004_01_DownCasting;
// 다운캐스팅 : 상위클래스형으로 변환되었던 하위클래스를 다시 원래의 자료형으로 변환하는 것 (부모클래스의 참조변수로 바라보게 했던 자식클래스를 다시 원래대로 돌려놓는 것)
// 업캐스팅 : 부모클래스의 참조 변수로 자식 객체를 바라보는 것 (지금까지 동적 다형성 등에서 한 예시, 다운캐스팅의 반대)
// instancef : 형변환 가능여부 확인 / 객체(인스턴스) instanceof 클래스 / 왼쪽 인스턴스가 오른쪽 클래스로 만들어졌는지를 확인 / 오른쪽 클래스의 자식관계이거나 오른쪽 클래스의 객체로 만들어졌으면 접근가능

import java.util.ArrayList;
import java.util.List;

public class DownCastingEx {

    // Animal 타입의 요소로 이루어진 ArrayList 선언
    // 하나의 ArrrayList가 여러가지 데이터타입에 대해 공용으로 사용해야 하기 때문에 같은 타입이 와야 함
    // 따라서 값 대신 주소가 옴 (참조 타입)
    // List 클래스의 종류 : ArrayList, LinkedList, Vector, Stack
    // List로 접근하면 부모가 상속준 것만 접근 가능, ArrayList로 접근하면 자체에서 만든 것도 접근
    // 강사님 comment : List에서 상속 준 것만 접근하는게 편해서(범용성 때문) List로 사용 더 많이함
    // animals는 객체들, 객체마다 주소가(배열) 들어가 있음
    List<Animal> animals = new ArrayList<>();

    public static void main(String[] args) {

        DownCastingEx downCast = new DownCastingEx();
        downCast.addAnimal();
        downCast.downCasting();

    }

    // 인스턴스 메소드 만들기
    public void addAnimal() {

        // Animal 클래스로 객체 생성
        // Heap 영역에 메모리를 할당받고, 객체를 생성해서 ArrayList의 첫번째 요소(객체의 주소가 있음)에 집어넣음
        // Animal animal = new Animal();과 같음

        // add 방법 1 : 특정한 인덱스를 주고 그 위치(중간)에 끼워넣기, ArrayList에서는 안좋은 방법(뒤 인덱스가 다 밀리므로), 중간에 끼워넣으려면 LinkedList로 바꾸는게 좋음
        // add 방법 2 : 인덱스의 맨 마지막에 넣는 것
        animals.add(new Animal()); // ArrayList에 추가되면서 Animal 형으로 변환

        // Human, Tiger, Eagle의 move가 부모 클래스의 참조변수로 설정되어 있기 때문에 가져옴
        animals.add(new Human());
        animals.add(new Tiger());
        animals.add(new Eagle());
        for (Animal e : animals) e.move();

    }

    public void downCasting() {

        // 길이반환이 length인타입이 있고, size인타입이 있음
        // 타이핑해보고 되는걸로 반영하면됨ㅎ..
        for (int i = 0; i < animals.size(); i++) {
            // ArrayList에서 해당 인덱스의 값(각 객체에 대한 주소)을 가져옴
            Animal ani = animals.get(i);

            // 클래스와 객체 타입이 허용되는지를 확인
            // 이 객체가 어떤 클래스로부터 만들어진 객체인지?
            // animal타입이 Human 클래스로 만들어진 객체인지를 확인, 다운캐스팅을 해도 되는지 물어보는 것
            if (ani instanceof Human) {

                // Human 클래스의 h라는 참조 변수, 원래 Human 클래스에 대한 참조 변수로 바꿔줘
                // 다운캐스팅은 명시적 형변환 필요
                // 업캐스팅(부모 클래스의 참조변수로 설정)은 일반적인 것으로 봐서 명시적 형변환이 필요 없음
                Human h = (Human) ani;
                h.readBook();

            } else if (ani instanceof Tiger) {
                Tiger t = (Tiger) ani;
                t.hunting();
            } else if (ani instanceof Eagle) {
                Eagle e = (Eagle) ani;
                e.flying();
            } else {

                // 위 animals.add(new Animal()); // ArrayList에 추가되면서 Animal 형으로 변환 코드 비활성화시 출력되지 않는 구간
                System.out.println("지원되지 않는 형 입니다.");

            }


        }
    }


}
