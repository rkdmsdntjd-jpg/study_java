package ex9_list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListMain {
    public static void main(String[] args) {
        String[] subject = { "국어", "영어" };

        Scanner sc = new Scanner(System.in);
        List<InfoStudent> st = new ArrayList<>();
        
        
        System.out.print("학생 수 : ");
        int n = sc.nextInt();
        System.out.println("------------------------");
        
        for(int i = 0; i < n; i++){
            System.out.print("이름 : ");
            String name = sc.next();
            
            List<Integer> score = new ArrayList<>();
            for (int j = 0; j < subject.length; j++) {
                System.out.print(subject[j] + " : ");
                score.add(sc.nextInt());
            }

            System.out.println("------------------------");
            
            st.add(new InfoStudent(name, score, subject));  
        }

        for (InfoStudent i : st) {
            i.printInfo();
        }
        // double avg = st.stream().mapToDouble(InfoStudent::getAvg).average().orElse(0.0);

        float avg = 0;
        for (InfoStudent i : st) {
            avg += i.getAvg();
        }
        System.out.printf("전체학생 평균 : %.2f\n", avg / st.size());
        sc.close();
    }
}
/*실행 결과
학생 수 : 2
------------------------
이름 : 아무개
국어 : 98
영어 : 89
------------------------
이름 : 홍길동
국어 : 79
영어 : 87
------------------------
아무개  국어 : 98       영어 : 89       총점 : 187      평균 : 93.50
홍길동  국어 : 79       영어 : 87       총점 : 166      평균 : 83.00
전체학생 평균 : 88.25
*/