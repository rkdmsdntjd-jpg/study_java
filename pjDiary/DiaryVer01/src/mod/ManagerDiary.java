package mod;//김대성

import java.util.List;

import data.*;

public class ManagerDiary {
    //흐름 조정
    private List<Diary> diarys;
    private DiaryRead dr;
    private DiaryWrite dw;

    public ManagerDiary(){
        dr = new DiaryRead();
        dw = new DiaryWrite();
        diarys = dr.diaryRead();
    }

    //생성 메소드(view에서 전달받아 )
    public void create(String date, String title, String content){
        Diary diary = new Diary(date, title, content);
        dw.diaryWrite(diary);
        diarys.add(diary);
    }

    //수정 메소드
    public void edit(String date, String title, String content){
        for (Diary d : diarys) {
            if(d.getDate().equals(date)){
                d.setTitle(title);
                d.setContent(content);
                dw.diaryWrite(d);
                break;
            }
        } 
    }

    //삭제 메소드
    public void delete(String date){//for-each 순회 중에 같은 리스트를 직접 remove()하는 구조 피하는 게 좋음
        Diary diary = null;

        for (Diary d : diarys) {
            if(d.getDate().equals(date)){
                diary = d;
                break;
            }
        }
        if(diary == null)
            return;

        if(dw.diaryRemove(diary))//파일이 삭제가 되면
            diarys.remove(diary);//리스트도 삭제해줘
    }

    //Panel이 띄울 메소드
    public List<Diary> getDiaries(){
        return diarys;
    }
}
