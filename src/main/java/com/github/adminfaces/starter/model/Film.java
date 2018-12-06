package com.github.adminfaces.starter.model;

import com.github.adminfaces.starter.dto.enums.GendreEnum;

import javax.persistence.*;

@Entity
//@Table(name ="Film", schema = "jat")
public class Film {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int fid;
    private String name;
    private GendreEnum gendre;
    private String description;

    public Film() {
    }

    public int getFid() {
        return fid;
    }

    public void setFid(int fid) {
        this.fid = fid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public GendreEnum getGendre() {
        return gendre;
    }

    public void setGendre(GendreEnum gendre) {
        this.gendre = gendre;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
