package data;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;

public class DiaryWrite {
    //일기 파일로 저장/수정
    public void diaryWrite(Diary diary){
        String path = Path.PATH + diary.getDate() + ".txt";
        File dir = new File(Path.PATH);

        if(!dir.exists()){//dir이 가리키는 경로에 파일이든 폴더가 존재하는지 확인하는 메소드
            dir.mkdirs();//dir이 가리키는 경로의 파일이나 폴더의 상위까지 생성해주는 메소드
        }
        try (
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
        ) {
            oos.writeObject(diary);//다이어리 객체를 저장
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //해당파일 삭제
    public boolean diaryRemove(Diary diary){
        File file = new File(Path.PATH + diary.getDate() + ".txt");
        return file.delete();//해당 파일을 삭제하고 결과값 반환(true or falses)
    }
}