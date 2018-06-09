package com.java4all.apiImpl;

import api.UserApi;
import com.alibaba.dubbo.config.annotation.Service;
import com.java4all.domain.User;

/**
 * Author: momo
 * Date: 2018/6/9
 * Description:接口服务实现类
 */
//对外暴露为dubbo服务，注意，这个@service为dubbo的@service,版本号可不要，或者自定义
@Service(version = "1.0.0")
public class UserApiImpl implements UserApi
{
    @Override
    public User getUserById(Integer id) {
        return new User(id,"汪汪啊辛苦了",22);
    }
}
