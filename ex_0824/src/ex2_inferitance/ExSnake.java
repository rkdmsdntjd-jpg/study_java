package ex2_inferitance;

public class ExSnake extends ExAnimal{
    String s = "다리가 없어요";

    public int getLeg(){//오버라이딩 : 부모의 메소드를 가져와 입맛대로 수정해서 쓰는것
        return 0;
    }
}
