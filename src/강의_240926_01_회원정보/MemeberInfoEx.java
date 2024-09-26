package 강의_240926_01_회원정보;
// 회원정보예제
// 이름은 String 클래스로 입력받기
// 나이는 정수타입으로 입력받기(int), 0~199까지만 정상으로 간주, 이외의 값이 입력되면 재입력 요구
// 나이에 숫자가 아닌 값이 오는 경우 발생하는 오류는 일단 무시 (개별진행)
// 성별은 문자 타입으로 입력받기(char), 남성은 'M'과 'm', 여성은 'F'와 'f'
// 성별 출력은 "남성", "여성"
// 직업은 정수 1~4로 입력, 1은 "학생", 2는 "회사원", 3은 "주부", 4는 "무직"
// 모든 입력이 완료되면 결과는 한번에 출력

public class MemeberInfoEx {
    public static void main(String[] args) {

        // 멤버 클래스에 대한 객체를 생성하기 위해 기본 생성자 호출
        Member member = new Member();

        member.setName();
        member.setAge();
        member.setGender();
        member.setJob();
        member.getInfo();

    }
}
