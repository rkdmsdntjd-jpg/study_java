package ex6_work;

public class Ex3_work {
    public static void main(String[] args) {
        //주사위 2개를 던졌을 때 합이 5, 6, 7이 되는 경우의 수를 찾아 출력
        System.out.println("----------------------------------");

        //방법1
        for(int k = 5; k <= 7; k++){// 5 ~ 7
            System.out.printf("%d :", k);
            for(int i = 1; i <= 6; i++){//첫번째 주사위
                for(int j = 1; j <= 6; j++){//두번째 주사위
                    if(i + j == k)
                        System.out.printf(" %d %d ", i, j);
                }
            }
            System.out.println();
        }

        System.out.println("----------------------------------");

        //방법2
        String five = "", six = "", seven = "";
        for(int i = 1; i <= 6; i++){//첫번째 주사위
            for(int j = 1; j <=6; j++){//두번째 주사위
                int res = i + j;
                switch (res) {
                    case 5:
                        five += i + " " + j + "  ";
                        break;
                    case 6:
                        six += i + " " + j + "  ";
                        break;
                    case 7:
                        seven += i + " " + j + "  ";
                        break;
                }
            }
        }
        System.out.println("5 : " + five);
        System.out.println("6 : " + six);
        System.out.println("7 : " + seven);
        
        System.out.println("----------------------------------");
    }
}
