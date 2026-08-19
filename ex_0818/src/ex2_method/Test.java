package ex2_method;

public class Test {
    public String average(int[] n){
        int num = 0;
        for (int i = 0; i < n.length; i++) {
            num += n[i];
        }
        num /= n.length;
        if(num > 50)
            return "합격";
        else
            return "불합격";
    }
}
