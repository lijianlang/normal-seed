package cn.ljl.baseservice.realm;

import cn.ljl.baseservice.entity.TbUserInfo;
import cn.ljl.baseservice.service.ITbUserInfoService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author lijianlang
 * @Description
 * @createTime 2019/01/11 16:39:00
 */
public class UserRealm extends AuthorizingRealm {

    @Autowired
    @Lazy
    private ITbUserInfoService userInfoService;

    /**
     * 授权
     * @param principal
     * @return
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principal) {
        String username = (String) principal.getPrimaryPrincipal();
        SimpleAuthorizationInfo authorizationInfo = new SimpleAuthorizationInfo();
        //todo  获取用户的角色
        Set<String> roles = new HashSet<>();
        authorizationInfo.setRoles(roles);
        return authorizationInfo;
    }

    /**
     * 认证
     * @param token
     * @return
     * @throws AuthenticationException
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        String username = (String) token.getPrincipal();
        if (username == null) {  //todo 判空工具
            throw new AccountException("登陆异常，用户名为空");
        }
        // todo 根据username找到User
        QueryWrapper<TbUserInfo> wrapper = new QueryWrapper<>();
        wrapper.eq("username", username);
        List<TbUserInfo> userInfoList = userInfoService.list(wrapper);
        if (userInfoList.size() == 0) {
            throw new UnknownAccountException("未找到用户");
        }
        TbUserInfo userInfo = userInfoList.get(0);
        //查询用户的角色和权限存到SimpleAuthenticationInfo中，这样在其它地方
        //SecurityUtils.getSubject().getPrincipal()就能拿出用户的所有信息，包括角色和权限
        TbUserInfo temp = new TbUserInfo();
        temp.setPassword("123");
        temp.setUsername("lijianlang");
        SimpleAuthenticationInfo info = new SimpleAuthenticationInfo(temp, temp.getPassword(), temp.getUsername());
//        SimpleAuthenticationInfo info = new SimpleAuthenticationInfo(userInfo, userInfo.getPassword(), userInfo.getUsername());
        // todo 非法判断
        return info;
    }
}
