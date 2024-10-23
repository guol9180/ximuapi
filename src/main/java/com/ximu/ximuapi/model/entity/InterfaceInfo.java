package com.ximu.ximuapi.model.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;

import com.ximu.ximuapi.common.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author: 析木
 * @description: 接口信息实体类
 */
@EqualsAndHashCode(callSuper = true)
@TableName(value ="interface_info")
@Data
public class InterfaceInfo extends BaseEntity {

    private String name;

    /**
     * 接口描述
     */
    private String description;

    /**
     * 接口地址
     */
    private String url;

    /**
     * 请求头
     */
    private String requestHeader;

    /**
     * 响应头
     */
    private String responseHeader;

    /**
     * 状态（默认0 - 禁用，1 - 启用）
     */
    private Integer status;

    /**
     * 请求类型
     */
    private String method;

    /**
     * 创建人
     */
    private Long userId;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}