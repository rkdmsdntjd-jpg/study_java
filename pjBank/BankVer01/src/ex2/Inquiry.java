package src.ex2;

public class Inquiry {//조회
    public void show(User user){
        if (user == null) {
            System.out.println("조회할 사용자 정보가 없습니다.");
            return;
        }

        System.out.println();
        System.out.println("====================");
        System.out.println("      계좌 조회");
        System.out.println("====================");

        System.out.println("아이디 : " + user.getId());
        System.out.println("이름 : " + user.getName());
        System.out.println("계좌번호 : " + user.getAccountNumber());
        System.out.println("현재 잔액 : " + user.getBalance() + "원");

        System.out.println("====================");
    }
}
