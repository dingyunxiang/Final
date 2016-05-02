package service;

import entity.CyryEntity;
import org.springframework.transaction.annotation.Transactional;

import java.io.File;
import java.util.List;

/**
 * Created by dingyunxiang on 16/4/17.
 */
@Transactional
public interface CyryService {

    public void addCyry(CyryEntity cyry);

    public void delCyry(String id);

    public void updateCyry(CyryEntity cyry);

    public List<CyryEntity> getAllCyry();

    public void delShejuByShequ(String shequ);

    public CyryEntity getCyryById(String id);

    public File listToExcel();

    public String excelToList(File file);

    public File listToExcelByDiy(String []arr);

}
