package ex2_RockPaperScissors;

import java.util.Random;
import java.util.Scanner;

public class PlayMain {
    public static void main(String[] args) {
        int[][] rps = { 
            {0, 1, -1},
            {-1, 0, 1},
            {1, -1, 0}
        };
        String[] s = { "가위", "바위", "보"};
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();

        //플레이어 로그인
        Player player =  new Player();;
        System.out.print("이름 >> ");
        String name = sc.next();

        //가져오기
        PlayerLoad pl = new PlayerLoad();
        player = pl.loadInfo(name);

        do {
            int computer = rd.nextInt(rps.length);//컴퓨터 가위바위보 결정
    
            System.out.println("==============================");
            for (int i = 0; i < s.length; i++) {//선택지
                System.out.println(i +". " + s[i]);
            }
            System.out.println("==============================");
            
            System.out.print(" >> ");
            int me = sc.nextInt();//유저 입력
            
            if(rps[computer][me] == 0){//무
                player.upDraw();
            }
            if(rps[computer][me] == 1){//승
                player.upWin(); 
            }
            if(rps[computer][me] == -1){//패
                player.upDefeat();    
            }
            
            //결과
            System.out.printf("[컴퓨터: %s] vs [%s: %s]\n", s[computer], player.getName(), s[me]);
            System.out.println("==============================");
            player.printRecord();//승패 기록 메소드 호출
            System.out.println("==============================");

            //종료 확인
            System.out.println("one more? y or n");
            System.out.print(" >> ");
            char c = sc.next().charAt(0);

            if(c == 'n'){
                PlayerWrite pw = new PlayerWrite();
                pw.inPlayerData(player);
                break;
            }
            else if(c != 'y'){
                System.out.println("옳지 않은 입력입니다.\nnot saved");
                break;
            }
        } while (true);

        sc.close();
    }
}
