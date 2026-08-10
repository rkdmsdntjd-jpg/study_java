package ex1_multiFor;

public class Ex1_multiFor {
    public static void main(String[] args) {
        //중첩for문 or 다중for문

        //1 2 3 4 5 
        //1 2 3 4 5
        //1 2 3 4 5
        for(int i = 1; i <= 3; i++){
            for(int j = 1; j <= 5; j++)
                System.out.printf("%d ", j);
            System.out.println();
        }
        System.out.println("---------");
        
        //5 4 3 2 1
        //5 4 3 2 1
        //5 4 3 2 1
        for(int i = 0; i < 3; i++){
            for(int j = 5; j > 0; j--){
                System.out.printf("%d ", j);
            }
            System.out.println();
        }
        System.out.println("---------");

        //1 2 3 4 5
        //2 3 4 5 1
        //3 4 5 1 2
        //4 5 1 2 3
        //5 1 2 3 4
        for(int i = 1; i <= 5; i++){
            for(int j = i; j <= 5; j++)
                System.out.printf("%d ", j);//for->i부터 5끼지.
            for(int j = 1; j < i; j++)
                System.out.printf("%d ", j);//for->1부터 i전까지.
            System.out.println();
        }
    }
}
