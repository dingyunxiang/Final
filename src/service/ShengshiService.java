package service;

import entity.ShengshiEntity;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by dingyunxiang on 16/4/17.
 */
@Transactional
public interface ShengshiService {

    public void addShengshi(ShengshiEntity shengshi);


    public void delShengshi(ShengshiEntity shengshi);

    public void updateShengshi(ShengshiEntity shengshi);

    public List<ShengshiEntity> getAllShengshi();


}
