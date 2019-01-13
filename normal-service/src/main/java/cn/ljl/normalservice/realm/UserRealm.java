package cn.ljl.normalservice.realm;

import cn.ljl.normalservice.entity.TbUserInfo;
import cn.ljl.normalservice.service.ITbUserInfoService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

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
        // todo 根据username找到User
        QueryWrapper<TbUserInfo> wrapper = new QueryWrapper<>();
        wrapper.eq("username", username);
        List<TbUserInfo> userInfoList = userInfoService.list(wrapper);

        // todo 非法判断
        return null;
    }
}
