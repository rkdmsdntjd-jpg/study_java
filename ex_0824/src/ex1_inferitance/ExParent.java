package ex1_inferitance;

public class ExParent {//부모 클래스
    private int money = 2000;
    String name = "김씨";

    public ExParent(){
        System.out.println("부모 클래스 생성");
    }

    protected int getMoney() {
        return money;
    }
}
