package com.example.demo.mapper;
import com.example.demo.entity.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
public interface UserMapper {
    @Select("select*from user")
    List<User> findall();

   @Update("INSERT INTO `user` (`name`, `author`, `phase`) VALUES (#{name},#{author},#{phase});")
   @Transactional
   void save(User user);
    @Update("update  user set name=#{name}, author=#{author}, phase=#{phase} where id = #{id}")
    @Transactional
    void updateById(User user);
@Delete("delete from user where id = #{id}")
    void deleteById(Long id);

}
