package cn.swust.mapper;

import cn.swust.pojo.User;

import java.util.List;

public interface UserMapper {
    public List<User> findAll();
    public User findById();
    public List<User> findByName();
}
