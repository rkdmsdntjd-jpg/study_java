package ex04_work;

public class ExVending {
    private ExCan[] cans = new ExCan[5];

    public void init(){
        cans[0] = new ExCan("환타", 1000, 10);
        cans[1] = new ExCan("사이다", 900, 10);
        cans[2] = new ExCan("제로콜라", 1300, 10);
        cans[3] = new ExCan("이프로", 1200, 10);
        cans[4] = new ExCan("토마토주스", 1500, 10);
    }

    //자판기가 가지고 있는 기능
    
    //돈을 투입: 먹을 수 있는 음료 목록 보여주기
    public void showDrink(int money){
        for (int i = 0; i < cans.length; i++) {
            if(cans[i].getPrice() <= money){
                cans[i].showName();
            }
        }
    }

    public boolean ablePayDrink(String name, int money){
        for (int i = 0; i < cans.length; i++) {
            if(name.equals(cans[i].getName())){
                if(money >= cans[i].getPrice()){
                    return true;
                }
                else
                    return false;
            }
        }
        return false;
    }

    public int payment(String name, int money){
        for (int i = 0; i < cans.length; i++) {
            if(name.equals(cans[i].getName())){
                cans[i].payCan();
                System.out.println(cans[i].getName() + "이(가) 하나 나왔습니다.");
                money -= cans[i].getPrice();
            }
        }
        return money;
    }
}
