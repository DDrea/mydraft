package cn.swust.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/*
 * @Controller:创建控制器对象,并放入容器中
 * */
@Controller
public class MyController {

    /*
     * @RequestMapping:请求映射
     *   属性：value  请求中的uri地址， 以‘/’开头
     *   作用：把指定的请求交给指定的方法处理，等同于url-pattern
     *  返回值ModelAndView：表示本次请求的处理结果（数据和试视图）
     *
     * */
    @RequestMapping(value = "/some.do")
    public ModelAndView doSome() {
        //使用这个方法处理请求，
        //调用service对象处理请求，返回数据
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("msg", "处理了some.do请求");
        modelAndView.addObject("func", "执行了...功能");

        //指定视图
        modelAndView.setViewName("/show.jsp");

        /*
         * 当框架调用完doSome()方法后，得到返回值modelAndView
         * 框架会自动处理（如何？）View和Data
         * 对数据执行request.setAttribute("msg", "处理了some.do请求");把数据放到request作用域
         * 对视图执行转发操作，等同于request.getRequestDispatcher("/show.jsp").forward(..)
         * */
        return modelAndView;
    }
}
