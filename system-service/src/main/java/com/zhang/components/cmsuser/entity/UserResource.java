package com.zhang.components.cmsuser.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

@Data
@ApiModel("角色资源信息")
@TableName("tb_xa_cms_resource")
public class UserResource implements Serializable {

    @ApiModelProperty(name = "唯一标识",required = true)
    private Long id;
    @ApiModelProperty(name = "状态，0:锁定，1:正常，9:删除")
    private Integer status;
    @ApiModelProperty(name = "排序")
    private Integer sort;
    @ApiModelProperty(name = "上级菜单")
    private Long parentId;
    @ApiModelProperty(name = "资源名称")
    private String name;
    @ApiModelProperty(name = "资源地址")
    private String url;
    @ApiModelProperty(name = "资源类型0: 菜单级1：页面级2：按钮级")
    private Integer type;
    @ApiModelProperty(name = "展示图标")
    private String icon;
    @ApiModelProperty(name = "权限")
    private String permission;

}
