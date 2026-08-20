package ex03_work;

public class ExCustomer {
    private final int UNIQUE_KEY;
    private String name;
    private int money = 0;

    public ExCustomer(int account, String name){//초기화에 계좌만 개설
        this.UNIQUE_KEY = account;
        this.name = name;
    }
    public ExCustomer(int account, String name, int money){//초기화에 금액을 넣고 시작
        this.UNIQUE_KEY = account;
        this.name = name;
        this.money = money;
    }
    void addMoney(int money){
        this.money += money;
    }
    void subMoney(int money){

    }

    public int getUNIQUE_KEY() {
        return UNIQUE_KEY;
    }
    public int getMoney() {
        return money;
    }
    public String getName() {
        return name;
    }
}
