package com.geekjc.springbootmybatisplus.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.geekjc.springbootmybatisplus.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author ll
 * @date 2019年10月15日 11:04 AM
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {}
