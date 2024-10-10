package JAVA_241010_02_Comparable;
// Comparable은 나와 다른 객체를 비교할 때 사용 (1인칭)
// 제네릭은 타입변수로 어떤 타입이든 들어올 수 있게 함
// 여기서는 <Car>로 제한하여, Car 타입만 들어올 수 있게 함

public class Car implements Comparable<Car> {

    private String name;
    private int year;
    private String color;

    // generate로 Override Methods 자동 생성
    // 클래스 내부에 있는 인스턴트 필드 조건으로 정렬
    // 정렬 조건을 넣어줘야 함
    @Override
    public int compareTo(Car o) {

        // 연식이 같으면
        if (this.year == o.year) { // 현재 객체인 나 = this의 연식 = this.year

            // 모델 이름으로 사전순 정렬
            int rst = this.name.compareTo(o.name);
            // 비교 조건에 대한 반환값이 0이면 중복 제거 (같은 연식에 이름도 색상도 같은 경우)
            // 0인 경우 : 이름도 연식도 같은 경우
            if (rst == 0) {
                // 색깔까지도 같으면 중복으로 간주해 제거
                return this.color.compareTo(o.color);
            } else return rst;
            // 연식이 앞이 뒤보다 크면 (앞이 더 최신이면) 정렬 (뒤집어)
            // 오름차순 정렬, 연식이 오래된 것부터 출력
        } else if (this.year > o.year) return 1;

        // 아니면 정렬하지 않음
        else return -1;

    }

    // generate로 매개변수가 전부인 생성자 자동 생성
    public Car(String name, int year, String color) {
        this.name = name;
        this.year = year;
        this.color = color;
    }

    // generate로 getter 전부 자동 생성
    public String getName() {
        return name;
    }
    public int getYear() {
        return year;
    }
    public String getColor() {
        return color;
    }

    // generate로 setter 전부 자동 생성
    public void setName(String name) {
        this.name = name;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public void setColor(String color) {
        this.color = color;
    }

}
