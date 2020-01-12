package com.tlm.controller;

import com.swagger.model.TUser;
import com.tlm.bean.User;
import com.tlm.service.AccountService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * @author: lijinyu@sensorsdata.cn
 * @date: 2020/1/11 7:51 下午
 */
@Api("账号管理")
@RestController
@RequestMapping("/account")
public class AccountController {

  @Autowired
  AccountService accountService;

  @ApiOperation(value="添加一个用户信息",tags={""},notes="",response = TUser.class)
  @ApiResponses(value =    {
      @ApiResponse(code = 200, message = "添加成功", response = TUser.class) })
  @PostMapping("/register")
  public TUser addUser(@ApiParam(value = "要添加的用户" ,required=true )  @Valid @RequestBody TUser tUser) {
    return new TUser();
  }
}
