package data;

import java.io.Serializable;

public class Diary implements Serializable {
    // 날짜 date, 제목 title, 내용 content 같은 일기 데이터 객체, getter, setter

    private String date;
    private String title;
    private String content;

    public Diary(String date, String title, String content) {
        this.date = date;//+날짜를 받아오기
        this.title = title;
        this.content = content;
    }

    public String getDate() {
        return date;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public void setTitle(String title){
        this.title = title;
    }
    public void setContent(String content) {
        this.content = content;
    }
}
