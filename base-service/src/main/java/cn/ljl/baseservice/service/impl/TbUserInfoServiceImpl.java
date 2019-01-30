package cn.ljl.baseservice.service.impl;

import cn.ljl.baseservice.entity.TbUserInfo;
import cn.ljl.baseservice.mapper.TbUserInfoMapper;
import cn.ljl.baseservice.service.ITbUserInfoService;
import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author lijianlang
 * @since 2019-01-13
 */
@Service("tbUserInfoServiceImpl")
public class TbUserInfoServiceImpl extends ServiceImpl<TbUserInfoMapper, TbUserInfo> implements ITbUserInfoService {

    @Autowired
    private TbUserInfoMapper userInfoMapper;
    @Override
    public TbUserInfo userLogin(String username, String password) {
        QueryWrapper<TbUserInfo> userInfoWrapper = new QueryWrapper<>();
        userInfoWrapper.eq("username", username).eq("password", password);
        TbUserInfo userInfo = userInfoMapper.selectOne(userInfoWrapper);
        Assert.isNull(userInfo, "账号/密码不正确");
        return userInfo;
    }
}
