package cn.ljl.baseservice.entity;

import lombok.Data;

import java.time.LocalDateTime;

/**
 * <p>
 * 
 * </p>
 *
 * @author lijianlang
 * @since 2019-01-13
 */
@Data
public class TbUserInfo {

    private static final long serialVersionUID = 1L;

    /**
     * 用户名
     */
    private String username;

    /**
     * 昵称
     */
    private String nickname;

    /**
     * 密码
     */
    private String password;

    /**
     * 盐值
     */
    private String salt;

    /**
     * 手机
     */
    private String phone;

    /**
     * 状态 0/正常 1/禁用 2/注销
     */
    private Integer status;

    /**
     *  0/后台管理员 1/普通用户
     */
    private Integer type;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    /**
     * 更新时间
     */
    private LocalDateTime updateTime;


}
