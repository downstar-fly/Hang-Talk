package com.hangtalk.webapi.service;

import com.hangtalk.webapi.DO.RegisterUserDO;
import com.hangtalk.webapi.entry.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    User getUserById(Long id);

    User getUserByPassword(String username, String password);

    List<User> getAllUser();

    // 注册
    Boolean registerUser(RegisterUserDO userDo);

    User loginByPassword(String username, String password);
}
