package em.controller;

import em.service.JdbcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;

@Controller
@RequestMapping("/home")
public class DaoController {

	@Autowired
	private JdbcService jdbcService;

	@RequestMapping("/find_sql")
//	public Object testJdbc(@PathVariable String id) { //指定id查询sql
	public ModelAndView testJdbc() {
        ModelAndView nav = new ModelAndView();
        nav.addObject("query",jdbcService.queryAll());
        nav.setViewName("sql");
		return nav;
	}

}
