package src.mod;

import src.db.User;

public class MoneyIn extends Banking{

    public MoneyIn(User user){
        super(user);
    }

    @Override
    public boolean execute(int money) {
        if(money <= 0){
            return false;
        }
        user.setBalance(user.getBalance() + money);
        return true;
    }
}
