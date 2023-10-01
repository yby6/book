package com.example.demo.controller;
import com.example.demo.entity.User;
import com.example.demo.mapper.UserMapper;
import jakarta.annotation.Resource;
import org.apache.ibatis.annotations.Delete;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class Usercontroller {
    @Resource
    UserMapper userMapper;

    @GetMapping
    public List<User> getuser(){
        return userMapper.findall();
    }
    @PostMapping
    public String adduser(@RequestBody User user){
        userMapper.save(user);
        return "successful";
    }
    @PutMapping
    public String updateUser(@RequestBody User user) {
        userMapper.updateById(user);
        return "successful";
    }
    @DeleteMapping("/{id}")
    public String deleteUser(@PathVariable("id") Long id) {
        userMapper.deleteById(id);
        return "successful";
    }
}
