package ex2_constructor;

public class Pen {
    private String name;
    private String color;
    private int price;
    private boolean limited;
    
    public Pen(){
        name = "모나미153";
        color = "black";
        price = 500;
        limited = false;
    }

    public Pen(boolean limited){
        this.limited = limited;
        if(limited){
            name = "모나미153-G";
            color = "gold";
            price = 20000;
        }
        else{
            name = "모나미153";
            color = "black";
            price = 500;
        }
    }

    public Pen(String name, String color, int price, boolean limited){
        this.name = name;
        this.color = color;
        this.price = price;
        this.limited = limited;
    }

    public void info(){
        System.out.println("이름 : " + name);
        System.out.println("가격 : " + price);
        System.out.println("색상 : " + color);
        if(limited)
            System.out.println("한정 판매");
        else
            System.out.println("상시 판매");
        System.out.println("-----------------");
    }
}
