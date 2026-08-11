package ex1_multiFor;

public class Ex8_multiFor {
    public static void main(String[] args) {
        //1 2 3 4 5 6 7 8 9 10
        //2 3 4 5 6 7 8 9 10 1
        //...
        //10 1 2 3 4 5 6 7 8 9

        //방법1
        for(int i = 1; i <= 10; i++){
            for(int j = i; j <= 10; j++)
                System.out.printf("%d ", j);//for->i부터 10끼지.
            for(int j = 1; j < i; j++)
                System.out.printf("%d ", j);//for->1부터 i전까지.
            System.out.println();
        }
        System.out.println("--------------------");

        //방법2
        for(int i = 0; i < 10; i++){
            for(int j = 0; j < 10; j++){
                System.out.print(((j + i) % 10 + 1) + " ");
            }
            System.out.println();
        }
        System.out.println("--------------------");

        //방법3
        for(int i = 1 ; i <= 10; i++){
            for(int j = 0; j <10; j++){
                int num = i + j;
                if(num > 10)
                    num -= 10;
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}