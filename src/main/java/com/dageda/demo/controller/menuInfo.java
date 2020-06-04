package com.dageda.demo.controller;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName menuInfo
 * @Description:
 * @Author 邹捷
 * @Date 2020/6/2
 * @Version V1.0
 **/
public class menuInfo {
    private String title;
    private String href;
    private String icon;
    private String target;
    private List<menuInfo> child;

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

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    public List<menuInfo> getChild() {
        return child;
    }

    public void setChild(List<menuInfo> child) {
        this.child = child;
    }

    public menuInfo(String title, String href, String icon, String target) {
        this.title = title;
        this.href = href;
        this.icon = icon;
        this.target = target;
    }

    public menuInfo(String title, String href, String icon, String target, List<menuInfo> child) {
        this.title = title;
        this.href = href;
        this.icon = icon;
        this.target = target;
        this.child = child;
    }

    public menuInfo() {
    }
}
