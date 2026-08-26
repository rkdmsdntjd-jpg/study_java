package ex5_work;

import java.util.List;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class WorkMain {
    public static void main(String[] args) {
        //id : aaa String
        //pw : 1111 int
        List<UserInfo> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        final int MAX_ID_LENGH = 3;

        
        while (true) {
            try {
                System.out.print("ID : ");
                String id = sc.next();

                if(id.equals("out")){
                    System.out.println("종료");
                    break;
                }
                
                if(id.length() > MAX_ID_LENGH){
                    throw new IllegalArgumentException("ID가 너무 깁니다.");
                }
    
                if(list.stream().anyMatch(user -> user.getId().equals(id))){
                    throw new IllegalArgumentException("이미 존재하는 ID입니다.");
                }

                // for (UserInfo user : list) { //조금 귀찮은 방법2
                //     if(user.getId().equals(id)){
                //        throw new IllegalArgumentException("이미 존재하는 ID입니다.");
                //     }
                // }
    
                System.out.print("PW : ");
                int pw = sc.nextInt();
    
                list.add(new UserInfo(id, pw));
            }
            catch (InputMismatchException e) {// <-얘가 자식 예외
                System.out.println("잘못된 PW를 입력하셨습니다.");
                System.out.println("------------------------");
                sc.nextLine();
                continue;
            }
            catch (IllegalArgumentException e) {// <-얘가 부모 예외
                System.out.println(e.getMessage());
                System.out.println("------------------------");
                continue;
            }
            
            System.out.println("------------------------");
            
            for (UserInfo user : list) {
                System.out.println(user.getId() + "/" + user.getPassword());
            }

            System.out.println("------------------------");
        }
        sc.close();
    }
}
