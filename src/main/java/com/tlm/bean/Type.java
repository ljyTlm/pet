package com.tlm.bean;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

/**
 * @author: lijinyu@sensorsdata.cn
 * @date: 2020/1/12 11:39 上午
 */
@Data
@Table("m_type")
public class Type {
  @Id
  Integer id;
  String name;
  String instructions;
}
