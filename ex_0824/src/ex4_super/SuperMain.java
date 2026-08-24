package ex4_super;

public class SuperMain {
    public static void main(String[] args) {
        Ex4Child c = new Ex4Child();
        c.hello();

        System.out.println(c.getNum());
    }
}
