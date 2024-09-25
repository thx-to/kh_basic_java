package 강의_240925_08_이차원배열;

public class DoubleArrEx {
    public static void main(String[] args) {



        // 2행 3열의 배열 만들고 1~6까지 숫자 넣기

        int[][] arr = new int[2][3]; // 2행 3열의 배열, 가로 세칸 세로 두칸 총 여섯칸
        int cnt = 1; // 0,0(첫번째 칸)에 1을 넣고 시작함
        for (int i = 0; i < arr.length; i++) { // i++에서 i값은 수행(블록) 끝나고 증가함
            for (int j = 0; j < arr[i].length; j++) { // j는 arr의 i번째까지
                arr[i][j] = cnt++;
            }
        }


        for (int[] ee : arr) { // 이차원 배열에 일차원 배열이 두개 들어감, arr은 2차원 배열에 대한 참조 변수로 배열 전체를 가리킴
            for (int e : ee) {
                System.out.print(e + " ");
            }
            System.out.println();
        }



        // 이렇게해도 똑같음

        int[][] arr1 = new int[2][3];
        int cnt1 = 1;
        for (int i = 0; i < arr1.length;) { // i++ 값 위치변경
            for (int j = 0; j < arr1[i].length;) { // j+ 값 위치변경
                arr1[i][j] = cnt1++;
           j++; // 닫는 블록 바로 앞에, +1은 마지막에 됨
            }
        i++; // 닫는 블록 바로 앞에, +1은 마지막에 됨
        }

        for (int[] ee : arr1) {
            for (int e : ee) {
                System.out.print(e + " ");
            }
            System.out.println();
        }






        /*

        // 문자열 배열의 첫자 따서 출력하기
        String[] strArr = {"Java", "Python", "C++", "C", "Kotlin"};

        for (String e : strArr) {
            System.out.print(e.charAt(0));
        }
        */




    }
}
