package com.github.adminfaces.starter.dto.enums;

public enum  GendreEnum {
    HORROR("Horror"),
    COMEDY("Komedie"),
    ACTION("Akční"),
    ANIMATED("Animovaný")
    ;

    private String description;

    GendreEnum(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
