package com.tms.controller;

import com.tms.dao.LoginDao;
import com.tms.model.Login;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by wangkai on 2016/10/13.
 */
@Controller
@RequestMapping("/")
public class LoginController {
    @Autowired
    LoginDao loginDao;
    @RequestMapping(method = RequestMethod.GET)
    public String init(ModelAndView modelAndView) {
        Login loginInfo = this.loginDao.selectByPrimaryKey(1);
        modelAndView.addObject("login", loginInfo);
        return "login";
    }
}
