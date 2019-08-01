package com.tw.registered.entity;

import lombok.Data;

/**
 * Created by gaorui on 2017/12/14.
 */
@Data
public class PictureResp {
    int status;   //0成功， 1失败
    long size;    //文件大小，单位：字节
    long index;   //表主键索引
    String path;  //文件在服务器存储路径

}
