package cn.ljl.normalservice.controller;

import cn.ljl.normalservice.mapper.ProductMapper;
import cn.ljl.normalservice.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.net.ssl.HttpsURLConnection;

@Controller
@RequestMapping(value = "/login")
public class LoginController {

    @Autowired
    private ProductMapper productMapper;

    @RequestMapping(value = "/test")
    public void test() {
        Product product = productMapper.selectByPrimaryKey();
        System.out.println("hello");
    }

    @GetMapping(value = "/login")
    public String login(Model model) {
        return "login";
    }

}
