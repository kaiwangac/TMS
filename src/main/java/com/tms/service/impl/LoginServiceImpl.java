package com.tms.service.impl;

import com.tms.dao.LoginDao;
import com.tms.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by wangkai on 2016/11/14.
 */
@Service
public class LoginServiceImpl implements LoginService {
    @Autowired
    private LoginDao loginDao;
    public Boolean isAccessible(String username, String password) {
        return null;
    }
}
