package JAVA_241014_05_Stream3;
// 스트림을 통한 병렬 처리
// 내부 반복자는 요소들의 반복 순서를 변경하거나 멀티 코어 CPU를 최대한 활용하기 위해 요소들을 분배시켜 병렬처리를 할 수 있게 도와줌
// 향상된 for문은 반복 순서 변경 불가능

import com.sun.tools.javac.Main;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamEx3 {
    public static void main(String[] args) {

        // asList() : 배열의 요소를 List로 바꿈
        List<String> list = Arrays.asList("PHAM", "KIM", "MO", "KANG", "LEE");

        // 순차 처리
        Stream<String> stream = list.stream();
        stream.forEach(StreamEx3::print);
        System.out.println();

        // 병렬 처리
        // 병렬 처리니까 내부적으로 여러개의 스레드가 돌아감
        // 스트림은 parallelStream() 메소드를 통해 병렬 처리 지원
        Stream<String> parallelStream = list.parallelStream();
        parallelStream.forEach(StreamEx3::print);
        System.out.println();

    }

    static void print(String str) {
        System.out.println(str + " : " + Thread.currentThread().getName());
    }

}
