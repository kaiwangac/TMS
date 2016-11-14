package com.tms.dao;

import com.tms.model.Login;

public interface LoginDao {
    int deleteByPrimaryKey(Integer id);

    int insert(Login record);

    int insertSelective(Login record);

    Login selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Login record);

    int updateByPrimaryKey(Login record);

    Long selectByUsernameAndPassword(String username, String password);
}