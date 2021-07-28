package cn.swust.service;

import cn.swust.entity.Person;
import cn.swust.mapper.PersonMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class PersonServiceImp implements PersonService {
    @Resource
    private PersonMapper personMapper;

    @Override
    public Person findById(Integer id) {
        return personMapper.findById(id);
    }
}
