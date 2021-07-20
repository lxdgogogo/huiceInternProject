package com.huice.service_dyna.common;


import lombok.Data;

import java.util.HashMap;
import java.util.Map;

/**
 * @author SoonMachine
 * @apiNote 统一结果返回类
 */
@Data
public class R {



    private Integer code;

    private Map<String,Object> data = new HashMap<String,Object>();

    private String message;



    /**
     * 把构造方法私有化，别人就不能再实例化这个对象了
     */

    private R(){};

    /**
     * 成功的静态方法
     */
    public static R ok(){
        R r = new R();
        r.setCode(ResultCode.SUCCESS);
        r.setMessage("成功");
        return r;
    }

    /**
     * 失败的静态方法
     */
    public static R error(){
        R r = new R();
        r.setCode(ResultCode.ERROR);
        r.setMessage("失败");
        return r;
    }

    /**
     * 设置json的方法，下同
     */
    public R success(Boolean success){
        return this;
    }

    public R message(String message){
        this.setMessage(message);
        return this;
    }

    public R code(Integer code){
        this.setCode(code);
        return this;
    }

    public R data(String key, Object value){
        this.data.put(key,value);
        return this;
    }

}
