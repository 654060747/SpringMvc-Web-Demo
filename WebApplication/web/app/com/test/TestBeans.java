package test;

import em.controller.DaoController;
import em.dao.NetDao;
import em.entity.User;
import em.service.JdbcService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class TestBeans {
    public static void main(String[] args) {
        ApplicationContext test = new ClassPathXmlApplicationContext("classpath:beans.xml");
        NetDao netDao = test.getBean("netDao", NetDao.class);
        System.out.println(netDao.queryAll());
    }
}
