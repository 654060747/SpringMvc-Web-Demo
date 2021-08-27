package em.service;

import em.dao.NetDao;
import em.dao.NetDaoImp;
import em.entity.DaoUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
//@Service服务层组件，用于标注业务层组件
@Service
public class JdbcService implements JdbcServiceImp {

	@Autowired
	private NetDao netDao;

    public List<DaoUser> queryAll() {
        return netDao.queryAll();
    }

}
