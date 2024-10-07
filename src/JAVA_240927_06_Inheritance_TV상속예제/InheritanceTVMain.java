package JAVA_240927_06_Inheritance_TV상속예제;

public class InheritanceTVMain {
    public static void main(String[] args) {

        ProductTV lgTV = new ProductTV("우리집 TV");
        lgTV.setPower(true);
        lgTV.setVolume(30);
        lgTV.setChannel(30, true); // 인터넷 모드라서 채널이 바뀌지 않음
        lgTV.tvInfo();

        // 부모 클래스의 참조 변수로서 자식 객체를 사용 (자식 객체를 참조)
        ProtoTypeTV ssTV = new ProductTV("남의집 TV");


    }
}
