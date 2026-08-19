package ex4_workWord;

import java.util.Scanner;

public class Ex02_ActorMain {
    public static void main(String[] args) {        

        Scanner sc = new Scanner(System.in);
        System.out.println("입력 : ");
        String name = sc.next();

        Ex02_ActorSub a = new Ex02_ActorSub();
        a.findActor(name);
        
        sc.close();
    }//main
}//class
