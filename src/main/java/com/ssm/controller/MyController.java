package com.ssm.controller;

import com.ssm.entity.UserBean;
import com.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/** @Author: QTX @Date: 2021/5/15 */
@RestController
public class MyController {

  @RequestMapping("/test")
  public String test() {
    return "success";
  }

  @RequestMapping("/test1")
  public ModelAndView test01() {
    String str = "test01.success";
    ModelAndView modelAndView = new ModelAndView();
    modelAndView.addObject("str", str);
    modelAndView.setViewName("/test");
    return modelAndView;
  }

  private UserService userService;

  @Autowired
  public void setUserService(UserService userService) {
    this.userService = userService;
  }

  @RequestMapping("/user")
  public ModelAndView userTest() {
    List<UserBean> userBeans = userService.queryAll();
    ModelAndView modelAndView = new ModelAndView();
    modelAndView.addObject("users", userBeans);
    modelAndView.setViewName("/user");
    return modelAndView;
  }
}
