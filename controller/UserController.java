package com.bgs.maven.wineparty.controller;


import com.bgs.maven.wineparty.pojo.OrgZtree;
import com.bgs.maven.wineparty.pojo.PubData;
import com.bgs.maven.wineparty.pojo.User;
import com.bgs.maven.wineparty.service.UserService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.*;

@Controller
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;


    @RequestMapping("login")
    @ResponseBody
    //登录
    public boolean login(String name,String password,HttpSession session) {
        User user = userService.getByNameAndPwd(name, password);
        if(user !=null) {
            session.setAttribute("user", user);
            return true;
        }else {
            return false;
        }
    }

    //机构管理zTree
    @RequestMapping("getOrgZtree")
    @ResponseBody								//节点的id是子节点的父id
    public List<OrgZtree> getOrgZtree(HttpServletRequest request, Integer id){
        List<OrgZtree> list = userService.getOrgZtree(id);
       for(OrgZtree li:list) {
            li.setIcon(request.getContextPath()+li.getIcon());
        }
        return list;

    }

    //用户管理zTree
    @RequestMapping("getUserZtree")
    @ResponseBody								//节点的id是子节点的父id
    public List<User> getUserZtree(HttpServletRequest request, Integer id){
        List<User> list = userService.getUserZtree(id);
       for(User li:list) {
            li.setIcon(request.getContextPath()+li.getIcon());
        }
        return list;

    }

    //添加用户信息
    @RequestMapping("insertUser")
    @ResponseBody
    public int insertUser(User user){

        return userService.insertUser(user);
    }

    //查询用户的pid
    @RequestMapping("getAllUserPid")
    @ResponseBody
    public List<User> getAllUserPid(Integer id){
        System.out.println(id);
        return userService.getAllUserPid(id);
    }


    //预报数据
    @RequestMapping("insertPubData")
    @ResponseBody
    public int insertPubData(PubData pubData){

        return userService.insertPubData(pubData);
    }


//查看数据 详细列表信息
@RequestMapping("getAllLookData")
@ResponseBody
public List<PubData> getAllLookData(){

    return userService.getAllLookData();
}

//增加上报数据
@RequestMapping("insertSbData")
@ResponseBody
public int insertSbData(PubData pubData){

    return userService.insertSbData(pubData);
}























}
