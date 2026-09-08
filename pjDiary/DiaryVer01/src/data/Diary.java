package data;//김기범

import java.io.Serializable;

public class Diary implements Serializable{
    //날짜 date, 제목 title, 내용 content 같은 일기 데이터 객체, getter, setter
    private String date;
    private String title;
    private String content;

    public Diary(String date, String title, String content){
        this.date = date;
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
    public void setContent(String content) {
        this.content = content;
    }
    public void setTitle(String title) {
        this.title = title;
    }
}