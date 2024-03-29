package com.lwg.domain;

import java.util.Date;

public class Orders {
    private Integer id;
    private Integer userId;
    private String number;
    private String note;
    private Date createTime;

    public Orders() {
    }

    public Orders(Integer id, Integer userId, String number, String note, Date createTime) {
        this.id = id;
        this.userId = userId;
        this.number = number;
        this.note = note;
        this.createTime = createTime;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Orders{" +
                "id=" + id +
                ", userId=" + userId +
                ", number='" + number + '\'' +
                ", note='" + note + '\'' +
                ", createTime=" + createTime +
                '}';
    }
}
