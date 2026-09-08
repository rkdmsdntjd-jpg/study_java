package src.ex2;

import java.util.Scanner;

public class Deposit extends Transaction{//입금
    public Deposit(User user){
        super(user, "출금");
    }
    //입금
    @Override
    public boolean execute(int money) {                      
        // 입금 금액 검사
        if (money <= 0) {
            System.out.println("입금 금액은 0보다 커야 합니다.");
            return false;
        }
            
        // 기존 잔액 + 입금 금액
        user.setBalance(user.getBalance() + money);
            
        System.out.println(money + "원이 입금되었습니다.");
        return true;//입금이 완료되었을 때.
    }
}
