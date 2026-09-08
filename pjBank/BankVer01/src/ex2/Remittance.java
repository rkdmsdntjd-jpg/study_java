package src.ex2;

import java.util.Scanner;

public class Remittance extends Transaction {
    
    public Remittance(User user){
        super(user);
    }
    @Override
    public boolean execute() {
        //송금 시스템
        System.out.print("송금 계좌 입력 >> ");
        int account = new Scanner(System.in).nextInt();

        

        for (User u : set) {
            if(u.getAccountNumber() == account){//송금한 계좌를 찾은 경우
                System.out.printf("송금할 계좌\t: %d\n%s님이 맞습니까?\n 맞으면 y를 입력 >> ", u.getAccountNumber(), u.getName());
                char c = new Scanner(System.in).next().charAt(0);
                //해당 계좌에 송금하는 것이 맞는지 확인
                if(c == 'y'){
                    send = u;
                    break;
                }
                else{
                    System.out.println("잘못된 입력입니다.\n송금이 취소되었습니다.");
                    return false;
                }
            }
        }
        if(send == null){//입력에 해당하는 계좌를 찾지 못한 경우
            System.out.println("해당하는 계좌가 없습니다.\n송금이 취소되었습니다.");
            return false;
        }
        //출금
        System.out.println("송금할 금액 입력 >>");
        int money = new Scanner(System.in).nextInt();
        if(money <= 0){//금액이 0보다 작을 경우
            System.out.println("잘못된 금액");
            return false;
        }
        if(money > user.getBalance()){//금액이 잔액보다 큰 경우
            System.out.println("잔액부족");
            return false;
        }
        
        user.setBalance(user.getBalance() - money);

        //입금
        send.setBalance(send.getBalance() + money);
        System.out.println("송금이 정상적으로 완료되었습니다.");
        return true;//송금이 완료되었을 때
    }
}
