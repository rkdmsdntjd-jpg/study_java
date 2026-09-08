package src.mod;

import src.db.User;
import src.db.UserRead;

public class Send {

    private User sender, receiver;

    public Send(User user){
        sender = user;
    }
    
    //계좌
    public boolean findReceiver(int account){
        receiver = new UserRead().findByAccount(account);
        if(receiver != null)
            return true;
        return false;
    }

    public boolean sendMoney(int money){
        Banking bOut = new MoneyOut(sender);
        Banking bIn = new MoneyIn(receiver);

        boolean s = bOut.execute(money);
        boolean r = bIn.execute(money);

        if(!s || !r){
            bOut.rollback();
            bIn.rollback();
            return false;
        }
        bOut.commit();
        bIn.commit();
        return true;
    }

    public String nameReceiver(){
        return receiver.getId();
    }
}
