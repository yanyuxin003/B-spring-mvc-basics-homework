package com.thoughtworks.capacity.gtb.mvc.service;

import com.thoughtworks.capacity.gtb.mvc.domain.User;
import com.thoughtworks.capacity.gtb.mvc.exception.UserIsExistException;
import com.thoughtworks.capacity.gtb.mvc.exception.UserNameAndPasswordIsNullException;
import com.thoughtworks.capacity.gtb.mvc.exception.UsernameOrPasswordIsWrong;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class UserService {
    private Map<Integer, User> userMap = new HashMap<>();

    public UserService() {
        userMap.put(1, new User(1, "yanyuxin", "123456", "yyx@qq.com"));
        userMap.put(2, new User(2, "ytj", "22222", "ytj@qq.com"));
    }

    public void registerUser(User user) {
        if((user.getUsername()==null)){
            throw new UserNameAndPasswordIsNullException("用户名不为空");
        }else if(user.getPassword()==null) {
            throw new UserNameAndPasswordIsNullException("密码不为空");
        }
        for(int i=0 ;i< userMap.size();i++){
            if(userMap.get(i).getUsername()==user.getUsername()) {
                throw new UserIsExistException("用户已存在");
            }
        }
        userMap.put(user.getId(), user);
    }

    public User userLogin(String username, String password) {
        for(int i=0 ;i< userMap.size();i++){
            if (userMap.get(i).getUsername().equals(username) && userMap.get(i).getPassword().equals(password)) {
                return userMap.get(i) ;
            }
        }
        throw  new UsernameOrPasswordIsWrong("用户名或密码错误");
    }
}