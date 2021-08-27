package em.dao;


import em.entity.DaoUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

@Repository //用于标注数据访问组件，即DAO组件
public class NetDao implements NetDaoImp {

    @Autowired //后不需要getter()和setter()方法,Spring也会自动注入
//    @Resource(name="jdbcTemplate")
//    @Autowired() @Qualifier("jdbcTemplate")
    private JdbcTemplate jdbcTemplate;

    //查询所有
    public List<DaoUser> queryAll() {
        String sql = "select id,nickname,password,first_name,last_name from user";
        //将查询结果映射到Student类中，添加到list中，并返回
        RowMapper<DaoUser> user_dao = BeanPropertyRowMapper.newInstance(DaoUser.class);
        List<DaoUser> dao_user = jdbcTemplate.query(sql, user_dao);
        DaoUser user = new DaoUser();
        for (int i = 0; i < dao_user.size(); i++) {
            DaoUser daoUser = dao_user.get(i);
            user.setId(daoUser.getId());
            user.setFirst_name(daoUser.getFirst_name());
            user.setNickname(daoUser.getNickname());
            user.setPassword(daoUser.getPassword());
            user.setLast_name(daoUser.getLast_name());
        }
        return dao_user;
    }

}
