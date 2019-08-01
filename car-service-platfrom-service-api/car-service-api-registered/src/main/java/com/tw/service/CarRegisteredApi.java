package com.tw.service;

import com.tw.entity.*;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

/**
 * @author ${H_H}
 * @DATE 2019-05-15
 * @TIME 11:17
 */
@Api(tags = "网约车服务平台接口集合")
public interface CarRegisteredApi {
    /**
     * 登录接口
     *
     * @return LoginEn
     */
//    @PostMapping("/registered_login")
//    @ApiOperation(value = "注册模块登录接口")
//    @ApiImplicitParams({@ApiImplicitParam(name = "userName" ,value = "用户名",required = true,dataType = "String"),
//            @ApiImplicitParam(name = "password" ,value = "密码",required = true,dataType = "String")})
//    public BackMessage<String> Registered_login(@RequestParam("userName")String userName, @RequestParam("password")String password);
//
//    @PostMapping("/test01")
//    @ApiOperation(value = "测试接口01_无")
//    public BackMessage<UserEn2> test01();

    @PostMapping("/registered")
    @ApiOperation(value = "司机用户注册接口")
    public BackMessage<String> registered(@RequestBody UserMsgEn userMsgEn);


    @PostMapping("/accountRegistered")
    @ApiOperation(value = "司机账户注册接口")
    public BackMessage<String> accountRegistered(@RequestBody AccountEn accountEn);

    @PostMapping("/trainingPlan")
    @ApiOperation(value = "培训计划")
    public BackMessage<String> trainingPlan(@RequestBody TrainingPlanEn trainingPlanEn);

    @PostMapping("/trainingAppointment")
    @ApiOperation(value = "培训预约")
    public BackMessage<String> trainingAppointment(@RequestBody TrainingAppointmentEn trainingAppointmentEn);

    @PostMapping("/operatorInvite")
    @ApiOperation(value = "企业招聘")
    public BackMessage<String> operatorInvite(@RequestBody OperatorInviteEn operatorInviteEn);

    @PostMapping("/jobWantEn")
    @ApiOperation(value = "驾驶员求职")
    public BackMessage<String> jobWantEn(@RequestBody JobWantEn jobWantEn);

}
