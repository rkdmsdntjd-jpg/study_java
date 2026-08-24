package ex7_interface;

public interface InterParent {
//Interface :
//변수는 public static final로 선언, 메소드는 public abstract로 선언
//참조 변수 선언 가능, 메소드 오버라이딩 가능, 다중 상속 가능
//하나의 형태(기준)으로 사용
//implements(구현)이라는 명령을 통해 상속(구현이 정확한 표현)
//참조 변수를 통해 부모 클래스 처럼 구현된 자식 클래스의 메소드를 호출 할 수 있다.
//인터페이스에 정의된 abstract메소드를 자식이 오버라이딩했기 때문
//public abstract는 생략이 가능하지만 명확히 하기 위해 사용하는 것이 기본
//접근 제어 지시자는 변경 불가능
//참고: 상위클래스에서 선언된 접근제어지시자(private, default, protect)는 확장만 가능하기 때문에
//public으로 선언된 경우에는 무조건 public으로 선언해야 한다.

    public static final int  VELUES = 10;

    public abstract void interfaceMethod();
    
}