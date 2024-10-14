package JAVA_241014_03_Stream;
// Steram : 생성, 중간 연산, 최종 연산을 하나의 스트림으로 관리 및 처리하는 방법
// 중간연산 : 내가 원하는 값만 골라내는 것 (필터링)
// 배열, 컬렉션 등의 자료를 일관성 있게 처리할 수 있게 해줌 (자료에 따라 기능을 각각 새로 구현하는 게 아니라, 처리해야 하는 자료가 무엇인지에 상관 없이 같은 방식으로 메소드 호출)
// 컬렉션(또는 배열)의 저장 요소를 하나씩 참조해서 람다식으로 처리할 수 있도록 반복자 역할을 함
// 자료의 대상과 상관 없이 동일한 연산을 수행 (컬렉션 프레임워크와 유사하나, 컬렉션 프레임워크보다 추상화 정도가 더 높음)
// 컬렉션과 다르게 내부 반복자를 통해서 작업 수행
// 필터와 맵 기반의 API를 사용한 지연 연산을 통해 성능 최적화
// 병렬 처리 지원

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamEx {
    public static void main(String[] args) {

        // Integer형 배열에 10개의 값을 넣음
        Integer[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // 리스트 앞 s는 stream의 약자로 넣어줌
        // asList : 배열을 List로 변환해주는 메소드
        List<Integer> sList = new ArrayList<>(Arrays.asList(arr));

        // 스트림 생성, 중간 연산, 최종 연산을 한번에 함
        // 백엔드에서는 이 문법(Stream)을 많이 사용함
        sList.stream()
                // filter() : 스트림 필터링, 해당 스트림에서 주어진 조건에 맞는 요소만으로 구성된 새로운 스트림을 반환하는 중간 연산
                // 5보다 크거나 같은 값 필터링
                .filter(s -> s >= 5)
                // forEach는 내부 반복자 스트림
                // forEach() : 스트림 요소에 대한 순차 접근 제공, 최종 연산에 해당
                // 람다 활용하면 .forEach(System.out::println)으로 축약됨
                .forEach(s -> System.out.print(s + " "));

        System.out.println(); // 단순개행

        // 원래 알고 있던 문법으로 변환해보기
        for (Integer e : sList) {
            if (e >= 5) System.out.print(e + " ");
        }

    }
}
