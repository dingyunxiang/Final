package serviceImpl;

import dao.ShequDao;
import entity.ShequEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.ShequService;

import java.util.List;

/**
 * Created by dingyunxiang on 16/4/17.
 */


@Service("shequService")
class ShequServiceImpl implements ShequService {
    @Autowired
    ShequDao dao;


    @Override
    public boolean addShequ(ShequEntity shequ) {
       dao.save(shequ);
        return true;
    }

    @Override
    public boolean delShequ(ShequEntity shequ) {
        dao.delete(ShequEntity.class,shequ.getId());
        return true;
    }

    @Override
    public boolean updateShequ(ShequEntity shequ){
        dao.update(shequ);
        return true;
    }

    @Override
    public List<ShequEntity> getAll() {
        return dao.getAll(ShequEntity.class);
    }


}
