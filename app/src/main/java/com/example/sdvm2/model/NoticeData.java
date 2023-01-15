package com.example.sdvm2.model;

public class NoticeData {
    private String subject;
    private String data;

    public NoticeData(){

    }

    public NoticeData(String subject, String data) {
        this.subject = subject;
        this.data = data;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getSubject() {
        return subject;
    }

    public String getData() {
        return data;
    }
}
