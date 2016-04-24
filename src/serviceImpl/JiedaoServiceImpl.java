package serviceImpl;

import dao.JiedaoDao;
import entity.JiedaoEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.JiedaoService;

import java.util.List;

/**
 * Created by dingyunxiang on 16/4/17.
 */


@Service("jiedaoService")
class JiedaoServiceImpl implements JiedaoService{
    @Autowired
    JiedaoDao dao;

    @Override
    public void addJiedao(JiedaoEntity jiedao) {
        dao.save(jiedao);
    }

    @Override
    public void delJiedao(JiedaoEntity jiedao) {
        dao.delete(JiedaoEntity.class,jiedao.getId());
    }

    @Override
    public void updateJiedao(JiedaoEntity jiedao) {
        dao.update(jiedao);
    }

    @Override
    public List<JiedaoEntity> getAllJiedao() {
        return dao.getAll(JiedaoEntity.class);
    }
}
