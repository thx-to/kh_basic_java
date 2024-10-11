package JAVA_241008_05_커피메뉴만들기예제_내꺼;

public class MenuInfo {

    private String name;
    private int price;
    private String category;
    private String desc;



    // 생성자와 getter setter는 쓸지 모르겠지만 generator를 사용해 다 만들어줌
    public MenuInfo(String name, int price, String category, String desc) {
        this.name = name;
        this.price = price;
        this.category = category;
        this.desc = desc;
    }



    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public String getCategory() {
        return category;
    }

    public String getDesc() {
        return desc;
    }



    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
