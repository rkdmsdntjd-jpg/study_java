package src.ex2;

import java.util.Scanner;

public class BankHandler{
    private User user;
    private Transaction tran;

    public BankHandler(User user){
        this.user = user;
    }
    public User getUser(){//추가
        return user;
    }


    public void runBank() {
        User savePoint = new User(
            user.getId(),
            user.getPassword(),
            user.getName(),
            user.getAccountNumber(),
            user.getBalance()
        );
        outerLoop:
        while (true) {
            System.out.println("-----------------------");
            System.out.println("1. 입금");
            System.out.println("2. 출금");
            System.out.println("3. 송금");
            System.out.println("4. 조회");
            System.out.println("0. 종료");
            System.out.println("-----------------------");
            int num = new Scanner(System.in).nextInt();

            switch (num) {
                case 1:
                    tran = new Deposit(user);
                    System.out.println("입금중...");
                    break;
                case 2:
                    tran = new Withdraw(user);
                    System.out.println("출금중...");
                    break;
                case 3:
                    tran = new Remittance(user);
                    System.out.println("송금중...");
                    break;
                case 4:
                    System.out.println("정보를 찾고 있습니다.");
                    new Inquiry().show(user);
                    continue;            
                case 0:
                    System.out.println("종료합니다.");
                    return;     
                default:
                    System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
                    continue outerLoop;
            }

            UserWrite uw = new UserWrite();

            if(tran.execute()){
                //정상 작동 
                uw.writeInfo(user);
                if(tran.getSend() != null){//송금일 경우
                    uw.writeInfo(tran.getSend());
                }
                System.out.println("정상적으로 처리되었습니다.");
            }
            else{
                uw.writeInfo(savePoint);
                System.out.println("처음부터 다시 실행해주세요.");
            }
        }
    }
}