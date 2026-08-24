package ex1_inferitance;

public class ExChild extends ExParent {//ExParent를 상속 받는 클래스
    String car = "중고차";

    public ExChild(){
        System.out.println("자식 클래스 생성");
    }
}
