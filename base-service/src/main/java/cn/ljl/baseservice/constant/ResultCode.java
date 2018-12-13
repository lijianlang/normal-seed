package cn.ljl.baseservice.constant;

/**
 * @Description
 * @author lijianlang
 * @createTime 2018/12/13 16:54:00
 */
public enum ResultCode {

    //==============================常用http状态码==============================//
    SUCCESS(200, "ok"),
    FAIL(400, "fail"),
    UNAUTHORIZED(401, "未授权"),
    FORBIDDEN(403, "禁止访问"),
    NOT_FOUND(404, "找不到接口"),
    INTERNAL_SERVER_ERROR(500, "服务器错误");
    //==============================常用http状态码==============================//


    //==============================业务状态码==============================//

    //==============================业务状态码==============================//
    /**
     * 错误代码
     */
    private int code;
    private String desc;

    ResultCode(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
