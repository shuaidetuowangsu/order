package com.imooc.order.controller;

import com.imooc.order.dto.OrderDto;
import com.imooc.order.exception.OrderException;
import com.imooc.order.util.ResultVO;
import com.imooc.order.util.ResultVoUtil;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * @ClassName OrderController
 * @Description com.imooc.order.controller
 * @Author Administrator
 * Date 2019/1/3 15:20
 * Version 1.0
 **/
@RestController
@RequestMapping("/order")
public class OrderController {


    @GetMapping("/test")
    public ResultVO<OrderDto> query(@Valid OrderDto orderDto,
                          BindingResult bindingResult){

        if (bindingResult.hasErrors())
            throw new OrderException(1,bindingResult.getFieldError().getDefaultMessage());



        return ResultVoUtil.success(orderDto);

    }
}
