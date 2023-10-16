package com.work.passstrong2;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Alien {

    @Id
    private int aid;
    private String aname;
    private  String lang;

    public void setAid(int aid) {
        this.aid = aid;
    }

    public void setAname(String aname) {
        this.aname = aname;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    public int getAid() {
        return aid;
    }

    public String getAname() {
        return aname;
    }

    public String getLang() {
        return lang;
    }

}
