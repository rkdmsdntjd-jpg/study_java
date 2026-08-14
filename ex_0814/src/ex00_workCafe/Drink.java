package ex00_workCafe;

public class Drink {
    private String name;
        private int cnt = 0;
        private int price;

    Drink(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public void printMenu() {
        System.out.printf("%s : %d원 %d개\n", name, price, cnt);
        System.out.println("=".repeat(30));
    }
    public void orderDrink(){
        cnt++;
    }
    public String getName(){
        return name;
    }

    public int getSales() {
        return cnt * price;
    }

    public int getCnt() {
        return cnt;
    }
}
