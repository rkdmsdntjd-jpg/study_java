package ex_can;

public class Vending {
    private CanInfo[] cans = new CanInfo[5];
    private int money;

    public Vending(){
        cans[0] = new CanInfo("환타", 1000);
        cans[1] = new CanInfo("콜라", 1100);
        cans[2] = new CanInfo("사이다", 1200);
        cans[3] = new CanInfo("몬스터", 1300);
        cans[4] = new CanInfo("맥콜", 1400);
    }

    public void showDrink(int money){
        this.money = money;
        System.out.println("------------------------");
        for (int i = 0; i < cans.length; i++) {
            if(cans[i].getPrice() <= money){
                System.out.println(cans[i].getName());
            }
        }
        System.out.println("------------------------");
    }
    public void dispense(String name){
        for (int i = 0; i < cans.length; i++) {
            if(cans[i].getName().equals(name)){
                System.out.println(cans[i].getName() + "이(가) 나왔습니다.");
                System.out.println("잔돈 반환 : " + (money - cans[i].getPrice()));
            }
        }
    }
}
