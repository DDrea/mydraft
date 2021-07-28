package cn.swust.mapper;

import cn.swust.entity.Person;
import org.apache.ibatis.annotations.Mapper;

public interface PersonMapper {
    public Person findById(Integer id);
}
