package ex6_abstract;

public abstract class Unit {
    String name;
    int energy;

    public Unit(){
        System.out.println("인자없는 Unit 생성자 호출");
    }

    public Unit(String name, int energy){
        this.name = name;
        this.energy = energy;
        System.out.println("인자있는 Unit 생성자 호출");
    }
    
    public abstract void decEnergy();
}
