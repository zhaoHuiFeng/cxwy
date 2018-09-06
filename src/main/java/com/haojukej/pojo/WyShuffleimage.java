package com.haojukej.pojo;

import java.util.Date;

public class WyShuffleimage {
    private Integer id;

    private String image;

    private String jumpaddress;

    private Date createtime;

    private String deleteflag;

    private String url;

    private Date createTime;

    private String deleteFlag;

    private String jumpAddress;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image == null ? null : image.trim();
    }

    public String getJumpaddress() {
        return jumpaddress;
    }

    public void setJumpaddress(String jumpaddress) {
        this.jumpaddress = jumpaddress == null ? null : jumpaddress.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getDeleteflag() {
        return deleteflag;
    }

    public void setDeleteflag(String deleteflag) {
        this.deleteflag = deleteflag == null ? null : deleteflag.trim();
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(String deleteFlag) {
        this.deleteFlag = deleteFlag == null ? null : deleteFlag.trim();
    }

    public String getJumpAddress() {
        return jumpAddress;
    }

    public void setJumpAddress(String jumpAddress) {
        this.jumpAddress = jumpAddress == null ? null : jumpAddress.trim();
    }
}