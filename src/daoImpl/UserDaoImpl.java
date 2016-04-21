package daoImpl;

import dao.UserDao;
import entity.UserEntity;
import org.springframework.stereotype.Repository;

/**
 * Created by dingyunxiang on 16/4/12.
 */


@Repository("userDao")
public class UserDaoImpl extends BaseDaoImpl<UserEntity> implements UserDao {


}
