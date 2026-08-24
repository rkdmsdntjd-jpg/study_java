package ex6_abstract;

public class Terran extends Unit{

    public Terran(String name, int energy){
        super.name = name;
        super.energy = energy;
    }
    
    @Override
    public void decEnergy() {//<-반드시 오버라이딩을 해야 컴파일 가능
        // TODO Auto-generated method stub
        super.energy -= 3;
    }
}
