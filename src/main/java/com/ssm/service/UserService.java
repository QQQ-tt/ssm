package com.ssm.service;

import com.ssm.entity.UserBean;

import java.util.List;

/** @Author: QTX @Date: 2021/5/16 */
public interface UserService {
  /**
   * 查询所有
   *
   * @return
   */
  List<UserBean> queryAll();
}
