package ex3_work;

import java.util.Scanner;

public class Ex02_workA {
    private String[][] actor = {
        {"톰홀랜드", "스파이더맨", "오디세이"},
        {"앤해서웨이", "거울나라의앨리스", "악마는프라다를 입는다"},
        {"베니", "셜록", "닥터스트레인지"}
    };
    public void searchActor(Scanner sc){
        
        System.out.print("검색 : ");
        String str = sc.next();
        for(int i = 0; i < actor.length; i++){
            if(str.equals(actor[i][0])){
                System.out.println("[" + actor[i][0] + "]");
                for (int j = 1; j < actor[i].length; j++) {
                    System.out.println(actor[i][j]);
                }
                return;
            }
        }
        System.out.println("해당 배우 존재x");
    }
}
