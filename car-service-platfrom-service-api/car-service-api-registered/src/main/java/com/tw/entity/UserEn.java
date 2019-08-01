package com.tw.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author ${H_H}
 * @DATE 2019-05-22
 * @TIME 17:01
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(value = "Registered_login返回")
public class UserEn {
    @ApiModelProperty(value = "用户名")
    private String name;
    @ApiModelProperty(value = "密码")
    private String password;


}
