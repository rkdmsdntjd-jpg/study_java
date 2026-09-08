package src.db;

import java.io.Serializable;

public class User implements Serializable{
    //멤버 : 아이디, 비밀번호, 이름, 계좌번호, 잔액
    private String id;
    private String password;
    private String name;
    private int accountNumber;
    private long balance;
    //생성자(String id, String password, String name, int account, int balance)
    public User(String id, String password, String name, int accountNumber, long balance){
        this.id = id;
        this.password = password;
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    //getter all
    public String getId() {
        return id;
    }
    public String getPassword() {
        return password;
    }
    public String getName() {
        return name;
    }
    public int getAccountNumber() {
        return accountNumber;
    }
    public long getBalance() {
        return balance;
    }
    //setBalance
    public void setBalance(long balance) {
        this.balance = balance;
    }
}