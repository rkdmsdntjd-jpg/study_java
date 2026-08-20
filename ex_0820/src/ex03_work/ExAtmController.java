package ex03_work;

import java.util.Scanner;

public class ExAtmController {
    private final String[] NUM_MENU = {
        "입금", "출금", "잔액", "종료"
    };

    public void runAtm(){
        Scanner sc = new Scanner(System.in);
        ExCustomer cs = new ExCustomer(000, "java");
        
        ExAtm atm = new ExAtm(cs);//나중에 할 일: 사용자 확인으로 변경해주기

        while (true) {
            printMenu();//출력용
            int n = sc.nextInt();
        
            printFunc(n);//출력용
            switch (n) {
                case 1:
                    atm.addMoney(sc);
                    break;
                case 2:
                    atm.subMoney(sc);
                    break;
                case 3:
                    atm.showMoney();
                    break;
            
                default://종료할 때 세션 반환하면 좋겠다...
                    sc.close();
                    return;
            }
            System.out.println("------------");//구분선 출력용
        } 
    }

    private void printMenu(){//메뉴 출력
        for (int i = 0; i < NUM_MENU.length; i++) {
            if(i == NUM_MENU.length - 1){//마지막 인덱스
                System.out.print("etc");
            }
            else
                System.out.print(i + 1);
            System.out.println(".\t" + NUM_MENU[i]);
        }
        System.out.print(">> ");
    }
    
    private void printFunc(int n){//실행할 메뉴 이름 출력
        if(n < 1 || n > NUM_MENU.length)
            n = NUM_MENU.length;//잘못된 숫자가 입력되면 NUM_MENU의 마지막 인덱스("종료")를 지정하기 위한 if문
        System.out.println("----" + NUM_MENU[n - 1] + "----");
    }
}
