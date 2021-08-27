package em.service;

import em.entity.DaoUser;

import java.util.List;

public interface JdbcServiceImp {

    public List<DaoUser> queryAll();

}
