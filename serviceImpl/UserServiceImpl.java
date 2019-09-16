package com.bgs.maven.wineparty.serviceImpl;


import com.bgs.maven.wineparty.mapper.UserMapper;
import com.bgs.maven.wineparty.pojo.OrgZtree;
import com.bgs.maven.wineparty.pojo.PubData;
import com.bgs.maven.wineparty.pojo.User;
import com.bgs.maven.wineparty.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    //登录
    @Override
    public User getByNameAndPwd(String name, String password) {
        return userMapper.getByNameAndPwd(name,password);
    }

    //机构管理zTree
    @Override
    public List<OrgZtree> getOrgZtree(Integer id) {
        return userMapper.getOrgZtree(id);
    }

    //用户管理zTree
    @Override
    public List<User> getUserZtree(Integer id) {
        return userMapper.getUserZtree(id);
    }

    //增加用户信息
    @Override
    public int insertUser(User user) {
        return userMapper.insertUser(user);
    }

    //查询用户的pid
    @Override
    public List<User> getAllUserPid(Integer id) {
        return userMapper.getAllUserPid(id);
    }

    //预报数据
    @Override
    public int insertPubData(PubData pubData) {
        return userMapper.insertPubData(pubData);
    }

    //查看数据 详细列表信息
    @Override
    public List<PubData> getAllLookData() {
        return userMapper.getAllLookData();
    }

    //增加上报数据
    @Override
    public int insertSbData(PubData pubData) {
        return userMapper.insertSbData(pubData);
    }


}
