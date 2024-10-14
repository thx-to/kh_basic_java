package JAVA_241014_04_Stream2;

import java.util.ArrayList;
import java.util.List;

public class StreamEx2 {
    public static void main(String[] args) {

        // list라는 이름의 리스트를 만들고
        List<Student> list = new ArrayList<>();

        // add를 해줌
        list.add(new Student("PHAM", 100));
        list.add(new Student("KIM", 77));

        // 리스트 순회하기
        // 향상된 for문 대신 내부반복자(forEach, List 안에 있는 반복자) 사용, 추후 병렬 처리 등도 가능
        // 향상된 for문은 외부에 있는 반복자를 사용하여 순회하는 것
        list.stream().forEach(s -> {
            System.out.println(s.getName() + " : " + s.getScore());
        });
    }
}


class Student {

    private String name;
    private int score;

    // 생성자 generate
    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    // getter generate
    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

}