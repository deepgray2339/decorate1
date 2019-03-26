package com.shenghaozhou.decorate1.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Work {
    private Long id;
    private Long authorId;
    private String url;
    private String houseType;
    private String style;
    private String area;

    public Work() {
    }

    public Work(Long authorId, String url, String houseType, String style, String area) {
        this.authorId = authorId;
        this.url = url;
        this.houseType = houseType;
        this.style = style;
        this.area = area;
    }

    @Override
    public String toString() {
        return getStyle() + " " + getUrl();
    }
}
