package com.imooc.order.dto;

import lombok.Data;

import javax.validation.constraints.NotEmpty;

/**
 * @ClassName OrderDto
 * @Description com.imooc.order.dto
 * @Author Administrator
 * Date 2019/1/3 15:20
 * Version 1.0
 **/
@Data
public class OrderDto {

    @NotEmpty(message = "姓名不能为空")
    private String name;

    @NotEmpty(message = "性别不能为空")
    private String sex;
}
