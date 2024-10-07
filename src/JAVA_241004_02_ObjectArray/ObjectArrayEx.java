package JAVA_241004_02_ObjectArray;

import java.util.Scanner;

public class ObjectArrayEx {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        // 배열은 크기를 지정해야 함 (가장 치명적인 단점, 정적 크기 잡기)
        // ArrayList는 적정한 크기를 알아서 잡아둠, 크기를 지정할 필요가 없음
        System.out.print("입력 인원 : ");
        int cnt = sc.nextInt();

        // 객체를 저장할 배열(NameCard 클래스 타입의 배열) 생성 및 입력받은 사이즈대로 크기 지정
        // 참조 타입(배열)이기 때문에 nameCards에 대한 객체 주소가 들어옴
        NameCard[] nameCards = new NameCard[cnt];

        System.out.println("정보 입력");
        System.out.println("-".repeat(16));

        // 배열이라서 length가 길이
        for (int i = 0; i < nameCards.length; i++) {

            // 객체를 만들고 주소를 대입해줘야 함
            // 해당하는 배열의 인덱스에, 생성된 객체의 주소를 대입
            // 주소를 하나 만들고 그 주소를 배열의 i번째에 넣어줌
            nameCards[i] = new NameCard();

            // namdCards 배열의 i번째에 setName(스캐너를 통해 입력받은 배개변수)을 넣어줌
            System.out.print("이름 : ");
            nameCards[i].setName(sc.next());

            System.out.print("나이 : ");
            nameCards[i].setAge(sc.nextInt());

            System.out.print("전화번호 : ");
            nameCards[i].setPhone(sc.next());

            System.out.print("이메일 : ");
            nameCards[i].setEmail(sc.next());

        }

        for (NameCard e : nameCards) {
            e.printInfo();
        }


    }
}
