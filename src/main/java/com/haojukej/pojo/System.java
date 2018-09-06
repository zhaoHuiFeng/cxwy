package com.haojukej.pojo;

public class System {
    private Integer id;

    private String name;

    private String versionName;

    private String versionCode;

    private String authorName;

    private String domainName;

    private String serverIp;

    private String serverSurroundings;

    private String databaseCode;

    private String maxUpload;

    private Integer createTime;

    private String mark;

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

    public String getVersionName() {
        return versionName;
    }

    public void setVersionName(String versionName) {
        this.versionName = versionName == null ? null : versionName.trim();
    }

    public String getVersionCode() {
        return versionCode;
    }

    public void setVersionCode(String versionCode) {
        this.versionCode = versionCode == null ? null : versionCode.trim();
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName == null ? null : authorName.trim();
    }

    public String getDomainName() {
        return domainName;
    }

    public void setDomainName(String domainName) {
        this.domainName = domainName == null ? null : domainName.trim();
    }

    public String getServerIp() {
        return serverIp;
    }

    public void setServerIp(String serverIp) {
        this.serverIp = serverIp == null ? null : serverIp.trim();
    }

    public String getServerSurroundings() {
        return serverSurroundings;
    }

    public void setServerSurroundings(String serverSurroundings) {
        this.serverSurroundings = serverSurroundings == null ? null : serverSurroundings.trim();
    }

    public String getDatabaseCode() {
        return databaseCode;
    }

    public void setDatabaseCode(String databaseCode) {
        this.databaseCode = databaseCode == null ? null : databaseCode.trim();
    }

    public String getMaxUpload() {
        return maxUpload;
    }

    public void setMaxUpload(String maxUpload) {
        this.maxUpload = maxUpload == null ? null : maxUpload.trim();
    }

    public Integer getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Integer createTime) {
        this.createTime = createTime;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark == null ? null : mark.trim();
    }
}