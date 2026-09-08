package src.ex2;

public class Main {
    public static void main(String[] args) {
        Login lg = new Login();
        User user = lg.member();
        if(user != null){
            BankHandler bh = new BankHandler(user);
            //bh.runBank();
        }
    }
}
