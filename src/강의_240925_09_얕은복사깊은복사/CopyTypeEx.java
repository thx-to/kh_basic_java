package 강의_240925_09_얕은복사깊은복사;
//


public class CopyTypeEx {
    public static void main(String[] args) {



        // 얕은복사

        int[] arr1 = new int[3]; // 스택 영역에 arr1 주소, 배열은 헵 영역에
        int[] arr2 = arr1; // 헵 영역에 있는 arr1의 배열을 같이 바라보고 있음 > 코드 뒤쪽에 쓴게 값이 됨

        arr1[0] = 1;
        arr1[1] = 1;
        arr1[2] = 1;

        arr2[0] = 1000;
        arr2[1] = 2000;
        arr2[2] = 3000;

        for (int e : arr1) System.out.print(e + " "); // 출력값 1000 2000 3000, 얕은 복사가 일어났기 때문



    }
}