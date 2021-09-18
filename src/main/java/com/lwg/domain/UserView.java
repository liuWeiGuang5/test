package com.lwg.domain;

public class UserView extends User {
    private String cnum;

    public String getCnum() {
        return cnum;
    }

    public void setCnum(String cnum) {
        this.cnum = cnum;
    }

    @Override
    public String toString() {
        return "UserView{" +
                "cnum='" + cnum + '\'' +
                "} " + super.toString();
    }
}
