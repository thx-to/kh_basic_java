package JAVA_241014_07_StreamIntermediateOperation;
// 스트림 중개 연산 : 생성된 스트림을 중개 연산 또는 다른 스트림을 변환
// 스트림 필터링 : filter() 조건에 맞는 것만 골라냄, distinct() 중복제거
// 스트림 변환 : map() 하나의 요소를 받으면 하나의 요소를 반환 1:1, flatMap() 각 요소를 여러 값 혹은 평탄화된 하나의 단일 스트림으로 변환하고 병합하여 반환 1:1 또는 N:1
// 스트림 제한 : limit() 첫번째 요소부터 전달된 개수만큼의 요소로 이루어진 스트림 반환, skip() 첫번째 요소부터 전달된 개수만큼의 요소를 제외한 나머지로 이루어진 스트림 반환
// 스트림 정렬 : sorted() : 해당 스트림을 주어진 비교자(comparator)를 이용하여 정렬
// 스트림 연산 결과 확인 : peek()

import java.util.stream.IntStream;

public class StreamIntermidEx {
    public static void main(String[] args) {

        // 스트림 생성
        IntStream stream1 = IntStream.of(7, 5, 5, 2, 1, 2, 3, 4, 6);
        IntStream stream2 = IntStream.of(7, 5, 5, 2, 1, 2, 3, 4, 6);

        // 중복 제거(중개 연산 discinct) 이후 최종 결과(forEach) 출력
        // forEach는 내부반복자
        // 내부 요소값(e)을 던져서 print
        stream1.distinct().forEach(e -> System.out.print(e + " "));

        System.out.println(); // 단순개행

        // 필터링(중개 연산 filter) 이후 최종 결과(forEach) 출력
        // 홀수만 골라냄 (2로 나눈 나머지가 0이 아닌 경우, 2의 배수가 아닌 경우)
        // stream1은 위에서 최종 연산 forEach로 끝났기 때문에 재사용 불가, stream2로 새로 출력
        stream2.filter(e -> e % 2 != 0).forEach(e -> System.out.print(e + " "));

    }
}
