package com.tw.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author ${H_H}
 * @DATE 2019-05-31
 * @TIME 15:35
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(value="用户注册")
public class UserMsgEn {
    @ApiModelProperty(value="用户名",name="name",dataType = "String")
    private String name;
    @ApiModelProperty(value="性别1 男  2女",name="sex",dataType = "int")
    private int sex;
    @ApiModelProperty(value="出生日期",name="birthday",dataType = "String")
    private String birthday;
    @ApiModelProperty(value="身份证号",name="idNumber",dataType = "String")
    private String idNumber;
    @ApiModelProperty(value="居住地址",name="address",dataType = "String")
    private String address;
    @ApiModelProperty(value="国籍",name="nationality",dataType = "String")
    private String nationality;
    @ApiModelProperty(value="注册日期",name="registerDate",dataType = "String")
    private String registerDate;
    @ApiModelProperty(value="创建时间",name="createTime",dataType = "String")
    private String createTime;
}
