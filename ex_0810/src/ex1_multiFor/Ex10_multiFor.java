package ex1_multiFor;

public class Ex10_multiFor {
    public static void main(String[] args) {
        System.out.println("----------");
        //방법1 증가값을 1이 아닌 2씩 증가
        for(int i = 0; i < 10; i += 2){
            for(int j = 0; j < 10; j += 2){
                    System.out.print(((j + i) % 10 + 1) + " ");
            }
            System.out.println();
        }
        System.out.println("----------");
        
        //방법2
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                int num = i * 2 + j * 2;
                System.out.print((num % 10 + 1) + " ");
            }
            System.out.println();
        }
        System.out.println("----------");
    }
}
