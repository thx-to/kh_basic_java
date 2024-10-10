package JAVA_241010_09_IteratorInterface;
// 자바의 컬렉션 프레임워크는 컬렉션에 저장된 요소를 읽어 오는 방법을 Iterator 인터페이스로 표준화

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class IteratorExMain {
    public static void main(String[] args) {

        // Integer LinkedList 만들기
        List<Integer> list = new LinkedList<>();
        list.add(4);
        list.add(3);
        list.add(2);
        list.add(1);

        // 향상된 for문 방식 (권장되는 방식)
        // 요소의 처음부터 끝까지 자동 순회
        // 요소의 값을 변경할 수 없음
        // 코드가 명확함
        // 버그 예방 (코드가 단순하기 때문)
        for (int e : list) System.out.print(e + " ");


        System.out.println(); // 단순 개행


        // list의 iterator라는 표준화된 요소를 읽어들이기 위한 Iterator 인터페이스
        // 표준 Iterator 생성
        Iterator<Integer> iterator = list.iterator();

        // Iterator를 이용한 방식
        // 반복자를 이용하여 반복 순회
        // 값을 지우거나 변경할 수 있음
        while (iterator.hasNext()) {

            // 읽어온 값이 4이면, 요소값을 지움
            if (iterator.next() == 4) iterator.remove();

        }

        for (int e : list) System.out.print(e + " ");

    }
}
