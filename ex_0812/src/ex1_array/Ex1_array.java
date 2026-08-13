package ex1_array;

public class Ex1_array {
    public static void main(String[] args) {
        //배열 : 같은 자료형끼리 모아둔 하나의 묶음
        //자바의 배열은 인스턴스.

        //1차원 배열의 선언
        int[] arr1 = new int[5];//'arr1'이름으로 5칸짜리 int형 배열을 객체 생성(new)한다는 의미
        //int[] arr2 = new int[] { 1, 2, 3, 4, 5 };// 선언과 동시에 값을 초기화
        //int[] arr3 = { 10, 20, 30, 40, 50 };//선언과 동시에 초기화할 때는 new type[]을 생략할 수 있다.
        // type[] name = new type[n] { //이 영역은 실제 값이 들어갈 자리 }, n : 만들고 싶은 공간의 개수

        //다차원 배열
        int[][] multiArr1 = new int[3][2];// 행Row 3칸, 열Column 2칸
        //int[][] multiArr2 = new int[][]{
        //    {1, 2},
        //    {2, 0},
        //    {3, 5}
        //};
        //int[][] multiArr3 = {
        //    {1, 2},
        //    {2, 0},
        //    {3, 5}
        //};

        arr1[0] = 100; //arr1이란 이름의 0번째 자리(index)에 값을 대입
        multiArr1[0][1] = 101;//배열의 index는 0부터 시작해서 n-1번째 자리까지 존재
        //따라서 multiArr1[3][2]라는 자리는 없음. multiArr1[2][1]까지만 있음.

        //for문으로 초기화
        for(int i = 0; i < arr1.length; i++){
            //배열명.length : 배열의 길이
            //여기서 length는 메소드가 아닌 필드라서 jvm이 배열 객체의 길이 정보에 바로 접근 가능
            //String -> length(), ArrayList -> size(), ** 배열 -> length **
            arr1[i] = (i + 1) * 100;
        }
        for (int n : arr1) {
            //for-each문 배열이나 컬렉션 요소를 하나씩 꺼내서 처리하는 반복문
            //for-each문은 배열의 값을 복사해서 가져오는 것이기 때문에 직접 변경은 불가능
            //그러나 참조된 객체의 내부 상태를 변경하는 것은 가능: 복사한 참조값이 가리키는 객체가 같기 때문
            //for(자료형(반드시 선언이 필요) 임시변수명: 배열이나 컬랙션){ 실행문 }
            System.out.print(n + " ");
        }
        
        /*자바의 메모리 모델(참고)
        메소드 영역 : 메소드의 바이트 코드, static 변수, static 메소드 (클래스가 메모리에 올려지는 시점)
        스택 영역 : 지역 변수, 매개 변수 (메소드 내에서 유효한 변수들)
        힙 형역 : 인스턴스(소멸 방법이나 시점은 다름. 참조가 이뤄지지 않을 때 소멸)
         */
    }
}
