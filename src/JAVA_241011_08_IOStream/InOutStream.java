package JAVA_241011_08_IOStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class InOutStream {
    public static void main(String[] args) {

        FileInputStream inputStream = null;

        try {
            inputStream = new FileInputStream("src/JAVA_241011_08_IOStream/chicken.txt");
        } catch (FileNotFoundException e) {
            System.out.println(e + " 파일을 찾지 못했습니다.");
        }
        Scanner sc = new Scanner(inputStream);

        // hasNextLine() : 읽을 라인이 있으면
        // 한줄씩 읽어내라
        // has구문
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            System.out.println(line);
        }
    }
}
