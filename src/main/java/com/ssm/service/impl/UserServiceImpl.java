package com.ssm.service.impl;

import com.ssm.entity.UserBean;
import com.ssm.mapper.UserMapper;
import com.ssm.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/** @Author: QTX @Date: 2021/5/16 */
@Service("userService")
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class UserServiceImpl implements UserService {

  private final UserMapper userMapper;

  @Override
  public List<UserBean> queryAll() {
    return this.userMapper.selectAll();
  }
}
