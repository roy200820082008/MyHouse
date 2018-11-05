package com.harleycorp.pojo;

public class LikeUsers {
    private Integer id;

    private String slug;

    private String time;

    private Integer userid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug == null ? null : slug.trim();
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        String[] timeArr = time.split("\\+");
        time = timeArr[0].replace("T"," ");
        this.time = time == null ? null : time.trim();
    }
    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }
}