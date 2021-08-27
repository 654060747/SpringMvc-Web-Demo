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
        DaoController daoController = test.getBean("daoController", DaoController.class);
        System.out.println(daoController.testJdbc());
    }
}
