package com.tw;

import com.tw.entity.BackMessage;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

@Api(tags = "巡游车接口")
public interface CarParadeApi {

    @ApiOperation(value = "巡游车登录接口")
    @PostMapping("/parade_login")
    @ApiImplicitParams({@ApiImplicitParam(name = "user" ,value = "用户名",required = true,dataType = "String"),
            @ApiImplicitParam(name = "password" ,value = "密码",required = true,dataType = "String")})
    public BackMessage Parade_login(@RequestParam("user") String user,@RequestParam("password") String password);

}
