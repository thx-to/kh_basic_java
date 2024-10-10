package JAVA_241010_05_StackBasic;
// JVM의 Stack 메모리는 LIFO, Stack은 내부적으로 Vector 클래스를 상속받아 만들어짐
// Last In First Out : 프로그래밍에서는 함수 호출 구조(콜스택)가 대표적인 LIFO, 일상 생활에서는 설거지한 접시를 쌓고 맨 위 접시부터 쓰는 것
// push(객체) : 객체를 저장
// peek() : Stack의 최상위 값 확인
// pop() : Stack의 최상위의 값을 추출하면서 보여줌, 반환값이 있음
// empty() : Stack이 비어 있는지 확인

import java.util.Stack;

public class StackMain {
    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();

        // 객체 저장
        // 객체를 넣을 수도 있고 일반 숫자를 넣을 수도 있음
        // 원래 객체를 넣어야 하는데, 제네릭 타입, 컬렉션 프레임워크로 내부에서 오토박싱
        stack.push(1);
        stack.push(2);
        stack.push(3);

        // 최상위 값 확인
        System.out.println(stack.peek());

        // 최상위 값을 추출하면서 보여줌
        System.out.println(stack.pop());

        // 비어 있는지 확인
        System.out.println(stack.empty());

        // Stack에 포함된 요소의 갯수 확인
        System.out.println(stack.size());

        // Stack 내에 해당 값이 존재하는지 확인
        System.out.println(stack.contains(1));

        // 스택 내용 확인해보기
        System.out.println(stack);



    }
}
