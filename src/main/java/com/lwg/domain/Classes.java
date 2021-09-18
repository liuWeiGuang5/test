package com.lwg.domain;

import java.util.List;

public class Classes {
    private Integer cid;
    private String cnum;
    private String cname;
    private List<Student> students;

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

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "Classes{" +
                "cid=" + cid +
                ", cnum='" + cnum + '\'' +
                ", cname='" + cname + '\'' +
                ", students=" + students +
                '}';
    }
}
