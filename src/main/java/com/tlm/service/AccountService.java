package com.tlm.service;

import com.swagger.model.TUser;
import com.tlm.bean.User;
import com.tlm.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author: lijinyu@sensorsdata.cn
 * @date: 2020/1/11 7:55 下午
 */
@Service
public class AccountService {

  @Autowired
  UserRepository userRepository;

  public TUser addUser(TUser tUser) {
    User userNew = new User();
    userNew.setName(tUser.getName());
    userNew.setPassword(tUser.getPassword());
    userNew.setSource(0);
    userNew.setTypeId(0);
    User user = userRepository.save(userNew);
    tUser.setId(user.getId());
    return tUser;
  }

  public TUser getUser(Integer userId) {
    User user = userRepository.findById(userId).orElse(null);
    TUser tUser = new TUser();
    tUser.setId(userId);
    tUser.setName(user.getName());
    tUser.setPhone(user.getPhone());
    tUser.setSource(user.getSource());
    tUser.setGender(user.getGender());
    tUser.setAge(user.getAge());
    return tUser;
  }
}
