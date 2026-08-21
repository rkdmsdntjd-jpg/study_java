package ex3_constructor;

import java.util.Random;

public class PokeMain {
    public static void main(String[] args) {
        Pokemon pikachu = new Pokemon("피카츄", "전기", 80);
        pikachu.info();
        while (pikachu.getHp() > 0) {
            pikachu.hpCount(new Random().nextInt(30));
        }
    }
}
