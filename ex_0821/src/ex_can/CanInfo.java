package ex_can;

public class CanInfo {
    private String name;
    private int price;

    public CanInfo (String name, int price){
        this.name = name;
        this.price = price;
    }
    public String getName() {
        return name;
    }
    public int getPrice() {
        return price;
    }
}
