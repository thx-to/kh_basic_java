package JAVA_241010_03_학생성적정렬하기예제_강사님코드ArrayList;
// 5명의 학생에 대해 이름과 국어, 영어, 수학 성적을 입력받아 정렬하기
// 총점 기준 성적순(내림차순), 총점이 같으면 이름의 사전순
// 자료 구조는 TreeSet을 사용해도 되고, ArrayList를 사용해도 됨
// TreeSet의 경우는 중복 제거가 되므로 유일한 키가 없는 경우 주의해야 함 (이름도 같고 총점도 같은 경우 중복제거됨)
// ArrayList는 자동 정렬이 안됨

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class StudentSortEx<S> {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Student> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            System.out.print("이름 입력 : ");
            String name = sc.next();
            System.out.print("국어 성적 : ");
            int kor = sc.nextInt();
            System.out.print("영어 성적 : ");
            int eng = sc.nextInt();
            System.out.print("수학 성적 : ");
            int mat = sc.nextInt();

            // add할 때 해당 Student 객체에 있는 Compare라는 메소드를 보고 자동 정렬
            // tree를 왼쪽에 붙일지 오른쪽에 붙일지 자동으로 정함
            list.add(new Student(name, kor, eng, mat));
        }

        // Collections.sort() 기본 내림차순 정렬
        Collections.sort(list);

        System.out.println("====== 결과 출력 ======");
        for (Student e : list) {
            // toString 오버라이딩을 안하면 패키지이름.클래스이름@해시코드값이 찍힘
            // 이렇게(toString 오버라이딩) 안하고 직접 프린트 내용을 설정해도 됨
            System.out.println(e);
        }

    }
}
