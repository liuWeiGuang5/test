package com.lwg.domain;

import org.apache.ibatis.annotations.Param;

public class Student {
    private Integer sid;
    private String sname;
    private String remark;
    private Integer cla_id;
    private Classes classes;
    private Paper paper;

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Integer getCla_id() {
        return cla_id;
    }

    public void setCla_id(Integer cla_id) {
        this.cla_id = cla_id;
    }

    public Classes getClasses() {
        return classes;
    }

    public void setClasses(Classes classes) {
        this.classes = classes;
    }

    public Paper getPaper() {
        return paper;
    }

    public void setPaper(Paper paper) {
        this.paper = paper;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sid=" + sid +
                ", sname='" + sname + '\'' +
                ", remark='" + remark + '\'' +
                ", cla_id=" + cla_id +
                ", classes=" + classes +
                ", paper=" + paper +
                '}';
    }
}
