package src.mod;

import src.db.User;

public class MoneyOut extends Banking{

    public  MoneyOut(User user){
        super(user);
    }

    @Override
    public boolean execute(int money) {
        
        if (money <= 0 || money > user.getBalance()) {
            return false;
        }
            
        // 참조하는 user객체 set잔액 메소드 호출 = 기존 잔액 + 출금 금액
        user.setBalance(user.getBalance() - money);
        return true;
    }
}
