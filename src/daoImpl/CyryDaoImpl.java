package daoImpl;

import dao.CyryDao;
import entity.CyryEntity;
import org.hibernate.Query;
import org.springframework.stereotype.Repository;

/**
 * Created by dingyunxiang on 16/4/15.
 */


@Repository("cyryDao")
public class CyryDaoImpl extends BaseDaoImpl<CyryEntity> implements CyryDao{

    @Override
    public String delCyryByShequ(String shequ) {

        String sql = "delete from CyryEntity c where c.loactecommunity = '"+shequ+"'";
        Query query = this.getSession().createQuery(sql);
        int rs = query.executeUpdate();
        return "Success";
    }
}
