package com.myapp;

import com.myapp.bean.UserVO;
import com.myapp.dao.UserDAO;
import org.springframework.beans.factory.annotation.Autowired;

public class UserServiceImpl {
    @Autowired
    UserDAO userDAO;
    public UserVO getUser(UserVO vo){
        return userDAO.getUser(vo);
    }
}
