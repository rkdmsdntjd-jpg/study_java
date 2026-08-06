package ex2_valueType;

public class Ex2_valueType {
    public static void main(String[] args) {
        //문자형: '이 안에는 한 글자만 저장할 수 있는 자료형'
        char cStart = 'A';
        char cEnd = 'Z';
        System.out.println("cStart : " + cStart);
        System.out.println("cEnd : " + cEnd);
        
        for(int i = cStart; i <= cEnd; i++) System.out.print((char)i + " ");
        System.err.println();

        int j = cStart;
        while (true) {//실수: J%3은 문자코드값을 기준으로 나눴기 때문에 A부터 3번째마다 출력이 아님
            
            if(j > cEnd) break;
            if(0 == j%3)
            System.out.print((char)j + " ");
            j++;
        }
        System.out.println();
        
        int cnt = 0;
        while (true) {//A부터 시작해서 3번째마다 출력
            if(cStart + cnt > cEnd) break;

            if((cnt+1)%3 == 0) System.out.print((char)(cStart + cnt) + " ");
            cnt++;
        }
        System.out.println();

        //실수형 : 소수점을 포함하는 값을 저장하기 위한 자료형
        float f1 = 100;
        System.out.println("f1 : " + f1);
        f1 = 3.14F;//디폴트 소수점 자료형은 double이기 때문에 F를 붙여줘야 float이라고 인식
        double d1 = 3.14;
        System.out.println("f1 : " + f1);
        System.out.println("d1 : " + d1);
        d1 = 3.1415;
        System.out.println("d1 : " + d1);

    }
    
}
