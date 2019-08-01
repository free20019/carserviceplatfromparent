package com.tw.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author ${H_H}
 * @DATE 2019-05-31
 * @TIME 15:35
 */
@Data
@ApiModel(value="培训预约")
public class TrainingAppointmentEn {
    @ApiModelProperty(value="预约人账户ID",name="ownerId",dataType = "String")
    private String ownerId;
    @ApiModelProperty(value="巡游车驾驶员从业资格证号",name="certificateNumber",dataType = "int")
    private int certificateNumber;
    @ApiModelProperty(value="手机号码",name="stuPhone",dataType = "String")
    private String stuPhone;

    @ApiModelProperty(value="姓名",name="stuName",dataType = "String")
    private String stuName;
    @ApiModelProperty(value="单位",name="stuComp",dataType = "String")
    private String stuComp;
    @ApiModelProperty(value="预约状态0:预约成功（默认）1：取消预约",name="appointmentStatus",dataType = "int")
    private int appointmentStatus;
    @ApiModelProperty(value="创建时间",name="appointmentDate",dataType = "String")
    private String appointmentDate;
}
