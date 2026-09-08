package src.ex2;

import java.util.Set;

public abstract class Transaction {//부모 추상 클래스
    protected User user;
    protected User send;
    protected User saveUser;
    protected User saveSend;

    protected Set<User> set = new UserRead().loadAll();
    protected String transName;

    public Transaction(User user, String t){
        this.user = user;
        this.transName = t;
    }
    
    public abstract boolean execute(int money);

    public User getSend() {
        return send;
    }

    public String getTransName(){
        return transName;
    }
    public void setSaveUser(User u) {
        saveUser = new User(u.getId(), u.getPassword(), u.getName(), u.getAccountNumber(), u.getBalance());
    }
    public void setSaveSend(User u) {
        saveSend = new User(u.getId(), u.getPassword(), u.getName(), u.getAccountNumber(), u.getBalance());
    }
}
