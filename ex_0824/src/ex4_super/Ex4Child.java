package ex4_super;

public class Ex4Child extends Ex4Parent{
    public Ex4Child(){
        System.out.println("자식 생성자");
    }
    
    @Override
    public void hello(){
        System.out.println("자식의 hello");
        super.hello();
    }

    @Override
    public int getNum() {
        System.out.println("자식getNum 호출");
        // TODO Auto-generated method stub
        return super.getNum();
    }
}
