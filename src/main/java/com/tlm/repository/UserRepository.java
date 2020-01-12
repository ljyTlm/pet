package com.tlm.repository;

import com.tlm.bean.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @author: lijinyu@sensorsdata.cn
 * @date: 2020/1/11 8:05 下午
 */
@Repository
public interface UserRepository extends CrudRepository<User, Integer> {
}
