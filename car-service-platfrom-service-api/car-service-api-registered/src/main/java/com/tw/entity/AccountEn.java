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
public class AccountEn {
    @ApiModelProperty(value="手机号码",name="phone",dataType = "String")
    private String phone;
    @ApiModelProperty(value="密码",name="password",dataType = "int")
    private int password;
    @ApiModelProperty(value="数据库时间",name="createTime",dataType = "String")
    private String createTime;

}
