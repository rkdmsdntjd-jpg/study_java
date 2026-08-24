package ex2_inferitance;

public class ExBoA extends ExSnake{
    public void printEyes(){
        System.out.println(getEyes());
    }

    public int getSuperLegs(){
        return super.getLeg();
    }
}
