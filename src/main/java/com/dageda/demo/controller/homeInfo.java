package com.dageda.demo.controller;

/**
 * @ClassName homeInfo
 * @Description:
 * @Author 邹捷
 * @Date 2020/6/2
 * @Version V1.0
 **/
public class homeInfo {
    private String title;
    private String href;

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

    public homeInfo(String title, String href) {
        this.title = title;
        this.href = href;
    }

    public homeInfo() {
    }
}
