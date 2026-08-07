package ex1_statement;
import java.util.Scanner;

public class Ex3_else_if {

    public static void mainMenu(){ //안내 출력하는 메소드
        System.out.println("성적을 입력해주세요. \n (-1을 입력하면 종료)");
    }

    public static void rank(int num, char c){ //점수에 대한 등급을 출력하는 메소드
        System.out.println(num + "점의 등급은 " + c + "입니다.");
    }

    //입력값이 -1이면 false를 리턴해서 while문 종료
    public static boolean process(int num){
        if(num == -1) return false;
        
        else if(num > 100 || num < 0){
            //입력값이 100보다 크거나 음수일 경우
            System.out.println("잘못된 입력값입니다. 다시 입력하세요.");
            return true;
        }
        else {
            //그 외, 입력된 점수값이 정상인 경우. 등급 계산 메소드를 호출
            score(num);
            return true;
        }
            
    }
    
    //등급 계산하는 메소드
    public static void score(int num){
        if(num >= 90)
            rank(num, 'A');
        else if(num >= 80) 
            rank(num, 'B');
        else if(num >= 70)
            rank(num, 'C');
        else if(num >= 60)
            rank(num, 'D');
        else
            rank(num, 'F');
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            mainMenu();
            int num = sc.nextInt();
            
            if(!process(num)) break;   
        }
        sc.close();      
    }  
}