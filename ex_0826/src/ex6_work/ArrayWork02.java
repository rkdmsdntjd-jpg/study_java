package ex6_work;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayWork02 {
    public static void main(String[] args) {
        //5개의 문장을 입력받아 ArrayList에 저장하고 가장 긴 문자열을 찾아 출력

        Scanner sc = new Scanner(System.in);//스캐너 객체 생성
        List<String> list = new ArrayList<>();//ArrayList 객체 생성

        final int LIST_LENGTH = 5;//몇번 입력 받을지 상수 선언
        
        int strIndex = 0;//가장 긴 문자열의 인덱스 저장할 변수 선언
        int strLength = 0;//문자열의 길이를 저장할 변수 선언

        for(int i = 0; i < LIST_LENGTH; i++){//리스트 생성
            System.out.print("입력 : ");
            list.add(sc.next());        
        }

        for (int i = 0; i < list.size(); i++) {//검사
            if(strLength < list.get(i).length()){//변수에 저장된 문자열 길이가 i번째 인덱스에 있는 lsit값의 문자열 길이보다 작으면
                strLength = list.get(i).length();//변수에 i번째 list 문자열의 길이를 저장하고
                strIndex = i;//인덱스를 저장하는 변수에 i를 저장하자
            }
        }//for문을 나오면 가장 긴 문자열의 인덱스를 strIndex에 저장한 상태

        System.out.println("가장 긴 문자열 : " + list.get(strIndex));//list에서 가장 긴 문자열의 인덱스를 주고 그 값을 반환
        sc.close();
    }
}