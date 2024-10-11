package JAVA_241010_03_학생성적정렬하기예제_내꺼;

public class Student implements Comparable<Student> {

    private String name;
    private int kor;
    private int eng;
    private int mat;
    private int total;

    @Override
    public int compareTo(Student o) {
        if (this.total > o.total) {
            return -1;
        } else {
            if (this.total == o.total) {
                return this.name.compareTo(o.name);
            } else {
                return 1;
            }
        }
    }

    public Student(String name, int kor, int eng, int mat) {
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.mat = mat;
        this.total = total;
    }

    public String getName() {
        return name;
    }
    public int getKor() {
        return kor;
    }
    public int getEng() {
        return eng;
    }
    public int getMat() {
        return mat;
    }
    public int getTotal() {
        return kor + eng + mat;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setKor(int kor) {
        this.kor = kor;
    }
    public void setEng(int eng) {
        this.eng = eng;
    }
    public void setMat(int mat) {
        this.mat = mat;
    }
    public void setTotal(int total) {
        this.total = kor + eng + mat;
    }


}


