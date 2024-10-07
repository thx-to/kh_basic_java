package JAVA_240926_01_회원정보예제;
// 회원정보예제
// 이름은 String 클래스로 입력받기
// 나이는 정수타입으로 입력받기(int), 0~199까지만 정상으로 간주, 이외의 값이 입력되면 재입력 요구
// 나이에 숫자가 아닌 값이 오는 경우 발생하는 오류는 일단 무시 (개별진행)
// 성별은 문자 타입으로 입력받기(char), 남성은 'M'과 'm', 여성은 'F'와 'f'
// 성별 출력은 "남성", "여성"
// 직업은 정수 1~4로 입력, 1은 "학생", 2는 "회사원", 3은 "주부", 4는 "무직"
// 모든 입력이 완료되면 결과는 한번에 출력

// void는 반환값이 없음 ex) public void
// 반환값이 있는 경우에는 클래스 접근 제한자 뒤 해당 타입을 기재 ex) public int


import java.util.Scanner;

public class Member {

    // 필드 추가 (필드 : 클래스 내에 존재하는 변수를 지칭, 인스턴스 필드 / 정적 필드 / 지역 필드)
    // 파이썬은 인스턴스 변수 만들려면 생성자 내에 넣어줘야 함
    // 자바는 클래스 내에 선언하면 됨
    // private 접근 제한자 : 같은 클래스 내에서만 접근 가능
    private String name; // 기존에는 String name; 으로 단순 선언만 함
    private int age;
    private char gender;
    private int job;

    // 입력을 받기 위한 스캐너 생성
    // final은 변수가 대입되고 바뀌지 않음, 상수 선언 키워드
    private final Scanner sc = new Scanner(System.in);

    // 생성자 : 클래스를 호출하기 위해 생성하는 메서드
    // 생성자는 클래스 이름과 동일, 본 파일 기준으로는 'member() {}' 형태
    // 자바에서 생성자를 만들지 않으면 기본 생성자가 자동으로 만들어짐
    // 여기에서는 안넣기로 함
    // 객체 생성과 동시에 인스턴스 필드에 대한 초기값을 넣어주는 용도로 사용

    // 클래스 문법에 매개변수가 없는 경우가 많음, 빈 소괄호()
    // 내부 인스턴스 필드에서 업데이트하기 때문에 외부에 반환값이 없어도 됨

    public void setName() {

        // 이름을 입력하는 함수 만들기
        System.out.print("이름 : "); // 위와 같은 클래스 내에 있어서 private이지만 접근 가능
        name = sc.nextLine(); // 인스턴스 필드

    }


    public void setAge() {
        while (true) { // true를 쓰는 이유는, 정상적인 입력이 아니면 재입력을 받아야 하기 때문

            // 나이를 입력하는 함수 만들기
            System.out.print("나이 : "); // 위와 같은 클래스 내에 있어서 private이지만 접근 가능
            age = sc.nextInt(); // 인스턴스 필드

            // break는 해당 블럭 끝까지 갔다가 끝남
            // return은 여기서 끝내고 호출 지점으로 되돌아감 (호출한 쪽으로 결과를 되돌려준다)
            // 끝까지 갈 필요가 없다면 return이 효율적임
            // else는 해당 조건이 아니면 만나라는 것, 조건에 해당하게 되면 어차피 만나기 전에 나가게 되니까 else가 필요 없는 if문이 됨
            if (age >= 0 && age < 200) return; // 정상 범주 입력시 return, 아래 문장은 못만남
            System.out.println("나이를 잘못 입력하셨습니다.");

        }
    }


    public void setGender() {

        // 성별을 입력하는 함수 만들기
        System.out.print("성별 : "); // 위와 같은 클래스 내에 있어서 private이지만 접근 가능
        gender = sc.next().charAt(0); // 인스턴스 필드, 문자열에 대한 입력은 문자열에 대해 해당 인덱스의 문자를 추출 charAt

        switch (gender) {
            // case 'M' : case 'm' : case 'F' : case 'f' : return; 이렇게 한줄로도 표기 가능
            // if문으로 하면 else if를 3번 써줘야되기 때문에 여기에서는 switch문이 더 효율적임
            case 'M' :
            case 'm' :
            case 'F' :
            case 'f' :
                return; // 정상 입력시 return, break를 쓰면 continue도 써야되고 빠져나가는 것을 고민해야 해서 return이 더 쉬움
            default :
                System.out.println("성별을 잘못 입력하셨습니다.");
                // return 대신 break를 쓴다면 continue는 이자리, continue는 반복문의 조건식으로 되돌아가는 분기문

        } // return 대신 break를 쓴다면 break는 이자리
    }


    public int getGenderType() { // int라는 반환타입이 존재해서 void를 쓰지 않음

        // 'M', 'm'이면 1, 아니면('F', 'f') 2를 반환하는 함수 만들기
        if (gender == 'M' || gender == 'm') return 1;
        else return 2;

    }


    public void setJob() {
        while(true) { // true를 쓰는 이유는, 정상적인 입력이 아니면 재입력을 받아야 하기 때문

            // 직업을 입력하는 함수 만들기
            System.out.print("직업 : "); // 위와 같은 클래스 내에 있어서 private이지만 접근 가능
            job = sc.nextInt(); // 인스턴스 필드

            // 0보다 크고 5보다 작으면(1~4) return
            if (job > 0 && job < 5) return;
            System.out.println("직업을 잘못 입력하셨습니다.");

        }
    }


    public void getInfo() {

        // 입력된 값과 배열의 인덱스를 일치시키기 위해 첫번째를 비워둠
        // 인덱스는 0부터니까
        // 화면에 출력하기 위한 문자열 구성
        String[] genderStr = {"", "남성", "여성"};
        String[] jobStr = {"", "학생", "회사원", "주부", "무직"};

        // 실제 출력 문자열
        System.out.println("====== 회원 정보 ======");
        System.out.println("이름 : " + name); // 인스턴스 필드인 name에 입력이 되어 있음
        System.out.println("나이 : " + age); // 인스턴스 필드인 age에 입력이 되어 있음

        System.out.println("성별 : " + genderStr[getGenderType()]);
        System.out.println("직업 : " + jobStr[job]);

    }

}

