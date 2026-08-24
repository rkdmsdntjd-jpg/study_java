package ex6_abstract;

public class Zerg extends Unit{
    public Zerg(String name, int energy){        
        super(name, energy);
        System.out.println("Zerg 생성자");
    }
    
    @Override
    public void decEnergy() {
        // TODO Auto-generated method stub
        super.energy -= 10;
    }
}
