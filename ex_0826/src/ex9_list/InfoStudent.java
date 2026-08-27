package ex9_list;

import java.util.List;

public class InfoStudent {

    private String name;
    private String[] subject; //"국어", "영어"
    private List<Integer> score;

    private float avg;
    private int sum = 0;

    public InfoStudent(String name, List<Integer> score, String[] subject){
        this.subject = subject;
        this.name = name;
        this.score = score;
        for (int i: score) {
            sum += i;
        }
        avg = (float)sum / score.size();
    }

    public void printInfo(){
        System.out.printf("%s\t", name);
        for (int i = 0; i < score.size(); i++) {
            System.out.printf("%s : %d\t", subject[i], score.get(i));
        }
        System.out.printf("총점 : %d\t평균 : %.2f\n", sum, avg);
    }

    public float getAvg(){
        return avg;
    }
}