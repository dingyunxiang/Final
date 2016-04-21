package serviceImpl;

import dao.UserDao;
import entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.UserService;

/**
 * Created by dingyunxiang on 16/4/17.
 */


@Service("userService")
class UserServiceImpl implements UserService {


    @Autowired
    private UserDao userDao;

    @Override
    public boolean login(UserEntity user) {
        UserEntity user1 = userDao.getEntityByLine("UserEntity","username",user.getUsername());
        if(user1!=null){
            if(user1.getPassword().equals(user.getPassword())){
                return true;
            }
        }
        return false;
    }
}
