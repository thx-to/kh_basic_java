package JAVA_241010_03_Comparable_학생성적정렬하기예제_내꺼;
// 5명의 학생에 대해 이름과 국어, 영어, 수학 성적을 입력받아 정렬하기
// 총점 기준, 총점이 같으면 이름의 사전순
// 자료 구조는 TreeSet을 사용해도 되고, ArrayList를 사용해도 됨
// TreeSet의 경우는 중복 제거가 되므로 유일한 키가 없는 경우 주의해야 함

import java.util.Scanner;
import java.util.TreeSet;

public class StudentSortEx<S> {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        TreeSet<Student> treeSet = new TreeSet<>();
        for(int i = 0; i < 5; i++) {
            System.out.print("학생 " + (i+1) + "의 이름과 국어, 영어, 수학 성적을 공백 기준으로 입력하세요 : ");
            String name = sc.next();
            int kor = sc.nextInt();
            int eng = sc.nextInt();
            int mat = sc.nextInt();
            treeSet.add(new Student(name, kor, eng, mat));
        }

        for (Student e : treeSet) {
            System.out.println("이름 : " + e.getName() + " / 총점 : " + e.getTotal());
        }

    }
}
