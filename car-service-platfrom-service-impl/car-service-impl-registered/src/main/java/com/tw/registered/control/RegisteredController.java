package com.tw.registered.control;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.tw.entity.*;
import com.tw.registered.entity.PictureResp;
import com.tw.registered.mybatis.service.UserService;
import com.tw.service.CarRegisteredApi;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
public class RegisteredController  implements CarRegisteredApi {
    @Autowired
    private UserService userService;

    @Override
    public BackMessage<String> registered(UserMsgEn userMsgEn) {

        return new BackMessage<String>(1,"返回结果",userService.registered(userMsgEn)+"");
    }

    @Override
    public BackMessage<String> accountRegistered(AccountEn accountEn) {
        return new BackMessage<String>(1,"返回结果",userService.accountRegistered(accountEn)+"");
    }

    @Override
    public BackMessage<String> trainingPlan(TrainingPlanEn trainingPlanEn) {
        return new BackMessage<String>(1,"返回结果",userService.trainingPlan(trainingPlanEn)+"");
    }

    @Override
    public BackMessage<String> trainingAppointment(TrainingAppointmentEn trainingAppointmentEn) {
        return new BackMessage<String>(1,"返回结果",userService.trainingAppointment(trainingAppointmentEn)+"");
    }

    @Override
    public BackMessage<String> operatorInvite(OperatorInviteEn operatorInviteEn) {
        return new BackMessage<String>(1,"返回结果",userService.operatorInvite(operatorInviteEn)+"");
    }

    @Override
    public BackMessage<String> jobWantEn(JobWantEn jobWantEn) {
        return new BackMessage<String>(1,"返回结果",userService.jobWantEn(jobWantEn)+"");
    }
//    @Override
//    public BackMessage<String> Registered_login(String userName, String password) {
//        return new BackMessage<String>(1,"registered返回数据",userService.insert(userName,password)+"");
//    }
//
//    @Override
//    public BackMessage<UserEn2> test01() {
//        return new BackMessage<UserEn2>(1,"registered返回数据",new UserEn2("xhh","123"));
//    }

//    @Override
//    public BackMessage insert(String user, String password) {
//        return new BackMessage(userService.insert(user,user,password),"registered插入返回",null);
//    }
//
//    @Override
//    public BackMessage<UserEn2> test01() {
//        log.info("test01  线程名字="+Thread.currentThread().getName());
//        return new BackMessage<UserEn2>(1,"registered返回数据",new UserEn2("xhh","123"));
//    }
//
//    @Override
//    public BackMessage test02() {
//        log.info("test02  线程名字="+Thread.currentThread().getName());
//        return new BackMessage(1,"无_测试接口02返回数据",null);
//    }
//
//    @Override
//    @HystrixCommand(fallbackMethod = "fallback")
//    public BackMessage test03() {
//        log.info("test03  线程名字="+Thread.currentThread().getName());
//        return userService.test03();
//    }
//
//    //@GetMapping("/fallback")
//    public BackMessage fallback() {
//        return new BackMessage(1,"当前访问人数过多",null);
//    }

}
