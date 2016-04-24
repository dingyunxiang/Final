package serviceImpl;

import dao.ShengshiDao;
import entity.ShengshiEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.ShengshiService;

import java.util.List;

/**
 * Created by dingyunxiang on 16/4/17.
 */


@Service("shengshiService")
class ShengshiServiceImpl implements ShengshiService {
    @Autowired
    ShengshiDao dao;

    @Override
    public void addShengshi(ShengshiEntity shengshi) {
        dao.save(shengshi);
    }

    @Override
    public void delShengshi(ShengshiEntity shengshi) {
        dao.delete(ShengshiEntity.class,shengshi.getId());
    }

    @Override
    public void updateShengshi(ShengshiEntity shengshi) {
        dao.update(shengshi);
    }

    @Override
    public List<ShengshiEntity> getAllShengshi() {
        return dao.getAll(ShengshiEntity.class);
    }
}
