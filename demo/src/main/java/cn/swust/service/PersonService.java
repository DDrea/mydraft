package cn.swust.service;

import cn.swust.entity.Person;
import org.springframework.stereotype.Service;

@Service
public interface PersonService {
    public Person findById(Integer id);
}
