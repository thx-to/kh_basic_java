package JAVA_241011_09_자바파이널실습문제_내꺼;
// 임의의 위치에 텍스트 파일을 만들고
// 10명의 정보를 공백 기준으로 미리 입력

// 이름 국어 영어 수학
// 해당 파일을 읽어 총점을 구하고
// 총점이 높은 사람 순으로 이름과 총점 보여주기
// 총점이 같은 경우 이름순

// Hint 1) TreeSet이나 ArrayList 활용
// Hint 2) Student Class 사용, implements Comparable, 생성자 및 getTotalScore 메소드 생성
// Hint 3) CompareTo 오버라이드 구현, 점수 같지 않을때 내림차순 및 같을 때 이름순
// Hint 4) toString 오버라이딩
// Hint 5) main() 메소드에 FileInputStream 및 Scanner 넣어주기
// Hint 6) ArrayList 만들고 10개 넣기
// Hint 7) while문에서 한줄씩 읽어내기 hasNextLine
// Hint 8) Line을 split 기준으로 나누기, 0번 이름 1번 국어 2번 영어 3번 수학
// Hint 9) ArrayList에 add
// Hint 10) ArrayList니까 sort 한번 돌려주기 (Collections)

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


public class JavaFinalReportMain {
    public static void main(String[] args) throws FileNotFoundException {

        try {

            FileInputStream inputStream = new FileInputStream("src/JAVA_241011_09_자바파이널실습문제_내꺼/score.txt");
            List<Score> list = new ArrayList<>();
            Scanner sc = new Scanner(inputStream);

            while (sc.hasNextLine()) {

                for (int i = 0; i < 10; i++) {
                    String name = sc.next();
                    int kor = sc.nextInt();
                    int eng = sc.nextInt();
                    int mat = sc.nextInt();
                    list.add(new Score(name, kor, eng, mat));
                }

                Collections.sort(list);

                System.out.println("결과 출력");
                for (Score e : list) {
                        System.out.println(e);
                }
            }


        } catch (FileNotFoundException e) {
            System.out.println(e + " 파일을 찾지 못했습니다.");
        }

    }
}

class Score implements Comparable<Score> {

    public String name;
    public int kor;
    public int eng;
    public int mat;

    @Override
    public int compareTo(Score o) {
        if (this.getTotalScore() < o.getTotalScore()) return 1;
        else if (this.getTotalScore() == o.getTotalScore()) {
            return this.name.compareTo(o.name);
        } else {
            return -1;
        }
    }

    @Override
    public String toString() {
        return name + " : " + getTotalScore();
    }

    public Score(String name, int kor, int eng, int mat) {
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.mat = mat;
    }

    public int getTotalScore() {
        return kor + eng + mat;
    }

}