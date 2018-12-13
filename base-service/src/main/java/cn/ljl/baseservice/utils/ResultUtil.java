package cn.ljl.baseservice.utils;

import cn.ljl.baseservice.constant.ResultCode;
import cn.ljl.baseservice.vo.Result;

/**
 * @Description 统一结果返回工具类
 * @author lijianlang
 * @createTime 2018/12/13 17:14:00
 */
public class ResultUtil {

    public static <T> Result<T> makeOKRsp() {
        return new Result<>(ResultCode.SUCCESS.getCode(), ResultCode.SUCCESS.getDesc(), null);
    }

    public static <T> Result<T> makeOKRsp(T data) {
        return new Result<>(ResultCode.SUCCESS.getCode(), ResultCode.SUCCESS.getDesc(), data);
    }

    public static <T> Result<T> makeErrRsp() {
        return new Result<>(ResultCode.FAIL.getCode(), ResultCode.FAIL.getDesc(), null);
    }

    public static <T> Result<T> makeRsp(int code, String msg) {
        return new Result<>(code, msg, null);
    }

    public static <T> Result<T> makeRsp(int code, String msg, T data) {
        return new Result<>(code, msg, data);
    }
}
