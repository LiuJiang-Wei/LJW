package com.bgs.maven.wineparty.mapper;

import com.bgs.maven.wineparty.pojo.OrgZtree;
import com.bgs.maven.wineparty.pojo.PubData;
import com.bgs.maven.wineparty.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;


public interface UserMapper {
    //登录
    User getByNameAndPwd(@Param("name") String name, @Param("password")String password);

    //机构管理zTree
    List<OrgZtree> getOrgZtree(@Param("pid") Integer id);

    //用户管理zTree
    List<User> getUserZtree(@Param("pid") Integer id);

    //增加用户信息
    int insertUser(User user);

    //查询用户的pid
    List<User> getAllUserPid(@Param("pid") Integer id);

    //预报数据
    int insertPubData(PubData pubData);

    //查看数据 详细列表信息
    List<PubData> getAllLookData();

    //增加上报数据
    int insertSbData(PubData pubData);



}
