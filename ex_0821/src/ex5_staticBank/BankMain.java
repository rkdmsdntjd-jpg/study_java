package ex5_staticBank;

public class BankMain {
    public static void main(String[] args) {
        Bank b1 = new Bank("신촌", "02-111-1111");
        Bank b2 = new Bank("강남", "02-222-2222");
        Bank b3 = new Bank("역삼", "02-333-3333");

        Bank.interest = 0.1f;//static은 클래스 이름으로 접근하는 것이 일반적(static은 보통 private으로 만들지 않는다)

        b1.info();
        b2.info();
        b3.info();
    }
    /*java의 memory area
    -method area : 메소드의 바이트코드(프로그램의 흐름을 구성), static변수, static메소드 ->클래스가 메모리에 올려지는 시점에서 생성
    -stack area : 지역변수, 매개변수 : 메소드 내에서 유효한 변수들 (LIFO) ->현재 메소드를 실행하면서 필요한 값을 저장
    -heap area : 인스턴스 -> 참조가 이뤄지지 않는 때 소멸
    
     */
}
