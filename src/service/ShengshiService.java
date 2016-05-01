package service;

import entity.ShengshiEntity;
import org.springframework.transaction.annotation.Transactional;

import java.io.File;
import java.util.List;

/**
 * Created by dingyunxiang on 16/4/17.
 */
@Transactional
public interface ShengshiService {

    public void addShengshi(ShengshiEntity shengshi);


    public void delShengshi(String id);

    public void updateShengshi(ShengshiEntity shengshi);

    public List<ShengshiEntity> getAllShengshi();

    public File listToExcel();

    public String excelToList(File file);

    public ShengshiEntity getById(String id);


}
