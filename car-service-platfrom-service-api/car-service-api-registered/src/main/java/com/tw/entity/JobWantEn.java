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
@ApiModel(value="账户")
public class JobWantEn {
    @ApiModelProperty(value="预约人账户ID",name="ownerId",dataType = "String")
    private String ownerId;
    @ApiModelProperty(value="手机号码",name="driverPhone",dataType = "int")
    private int driverPhone;
    @ApiModelProperty(value="姓名",name="driverName",dataType = "String")
    private String driverName;
    @ApiModelProperty(value="1 男 2女",name="driverSex",dataType = "int")
    private int driverSex;
    @ApiModelProperty(value="是否有车 0：没有  1：有",name="isCar",dataType = "int")
    private int isCar;
    @ApiModelProperty(value="车辆品牌型号",name="carModel",dataType = "String")
    private String carModel;
    @ApiModelProperty(value="其他描述",name="rests",dataType = "String")
    private String rests;
    @ApiModelProperty(value="求职类型 1：巡游车求职   2：网约车求职",name="wantedType",dataType = "int")
    private int wantedType;
    @ApiModelProperty(value="状态0：有效（默认）  1：无效",name="status",dataType = "int")
    private int status;
    @ApiModelProperty(value="数据库时间",name="createTime",dataType = "String")
    private String createTime;

}
