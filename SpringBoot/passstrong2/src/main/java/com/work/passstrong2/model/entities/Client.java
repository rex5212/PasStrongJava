package com.work.passstrong2.model.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class Client {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;
    private String name;
    private  String password;

//    public void setAid(int aid) {
//        this.aid = aid;
//    }
//
//    public void setAname(String aname) {
//        this.aname = aname;
//    }
//
//    public void setLang(String lang) {
//        this.lang = lang;
//    }
//
//    public int getAid() {
//        return aid;
//    }
//
//    public String getAname() {
//        return aname;
//    }
//
//    public String getLang() {
//        return lang;
//    }

}
