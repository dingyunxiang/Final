package service;

import entity.CyryEntity;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by dingyunxiang on 16/4/17.
 */
@Transactional
public interface CyryService {

    public void addCyry(CyryEntity cyry);

    public void delCyry(CyryEntity cyry);

    public void updateCyry(CyryEntity cyry);

    public List<CyryEntity> getAllCyry();
}
