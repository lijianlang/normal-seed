package cn.ljl.normalservice.controller.demo;

import org.apache.shiro.authz.annotation.RequiresRoles;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author lijianlang
 * @Description
 * @createTime 2019/01/28 14:41:00
 */
@Controller
@RequestMapping(value = "/shiro")
public class ShiroController {

    /**
     * 未登陆时跳转到登陆界面
     */
    @GetMapping(value = "/login")
    public void loginUnAuthentic() {
        System.out.println("login");
    }

    @GetMapping(value = "role")
    @RequiresRoles(value = "admin")
    public void testRequireRole() {
        System.out.println("permission granted");
    }
}
