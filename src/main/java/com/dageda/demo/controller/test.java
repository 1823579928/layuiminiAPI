package com.dageda.demo.controller;

import com.alibaba.fastjson.JSON;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @ClassName test
 * @Description:
 * @Author 邹捷
 * @Date 2020/5/31
 * @Version V1.0
 **/
@RestController     //controller注解
@CrossOrigin        // 前后端分离注解
@RequestMapping("/test")    //url注解
public class test {
    /***
     * 功能描述:    这就类似调用接口   别人写好的接口 你直接调用到前端展示数据xxs
     * @Param: []
     * @Return: java.lang.String
     * @Author: 邹捷
     * @Date:  17:18
     */
    @RequestMapping("test1")
    @ResponseBody
    public Map test1(){
        Map<String,Object> map = new HashMap();
        homeInfo homeInfo = new homeInfo("首页","page/welcome-1.html?t=1");
        logoInfo logoInfo = new logoInfo("dageda","","images/logo.png");

        //左边导航栏 2子菜单
        List<menuInfo> list2 = new ArrayList<>();
        menuInfo menuInfo2 = new menuInfo("主页一","page/welcome-1.html","fa fa-tachometer","_self");
        menuInfo menuInfo3 = new menuInfo("主页二","page/welcome-2.html","fa fa-tachometer","_self");
        menuInfo menuInfo4 = new menuInfo("主页三","page/welcome-3.html","fa fa-tachometer","_self");
        list2.add(menuInfo2);
        list2.add(menuInfo3);
        list2.add(menuInfo4);

        //左边导航栏
        List<menuInfo> list1 = new ArrayList<>();
        menuInfo menuInfo1 = new menuInfo("主页模板","","fa fa-home","_self",list2);
        list1.add(menuInfo1);


        //头
        List<menuInfo> list = new ArrayList<>();
        menuInfo menuInfo = new menuInfo("常规管理","","fa fa-address-book","_self",list1);
        list.add(menuInfo);



        map.put("homeInfo",homeInfo);
        map.put("logoInfo",logoInfo);
        map.put("menuInfo",list);

        return map;
    }
}
