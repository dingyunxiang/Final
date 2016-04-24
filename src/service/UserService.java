package service;

import entity.UserEntity;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by dingyunxiang on 16/4/17.
 */
@Transactional
public interface UserService {

    public boolean login(UserEntity user);

    public void addUser(UserEntity user);

    public void updateUser(UserEntity user);

    public void delUser(UserEntity user);

    public List<UserEntity> getAllUser();

}
