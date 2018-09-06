package com.haojukej.pojo;

public class WyUsersay {
    private Integer id;

    private String name;

    private String desc;

    private String usersay;

    private String userhead;

    private String deleteflag;

    private String deleteFlag;

    private String userHead;

    private String userSay;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc == null ? null : desc.trim();
    }

    public String getUsersay() {
        return usersay;
    }

    public void setUsersay(String usersay) {
        this.usersay = usersay == null ? null : usersay.trim();
    }

    public String getUserhead() {
        return userhead;
    }

    public void setUserhead(String userhead) {
        this.userhead = userhead == null ? null : userhead.trim();
    }

    public String getDeleteflag() {
        return deleteflag;
    }

    public void setDeleteflag(String deleteflag) {
        this.deleteflag = deleteflag == null ? null : deleteflag.trim();
    }

    public String getDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(String deleteFlag) {
        this.deleteFlag = deleteFlag == null ? null : deleteFlag.trim();
    }

    public String getUserHead() {
        return userHead;
    }

    public void setUserHead(String userHead) {
        this.userHead = userHead == null ? null : userHead.trim();
    }

    public String getUserSay() {
        return userSay;
    }

    public void setUserSay(String userSay) {
        this.userSay = userSay == null ? null : userSay.trim();
    }
}