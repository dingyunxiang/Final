package serviceImpl;

import entity.CyryEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.CyryService;
import dao.*;

import java.util.List;

/**
 * Created by dingyunxiang on 16/4/23.
 */
@Service("cyryService")
public class CyryServiceImpl  implements CyryService{
    @Autowired
    CyryDao dao;

    @Override
    public void addCyry(CyryEntity cyry) {
        dao.save(cyry);
    }

    @Override
    public void delCyry(CyryEntity cyry) {
        dao.delete(CyryEntity.class,cyry.getId());
    }

    @Override
    public void updateCyry(CyryEntity cyry) {
        dao.update(cyry);
    }

    @Override
    public List<CyryEntity> getAllCyry() {
        return dao.getAll(CyryEntity.class);
    }
}
