package com.tw.registered.mybatis.service;

import com.tw.entity.*;
import com.tw.registered.mybatis.dao.UserMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Slf4j
public class UserService {
    @Autowired
    private UserMapper userMapper;
    @Transactional(rollbackFor = Exception.class)
    public int accountRegistered(AccountEn accountEn){
        int a = userMapper.accountRegistered(accountEn);
        return a;
    }
    @Transactional(rollbackFor = Exception.class)
    public int registered(UserMsgEn userMsgEn){
        int a = userMapper.registered(userMsgEn);
        return a;
    }
    @Transactional(rollbackFor = Exception.class)
    public int trainingPlan(TrainingPlanEn trainingPlanEn){
        int a = userMapper.trainingPlan(trainingPlanEn);
        return a;
    }
    @Transactional(rollbackFor = Exception.class)
    public int trainingAppointment(TrainingAppointmentEn trainingAppointmentEn){
        int a = userMapper.trainingAppointment(trainingAppointmentEn);
        return a;
    }
    @Transactional(rollbackFor = Exception.class)
    public int operatorInvite(OperatorInviteEn operatorInviteEn){
        int a = userMapper.operatorInvite(operatorInviteEn);
        return a;
    }
    @Transactional(rollbackFor = Exception.class)
    public int jobWantEn(JobWantEn jobWantEn){
        int a = userMapper.jobWantEn(jobWantEn);
        return a;
    }

    /**
     * @Transactional 事物
     * 如果中间报错会回滚  USERNAME,LOGINNAME, PASSWORD
     * */
    @Transactional(rollbackFor = Exception.class)
    public int insert(String userName, String password){
        int a = userMapper.insert(userName,password);
        return a;
    }

    @Transactional(rollbackFor = Exception.class)
    public int loginCount(String LOGINNAME,String PASSWORD){

        int loginCount = userMapper.loginCount(LOGINNAME,PASSWORD);
        return loginCount;
    }

    @Transactional(rollbackFor = Exception.class)
    public BackMessage test03(){
//        try {
//            Thread.sleep(2000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        return new BackMessage(1,"可可你个垃圾",null);
    }
}
