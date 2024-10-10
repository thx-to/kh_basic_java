package JAVA_241010_03_Comparable_학생성적정렬하기예제_강사님코드;
// 인터페이스 상속 implements
public class Student implements Comparable<Student> {
    String name;
    int kor;
    int eng;
    int mat;

    @Override
    public int compareTo(Student o) {
        // 총점이 현재 객체(this)보다 다음 객체(o)가 크면 정렬(양수, 뒤집다)
        // 총점은 높은사람이 먼저, 내림차순 기준으로
        if (this.getTotalScore() < o.getTotalScore()) return 1;
        // 총점이 같으면 이름순 정렬
        else if (this.getTotalScore() == o.getTotalScore()) {
            return this.name.compareTo(o.name);
        } else {
            return -1;
        }
    }
    // 간단한 코드
    // 같지않으면
    // if (this.getTotalScore() != o.getToTalScore()) {
    // 뒤 값(o.getTotalScore)이 앞 값(this.getTotalScore)보다 큰 경우가 양수(뒤에서 앞 뺀 수가 양수인 경우, 뒤집어 정렬)
    //     return o.getTotalScore() - this.getTotalScore();
    // }

    @Override
    // 문자열을 내부적으로 찍어줄 때 toString으로 간편하게 사용
    public String toString() {
        return name + " : " + getTotalScore();
    }

    public Student(String name, int kor, int eng, int mat) {
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.mat = mat;
    }

    public int getTotalScore() {
        return kor + eng + mat;
    }

}
