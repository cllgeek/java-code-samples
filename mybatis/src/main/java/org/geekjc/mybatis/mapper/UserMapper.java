package org.geekjc.mybatis.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.geekjc.mybatis.bean.User;

import java.util.List;

/**
 * @author ll
 * @date 2019年09月27日 1:39 PM
 */
//@Mapper
public interface UserMapper {
    //    @Select("select * from t_user")
    List<User> getAllUser();
}
