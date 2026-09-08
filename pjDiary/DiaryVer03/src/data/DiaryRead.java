package data;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

//import data.Diary.DailyReader;

public class DiaryRead {
    // 일기 읽기
    public List<Diary> diaryRead() {
        List<Diary> list = new ArrayList<>();

        File file = new File(DiaryPath.PATH);

        if (!file.isFile())
            return list;

        try (
            // 파일 입력 스트림 생성 (경로 지정 필요)
            FileInputStream fils = new FileInputStream(file); // 경로를 실제 파일로 수정해야 함
            ObjectInputStream obj = new ObjectInputStream(fils); // 파일에서 객체를 읽기 위한 ObjectInputStream 객체 생성
        ){
            // ObjectInputStream을 사용하여 파일에서 List<Diary> 객체를 읽어옴
            list = (List<Diary>)obj.readObject();
            
        } catch (Exception e) { 
            e.printStackTrace();
        } 
        return list;
    }
}