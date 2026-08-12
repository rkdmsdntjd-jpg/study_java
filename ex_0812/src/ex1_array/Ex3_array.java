package ex1_array;

public class Ex3_array {
    public static void main(String[] args) {
        char[] ch = new char[4];// ch:ㅁㅁㅁㅁ
        /*
        for(int i = 0; i < ch.length; i++){ // ch: 'J', 'A', 'V', 'A'
            switch (i) {
                case 0:
                    ch[i] = 'J';
                    break;
                case 1:
                case 3:
                    ch[i] = 'A';
                    break;
                case 2:
                    ch[i] = 'V';                       
                    break;
            }            
         } */
        ch[0] = 'J';
        ch[1] = 'A';
        ch[2] = 'V';
        ch[3] = 'A';
        System.out.println("\n-----------------");
        for (char c : ch) {
            System.out.print(c);
        }
        System.out.println("\n-----------------");
        /* for문을 사용하여 출력하면 아래와 같다.
        for(int i = 0; i < ch.length; i++)
            System.out.print(ch[i]);
         */
        char[] ch2 = new char[]{'j', 'a', 'v', 'a'};
        //ch = {'j', 'a', 'v', 'a'}는 불가능
        for (char c : ch2) {
            System.out.print(c);
        }
        System.out.println("\n-----------------");
    }
}
