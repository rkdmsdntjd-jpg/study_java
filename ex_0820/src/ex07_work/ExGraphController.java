package ex07_work;

import java.util.Random;

public class ExGraphController {    
    private static final int LENGTH = 10;//0~9를 많이써서 만들어둔 상수.
    private ExGraphSharpCount[] graph = new ExGraphSharpCount[LENGTH];//'#'과 cnt를 하나의 묶음으로 보관하기 위한 클래스 배열
    
    public void runGraph(){//main메소드에 호출되는 메소드, 실행 담당
        instantiation();
        rand(100);//매개변수로 100넘김(매개변수의 값을 변경하면 난수 발생횟수를 조절하기 쉬움)
        showGraph();
    }

    //이후는 다른 클래스에게 공개할 이유가 없어서 private으로 지정
    //0~9까지 그래프 저장할 객체 생성
    private void instantiation(){
        for (int i = 0; i < LENGTH; i++) {
            graph[i] = new ExGraphSharpCount();//클래스 배열은 각각의 인덱스마다 객체생성을 해야한다.
        }
    }
    
    //난수 100개 발생
    private void rand(int ran){
        Random rd = new Random();
        for (int i = 0; i < ran; i++) {
            graph[rd.nextInt(LENGTH)].addSharpCount();//sharp[0~9]에 해당하는 addSharp()메소드 실행해줘
        }
    }
        
    //결과출력
    private void showGraph(){
        for (int i = 0; i < LENGTH; i++) {//sharp 배열의 길이만큼 결과를 출력할거야
            System.out.print(i + "의 개수 : ");
            graph[i].printGraph();
        }
    }
}
