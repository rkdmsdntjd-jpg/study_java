package ex4_workWord;

public class Ex02_ActorSub {
    private String[][] actor = {
        {"[톰홀랜드]", "스파이더맨", "오디세이"},
        {"[앤해서웨이]", "거울나라의앨리스", "악마는프라다를 입는다"},
        {"[베니]", "셜록", "닥터스트레인지"}
    };

    public void findActor(String name){
        int cnt = 0;

        for (int i = 0; i < actor.length; i++) {
            if(actor[i][0].equals("[" + name + "]")){                
                for (String s : actor[i]) {
                    System.out.println(s);
                }
            }//if
            else{
                cnt++;
                if(cnt == actor.length)
                    System.out.println("배우 정보가 없음");
            }//else
        }//for
    }//findActor()
}
