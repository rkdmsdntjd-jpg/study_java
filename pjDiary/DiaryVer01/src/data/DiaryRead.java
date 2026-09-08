package data;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DiaryRead {
    //파일로 저장된 일기 읽기

    public List<Diary> diaryRead(){
        List<Diary> diary = new ArrayList<>();

        /*상대경로
        현재 디렉터리 중심
        상위 ../
        상위의 다른 하위 ../test
         */
        File dir = new File(Path.PATH);
        File[] files = dir.listFiles();//특정 폴더 안에 있는 파일/폴더 목록을 배열로 가져오는 메소드

        if(files == null)//널포인터 예외가 발생하기 전에 메소드를 종료하여 예외를 발생시키지 않음
            return diary;

        for(File f : files){
            if(f.isDirectory())//더 안에 엉뚱한 파일이나 하위 폴더가 들어오면 전부 역직렬화를 시도를 방지
                continue;
            try (
                FileInputStream fis = new FileInputStream(f);
                ObjectInputStream ois = new ObjectInputStream(fis);
            ) {
                Diary d = (Diary)ois.readObject();
                diary.add(d);

            } catch (IOException | ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
        return diary;
    }
}