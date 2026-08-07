package ex_work;

public class Ex_switch {
    public static void main(String[] args) {
        String season = "";
        for(int i = 1; i <= 12; i++){
            switch (i) {
                case 12:
                case 1:
                case 2:
                    season = "겨울";
                    break;
                case 3:
                case 4:
                case 5:
                    season = "봄";
                    break;
                case 6:
                case 7:
                case 8:
                    season = "여름";
                    break;
            
                case 9:
                case 10:
                case 11:
                    season = "가을";
                    break;
                        
                default:
                    System.out.println("잘못된 월입니다.");
                    break;
            }
            System.out.println("현재는 " + i + "월로 " + season + "입니다.");
        }
    }
}
