package cn.ljl.baseservice.controller;

import cn.ljl.baseservice.utils.ResultUtil;
import cn.ljl.baseservice.vo.Result;

/**
 * @Description 公共控制器
 * @author lijianlang
 * @createTime 2018/12/13 16:47:00
 */
public class BaseController {

    public <T> Result<T> success() {
        return ResultUtil.makeOKRsp();
    }

    public <T> Result<T> success(T data) {
        return ResultUtil.makeOKRsp(data);
    }

    public <T> Result<T> fail() {
        return ResultUtil.makeErrRsp();
    }

    public <T> Result<T> addResult(int code, String msg) {
        return ResultUtil.makeRsp(code, msg);
    }

    public <T> Result<T> addResult(int code, String msg, T data) {
        return ResultUtil.makeRsp(code, msg, data);
    }

}
