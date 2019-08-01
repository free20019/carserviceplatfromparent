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
public class OperatorInviteEn {
    @ApiModelProperty(value="招聘标题",name="inviteTitle",dataType = "String")
    private String inviteTitle;
    @ApiModelProperty(value="招聘具体内容",name="inviteContent",dataType = "String")
    private String inviteContent;
    @ApiModelProperty(value="招聘地点",name="inviteAdr",dataType = "String")
    private String inviteAdr;

    @ApiModelProperty(value="公司联系人",name="contact",dataType = "String")
    private String contact;
    @ApiModelProperty(value="联系人电话",name="contactPhone",dataType = "String")
    private String contactPhone;
    @ApiModelProperty(value="薪资",name="compensation",dataType = "String")
    private String compensation;
    @ApiModelProperty(value="其他补充说明",name="rests",dataType = "String")
    private String rests;
    @ApiModelProperty(value="1：巡游车招聘 2：网约车招聘",name="inviteType",dataType = "int")
    private int inviteType;
    @ApiModelProperty(value="0：有效（默认）  1：无效",name="status",dataType = "int")
    private int status;
    @ApiModelProperty(value="数据库时间",name="createTime",dataType = "String")
    private String createTime;


}
