package em.controller;

import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

//@Controller用于标注控制层组件
@Controller
@RequestMapping("/home")
public class IndexController {
    @RequestMapping("/index")
    public String index() {
        return "index";
    }

//    @RequestMapping("/click")
//    @ResponseBody
//    public String index(String username) {
//        return username;
//    }

    @RequestMapping("/click")
    //@RequestBody接收一个对象，@RequestParam()简单理解为接收单个字段
    public ModelAndView index(@RequestParam("username") String username,@RequestParam("password") String password) {
        ModelAndView nav = new ModelAndView();
        if(username.equals("admin")&&password.equals("123")){
            nav.setViewName("index");
            return nav;
        }else {
            nav.addObject("error","用户名密码错误！！！");
            nav.setViewName("one");
            return nav;
        }
    }
}