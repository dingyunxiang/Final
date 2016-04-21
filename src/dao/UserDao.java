package dao;

import entity.UserEntity;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by dingyunxiang on 16/4/12.
 */
@Transactional
public interface UserDao extends BaseDao<UserEntity> {


}
