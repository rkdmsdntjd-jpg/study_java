package ex5_staticBank;

public class Bank {
    private String point;
    private String telNum;
    static float interest = 10f;//메모리 공간에 하나만 존재, 어디서나 접근 가능(클내스 내부 + 변수가 선언된 클래스)
    static final int NUM = 10;  //클래스에 하나만 존재하고(static), 값을 다시 바꿀 수 없는(final) 변수

    public Bank(String point, String telNum){
        this.point = point;
        this.telNum = telNum;
    }

    public void info(){
        System.out.println("지점 : " + point);
        System.out.println("전화 : " + telNum);
        System.out.println("이자 : " + interest + "%");
        System.out.println("---------------------");
    }
}
