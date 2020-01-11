package com.tlm.bean;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

/**
 * @author: lijinyu@sensorsdata.cn
 * @date: 2020/1/11 7:34 下午
 */
@Data
@Table("m_user")
public class User {
  @Id
  Integer id;
  String gender;
  Integer age;
  String name;
  String phone;
  Integer typeId;
  Integer source;
}
