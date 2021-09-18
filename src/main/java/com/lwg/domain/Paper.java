package com.lwg.domain;

public class Paper {
    private Integer pid;
    private String pname;
    private String pnumber;
    private Integer s_id;

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public String getPnumber() {
        return pnumber;
    }

    public void setPnumber(String pnumber) {
        this.pnumber = pnumber;
    }

    public Integer getS_id() {
        return s_id;
    }

    public void setS_id(Integer s_id) {
        this.s_id = s_id;
    }

    @Override
    public String toString() {
        return "Paper{" +
                "pid=" + pid +
                ", pname='" + pname + '\'' +
                ", pnumber='" + pnumber + '\'' +
                ", s_id=" + s_id +
                '}';
    }
}
