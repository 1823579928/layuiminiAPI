package com.dageda.demo.controller;

/**
 * @ClassName logoInfo
 * @Description:
 * @Author 邹捷
 * @Date 2020/6/2
 * @Version V1.0
 **/
public class logoInfo {
    private String title;
    private String href;
    private String image;

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public logoInfo() {
    }

    public logoInfo(String title, String href, String image) {
        this.title = title;
        this.href = href;
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }
}
