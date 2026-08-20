package ex05_overload;

public class ExOverSub {
    private int a = 0, b = 0;

    public ExOverSub(){
        //디폴드 생성자
    }
    public ExOverSub(int a, int b){
        //생성자 선언, 생성자도 오버로딩 가능
        this.a = a;
        this.b = b;
    }

    public void reslult(){
        System.out.println("인자가 없는 메소드 호출");
    }
    public void reslult(int num){
        System.out.println(num + " + " + a + " = " + (num + a));
    }
    public void reslult(int num, float num2){
        System.out.println((a * num) + " X " + (b * num2));
    }
    public void reslult(float num, int num2){
        System.out.println("순서바뀜" + num + " " + num2);
    }

    public String result(String s, char c){
        return s + c;
    }
}
