package JAVA_241014_07_StreamIntermediateOperation;
// 스트림 중개 연산 : 생성된 스트림을 중개 연산 또는 다른 스트림을 변환
// 1) 스트림 필터링 : filter() 조건에 맞는 것만 골라냄, distinct() 중복제거
// 2) 스트림 변환 : map() 하나의 요소를 받으면 하나의 요소를 반환 1:1, flatMap() 각 요소를 여러 값 혹은 평탄화된 하나의 단일 스트림으로 변환하고 병합하여 반환 1:1 또는 N:1
// 3) 스트림 제한 : limit() 첫번째 요소부터 전달된 개수만큼의 요소로 이루어진 스트림 반환, skip() 첫번째 요소부터 전달된 개수만큼의 요소를 제외한 나머지로 이루어진 스트림 반환
// 4) 스트림 정렬 : sorted() : 해당 스트림을 주어진 비교자(comparator)를 이용하여 정렬
// 5) 스트림 연산 결과 확인 : peek()

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamIntermidEx {
    public static void main(String[] args) {


        // 1) 스트림 필터링 : filter(), distinct()
        // 스트림 생성
        IntStream stream1 = IntStream.of(7, 5, 5, 2, 1, 2, 3, 4, 6);
        IntStream stream2 = IntStream.of(7, 5, 5, 2, 1, 2, 3, 4, 6);

        // 중복 제거(중개 연산 discinct) 이후 최종 결과(forEach) 출력
        // forEach는 내부반복자
        // 내부 요소값(e)을 던져서 print
        System.out.println("=== 1) 스트림 필터링 : fliter(), dintinct()");
        stream1.distinct().forEach(e -> System.out.print(e + " "));

        System.out.println(); // 단순개행

        // 필터링(중개 연산 filter) 이후 최종 결과(forEach) 출력
        // 홀수만 골라냄 (2로 나눈 나머지가 0이 아닌 경우, 2의 배수가 아닌 경우)
        // stream1은 위에서 최종 연산 forEach로 끝났기 때문에 재사용 불가, stream2로 새로 출력
        stream2.filter(e -> e % 2 != 0).forEach(e -> System.out.print(e + " "));

        System.out.println(); // 단순개행


        // 2) 스트림 변환 : map(), flatMap()
        // 스트림 생성
        Stream<String> stream = Stream.of("HTML", "CSS", "JAVA", "REACT");

        // 각 요소의 길이를 mapping하여 출력 map()
        System.out.println("=== 2) 스트림 변환 : map(), flatMap()");
        stream.map(e -> e.length()).forEach(e -> System.out.print(e + " "));

        System.out.println(); // 단순개행

        // 스트림 생성
        String[] arr = {"I Study Hard.", "You Study Java.", "I Am Hungry."};

        // 문자열 배열을 String 타입의 Stream으로 만들기
        Stream<String> stream3 = Arrays.stream(arr);

        // 하나하나를 다 쪼개서 다시 담음 (내부에서 평탄화 flat 작업) flatMap()
        stream3.flatMap(s -> Stream.of(s.split(" +"))).forEach(s -> System.out.print(s + "/"));

        System.out.println(); // 단순개행


        // 3) 스트림 제한 : limit(), skip()
        // 스트림 생성, 0에서 10미만까지
        IntStream stream4 = IntStream.range(0, 10);
        IntStream stream5 = IntStream.range(0, 10);

        // limit() : 전달된 개수만큼의 요소로 이루어진 새로운 스트림 반환
        // limit(5) : 처음부터 다섯개만큼의 요소로 이루어진 새로운 스트림 반환
        System.out.println("=== 3) 스트림 제한 : limit(), skip()");
        stream4.limit(5).forEach(e -> System.out.print(e + " "));;

        System.out.println(); // 단순개행

        // skip() : 전달된 개수만큼의 요소를 제외한 나머지 요소로 이루어진 새로운 스트림 반환
        // skip(4) : 처음부터 4개를 제외하고 나머지 요소로 이루어진 새로운 스트림 반환
        stream5.skip(4).forEach(e -> System.out.print(e + " "));

        System.out.println(); // 단순개행


        // 4) 스트림 정렬 : sorted()
        // 문자열 스트림 생성
        Stream<String> stream6 = Stream.of("JAVA", "HTML", "JAVASCRIPT", "CSS");
        Stream<String> stream7 = Stream.of("JAVA", "HTML", "JAVASCRIPT", "CSS");

        // sorted() : comparator를 이용해 정렬
        // 매개변수 아무것도 넣지 않으면 natural order, 오름차순 정렬
        System.out.println("=== 4) 스트림 정렬 : sorted()");
        stream6.sorted().forEach(e -> System.out.print(e + " "));

        System.out.println(); // 단순개행

        // reverseOrder() 역순으로 정렬 (내림차순)
        stream7.sorted(Comparator.reverseOrder()).forEach(e -> System.out.print(e + " "));

        System.out.println(); // 단순개행

        // 길이 기준으로 정렬하고, 길이가 같으면 알파벳 정렬해보기
        // 문자열 스트림 생성
        Stream<String> stream8 = Stream.of("JAVA", "HTML", "JAVASCRIPT", "CSS");

        // 람다식으로 comparingInt(String::length) 이렇게 써도 됨
        // sorted 중개연산 내부에 조건이 2개 들어감
        // Comparator의 메소드로 comparingInt, thenComparing(정렬조건 추가) 등을 사용
        // chaining method, 계속 도트연산자 찍고 중개연산 사용
        stream8.sorted(Comparator
                .comparingInt(String::length)
                .thenComparing(String::compareTo))
                .forEach(e -> System.out.print(e + " "));

    }
}
