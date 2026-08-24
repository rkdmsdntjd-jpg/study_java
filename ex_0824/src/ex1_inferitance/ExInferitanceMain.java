package ex1_inferitance;

public class ExInferitanceMain {
    public static void main(String[] args) {
        ExChild c = new ExChild();
        //생성자 호출 결과
        //부모 클래스 생성
        //자식 클래스 생성
        System.out.println(c.car);

        //상속 : 기존에 정의된 클래스에 메소드와 변수를 추가하여 새로운 클래스를 정을 정의
        //부모가 먼저 생성됨

        //자식은 부모의 메소드나 멤버를 사용할 수 있으나 부모는 자식의 멤버를 사용할 수 없다.
        System.out.println(c.name);
        System.out.println(c.getMoney());

        if( c instanceof ExParent){
            System.out.println("ExChild는 ExParent의 자식이 맞습니다");
        }
        //다형성 : Parent p = new Child()
        //참조 변수의 타입 = 실제 개체의 타입() -> 다를 수 있다
        //Parent 타입의 참조변수 p가 Child의 객체를 가리키고 있음. 그러나 반대는 불가능
        //p로 Child에만 있는 메소드는 호출 불가능
        //그러나 오버라이딩된 메소드는 호출가능하며 자식의 메소드가 호출된다.

        //IS - A관계 : "~의 일종이다"
        //ex) 전화기 -> 무선 전화기, 고래 -> 흰수염고래, 동물 -> 강아지, 과일 -> 사과
    }
}
