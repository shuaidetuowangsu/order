package com.imooc.order.util;

import lombok.Data;

/**
 * @ClassName ResultVO
 * @Description com.imooc.order.util
 * @Author Administrator
 * Date 2019/1/3 15:37
 * Version 1.0
 **/
@Data
public class ResultVO<T> {

    private Integer code;

    private String msg;

    private T data;
}
