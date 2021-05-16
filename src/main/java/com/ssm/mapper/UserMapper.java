package com.ssm.mapper;

import com.ssm.entity.UserBean;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/** @Author: QTX @Date: 2021/5/16 */
public interface UserMapper {
  /**
   * 查询所有
   *
   * @return
   */
  @Select("select id,name from user")
  List<UserBean> selectAll();
}
