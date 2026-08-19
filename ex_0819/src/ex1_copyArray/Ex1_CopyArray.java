package ex1_copyArray;

public class Ex1_CopyArray {
    public static void main(String[] args) {
        //얕은 복사
        int[] arr1 = { 1, 2, 3 };
        int[] arr2 = arr1;//arr1의 주소값을 가져옴

        arr1[0] = 100;

        System.out.println(arr1[0]);
        System.out.println(arr2[0]);
        
        //깊은 복사
        int[] arr3 = { 1, 2, 3 };
        int[] arr4 = new int[arr3.length];
        
        for (int i = 0; i < arr3.length; i++) {
            arr4[i] = arr3[i];
        }
        
        arr3[0] = 100;

        System.out.println(arr3[0]);
        System.out.println(arr4[0]);
    }
}
