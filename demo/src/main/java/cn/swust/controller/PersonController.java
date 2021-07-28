package cn.swust.controller;

import cn.swust.entity.Person;
import cn.swust.service.PersonService;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class PersonController {
    @Resource
    PersonService personService;

    @RequestMapping(value = "/person", method = RequestMethod.GET)
    public Person findById(@Param("id") Integer id) {
        return personService.findById(id);
    }
}
