package src.ex2;

import java.util.Scanner;

public class Withdraw extends Transaction{//출금

 
    public Withdraw(User user){
        super(user, "입금");
    }
    //출금
    @Override
    public boolean execute(int money) {
        System.out.println(user.getName() + "님 어서오세요.");
        System.out.println("출금할 금액을 입력하세요");
        System.out.print(" >> ");
        money = new Scanner(System.in).nextInt();

        if(money <= 0){
            System.out.println("출금할 금액이 0보다 작을 수 없습니다.");
            return false;
        }
        if(money > user.getBalance()){
            System.out.println("잔액이 부족합니다.");
            return false;
        }
        user.setBalance(user.getBalance() - money);
        return true;//출금이 완료되었을 때.
    }
}
