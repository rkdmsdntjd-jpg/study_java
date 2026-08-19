package ex6_work;

public class Ex01_GradeSub {
    public int gradePer(String grade){
        int perGrade;
        switch (grade) {
            case "vip":
                perGrade = 10;
                break;
            case "gold":
                perGrade = 5;
                break;
            case "silver":
                perGrade = 3;
                break;        
            default:
                System.out.println("회원등급이 올바르지 않습니다.");
                perGrade = 0;
                break;
        }
        return perGrade;
    }
    public void res(int num, int perGrade){
        int result = (int)(num * ( perGrade / 100.0 ));
        System.out.println("적립 포인트 :" + result);
    }
}
