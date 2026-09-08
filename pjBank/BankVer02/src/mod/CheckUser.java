
package src.mod;

import java.util.Random;
import java.util.Set;

import src.db.*;

public class CheckUser {

    private User user;
    private Set<User> set = new UserRead().findAll();

    public User getUser() {
        return user;
    }

    public Set<User> getUserSet() {
        return set;
    }

    //회원가입 시 ID 중복검사
    public boolean checkId(String id) {
        for (User u : set) {
            if (u.getId().equals(id)) {
                return true;
            }
        }
        return false;
    }

    //set을 검사해서 객체가 있는지 확인
    public boolean checkLogin(String id, String pw) {
        for (User u : set) {
            if (u.getId().equals(id) && u.getPassword().equals(pw)) {
                user = u;
                return true;
            }
        }
        return false;
    }

    // 회원가입 정보 저장
    public void writeUser(String id, String pw, String name, long balance) {
        // 계좌번호 생성
        int accountNumber = createAccountNumber();

        // 객체 생성
        User u = new User(id, pw, name, accountNumber, balance);

        // 회원정보 저장
        UserWrite uw = new UserWrite();
        uw.writeInfo(u);
        set.add(u);
    }
    
    // 계좌 번호 만들어주는 메소드
    private int createAccountNumber() {

        Random rd = new Random();
        int accountNumber;
        do {
            accountNumber = rd.nextInt(900_000_000) + 100_000_000;
        } while (checkAccountNumber(accountNumber));

        return accountNumber;
    }

    //계좌번호 중복 체크
    private boolean checkAccountNumber(int accountNumber) {

        for (User u : set) {
            if (u.getAccountNumber() == accountNumber) {
                return true;
            }
        }
        return false;
    }
}