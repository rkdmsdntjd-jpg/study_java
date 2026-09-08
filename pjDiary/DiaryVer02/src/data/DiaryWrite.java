package data;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.List;

public class DiaryWrite {
    // 일기 파일로 저장/수정
    public void diaryWrite(List<Diary> list) {

        // 상대 경로
        File file = new File(DiaryPath.PATH);

        // 상위 폴더가 없으면 생성
        File folder = file.getParentFile();

        if (!folder.exists()) {
            folder.mkdirs();
        }

        try (
                FileOutputStream fos = new FileOutputStream(file);
                ObjectOutputStream obj = new ObjectOutputStream(fos);
            ) {

            obj.writeObject(list);

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("저장 실패 ");
        }
    }
}
