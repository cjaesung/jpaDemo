package com.r2ware.entity;

import com.r2ware.type.SEX;

import javax.persistence.*;

@Entity
public class Member {
    @Id
    private Long id;

    @Column(name = "USERNAME", nullable = false, length = 20)
    private String name;

    @Enumerated(EnumType.STRING)
    private SEX sex;

    @Lob
    private String content;

    @Lob
    private byte[] iamge;

    public Member() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SEX getSex() {
        return sex;
    }

    public void setSex(SEX sex) {
        this.sex = sex;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public byte[] getIamge() {
        return iamge;
    }

    public void setIamge(byte[] iamge) {
        this.iamge = iamge;
    }
}
