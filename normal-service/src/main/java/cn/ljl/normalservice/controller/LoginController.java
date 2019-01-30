package cn.ljl.normalservice.controller;

import cn.ljl.baseservice.controller.BaseController;
import cn.ljl.baseservice.entity.TbUserInfo;
import cn.ljl.baseservice.service.ITbUserInfoService;
import cn.ljl.baseservice.vo.Result;
import cn.ljl.normalservice.dto.LoginDTO;
import cn.ljl.normalservice.entity.Product;
import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.apache.shiro.authz.annotation.RequiresAuthentication;
import org.apache.shiro.authz.annotation.RequiresRoles;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.net.ssl.HttpsURLConnection;
import java.util.List;

@Controller
public class LoginController extends BaseController{

    @Autowired
    private ITbUserInfoService userInfoService;

    /**
     * 登陆界面
     * @param model
     * @return
     */
    @GetMapping(value = "/login")
    public String login(Model model) {
        return "login";
    }

    /**
     * 登陆
     * @param loginDTO
     * @return
     */
    @PostMapping(value = "/login")
    @ResponseBody
    public Result userLogin(@RequestBody LoginDTO loginDTO) {
        TbUserInfo userInfo = userInfoService.userLogin(loginDTO.getUsername(), loginDTO.getPassword());
        return super.success(userInfo);
    }

}
