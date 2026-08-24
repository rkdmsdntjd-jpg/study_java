package ex2_inferitance;

public class ExMainAnimal {
    public static void main(String[] args) {
        ExBear b = new ExBear();

        System.out.println("eyes" + b.getEyes());
        System.out.println("legs" + b.getLeg());

        ExElephant e = new ExElephant();

        System.out.println("눈 : " + e.getEyes());
        System.out.println("다리 : " + e.getLeg());
        e.merit();

        ExSnake s = new ExSnake();
        System.out.println(s.getEyes());
        System.out.println(s.getLeg());
        System.out.println(s.s);

        ExBoA boa = new ExBoA();
        System.out.println(boa.s);
        boa.printEyes();
        System.out.println(boa.getSuperLegs());
    }
}
