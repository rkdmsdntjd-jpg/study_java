package ex_workString;
//8.21제출용
import java.util.Random;//Random클래스 쓸게
import java.util.Scanner;//Scanner클래스 쓸게

public class Ex01_baseball {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);//스캐너 객체 생성
        //Random rd = new Random();

        int[] arr = new int[3];//랜덤 배열 객체 생성
        int[] inputArr = new int[3];//입력 배열 객체 생성

        //방법1(arr[i]에 1~9까지 수를 랜덤으로 저장)
        // for (int i = 0; i < arr.length; i++) {
        //     arr[i] = rd.nextInt(9) + 1;
        //     for (int j = 0; j < i; j++) {
        //         if(arr[i] == arr[j]){
        //             i--;
        //             break;
        //         }
        //     }
        // }
        
        //방법2(arr[i]에 1~9까지 수를 랜덤으로 저장)
        outerLoop://lable
        for(int i = 0; i < arr.length;){//배열만큼 반복
            arr[i] = new Random().nextInt(9) + 1;//1~9까지 수를 arr[i]에 저장

            for(int j = 0; j < i; j++){
                if(arr[i] == arr[j]){//중복이 발생하면
                    continue outerLoop;//outerLoop Lable로 돌아가서 반복문 마저 실행
                    // for문 안에 증감식이 없으니까 조건문으로 바로 이동
                }
            }//continue에 걸리면 i++을 만나지 않는다.
            i++;//for문을 무사히 빠져나오면 중복이 없으니까 i값을 증가시킴
        }
        
        System.out.println("결과 : " + arr[0] + arr[1] + arr[2]);//랜덤으로 지정된 값 출력

        int cnt = 0;//카운터
        //방법1(숫자를 입력받고 3strike를 할동안 반복하기)
        while (true) {//무한 반복
            System.out.print("입력(예|123) : ");//입력을 요구하는 문장 출력
            int number = sc.nextInt();//number에 숫자를 입력 받음
            cnt++;//횟수를 늘림
            inputArr[0] = number / 100;//0번째 배열에 들어갈 숫자
            inputArr[1] = number / 10 % 10;//1번째 배열에 들어갈 숫자
            inputArr[2] = number % 10;//2번째 배열에 들어갈 숫자

            int strike = 0, ball = 0;//strike, ball카운터(while문 안에 있기 때문에 반복할 때마다 초기화)

            for (int i = 0; i < arr.length; i++) {//arr i(0~arr길이만큼)
                for (int j = 0; j < inputArr.length; j++) {//arr가 i번일 때 inputArr j(0~inputArr길이만큼)
                    if( i == j ){//i값과 j값이 같을 때=> 같은 인덱스라면
                        if(arr[i] == inputArr[j])//arr i번째 값과 inputArr의 j번째값이 같으면 
                            strike++;//strike값을 증가
                    }
                    else{//i와 j가 같지않는데
                        if(arr[i] == inputArr[j])//arr i번째 값과 inputArr의 j번째값이 같으면
                            ball++;//ball값을 증가
                    }
                }
            }
            
            if(strike == 3){//strike가 3이면
                System.out.println("정답!" + arr[0] + arr[1] + arr[2]);//출력
                System.out.println("cnt = " + cnt);//몇번 시도했는지도 출력
                break;//반복문 종료
            }
            else{//그렇지 않으면(strike가 3이 아니면)
                if(strike > 0 || ball > 0){//strike or ball이 하나라도 증가했으면
                    System.out.println("스트라이크 : " + strike + "|볼 : " + ball);//증감한 결과 출력
                }
                else{//그렇지 않으면(Strike가 3도 아니고 strike or ball이 하나도 증가하지 않았으면)
                    System.out.println("out!");//out 출력
                }
            }
        }
        //방법2(숫자를 입력받고 3strike를 할동안 반복하기)
        /*
        while (true) { //반복문 실행
            System.out.println("================"); //구분선
            System.out.print("입력 : "); //입력받기 위한 출력
            String a = String.valueOf(sc.nextInt()); //숫자로 입력받아서 String type으로 바꿔서 a라는 공간에 저장
            //contains() = "이 문자열 안에 이 값이 있니?"
            int ball = 0, strike = 0; //strike와 ball 선언 및 초기화
            
            for (int i = 0; i < arr.length; i++){ //arr길이만큼 반복

                if(a.indexOf(String.valueOf(arr[i])) == i){
                    //arr[i]의 값을 String으로 변환해서 a의 index를 꺼낸 값이 i와 같다면
                    strike++; //strike를 증가
                }
                else if(a.contains(String.valueOf(arr[i]))){
                    //if에 걸리지 않았으며, arr[i]의 값을 String으로 변환해서 a라는 문자열에 있다면
                    ball++; //ball 증가
                }
            }

            System.out.println("----------------"); //구분선
            System.out.println(strike + "strike, " + ball + "ball"); //결과 출력
            if(strike == 3)//만약에 strike가 3이면
                break;//반복문을 종료해줘
        }
           <실행 결과>
        ================
        입력 : 123
        ----------------
        2strike, 0ball
        ================
        입력 : 124
        ----------------
        2strike, 0ball
        ================
        입력 : 125
        ----------------
        2strike, 0ball
        ================
        입력 : 126
        ----------------
        2strike, 0ball
        ================
        입력 : 127
        ----------------
        2strike, 0ball
        ================
        입력 : 128
        ----------------
        2strike, 0ball
        ================
        입력 : 129
        ----------------
        3strike, 0ball
         */
        sc.close();//스캐너 다 썼으니까 종료할게
    }
}
