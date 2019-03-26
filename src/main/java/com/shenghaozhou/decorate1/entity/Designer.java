package com.shenghaozhou.decorate1.entity;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class Designer {
    private Long id;
    private String name;
    private String profileImg;
    private String introduce;

    public Designer() {
    }

    public Designer(String name, String profileImg, String introduce) {
        this.name = name;
        this.profileImg = profileImg;
        this.introduce = introduce;
    }
}
