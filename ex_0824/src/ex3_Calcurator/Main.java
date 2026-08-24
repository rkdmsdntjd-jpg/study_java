package ex3_Calcurator;

public class Main {
    public static void main(String[] args) {
        Calcu cp = new CalPlus();
        Calcu cm = new CalMinus();

        System.out.println("+ result: " + cp.getResult(10, 20));
        System.out.println("- result: " + cm.getResult(15, 10));
    }
}
