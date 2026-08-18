package ex1_method;

public class MethodTest {
    
    public void test1(){
        System.out.println("test1호출");
    }
    public void test2(int n){
        n++;
        System.out.println(n + "을 매개 변수로 줘야 호출가능");
    }
    public int test3(int n){
        n += 100;
        return n;//나를 호출한 곳으로 값을 가지고 돌아간다. 반환
    }
}
