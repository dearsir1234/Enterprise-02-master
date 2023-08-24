package com.example.enterprise02.User.service.impl;

import com.example.enterprise02.User.entity.User;
import com.example.enterprise02.User.mapper.UserMapper;
import com.example.enterprise02.User.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zhufu
 * @since 2023-08-23
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
