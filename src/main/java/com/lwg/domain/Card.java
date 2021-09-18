package com.lwg.domain;

public class Card {
    private Integer cid;
    private String cnum;
    private String desc;
    private Integer u_id;

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getCnum() {
        return cnum;
    }

    public void setCnum(String cnum) {
        this.cnum = cnum;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Integer getU_id() {
        return u_id;
    }

    public void setU_id(Integer u_id) {
        this.u_id = u_id;
    }

    @Override
    public String toString() {
        return "Card{" +
                "cid=" + cid +
                ", cnum='" + cnum + '\'' +
                ", desc='" + desc + '\'' +
                ", u_id=" + u_id +
                '}';
    }
}
