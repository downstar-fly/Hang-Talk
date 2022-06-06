package com.hangtalk.webapi.service.impl;

import com.hangtalk.webapi.DO.RegisterUserDO;
import com.hangtalk.webapi.entry.User;
import com.hangtalk.webapi.mapper.UserDAO;
import com.hangtalk.webapi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import java.util.List;

@Service("UserService")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDAO userDAO;

    /***
     * @param id
     * @return
     */
    public User getUserById(Long id) {
        User user = new User();
        if (!ObjectUtils.isEmpty(id)) {
            user = userDAO.getUserById(id);
        }
        return user;
    }

    public User getUserByPassword(String username, String password){
        User user = new User();
        if (!ObjectUtils.isEmpty(username) && !ObjectUtils.isEmpty(password)) {
            user = userDAO.getUserByPassword(username, password);
        }
        return user;
    }

    public List<User> getAllUser(){
        return userDAO.getAllUser();
    }

    public Boolean registerUser(RegisterUserDO userDO){
        if (!ObjectUtils.isEmpty(userDO)) {
            return userDAO.registerUser(userDO);
        }
        return false;
    }
}
