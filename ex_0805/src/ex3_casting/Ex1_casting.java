package ex3_casting;

public class Ex1_casting {
    public static void main(String[] args) {
        //프로모션 형변환: 큰 자료형에 작은 자료형을 대입되는 것
        double d1 = 100.5; //8byte
        int n1 = 200; //4byte
        d1 = n1; //d1 = 200.0
        System.out.println("d1 = " + d1);//작은 자료형에서 큰 자료형으로 변환할 경우 자동 형변환이 발생하여 오류가 나지 않는다.
        System.out.printf("d1 = %.3f", d1);//소수점 자리 원하는 길이만큼 출력
        System.out.println();

        int n2 = 100;//4byte
        char ch = 'A';//2byte
        n2 = ch;
        System.out.println("n2 = " + n2);
    }
    
}
