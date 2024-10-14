package JAVA_241011_09_자바파이널실습문제_강사님코드;
//- 임의의 위치에 텍스트 파일을 만들고, 10명의 정보를 공백 기준으로 미리 입력 해둠.
//- 이름 국어 영어 수학  형식
// 해당 파일을 읽어 총점을 구하고
// 총점이 높은 사람 순으로 이름과 총점 보여주기(총점이 같은 경우 이름순)

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class JavaFinalReportMain {
    public static void main(String[] args) {


        FileInputStream inputStream = null;
        try {
            // 상대 경로로 파일 가져오기
            // 파일이 없는 경우를 대비해서 try catch 구문 사용
            inputStream = new FileInputStream("src/JAVA_241011_09_자바파이널실습문제_강사님코드/student.txt");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        // 입력을 받기 위한 Scanner 객체 생성
        // 입력은 파일로부터 읽어들임(System.in)이 아닌 부분..
        Scanner sc = new Scanner(inputStream);

        // 10명의 데이터를 파일에서 읽어들여 객체로 만들고 리스트에 저장
        // TreeSet은 중복 제거가 강력하고 자동 정렬이 되기 때문에 더 빠름
        // List는 입력되는 순서대로 저장, 정렬을 위해서는 sort 메소드를 불러줘야 함
        List<Student> list = new ArrayList<>();

        // hasNextLine() : 읽어들일 Line이 있으면 True
        while (sc.hasNextLine()) {

            // 문자열 1개의 Line을 읽어들여 변수(String 타입)에 담음
            String line = sc.nextLine();

            // split() : 문자열을 자름
            // 공백 기준으로 문자열을 잘라내 문자열 배열을 만듦
            // spilt에는 정규 표현식을 넣을 수도 있음 (여러 처리가 가능)
            String[] splitLine = line.split(" ");

            // 리스트에 대해 아래 Student 클래스 및 Student 객체 만들어주기
            // 생성자를 통해 Student 객체를 리스트에 추가
            // 생성자의 매개변수로 전달되는 내용(객체의 정보)은 파일에서 읽어들인 각 라인의 정보
            // Student 클래스로 만들어진 객체의 생성자를 통해 매개변수를 들여옴
            // 국어, 영어, 수학 성적은 연산이 필요하므로 정수 타입으로 형 변환 (Integer.parseInt)
            // 타입 변환 메소드 1) Integer.parseInt() : 문자열을 정수 int 타입으로 변환
            // 타입 변환 메소드 2) Double.parseDouble() : 문자열을 실수 double 타입으로 변환
            list.add(new Student(splitLine[0], Integer.parseInt(splitLine[1]),
                    Integer.parseInt(splitLine[2]), Integer.parseInt(splitLine[3])));
        }

        // 리스트를 정렬할 때 사용하는 메소드
        // 리스트의 객체를 정렬하는 경우 Comparable을 상속받아 compareTo를 구현해줘야 함
        // Comparable에 있는 compareTo 방식으로 정렬
        Collections.sort(list);

        // 향상된 for문으로 리스트를 순회하면서 요소를 출력
        // 그냥 e라고 찍어도 되는 이유 : 해당 요소의 객체가 toString을 오버라이딩하는 경우에는 메소드 접근 없이(그냥 e라고 찍어도) toString 내용 출력
        for (Student e : list) System.out.println(e);
    }
}

class Student implements Comparable<Student>{
    String name;
    int kor;
    int eng;
    int mat;

    public Student(String name, int kor, int eng, int mat) {
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.mat = mat;
    }
    public int getTotalScore() {
        return kor + eng + mat;
    }

    @Override
    public int compareTo(Student o) {
        if(this.getTotalScore() != o.getTotalScore()) {

            // 결과가 양수이면 정렬 조건이 됨
            // 두번째 Score가 첫번째 Score보다 큰 경우 정렬 (뒤가 앞으로)
            return o.getTotalScore() - this.getTotalScore();
        } else {

            // 총점이 같은 경우에는 사전순 정렬
            // compareTo는 문자열 비교 메소드
            return this.name.compareTo(o.name);
        }
    }
    @Override
    public String toString() {
        return name + " : " + getTotalScore();
    }
}



