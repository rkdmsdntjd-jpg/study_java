package mod;

import java.util.List;

import data.*;

public class ManagerDiary {
   
    private List<Diary> diaryList;
    public DiaryWrite diaryWrite;

    public ManagerDiary(){
        diaryList = new  DiaryRead().diaryRead();
        diaryWrite = new DiaryWrite();
    }
   
    //흐름 조정

    //생성 메소드(view에서 전달받아 )
    public void create(String date, String title, String content){
        Diary d = new Diary(date, title, content);
        diaryList.add(d);
        diaryWrite.diaryWrite(diaryList);
    }

    //수정 메소드
    public void edit(String diaryNum, String title, String content){
        for (Diary d : diaryList) {
            if(d.getDate().equals(diaryNum)){
                d.setTitle(title);
                d.setContent(content);
                break;
            }
        }
        diaryWrite.diaryWrite(diaryList);
    }

    //삭제 메소드
    public void delete(String diaryNum){
        Diary dia = null;
        for (Diary d : diaryList) {
            if(d.getDate().equals(diaryNum)){
                dia = d;
            }
        }
        diaryList.remove(dia);
        diaryWrite.diaryWrite(diaryList);
    }

    //읽기 목록 가져오기
    public List<Diary> getDiaries(){
        return  diaryList;
    }
}