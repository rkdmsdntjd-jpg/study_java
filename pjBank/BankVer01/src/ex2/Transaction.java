package src.ex2;

import java.util.Set;

public abstract class Transaction {//부모 추상 클래스
    protected User user;
    protected User send;
    protected Set<User> set = new UserRead().loadAll();

    public Transaction(User user){
        this.user = user;
    }
    
    public abstract boolean execute();

    public User getSend() {
        return send;
    }
}
