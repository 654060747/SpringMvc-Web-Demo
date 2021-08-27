package em.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping("/home")
public class DeptController {
//    @RequestMapping("/images") //http://localhost:8080/Demo/home/images
//    @RequestMapping(value = {"/logout","/exit"}) //http://localhost:8080/Demo/home/logout或者http://localhost:8080/Demo/home/exit
    @RequestMapping(value = {"/logout","/exit"},method = {RequestMethod.GET,RequestMethod.POST})
//    @RequestMapping(value = {"/logout","/exit"},params="id") //请求参数必须要有id
//    @RequestMapping(value = {"/logout","/exit"},method = RequestMethod.POST) //post请求配合form表单
//    @GetMapping("logout") //相当于GET
    public ModelAndView ixImag() {
        ModelAndView nav = new ModelAndView();
        nav.addObject("name","欢迎进入个人主页");
        nav.addObject("yasuo","亚索");
        nav.setViewName("two");
        return nav;
    }
}
