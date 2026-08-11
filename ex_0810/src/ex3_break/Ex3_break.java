package ex3_break;

public class Ex3_break {
    public static void main(String[] args) {
        int n = 1;
        while (true) {
            System.out.println(n);
            n++;

            if(n > 5) break;
        }
        System.out.println("while문 탈출 후 n값: " + n);
    }
}
