package JAVA_241014_06_Stream4;
// 스트림을 사용한 중간 처리와 최종 연산

import java.util.ArrayList;
import java.util.List;

public class StreamEx4 {
    public static void main(String[] args) {

        List<Student> studentList = new ArrayList<>();

        // add에 객체를 넣어줌
        // 객체를 만들어주기 위해 하나하나 생성자를 불러줌
        studentList.add(new Student("PHAM", 100));
        studentList.add(new Student("KIM", 80));
        studentList.add(new Student("MO", 95));

        // 기존 방법으로 평균값 구하기
        int sum = 0;
        for (Student e : studentList) {
            sum += e.getScore();
        }
        System.out.println("(기존) 평균 : " + (double)sum/studentList.size());

        // 스트림 형태(중간, 최종 처리)로 평균값 구하기
        // double이라는 변수를 만들고 스트림 생성(스트림 형태로 변환)
        double average = studentList.stream()
                // 맵을 돌리는데, 결과값을 Int형으로 바꿔주는 메소드
                // map : 10개의 값이 들어오면 가공된 10개의 값을 반환
                // mapToInt List를 돌면서 score부분만 뽑아냄, sum을 누적하지 않고 average라는 메소드를 불러줌(getScore의 int값만 뽑아냄)
                // map이니까 10개의 score값이 있었다면 10rodml int값을 뽑아냄
                // orElse : 값이 없는 경우에는 0.0으로 대체해서 넣어줌 (빈 값이 들어왔을 때)
                // 람다식으로 .mapToInt(Student::getScore) 이렇게 축약 가능
                // .mapToInt(), .average()가 중간 연산(중개 연산)
                .mapToInt(e -> e.getScore())
                .average()
                // .orElse는 최종 연산
                // 스트림 생성인지, 중간 연산인지, 최종 연산인지 구분이 필요
                // 최종 연산을 하면 스트림이 끝나버림(지워짐), 다음 처리를 못함
                // orElse(최종 연산)가 오면 forEach 등 내부반복자 사용 불가
                .orElse(0.0);
        System.out.println("(스트림) 평균 : " + average);
        System.out.printf("(스트림 서식) 평균 : %.2f", average);


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

    // getter와 setter generate

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}