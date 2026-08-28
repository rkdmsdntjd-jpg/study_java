package ex3_HangMan;

import java.util.Random;
import java.util.Scanner;

public class PlayGame {
    public static void main(String[] args) {
        final String NONE = "◆";
        String[] quest = {"apple", "banana", "orenge", "cherry", "lemon", "watermelon", "blueberry" };
        
        int n = new Random().nextInt(quest.length);
        StringBuilder sb = new StringBuilder(NONE.repeat(quest[n].length()));

        Scanner sc = new Scanner(System.in);

        TimerThread time = new TimerThread();
        time.setDaemon(true);
        time.start();

        while (true) {
            System.out.println("----------");
            System.out.println(sb);
            System.out.println("----------");

            if(sb.indexOf(NONE) == -1){
                break;
            }

            System.out.print(">> ");
            char c = sc.next().charAt(0);

            for(int i = 0; i < sb.length(); i++){
                if(c == quest[n].charAt(i)){
                    sb.setCharAt(i, c);
                }
            }
        }
        System.out.println("clear time : " + time.getTimer() + "초");
        sc.close();
    }
}
