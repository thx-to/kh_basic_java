package JAVA_241011_07_ExceptionHandling;

import java.io.IOException;

public class ExceptionMain {
    public static void main(String[] args) {

        IOSample ioSample = new IOSample();

        try {
            ioSample.input();
        } catch (IOException e) {
            System.out.println("호출된 메소드에서 예외 처리를 하지 않았기 때문에 호출된 예외 처리");
        }
        ioSample.output();

    }
}

// 예외처리 미루기
class IOSample {

    private int num;

    public void input() throws IOException {
        // read() 문자 입력을 받아 ASCII 코드 값으로 반환
        num = System.in.read();
    }

    public void output() {
        System.out.println(num);
    }

}
