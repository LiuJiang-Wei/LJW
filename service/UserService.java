package com.bgs.maven.wineparty.service;

import com.bgs.maven.wineparty.pojo.OrgZtree;
import com.bgs.maven.wineparty.pojo.PubData;
import com.bgs.maven.wineparty.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserService {

    //登录
    User getByNameAndPwd(String name, String password);

    //机构管理zTree
    List<OrgZtree> getOrgZtree(Integer id);

    //用户管理zTree
    List<User> getUserZtree(Integer id);

    //增加用户信息
    int insertUser(User user);

    //查询用户的pid
    List<User> getAllUserPid(Integer id);

    //预报数据
    int insertPubData(PubData pubData);

    //查看数据 详细列表信息
    List<PubData> getAllLookData();

    //增加上报数据
    int insertSbData(PubData pubData);



}
