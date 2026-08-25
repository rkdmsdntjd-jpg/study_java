package ex7_generic;

public class GenTest<T> {
    /* 제네릭 : 일반적인 형태의 코드를 작성하고 이코드를 다양한 타입에 대한 객체에 대해 재사용이 가능한 구조로 만들어둔 객체지향 기법
    class AAA<T> : AAA라는 클래스를 만들 때, 안에 들어갈 자료형을 아직 결정하지 않겠다는 의미
     */

    private T value;

    public void setValue(T value){
        this.value = value;
    }

    public T getValue(){
        return value;
    }
}
