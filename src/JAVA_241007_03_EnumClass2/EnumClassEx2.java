package JAVA_241007_03_EnumClass2;


enum DevType {
    MOBILE, FRONTEND, BACKEND, DBA, ANALYSIS
}


enum Career {
    JUNIOR, SENIOR
}


enum Gender {
    MALE, FEMALE
}


class Developer {

    // 인스턴스 필드 정하기
    // name은 문자열 타입
    private String name;

    // 인스턴스 필드 정하기
    // type은 DevType
    private DevType type;
    private Career career;
    private Gender gender;

    // generator로 생성자 만들기
    public Developer(String name, DevType type, Career career, Gender gender) {
        this.name = name;
        this.type = type;
        this.career = career;
        this.gender = gender;
    }

    public void devInfo() {
        System.out.println("이름 : " + name);
        System.out.println("업무 : " + type);
        System.out.println("경력 : " + career);
        System.out.println("성별 : " + gender);
    }
}


public class EnumClassEx2 {
    public static void main(String[] args) {

        Developer developer = new Developer("PHAM", DevType.BACKEND, Career.SENIOR, Gender.FEMALE);
        developer.devInfo();

    }
}
