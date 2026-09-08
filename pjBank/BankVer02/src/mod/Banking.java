package src.mod;

import src.db.User;
import src.db.UserWrite;

public abstract class Banking {//부모 추상 클래스
    private User savePoint;
    protected User user;
  
    public Banking(User user){
        this.user = user;
        savePoint = new User(
            user.getId(),
            user.getPassword(),
            user.getName(),
            user.getAccountNumber(),
            user.getBalance()
        );
    }
    
    public abstract boolean execute(int money);

    public User getUser() {
        return user;
    }

    public void rollback(){
        new UserWrite().writeInfo(savePoint);
    }

    public void commit(){
        new UserWrite().writeInfo(user);
    }
}
