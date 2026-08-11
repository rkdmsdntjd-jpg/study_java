package ex2_while;
import java.util.Scanner;

public class Ex2_while {
    public static void division(){
        System.out.println("------------------");
    }
    public static void main(String[] args) {
        //3을 입력받을 때까지 무한 반복하는 while
        Scanner sc = new Scanner(System.in);
        int i = 0;

        //방법1
        while (i != 3) {
            division();
            System.out.print("1. 입력 : ");
            i = sc.nextInt();
            System.out.println("값 : " + i);
            division();
        }
        System.out.println("1_while문 종료");
        
        //방법2
        boolean t = true;
        while (t) {
            division();
            System.out.print("2. 입력 : ");
            i = sc.nextInt();

            if(i == 3){
                t = false;
                System.out.println("종료.");
                division(); 
            }
            else{
                System.out.println("값 : " + i);
                division();
            }
        }
        
        sc.close();
    }
}
