package ex4_super;

public class Ex4Parent extends Ex4GrandParent{
    int num = 50;
    public Ex4Parent(){
        System.out.println("부모 생성자");
    }

    @Override
    public void hello(){
        super.hello();
        System.out.println("부모 hello");
    }

    public int getNum() {
        System.out.println("부모 getNum 호출");
        return num;
    }
}
