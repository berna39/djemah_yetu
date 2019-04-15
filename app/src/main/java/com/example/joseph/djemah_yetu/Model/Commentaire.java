package com.example.joseph.djemah_yetu.Model;

import com.google.firebase.database.ServerValue;

public class Commentaire {
    private String content;
    private String uid;
    private String uimg;
    private String uname;
    private Object timestamp;


    public Commentaire() {
    }

    public Commentaire(String content, String uid, String uimg, String uname) {
        this.setContent(content);
        this.setUid(uid);
        this.setUimg(uimg);
        this.setUname(uname);
        this.setTimestamp(ServerValue.TIMESTAMP);

    }

    public Commentaire(String content, String uid, String uimg, String uname, Object timestamp) {
        this.setContent(content);
        this.setUid(uid);
        this.setUimg(uimg);
        this.setUname(uname);
        this.setTimestamp(timestamp);
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getUimg() {
        return uimg;
    }

    public void setUimg(String uimg) {
        this.uimg = uimg;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public Object getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Object timestamp) {
        this.timestamp = timestamp;
    }
}
