package com.tw.registered.mybatis.dao;

import com.tw.entity.*;
import io.swagger.annotations.ApiModelProperty;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.web.bind.annotation.RequestBody;

public interface UserMapper {
	@Insert("INSERT INTO USER(USERNAME, PASSWORD) VALUES(#{userName}, #{password})")
	int insert(@Param("userName") String userName,@Param("password") String password);

	@Select("select count(*) from OA_TUSER a where a.LOGINNAME=#{LOGINNAME} and a.PASSWORD=#{PASSWORD}")
	int loginCount(@Param("LOGINNAME") String LOGINNAME, @Param("PASSWORD") String PASSWORD);


	@Insert("INSERT INTO tb_owner(name,sex,birthday,idNumber,address,nationality,registerDate,createTime) VALUES(#{name}, #{sex}," +
			"#{birthday},#{idNumber},#{address},#{nationality},#{registerDate},#{createTime})")
	int registered(UserMsgEn userMsgEn);

	@Insert("INSERT INTO tb_account(phone,password,createTime) VALUES(#{phone}, #{password},#{createTime})")
	int accountRegistered(AccountEn accountEn);

	@Insert("INSERT INTO px_jhfb(plateName,plateType,plateNO,plateDate,plateSum,publishUser,status,publishDate) " +
			"VALUES(#{plateName}, #{plateType},#{plateNO},#{plateDate},#{plateSum},#{publishUser},#{status},#{publishDate})")
	int trainingPlan(TrainingPlanEn trainingPlanEn);

	@Insert("INSERT INTO px_yyxx(ownerId,certificateNumber,stuPhone,stuName,stuComp,appointmentStatus,appointmentDate) " +
			"VALUES(#{ownerId}, #{certificateNumber},#{stuPhone},#{stuName},#{stuComp},#{appointmentStatus},#{appointmentDate})")
	int trainingAppointment(TrainingAppointmentEn trainingAppointmentEn);

	@Insert("INSERT INTO tb_operator_invite(inviteTitle,inviteContent,inviteAdr,contact,contactPhone,compensation,rests,inviteType,status,createTime) " +
			"VALUES(#{inviteTitle}, #{inviteContent},#{inviteAdr},#{contact},#{contactPhone},#{compensation},#{rests},#{inviteType},#{status},#{createTime})")
	int operatorInvite(OperatorInviteEn operatorInviteEn);


	@Insert("INSERT INTO tb_job_wanted(ownerId,driverPhone,driverName,driverSex,isCar,carModel,rests,wantedType,status,createTime) " +
			"VALUES(#{ownerId}, #{driverPhone},#{driverName},#{driverSex},#{isCar},#{carModel},#{rests},#{wantedType},#{status},#{createTime})")
	int jobWantEn(JobWantEn jobWantEn);

}
