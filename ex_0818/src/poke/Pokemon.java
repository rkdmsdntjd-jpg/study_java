package poke;

public class Pokemon {
    private String name;
    private String type;
    private int hp;

    public Pokemon(String name, String type, int hp){
        this.name = name;
        this.hp = hp;
        this.type = type;
    }

    public void infoP(){
        System.out.println("---------------------------------------");
        System.out.println("야생의 " + name + "이(가) 튀어나왔다!!");
        System.out.printf("hp\t: %d\ntype\t: %s\n", hp, type);
        System.out.println("---------------------------------------");
    }

}
