package com.binbinxiu.aihushop.utils;

import lombok.Data;

/**
 * @Description: 自定义响应数据结构
 * 				这个类是提供给门户，ios，安卓，微信商城用的
 * 				门户接受此类数据后需要使用本类的方法转换成对于的数据类型格式（类，或者list）
 * 				其他自行处理
 * 				200：表示成功
 * 				500：表示错误，错误信息在msg字段中
 * 				501：bean验证错误，不管多少个错误都以map形式返回
 * 				502：拦截器拦截到用户token出错
 * 				555：异常抛出信息
 */
@Data
public class R {
    // 响应业务状态
    private Integer status;

    // 响应消息
    private String msg;

    // 响应中的数据
    private Object data;

    private String ok;	// 不使用

    public static R build(Integer status, String msg, Object data) {
        return new R(status, msg, data);
    }

    public static R ok(Object data) {
        return new R(data);
    }

    public static R ok() {
        return new R(null);
    }

    public static R errorMsg(String msg) {
        return new R(500, msg, null);
    }

    public static R errorMap(Object data) {
        return new R(501, "error", data);
    }

    public static R errorTokenMsg(String msg) {
        return new R(502, msg, null);
    }

    public static R errorException(String msg) {
        return new R(555, msg, null);
    }

    public R() {

    }

//    public static LeeJSONResult build(Integer status, String msg) {
//        return new LeeJSONResult(status, msg, null);
//    }

    public R(Integer status, String msg, Object data) {
        this.status = status;
        this.msg = msg;
        this.data = data;
    }

    public R(Object data) {
        this.status = 200;
        this.msg = "OK";
        this.data = data;
    }

}
