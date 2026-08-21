package ex3_constructor;

public class Pokemon {
    private String name;
    private String type;
    private int hp;

    public Pokemon(String name, String type, int hp){
        this.name = name;
        this.type = type;
        this.hp = hp;
    }

    public void info(){
        System.out.println("이름 : " + name);
        System.out.println("타입 : " + type);
        System.out.println("HP : " + hp);
        System.out.println("______________________________");
    }

    public void hpCount(int n){
        if(hp <= n){
            hp = 0;
            System.out.printf("%s가 체력 %d가 되어 쓰러졌다.\n", name, hp);
            System.out.println("______________________________");
        }
        else{
            hp -= n;
            System.out.println("남은 체력 : " + hp);
            System.out.println("______________________________");

        }
    }

    public int getHp(){
        return hp;
    }

}
