package ex04_work;

public class ExCan {
    private String name;
    private int price;
    private int quantity;

    public ExCan(String name, int price, int quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public void setQuantity(int refill){
        quantity = refill;
    }

    public String getName(){
        return name;
    }
    public int getPrice(){
        return price;
    }
    public void payCan(){
        if(quantity == 0){
            System.out.println("재고 없음");
            return;
        }
        quantity--;
    }
    public void showName(){
        if(quantity > 0)
            System.out.println(name + " : " + price + "원");
    }

}
