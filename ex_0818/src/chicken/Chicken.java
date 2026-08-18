package chicken;

public class Chicken {
    private int price = 8000;
    private String name = "후라이드";

    public void order(){
        System.out.println(price + "원 " + name + " 치킨을 주문");
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setPrice(int price) {
        this.price = price;
    }
}
