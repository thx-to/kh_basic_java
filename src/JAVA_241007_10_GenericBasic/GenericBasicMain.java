package JAVA_241007_10_GenericBasic;
// 제네릭 : 데이터의 타입을 일반화(데이터 타입을 동일한 방법으로 처리, 길이가 정해져 있는 참조 타입으로)
// 데이터 타입과 자료 구조에 상관 없이 동일한 프로그래밍 가능
// 클래스나 메소드에서 사용할 내부 데이터 타입을 컴파일시 미리 지정하는 방식 사용
// 내부적으로는 아무 타입이나 받을 수 있지만, 지정을 안해주면 동작 중 오류 발생 가능

import java.util.ArrayList;
import java.util.List;

public class GenericBasicMain {
    public static void main(String[] args) {

        genericBasicFunc();
        genericTypeVariableFunc();

    }


        // 제네릭 타입 제한 : 컴파일 시 타입 체크 가능, 타입 변환 제거
        static void genericBasicFunc() {

            List list = new ArrayList();
            list.add("안녕하세요?");

            // 출력시 형변환이 필요
            System.out.println((String) list.get(0));


            List<String> list1 = new ArrayList<>();
            list1.add("안녕하세요?");

            // 출력시 형변환 필요없음
            System.out.println(list1.get(0));

        }


    static void genericTypeVariableFunc() {

        // 이렇게 하면 T가 문자열로 동작하게 됨
        Person<String> p1 = new Person<>("PHAM");
        Person<Integer> p2 = new Person<>(1004);
        System.out.println(p1.getInfo());
        System.out.println(p2.getInfo());
    }

    // 제네릭 타입 클래스 만들기
    // <T> : 타입 변수를 의미, 관례상 매개변수가 1개인 경우 대문자 T로 표기
    static class Person<T> {

        // 내부에 인스턴스 필드 넣기
        // 접근제한자 데이터타입 변수이름;
        // 현재 T에 대한 데이터 타입이 결정이 안돼있지만 사용 가능
        // 데이터타입이 결정되기 전 넣을 수 있는 변수로, 코딩이 유연해짐(타입에 대한 자유도가 높아짐)
        private T info;

        // 생성자 만들기
        // 매개변수 1개, 들어오는 것도 T타입, 받는 것도 T타입
        Person(T info) {
            this.info = info;
        }

        public T getInfo() {
            return info;
        }
    }

}
