package poke;

import java.util.Random;

public class PokeMain {
    public static void main(String[] args) {
        String[] s = {"피카츄", "파이리"};
        String[] str = {"전기", "불"};
        int[] n = {100, 80};
        Pokemon p1 = new Pokemon("피카츄", "전기", 100);
        Pokemon p2 = new Pokemon("파이리", "불", 80);
        Pokemon p3 = new Pokemon(
            s[new Random().nextInt(2)],
            str[new Random().nextInt(2)],
            n[new Random().nextInt(2)]
        );
        p1.infoP();
        p2.infoP();
        p3.infoP();
    }
}
