package ex5_abstract;

public abstract class AbsParent {
    //추상 클래스는 객체를 생성하지 않는다.
    //참조 변수로 선언은 가능
    //ex)AbsParent abs = new AbsChild();
    
    int values = 100;

    public int getValues() {
        return values;
    }

    public abstract void setValuse(int n);
    //추상 메소드: 몸체가 존재하지 않는다.
    //오버라이딩을 위한 메소드를 알리기 위함
    //추상 메소드가 존재할 경우 클래스는 반드시 추상 클래스여야 함
    //추상 메소드가 존재하지 않아도 추상 클래스는 존재할 수 있음
}
