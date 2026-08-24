package ex2_inferitance;

public class ExBear extends ExAnimal{
    //부모의 protected 메서드를 자식이 오버라이딩하면서 public으로 바꾸는 건 가능
    
    public int getEyes(){
        return super.getEyes();
    }
}
