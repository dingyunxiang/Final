package service;

import entity.ShequEntity;
import org.springframework.transaction.annotation.Transactional;

import java.io.File;
import java.util.List;

/**
 * Created by dingyunxiang on 16/4/20.
 */
@Transactional
public interface ShequService {

    public boolean addShequ(ShequEntity shequ);

    public boolean delShequ(String id);

    public boolean updateShequ(ShequEntity shequ);

    public List<ShequEntity> getAll();

    public File listToExcel();

    public String excelToList(File file);

    public ShequEntity getShequById(String id);
}
