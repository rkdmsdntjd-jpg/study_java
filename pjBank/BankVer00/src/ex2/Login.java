package src.ex2;

import java.util.Random;
import java.util.Set;
import java.util.Scanner;

public class Login {
    private User user;
    private Set<User> set = new UserRead().loadAll();
    
    public User member(){
        boolean b = true;

        outerLoop:
        while (b) {
            System.out.println("-------------");
            System.out.println("1. 로그인");
            System.out.println("2. 회원가입");
            System.out.println("0. 종료");
            System.out.println("-------------");
            System.out.print(" >> ");
            int num = new Scanner(System.in).nextInt();
    
            switch (num) {
                case 1:
                    //로그인
                    if(login()){
                        break outerLoop;
                    }
                    break;

                case 2:
                    //회원가입
                    singup();
                    break;

                case 0:
                    //종료
                    break outerLoop;
            
                default:
                    System.err.println("입력오류입니다. 처음부터 다시 실행해주세요.");
                    break;
            }
        }
        return user;
    }

    public Set<User> getUserSet(){
        return set;
    }

    private Boolean login(){
        //로그인 진행
        System.out.println("---------------------------");
        System.out.print("ID >> ");
        String id = new Scanner(System.in).next();
        System.out.print("PW >> ");
        String pw = new Scanner(System.in).next();
        System.out.println("---------------------------");

        if(checkLogin(id, pw)){
            System.out.println("성공");
            return true;
        }
        return false;

        //등록된 정보인지 확인
    //     UserRead ur = new UserRead();
    //     user = ur.loadInfo(id);

    //     if (user == null) {
    //         System.out.println("존재하지 않는 ID입니다.");
    //         return false;
    //     }

    //     System.out.println("로그인 성공!");
    //     return true;
    }

    private void singup(){
        //회원가입
        System.out.print("ID >> ");
        String id;
        //중복 검사
        do {
            id = new Scanner(System.in).next();
        } while (checkId(id));

        System.out.print("PW >> ");
        String pw = new Scanner(System.in).next();
        //문자와 숫자 조합


        System.out.print("name >> ");
        String name = new Scanner(System.in).next();
        
        System.out.print("balance >> ");
        int balance = new Scanner(System.in).nextInt();

        //계좌는 랜덤으로 생성하되 중복이 발생하지 않게
        int accountNumber = createAccountNumber();

        //객체 생성
        user = new User(id, pw, name, accountNumber, balance);
        UserWrite uw = new UserWrite();
        uw.writeInfo(user);
    }

    //계좌번호 만들어주는 메소드
    private int createAccountNumber(){
        Random rd = new Random();
        int accountNumber;

        do {
            accountNumber = rd.nextInt(900_000_000) + 100_000_000;
        } while (checkAccountNumber(accountNumber));

        return accountNumber;
    }

    private boolean checkAccountNumber(int accountNumber){
        for (User u : set) {
            if(u.getAccountNumber() == accountNumber){
                return true;
            }
        }
        return false;
    }

    private boolean checkId(String id){//회원가입시 중복검사
        for (User u : set) {
            if(u.getId().equals(id)){
                return true;
            }
        }
        return false;
    }

    public boolean checkLogin(String id, String pw){
        for (User u : set) {
            if(u.getId().equals(id) && u.getPassword().equals(pw)){
                user = u;
                return true;
            }
        }
        return false;
    }
}