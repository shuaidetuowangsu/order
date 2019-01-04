package com.imooc.order.util;

/**
 * @ClassName ResultVoUtil
 * @Description com.imooc.order.util
 * @Author Administrator
 * Date 2019/1/3 15:38
 * Version 1.0
 **/
public class ResultVoUtil {

    public static ResultVO success(Object object){
        ResultVO resultVo = new ResultVO();
        resultVo.setCode(0);
        resultVo.setMsg("成功");
        resultVo.setData(object);
        return resultVo;
    }
}
