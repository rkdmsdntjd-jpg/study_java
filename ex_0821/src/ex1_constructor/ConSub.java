package ex1_constructor;

public class ConSub {
    private String s = "생성자 호출";
    private String t = "메소드 호출";
    public ConSub(){
        System.out.println(s);
    }
    public String getT() {
        return t;
    }
}
