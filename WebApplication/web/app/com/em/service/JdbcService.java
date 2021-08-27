package em.service;

import em.dao.NetDao;
import em.dao.NetDaoImp;
import em.entity.DaoUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;
//@Transactional//通过这个注解可以声明事务，一般情况是我们会在servcie层添加了事务注解，即可开启事务
//@Service服务层组件，用于标注业务层组件
@Service
public class JdbcService implements JdbcServiceImp {

	@Autowired
	private NetDao netDao;

    public List<DaoUser> queryAll() {
        return netDao.queryAll();
    }

}
