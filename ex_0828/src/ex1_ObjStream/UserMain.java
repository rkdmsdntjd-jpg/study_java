package ex1_ObjStream;

import java.util.Scanner;

public class UserMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        User user = new User();

        outerLoop:
        while (true) {
            System.out.println("--------User--------");
            System.out.println("1. 등록");
            System.out.println("2. 조회");
            System.out.println("--------------------");
            System.out.println("0. 종료");
            System.out.println("--------------------");
            System.out.print(">> ");
            int select = sc.nextInt();
    
            switch (select) {
                case 1://User 등록
                    System.out.print("이름 >> ");
                    user.setName(sc.next());
                    System.out.print("번호 >> ");
                    user.setTel(sc.next());
                    System.out.print("나이 >> ");
                    user.setAge(sc.nextInt());
                    System.out.println("--------------------");
                    UserWriter uw = new UserWriter();
                    uw.writeInfo(user);
                    System.out.println("등록되었습니다.");
                    break;
    
                case 2://User 불러오기    
                    System.out.print("번호 >> ");
                    String tel = sc.next();
                    System.out.println("--------------------");
                    UserLoader ul = new UserLoader();
                    try {
                        user = ul.loadInfo(tel);

                        System.out.println("이름 : " + user.getName());
                        System.out.println("번호 : " + user.getTel());
                        System.out.println("나이 : " + user.getAge());
                    } catch (NullPointerException e) {
                        System.out.println("존재하지 않습니다.");
                    }
                    break;
                case 0:
                    System.out.println("종료합니다.");
                    break outerLoop;
                default:
                    System.out.println("잘못된 입력입니다.");
                    break;
            }
        }
        sc.close();
    }
}
