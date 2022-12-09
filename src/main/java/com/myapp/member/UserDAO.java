package com.myapp.dao;

import com.myapp.bean.UserVO;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;

public class UserDAO {
    @Autowired
    SqlSessionTemplate sqlSession;
    public UserVO getUser(UserVO vo){
        return sqlSession.selectOne("User.getUser",vo);
    }
}
