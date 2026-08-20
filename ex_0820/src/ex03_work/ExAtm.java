package ex03_work;

import java.util.Scanner;

public class ExAtm {
    
    private ExCustomer customer;

    //생성자
    public ExAtm(ExCustomer customer) {
        this.customer = customer;
    }

    //입금
    public void addMoney(Scanner sc){
        int money = sc.nextInt();
        customer.addMoney(money);
        System.out.println("입금 성공");
    }
    
    //출금
    public void subMoney(Scanner sc){
        int num = sc.nextInt();
        if(num > customer.getMoney()){
            System.out.println("잔액 부족");
            return;
        }
        customer.subMoney(num);
        System.out.println("출금 성공");
    }
    
    //잔액
    public void showMoney(){
        System.out.println(customer.getMoney() + "원");
        System.out.println("잔액 확인");
    }
    /*업무 흐름을 담당
    금액 입력 받음
    ↓
    입금 가능 여부 확인
    ↓
    Customer의 잔액 변경
     */
}