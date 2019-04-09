/**
 * @CompanyName:
 * @author: Guo Huaijian
 * @Date:
 * @description:
 */
package com.pzhu.management.service;

import com.pzhu.management.mapper.UserMapper;
import com.pzhu.management.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public User userlongin(User user){
       User user1 = userMapper.selectUser(user);
       if (user1!=null){
           return user1;
       }else {
           return null;
       }
    }
    public int register(User user){
       int i = userMapper.insert(user);
       return i;
    }
}
