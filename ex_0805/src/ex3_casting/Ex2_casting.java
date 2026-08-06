package ex3_casting;

public class Ex2_casting {
    public static void main(String[] args) {
        //디모션 캐스팅: 작은 자료형에 큰 자료형이 대입되는 것(자동형변환 발생하지 않음)
        char c1 = 'D'; //2byte
        int n1 = c1 + 1; //4byte
        System.out.println("c1 : " + c1 + ", n1 : " + n1);

        c1 = (char)n1;
        System.out.println("c1 : " + c1);
        System.out.println("n1 : " + (char)n1);
        System.out.println("n1 : " + n1);

        float f1 = 5.5F;
        int n2 = 0;
        n2 = (int)f1;
        System.out.println("n2 : " + n2);
    }
    
}
