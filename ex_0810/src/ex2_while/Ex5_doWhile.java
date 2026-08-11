package ex2_while;
import java.util.Random;

public class Ex5_doWhile {
    public static void main(String[] args) {
        // Java, jsp, Android 시험에서 각 과목별 점수는 랜덤으로 0~130점이 대입
        //각 과목별 점수를 검사하여 100점을 넘어가는 점수가 하나도 없을 때, 최종 결과를 화면에 출력
        /*실행 결과
        -------------------------
        java    : 123
        jsp     : 99
        android : 122
        -------------------------
        cnt     : 1
        -------------------------
        -------------------------
        java    : 85
        jsp     : 84
        android : 112
        -------------------------
        cnt     : 2
        -------------------------
        -------------------------
        java    : 90
        jsp     : 18
        android : 82
        -------------------------
        cnt     : 3
        -------------------------
         */
        Random rd = new Random();//랜덤 객체 생성
        int cnt = 0;//몇번 loop를 돌았는지 카운트할 변수
        int javaScore, jspScore, androidScore;
        do{
            cnt++;//loop문을 실행할 때마다 값을 하나씩 증가
            javaScore = rd.nextInt(131);//0~130까지 수 중에서 난수를 생성해 변수명 주소에 값을 저장
            jspScore = rd.nextInt(131);
            androidScore = rd.nextInt(131);            
            
            System.out.println("-------------------------");
            System.out.println("java\t: " + javaScore);//출력
            System.out.println("jsp\t: " + jspScore);
            System.out.println("android\t: " + androidScore);
            System.out.println("-------------------------");
            System.out.println("cnt\t: "+ cnt);//카운트 출력(편의성)
            System.out.println("-------------------------");
            
        }while(javaScore > 100 || jspScore > 100 || androidScore > 100);//조건

    }
}
