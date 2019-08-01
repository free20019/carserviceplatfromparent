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
@ApiModel(value="培训计划")
public class TrainingPlanEn {
    @ApiModelProperty(value="计划名称",name="plateName",dataType = "String")
    private String plateName;
    @ApiModelProperty(value="1：培训 2：复训",name="plateType",dataType = "int")
    private int plateType;
    @ApiModelProperty(value="计划编号",name="plateNO",dataType = "String")
    private String plateNO;
    @ApiModelProperty(value="培训日期",name="plateDate",dataType = "String")
    private String plateDate;
    @ApiModelProperty(value="计划人数",name="plateSum",dataType = "int")
    private int plateSum;
    @ApiModelProperty(value="发布人",name="publishUser",dataType = "String")
    private String publishUser;
    @ApiModelProperty(value="0：有效（默认） 1：无效",name="status",dataType = "int")
    private int status;
    @ApiModelProperty(value="创建时间",name="publishDate",dataType = "String")
    private String publishDate;


}
