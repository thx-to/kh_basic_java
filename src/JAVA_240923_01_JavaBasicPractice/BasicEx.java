package JAVA_240923_01_JavaBasicPractice;

public class BasicEx {
    // public은 접근제한자(외부에서 보여질지 말지), static은 정적 메서드, void는 반환값이 없음을 의미
    // main은 프로그램의 시작 지점, 프로그램 실행시 인자값을 받기 위한 부분(인자값을 받을 수 있음)
    // string의 배열이라는 말, 문자열을 여러개 받을 수 있음
    public static void main(String[] args) {
        System.out.println("안녕하세요. 자바를 시작합니다.");
        System.out.print(7); // 정수값을 출력하고 줄바꿈 없음
        System.out.println(700);
        System.out.println("문자열을 이어서 " + "출력하기");
        System.out.println("성적 : " + 98 + 100); // 문자열 먼저 + 뒤에 정수 계산
        System.out.println(100 + 200 + "점수"); // 앞에 정수 계산 먼저 + 문자열 결합
        System.out.printf("%d점\n", 300); // 300이라는 정수타입에서 쓰는 서식을 넣어줘야 함, decimal
        System.out.printf("%s\n", "경기도 수원시"); // "경기도 수원시"라는 문자를 위한 서식을 넣어줌, string
        System.out.printf("%.2f\n", 3.14159245);

        String gender="MM"; // 자바의 문자와 문자열은 다르다, 문자는 c=character, 문자열은 s=string
        System.out.printf("%s\n", gender);

        int age = 23;
        String name = "쿵";

    }
}