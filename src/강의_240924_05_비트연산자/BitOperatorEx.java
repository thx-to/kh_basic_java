package 강의_240924_05_비트연산자;

public class BitOperatorEx {
    public static void main(String[] args) {

        int num1 = 10; // 1010
        int num2 = 12; // 1100
        System.out.println(num1 & num2); // and라서 1000 = 8
        System.out.println(num1 | num2); // or라서 1110 = 14
        System.out.println(num1 ^ num2); // xor라서 110 = 6, 같으면 0 다르면 1
        System.out.println(num1 << 1); // 1010에서 한칸씩 왼쪽으로 10100 = 20
        System.out.println(num1 >> 1); // 1010에서 한칸씩 오른쪽으로 101 = 5
        System.out.println(~num1); // -11, 원래는 부호만 바꾸어 -10이어야 하는데 2의 보수 표기법이라 -11
    }
}
