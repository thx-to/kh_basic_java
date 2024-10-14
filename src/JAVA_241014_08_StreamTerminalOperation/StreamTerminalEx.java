package JAVA_241014_08_StreamTerminalOperation;
// 스트림 최종 연산 : 스트림의 각 요소를 소모하여 연산을 수행
// forEach(), reduce(), findFirst(), findAny(), anyMatch(), allMatch(), noneMatch(), count(), min(), max(), sum(), average(), collect()

import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTerminalEx {
    public static void main(String[] args) {


        // 요소의 소모 : reduce()
        // 문자열 스트림 생성
        Stream<String> stream1 = Stream.of("넷", "둘", "셋", "하나");
        Stream<String> stream2 = Stream.of("넷", "둘", "셋", "하나");

        // 첫번째와 두번째 요소를 가지고 연산을 한 뒤, 그 결과를 세번째 요소와 다시 연산함
        // 여기서 맨 처음 s1은 "넷", 맨 처음 s2는 "둘"
        // 두번째 s1은 "넷++둘", 두번째 s2는 "셋"
        // 세번째 s1은 "넷++둘++셋", 세번째 s2는 "하나"
        System.out.println("==================== reduce() 연산");

        // reduce() : 두 개를 연산해서 결과를 하나로 만들어내고, 다음 요소를 붙임
        // Optional은 null을 감지하기 위한 Wrapper클래스, 참조하더라도 NPE(Null Pointer Exception)가 발생하지 않음
        // 자바 8에서 추가됨, ifPresent를 사용해 null을 확인하는 if문을 줄일 수 있음
        Optional<String> rst1 = stream1.reduce((s1, s2) -> s1 + "++" + s2);


        // rst는 문자열타입, 참조 타입이기 때문에 값으 없을 수도 있음
        // ifPresent는 Optional과 함께 쓰이며, null값이 오면 적용하지 말라는 의미 (만약 존재한다면)
        rst1.ifPresent(e -> System.out.print(e + " "));

        System.out.println(); // 단순개행

        // Int 스트림 생성
        IntStream stream3 = IntStream.of(1, 2, 3, 4, 5, 6);

        // 정수의 합 구하기
        // 람다식 reduce(Integer::sum)으로 변환해도 됨
        OptionalInt rst2 = stream3.reduce((s1, s2) -> s1 + s2);
        System.out.println(rst2);

        System.out.println(); // 단순개행


        // 요소의 통계 : count(), max(), min()
        // count() : 요소의 총 개수를 long 타입으로 반환
        // Int 스트림 생성
        IntStream stream4 = IntStream.of(50, 90, 70, 10);
        IntStream stream5 = IntStream.of(50, 90, 70, 10);
        IntStream stream6 = IntStream.of(50, 90, 70, 10);

        System.out.println("==================== 통계 연산");
        System.out.println("count() : " + stream4.count());
        System.out.println("max() : " + stream5.max());
        System.out.println("min() : " + stream6.min());


    }

}
