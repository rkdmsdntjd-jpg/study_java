package src.ex2;

public class BankHandler{
    private User user;
    private Transaction tran;

    public BankHandler(User user){//생성자
        this.user = user;
    }

    public boolean deposit(int money) {//입금
        tran = new Deposit(user);
        return execute(money);
    }

    public boolean withdraw(int money) {//출금
        tran = new Withdraw(user);
        return execute(money);
    }

    public boolean remittance(int money) {//송금
        tran = new Remittance(user);
        return execute(money);
    }

    public User inquiry() {//조회
        return user;
    }

    private boolean execute(int money) {

        User savePoint = new User(
            user.getId(),
            user.getPassword(),
            user.getName(),
            user.getAccountNumber(),
            user.getBalance()
        );

        UserWrite uw = new UserWrite();

        if (tran.execute(money)) {
            uw.writeInfo(user);
            // 송금일 경우 상대방 정보 저장
            if (tran.getSend() != null) {
                uw.writeInfo(tran.getSend());
            }
            return true;
        }
        // 실패하면 기존 상태 복구
        user.setBalance(savePoint.getBalance());
        uw.writeInfo(savePoint);
        return false;
    }
}
