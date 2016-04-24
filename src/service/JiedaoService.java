package service;

import entity.JiedaoEntity;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by dingyunxiang on 16/4/17.
 */
@Transactional
public interface JiedaoService {

    public void addJiedao(JiedaoEntity jiedao);

    public void delJiedao(JiedaoEntity jiedao);

    public void updateJiedao(JiedaoEntity jiedao);

    public List<JiedaoEntity> getAllJiedao();

}
