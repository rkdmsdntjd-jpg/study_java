package ex2_inferitance;

public class ExAnimal {
    //Parent Class
    private int eyes = 2, leg = 4;

    protected int getEyes() {
        //다른 패키지의 일반 클래스에서 Child 객체를 만들었다고 해서 protected 메서드를 호출할 수 있는 건 아니다.
        return eyes;
    }
    public int getLeg() {
        return leg;
    }
}
