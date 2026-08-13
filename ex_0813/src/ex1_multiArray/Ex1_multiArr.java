package ex1_multiArray;

public class Ex1_multiArr {
    public static void main(String[] args) {
        int[][] test = new int[2][3];
        //{ {test[0][0], test[0][1], test[0][2]}, {test[1][0] ,test[1][1], test[1][2]} }
        test[0][0] = 100;
        test[0][1] = 200;
        test[0][2] = 300;

        test[1][0] = 400;
        test[1][1] = 500;
        test[1][2] = 600;
        //test[1] = new int[]{400, 500, 600};
        //선언과 동시에 초기화하는 게 아니라 기존 배열의 1번 행을 통째로 바꾸는 것
        //기존 test[1]은 바로 삭제되는 것이 아니라, 더 이상 참조되지 않으면 Garbage Collertor가 나중에 회수
        //Arrays.fill()처럼 모든 원소를 같은 값으로 바꾸는 경우는 한 줄로 가능
        //ex)Arrays.fill(test[1], 400);

        //행마다 길이가 다를 수도 있는 가변 배열(jagged array)이라서 length라고 쓰는 게 더 안전
        for(int i = 0; i < test.length; i++){// test.length => test[여기 길이 반환][]
            for(int j = 0; j < test[i].length; j++){//test[i].length => test[i][여기 길이 반환]               
                System.out.print(test[i][j] + " ");
            }
            System.out.println();
        }
        //만약 3차원 배열일 경우 arr[][][여기 길이는] => arr[i][j].length 이렇게 표현
        /*
        2차원
        arr.length
        arr[i].length

        3차원
        arr.length
        arr[i].length
        arr[i][j].length

        4차원
        arr.length
        arr[i].length
        arr[i][j].length
        arr[i][j][k].length
         */
    }
}
