package ex9_exception;

public class Ex3_TryCatch {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 30 };
        try {
            for (int i = 0; i <= arr.length; i++) {
                System.out.println(arr[i]);
            }
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
        }
    }
}
