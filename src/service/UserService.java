package service;

import entity.UserEntity;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by dingyunxiang on 16/4/17.
 */
@Transactional
public interface UserService {

    public boolean login(UserEntity user);


}
