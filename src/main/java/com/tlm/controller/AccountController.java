package com.tlm.controller;

import com.tlm.bean.User;
import com.tlm.service.AccountService;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: lijinyu@sensorsdata.cn
 * @date: 2020/1/11 7:51 下午
 */
@RestController
@RequestMapping("/account")
public class AccountController {

  @Autowired
  AccountService accountService;

}
