package com.hangtalk.webapi.mapper;

import com.hangtalk.webapi.DO.RegisterUserDO;
import com.hangtalk.webapi.entry.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface UserDAO {
    User getUserById(Long id);

    User getUserByPassword(String username, String password);

    List<User> getAllUser();

    // 注册
    Boolean registerUser(RegisterUserDO userDo);
}
