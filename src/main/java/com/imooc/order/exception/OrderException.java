package com.imooc.order.exception;

/**
 * @ClassName OrderException
 * @Description com.imooc.order.exception
 * @Author Administrator
 * Date 2019/1/3 15:29
 * Version 1.0
 **/
public class OrderException extends RuntimeException{

    private Integer code;

    public OrderException(Integer code,String message){

        super(message);
        this.code = code;
    }

}
